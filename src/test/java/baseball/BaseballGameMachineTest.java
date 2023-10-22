package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BaseballGameMachineTest {

    @DisplayName("console 테스트")
    @Test
    void input() {
        //given
        String inputLine = "콘솔로 입력합니다.";
        InputStream inputStream = new ByteArrayInputStream(inputLine.getBytes());
        System.setIn(inputStream);

        BaseballGameMachine baseballGameMachine = new BaseballGameMachine();
        //when
        String input = baseballGameMachine.userInput();
        //then
        assertThat(inputLine).isEqualTo(input);
    }

    @DisplayName("유저 input이 3스트라이크 일때, 게임이 성공 했는지 판단하는 테스트")
    @Test
    void isSuccessThreeStrikeTest() {
        //given
        BaseballGameMachine baseballGameMachine = new BaseballGameMachine();
        //when
        final List<Integer> userInputResult = List.of(0, 3);
        //then
        assertThat(baseballGameMachine.isSuccess(userInputResult)).isEqualTo(true);
    }

    @DisplayName("유저 input이 낫싱 일때, 게임 성공을 판단하는 테스트")
    @Test
    void isSuccessNothingTest() {
        //given
        BaseballGameMachine baseballGameMachine = new BaseballGameMachine();
        //when
        final List<Integer> userInputResult = null;
        //then
        assertThat(baseballGameMachine.isSuccess(userInputResult)).isEqualTo(false);
    }

    @DisplayName("유저 input이 3 스트라이크 아닐 경우, 게임 성공을 판단한느 테스트")
    @Test
    void isSuccessBallStrikeTest() {
        //given
        BaseballGameMachine baseballGameMachine = new BaseballGameMachine();
        //when
        final List<Integer> userInputResult = List.of(1, 3);
        //then
        assertThat(baseballGameMachine.isSuccess(userInputResult)).isEqualTo(false);
    }
}
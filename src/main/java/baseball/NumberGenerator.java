package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    private final int MAX_NUMBER = 9;
    private final int MIN_NUMBER = 1;

    public List<Integer> generateRandomAnswerList() {
        List<Integer> answerList = new ArrayList<>();
        while (answerList.size() < 3) {
            final int randomNumber = generateRandomNumber();
            if (!answerList.contains(randomNumber)) {
                answerList.add(randomNumber);
            }
        }
        return answerList;
    }

    public int generateRandomNumber() {
        final int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
        return randomNumber;
    }
}

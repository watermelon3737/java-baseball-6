# Flow Chart
<img src="https://github.com/watermelon3737/issueTest/assets/148438656/47c6a609-7325-472d-a261-1bbd810161d9" width="500" height="300">

# Class Details
## 1. Message class
- 출력 관련 메서드

        String start() = 게임 시작 문구 반환

        String requestInput() = 숫자 입력 요청 문구 반환

        String success() = 게임 성공 문구 반환 

        String requestRetryOrEnd() = 새로운 게임 진행 여부 문구 반환 

        String gameEnd() = 게임 종료 문구 반환

        String result(List<Integer> gameResult) = player 입력에 대한 결과 문구 반환

## 2. BaseBallNumberGameMachine class
- 게임 진행 관련 메서드 

         void play() = 종료를 입력 받기 전까지, 게임을 계속 진행

         void gameProcess() = 게임 하나를 진행

         boolean isSuccess(List<Integer> gameResult) = player의 입력 결과 받아 3스트라이크인지 검증 후 boolean으로 반환 

- 출력 관련 메서드

         void display(String message) = message 출력

- 입력 관련 메서드

         String getInputLine() = enter 이전까지 입력된 문자열 반환

         boolean isGameEnd(String playerInput) = 새로운 게임 진행 여부를 입력받고 검증 후 boolean으로 반환

## 3. Referee class
- 판정 관련 메서드

         List<Integer> judgePlayerInput(List<Integer> playerInput) = player의 유추를 입력받아 정답을 비교하여, 볼 스트라이크 결과를 integer 리스트로 반환 

         int judgeNumber(int playerNumber, int index) = strike, ball, nothing을 판정 후 반환

         void setAnswer(List<Integer> answer) = 랜덤 생성한 정답을 맴버 변수로 저장한다

         List<Integer> getAnswer() = 정답을 get할 수 있음, test를 위해 구현

## 4. Validate class
- 입력 유효성 판단 관련 메서드

         void validatePlayerInput(String input) = player의 입력에 대한 유효성 판단을 진행 

         void validateInputValue(String input) = 입력 받은 string의 길이, 공백과 ',' 포함에 대한 검증, 유효하지 않다면 error 발생

         void validateThreeEachNumber(String input) = 입력 받은 string이 1 ~ 9까지 서로 다른 숫자인지 검증, 유효하지 않다면 error 발생

         int validateGameEndRequestInput(String input) = 입력 받은 string이 1, 2인지 검증 후 int로 변경하여 반환, 유효하지 않다면 error 발생

         List<Integer> convertPlayerInput(String playerInput) = 유효성 검증이 끝난 입력을 List로 반환

## 5. NumberMaker class
- 숫자 생성 메서드

         List<Integer> generateRandomAnswer() = 서로 다른 3개의 숫자를 가진 list 반환
      
         int generateRandomNumber() = 지정된 범위 안에서 랜덤한 숫자 반환

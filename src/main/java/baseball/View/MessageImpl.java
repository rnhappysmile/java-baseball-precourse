package baseball.View;

import baseball.GameInfo;

public class MessageImpl implements Message{
    @Override
    public void requestInputBalls() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    @Override
    public void requestRetryGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    @Override
    public void gameResult(GameInfo gameInfo) {
        StringBuilder message = new StringBuilder();

        if(gameInfo.isResultNoting() == true) message.append("낫싱");
        if(gameInfo.getResultBall() != 0) message.append(gameInfo.getResultBall() + "볼 ");
        if(gameInfo.getResultStrike() != 0) message.append(gameInfo.getResultStrike() + "스트라이크");
        if(gameInfo.getResultStrike() == 3) message.append("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

        System.out.println(message);
    }
}

package baseball.View;

import baseball.GameInfo;

/**
 * 플레이어에게 전달 할 메시지
 */
public interface Message {
    /**
     * 숫자 입력을 요구하는 메시지 출력
     */
    void requestInputBalls();

    /**
     * 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료 할 것인지 문의 메시지 출력
     */
    void requestRetryGame();

    /**
     * 숫자 입력에 대한 결과 메시지 출력
     * @param gameInfo 숫자 야구 게임에서 사용되는 공의 정보
     */
    void gameResult(GameInfo gameInfo);
}

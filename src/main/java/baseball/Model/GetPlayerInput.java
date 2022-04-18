package baseball.Model;

import baseball.GameInfo;

/**
 * 플레이어의 입력을 받는 기능
 */
public interface GetPlayerInput {
    /**
     * 플레이어가 입력한 숫자를 받는 기능
     * @param gameInfo 숫자 야구 게임에서 사용되는 공의 정보
     * @return 플레이어가 입력한 숫자가 추가되어 공의 정보를 리턴
     */
    GameInfo balls(GameInfo gameInfo);

    /**
     * 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료 할 것인지 문의
     * @return 1: 새로운 게임 시작, 2: 게임 종료
     */
    String gameStatus();
}

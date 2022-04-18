package baseball.Model;

import baseball.GameInfo;

/**
 * 숫자 야구 게임의 규칙
 */
public interface GameRule {
    /**
     * 스트라이크, 볼, 낫싱 판별 기능
     * @param gameInfo 숫자 야구 게임에서 사용되는 공의 정보
     * @return
     */
    GameInfo check(GameInfo gameInfo);

    /**
     * 볼 판별 기능
     * @param balls
     * @return 볼의 갯수를 리턴
     */
    int checkBall(int balls);

    /**
     * 스트라이크 판별 기능
     * @param balls
     * @return 스트라이크 갯수를 리턴
     */
    int checkStrike(int balls);

    /**
     * 낫싱 판별 기능
     * @param Ball
     * @param Strike
     * @return 낫싱 여부를 리턴, FALSE: 볼 또는 스트라이크가 존재, TRUE: 볼 또는 스트라이크가 존재 하지 않음
     */
    boolean checkNoting(int Ball, int Strike);

    /**
     * 스트라이크, 볼, 낫싱을 게임 정보에 입력
     * @param ball
     * @param strike
     * @param noting
     * @return 숫자 야구 게임의 규칙을 적용한 게임 정보를 리턴
     */
    GameInfo count(int ball, int strike, boolean noting);
}

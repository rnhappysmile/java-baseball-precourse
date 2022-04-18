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
     * @param gameInfo 숫자 야구 게임에서 사용되는 공의 정보
     * @return 볼 판정 갯수를 리턴
     */
    int checkBall(GameInfo gameInfo);

    /**
     * 스트라이크 판별 기능
     * @param gameInfo 숫자 야구 게임에서 사용되는 공의 정보
     * @return 스트라이크 판정 갯수를 리턴
     */
    int checkStrike(GameInfo gameInfo);

    /**
     * 낫싱 판별 기능
     * @param ballCont 볼 판정 개수
     * @param strikeCount 스트라이크 판정 개수
     * @return 낫싱 여부를 리턴, FALSE: 볼 또는 스트라이크가 존재, TRUE: 볼 또는 스트라이크가 존재 하지 않음
     */
    boolean checkNoting(int ballCont, int strikeCount);

    /**
     * 스트라이크, 볼, 낫싱을 게임 정보에 입력
     * @param gameInfo 숫자 야구 게임에서 사용되는 공의 정보
     * @param ballCont 볼 판정 개수
     * @param strikeCount 스트라이크 판정 개수
     * @param notingResult 낫싱 판정 결과
     * @return 숫자 야구 게임의 규칙을 적용한 게임 정보를 리턴
     */
    GameInfo count(GameInfo gameInfo, int ballCont, int strikeCount, boolean notingResult);
}

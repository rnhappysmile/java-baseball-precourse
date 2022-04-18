package baseball.Model;

import baseball.GameInfo;

/**
 * 컴퓨터가 다른 수로 이루어진 공을 생성
 */
public interface GenerateBalls {
    /**
     * 컴퓨터가 1부터 9까지 서로 다른 수로 이루어진 공을 생성
     * @param gameInfo 숫자 야구 게임에서 사용되는 공의 정보
     * @return 컴퓨터가 생성한 공의 정보를 리턴
     */
    GameInfo generate(GameInfo gameInfo);

    /**
     * 컴퓨터가 생성한 공의 중복을 확인
     * @param balls 컴퓨터가 생성한 공들
     * @param newBall 컴퓨터가 신규 생성한 공
     * @return 기존 공과 신규 생성된 공의 중복체크 후 합친 공을 리턴
     */
    StringBuilder verifyBall(StringBuilder balls, int newBall);
}

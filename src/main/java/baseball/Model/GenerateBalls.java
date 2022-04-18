package baseball.Model;

import baseball.GameInfo;

/**
 * 컴퓨터가 다른 수로 이루어진 공을 생성
 */
public interface GenerateBalls {
    /**
     * 컴퓨터가 1부터 9까지 서로 다른 수로 이루어진 공을 생성
     * @return 컴퓨터가 생성한 공의 정보를 리턴
     */
    GameInfo generate();
}

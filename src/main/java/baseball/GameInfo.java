package baseball;

/**
 * 숫자 야구 게임에서 사용되는 공의 정보
 */
public class GameInfo {

    private int balls;              // 컴퓨터가 생성한 공
    private int playerBalls;        // 플레이어가 입력한 공
    private int resultBall;         // 볼의 개수
    private int resultStrike;       // 스트라이크의 개수
    private boolean resultNoting;   // 낫싱 여부, FALSE: 볼 또는 스트라이크가 존재, TRUE: 볼 또는 스트라이크가 존재 하지 않음

    public void init() {
        balls = 0;
        playerBalls = 0;
        resultBall = 0;
        resultStrike = 0;
        resultNoting = true;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getPlayerBalls() {
        return playerBalls;
    }

    public void setPlayerBalls(int playerBalls) {
        this.playerBalls = playerBalls;
    }

    public int getResultBall() {
        return resultBall;
    }

    public void setResultBall(int resultBall) {
        this.resultBall = resultBall;
    }

    public int getResultStrike() {
        return resultStrike;
    }

    public void setResultStrike(int resultStrike) {
        this.resultStrike = resultStrike;
    }

    public boolean isResultNoting() {
        return resultNoting;
    }

    public void setResultNoting(boolean resultNoting) {
        this.resultNoting = resultNoting;
    }
}

package baseball.Model;

import baseball.GameInfo;

public class GameRuleImpl implements GameRule{
    @Override
    public GameInfo check(GameInfo gameInfo) {
        int ballCont = 0;
        int strikeCount = 0;
        boolean notingResult = true;

        ballCont = checkBall(gameInfo);
        strikeCount = checkStrike(gameInfo);
        notingResult = checkNoting(ballCont, strikeCount);

        gameInfo = count(gameInfo, ballCont, strikeCount, notingResult);

        return gameInfo;
    }

    @Override
    public int checkBall(GameInfo gameInfo) {
        int ballCount = 0;

        if (gameInfo.getBalls().charAt(0) == gameInfo.getPlayerBalls().charAt(1) ||
                gameInfo.getBalls().charAt(0) == gameInfo.getPlayerBalls().charAt(2))
            ballCount++;
        if (gameInfo.getBalls().charAt(1) == gameInfo.getPlayerBalls().charAt(0) ||
                gameInfo.getBalls().charAt(1) == gameInfo.getPlayerBalls().charAt(2))
            ballCount++;
        if (gameInfo.getBalls().charAt(2) == gameInfo.getPlayerBalls().charAt(0) ||
                gameInfo.getBalls().charAt(2) == gameInfo.getPlayerBalls().charAt(1))
            ballCount++;

        return ballCount;
    }

    @Override
    public int checkStrike(GameInfo gameInfo) {
        int strikeCount = 0;

        if (gameInfo.getBalls().charAt(0) == gameInfo.getPlayerBalls().charAt(0))    strikeCount++;
        if (gameInfo.getBalls().charAt(1) == gameInfo.getPlayerBalls().charAt(1))    strikeCount++;
        if (gameInfo.getBalls().charAt(2) == gameInfo.getPlayerBalls().charAt(2))    strikeCount++;

        return strikeCount;
    }

    @Override
    public boolean checkNoting(int ballCont, int strikeCount) {
        boolean notingRelust = true;

        if(ballCont != 0 || strikeCount != 0)    notingRelust = false;

        return notingRelust;
    }

    @Override
    public GameInfo count(GameInfo gameInfo, int ballCont, int strikeCount, boolean notingResult) {
        gameInfo.setResultBall(ballCont);
        gameInfo.setResultStrike(strikeCount);
        gameInfo.setResultNoting(notingResult);

        return gameInfo;
    }
}

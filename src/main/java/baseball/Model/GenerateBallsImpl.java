package baseball.Model;

import baseball.GameInfo;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class GenerateBallsImpl implements GenerateBalls{
    final int maxBallSize = 3;
    final int startNumber = 1;
    final int endNumber = 9;
    final int notMatching = -1;

    @Override
    public GameInfo generate(GameInfo gameInfo) {
        StringBuilder balls = new StringBuilder();

        while(balls.length() != maxBallSize) {
            int newBall = 0;
            newBall = pickNumberInRange(startNumber, endNumber);
            balls = verifyBall(balls, newBall);
        }

        gameInfo.setBalls(Integer.parseInt(balls.toString()));

        return gameInfo;
    }

    @Override
    public StringBuilder verifyBall(StringBuilder balls, int newBall){
        String tempNewBall = Integer.toString(newBall);

        if(balls.indexOf(tempNewBall) == notMatching)
            balls.append(tempNewBall);

        return balls;
    }
}


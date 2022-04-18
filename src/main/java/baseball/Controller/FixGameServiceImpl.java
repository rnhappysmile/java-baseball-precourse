package baseball.Controller;

import baseball.GameInfo;
import baseball.Model.*;
import baseball.View.Message;
import baseball.View.MessageImpl;

public class FixGameServiceImpl implements FixGameService{
    final String GameRun = "1";

    GenerateBalls generateBalls = new GenerateBallsImpl();
    GameInfo gameInfo = new GameInfo();
    GameRule gameRule = new GameRuleImpl();
    GetPlayerInput getPlayerInput = new GetPlayerInputImpl();
    Message message = new MessageImpl();

    @Override
    public void start() {
        String gameStatus = "1";

        gameInfo.init();
        gameInfo = generateBalls.generate(gameInfo);

        while(gameStatus.equals(GameRun)) {
            message.requestInputBalls();
            gameInfo = getPlayerInput.balls(gameInfo);
            gameInfo = gameRule.check(gameInfo);

            message.gameResult(gameInfo);
            if (gameInfo.getResultStrike() == 3) {
                message.requestRetryGame();
                gameStatus = getPlayerInput.gameStatus();

                if (gameStatus.equals(GameRun)) {
                    gameInfo.init();
                    gameInfo = generateBalls.generate(gameInfo);
                }
            }
        }
    }
}

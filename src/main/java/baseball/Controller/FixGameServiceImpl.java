package baseball.Controller;

import baseball.GameInfo;
import baseball.Model.GenerateBalls;
import baseball.Model.GenerateBallsImpl;

public class FixGameServiceImpl implements FixGameService{

    GenerateBalls generateBalls = new GenerateBallsImpl();
    GameInfo gameInfo = new GameInfo();

    @Override
    public void start() {
        gameInfo.init();
        gameInfo = generateBalls.generate(gameInfo);
    }
}

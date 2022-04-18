package baseball.Model;

import baseball.GameInfo;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class GetPlayerInputImpl implements GetPlayerInput{
    @Override
    public GameInfo balls(GameInfo gameInfo) throws IllegalArgumentException {
        String readCommand = readLine();

        if(readCommand.length() > 3) {
            throw new IllegalArgumentException();
        }
        gameInfo.setPlayerBalls(readCommand);

        return gameInfo;
    }

    @Override
    public String gameStatus() {
        String readCommand = readLine();

        return readCommand;
    }
}

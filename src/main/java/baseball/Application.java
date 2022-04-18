package baseball;

import baseball.Controller.FixGameService;
import baseball.Controller.FixGameServiceImpl;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        FixGameService fixGameService = new FixGameServiceImpl();

        fixGameService.start();
    }
}

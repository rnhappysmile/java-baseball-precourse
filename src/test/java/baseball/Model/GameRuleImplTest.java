package baseball.Model;

import baseball.GameInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameRuleImplTest {

    private GameRule gameRule = new GameRuleImpl();
    private GameInfo gameInfo = new GameInfo();

    @BeforeEach
    void beforeEach() {
        gameInfo.init();
    }

    @Test
    void check() {
        gameInfo.setBalls("123");
        gameInfo.setPlayerBalls("123");
        assertThat(gameRule.checkBall(gameInfo)).isEqualTo(0);
        assertThat(gameRule.checkStrike(gameInfo)).isEqualTo(3);
        assertThat(gameRule.checkNoting(gameRule.checkBall(gameInfo), gameRule.checkStrike(gameInfo))).isEqualTo(false);

        gameInfo.setBalls("123");
        gameInfo.setPlayerBalls("456");
        assertThat(gameRule.checkBall(gameInfo)).isEqualTo(0);
        assertThat(gameRule.checkStrike(gameInfo)).isEqualTo(0);
        assertThat(gameRule.checkNoting(gameRule.checkBall(gameInfo), gameRule.checkStrike(gameInfo))).isEqualTo(true);

        gameInfo.setBalls("123");
        gameInfo.setPlayerBalls("156");
        assertThat(gameRule.checkBall(gameInfo)).isEqualTo(0);
        assertThat(gameRule.checkStrike(gameInfo)).isEqualTo(1);
        assertThat(gameRule.checkNoting(gameRule.checkBall(gameInfo), gameRule.checkStrike(gameInfo))).isEqualTo(false);

        gameInfo.setBalls("123");
        gameInfo.setPlayerBalls("256");
        assertThat(gameRule.checkBall(gameInfo)).isEqualTo(1);
        assertThat(gameRule.checkStrike(gameInfo)).isEqualTo(0);
        assertThat(gameRule.checkNoting(gameRule.checkBall(gameInfo), gameRule.checkStrike(gameInfo))).isEqualTo(false);

        gameInfo.setBalls("123");
        gameInfo.setPlayerBalls("152");
        assertThat(gameRule.checkBall(gameInfo)).isEqualTo(1);
        assertThat(gameRule.checkStrike(gameInfo)).isEqualTo(1);
        assertThat(gameRule.checkNoting(gameRule.checkBall(gameInfo), gameRule.checkStrike(gameInfo))).isEqualTo(false);
    }
}
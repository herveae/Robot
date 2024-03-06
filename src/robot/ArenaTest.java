package robot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArenaTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fight() {
        Robot robot1 = new Robot("robot1");
        Robot robot2 = new Robot("robot2");

        Robot winner= Arena.fight(robot1,robot2);
        assertTrue(winner==robot1 || winner==robot2);
    }
}
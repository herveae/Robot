package robot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNom() {
    }

    @Test
    public void getPv() {
    }

    @Test
    public void testToString() {
        Robot robot = new Robot("robot1");
        assertEquals("Robot robot1",robot.toString() );
    }

    @Test
    public void fire() {
    }

    @Test
    public void isDead() {
    }
}
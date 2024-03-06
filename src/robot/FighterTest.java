package robot;

import static org.junit.Assert.*;

public class FighterTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void fire() {
        Robot robot1 = new Robot("robot1");
        Robot robot2 = new Robot("robot2");

        robot1.fire(robot2);
        assertEquals(8,robot2.getPv());
    }

    @org.junit.Test
    public void testToString() {
        Fighter fighter = new Fighter("fighter1",111);
        assertEquals("Fighter fighter1",fighter.toString() );
    }
}
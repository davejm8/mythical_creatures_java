package tests;

import app.Centaur;
import static org.junit.Assert.*;

import org.junit.Test;

public class CentaurTests {
    @Test
    public void hasAName() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("George", centaur.name);
    }

    @Test
    public void hasABreed() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("Palomino", centaur.breed);
    }

    @Test
    public void hasExcellentBowSkills() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("Twang!!!", centaur.shoot());
    }

    @Test
    public void makesAHorseSoundWhenItRuns() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("Clop clop clop clop", centaur.run());
    }

    @Test
    public void whenFirstCreatedItIsNotCranky() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals(false, centaur.isCranky());
    }

    @Test
    public void whenFirstCreatedItIsStandingUp() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals(true, centaur.isStanding());
    }

    @Test
    public void getsCrankyAfterRunningOrShootingABowThrice() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.run();
        centaur.shoot();
        centaur.run();
        assertEquals(true, centaur.isCranky());
    }
}

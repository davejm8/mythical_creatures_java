package app;

public class Centaur {
    public String name;
    public String breed;
    private Boolean cranky = false;
    private Boolean standing = true;
    private int runAndShootCount = 0;
    public Centaur(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String shoot() {
        runAndShootCount++;
        return "Twang!!!";
    }

    public String run() {
        runAndShootCount++;
        return "Clop clop clop clop";
    }

    public Boolean isCranky() {
        if (runAndShootCount > 2) {
            cranky = true;
        }
        return cranky;
    }

    public Boolean isStanding() {
        return standing;
    }
    public static void main(String[] args) {
    }
}

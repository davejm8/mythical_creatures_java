package app;

public class Wizard {
    public String name;
    public Boolean isBearded;

    public Wizard(String name) {
        this.name = name;
        this.isBearded = true;
    }

    public Wizard(String name, Boolean isBearded) {
        this.name = name;
        this.isBearded = isBearded;
    }

    public String incantation(String command) {
        return "sudo " + command;
    }

    public static void main(String[] args) {

    }
}

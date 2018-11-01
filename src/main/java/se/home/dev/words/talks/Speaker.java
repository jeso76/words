package se.home.dev.words.talks;

public class Speaker {

    private String name;

    public String getName() {
        return name;
    }

    public Speaker withName(String name) {
        this.name = name;
        return this;
    }
}

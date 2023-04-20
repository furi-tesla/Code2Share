package story;

import java.util.Random;

public class Story {

    private Name characterOne;

    private Name characterTwo;

    private Name characterThree;

    public Story() {
        this.characterOne = randomizeCharacter();
        this.characterTwo = randomizeCharacter();
        this.characterThree = randomizeCharacter();
    }

    public Name characterOne() {
        return characterOne;
    }

    public Name characterTwo() {
        return characterTwo;
    }

    public Name characterThree() {
        return characterThree;
    }

    public Name randomizeCharacter() {
        Random random1 = new Random();
        Random random2 = new Random();

        String gender = "";
        if (random1.nextBoolean()) {
            gender = "Female";
        } else if (random2.nextBoolean()) {
            gender = "Male";
        } else {
            gender = "Non-binary";
        }

        return new Name(gender);
    }
}

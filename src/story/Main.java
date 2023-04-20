package story;

public class Main {
    public static void main(String[] args) {
//        Name femaleCharacter = new Name("F");
//        System.out.println(femaleCharacter);
//
//        Name maleCharacter = new Name("M");
//        System.out.println(maleCharacter);
//
//        Name nbCharacter = new Name("NB");
//        System.out.println(nbCharacter);

//        Story story = new Story();
//        System.out.println(story.randomizeCharacter() + "\n" + story.randomizeCharacter() + "\n" + story.randomizeCharacter());

        Story story = new Story();

        String characterOne = story.characterOne().toString();
        String characterTwo = story.characterTwo().toString();
        String characterThree = story.characterThree().toString();

        System.out.println(characterOne);
        System.out.println(characterTwo);
        System.out.println(characterThree);

        System.out.println("____________");
        System.out.println();

        System.out.println(characterOne);
    }
}

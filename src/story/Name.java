package story;

import java.util.Random;

public class Name {

    private String first;
    private String middle;
    private String last;
    private char gender;

    public Name(String gender) {
        this.gender = gender.toUpperCase().charAt(0);
        this.first = randomFirst();
        this.middle = randomFirst();
        this.last = randomLast();

    }

    public String randomFirst() {
        String first = "";

        String[] femNames = {"Allison", "Anastasia", "Belle", "Bethany", "Carol",
                "Denise", "Elle", "Fiona", "Gabriella", "Hazel",
                "Ivy", "Jennifer", "Jolene", "Katherine", "Lily", "Madison",
                "Nancy", "Ophelia", "Persephone", "Queen", "Rachel",
                "Stephanie", "Tammy", "Ursula", "Vivian", "Wilma",
                "Xandra", "Yasmin", "Zoya"};

        String[] mascNames = {"Arthur", "Andrew", "Bob", "Brandon", "Clint",
                "David", "Edgar", "Forrest", "Gene", "Hector",
                "Isaac", "Jacob", "James", "Kobe", "Liam", "Matthew",
                "Nathan", "Oscar", "Patrick", "Quentin", "Robert",
                "Stephen", "Tim", "Usman", "Victor", "Walder",
                "Xavier", "Yusuf", "Zachariah"};

        String[] nbNames = {"Alex", "Awe", "Blake",  "Blair", "Cameron",
                "Dylan", "Evan", "Erin", "Frankie", "Grayson", "Hayden",
                "Indigo", "Jo", "Kai", "Logan", "Morgan",
                "Noel", "Oakley", "Paris", "Quinn", "Robin",
                "Sage", "Tatum", "Urban", "Valentine", "Winter",
                "Xan", "Yael", "Zephyr"};

        if (gender == 'F') {
            Random random = new Random();
            first = femNames[random.nextInt(femNames.length)];
        } else if (gender == 'M') {
            Random random = new Random();
            first = mascNames[random.nextInt(mascNames.length)];
        } else if (gender == 'N') {
            Random random = new Random();
            first = nbNames[random.nextInt(nbNames.length)];
        } else {
            first = "Invalid gender input. Please enter 'F', 'M', or 'N' for non-binary.";
        }

        return first;
    }

    public  String randomLast() {
        String name = "";
        String[] lastName = {"Amon", "Andrews", "Bond", "Baker", "Cunningham",
                "Dubois", "Easton", "Finch", "Grant", "Houser",
                "Iman", "Jacobs", "Kane", "Land", "Moon",
                "Nader", "Opal", "Peterson", "Quiet", "Rohan",
                "Sanders", "Tennant", "Urdu", "Vanderson", "Worcester",
                "Xylo", "Yale", "Zimmerman"};

        Random random = new Random();
        name = lastName[random.nextInt(lastName.length)];

        return name;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String spelledOut() {
        return "The name of your new character is: " +
                first + " " + middle + " " +
                last;
    }

    @Override
    public String toString() {
        return first + " " + middle + " " + last;
    }
}

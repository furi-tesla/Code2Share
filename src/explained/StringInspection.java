package explained;

public class StringInspection {
    public static void main(String[] args) {
        String str = "This is a sample text.";

        int strLength = str.length(); //this method returns the length of the string

        System.out.println(strLength);

        char strCharAtIndex = str.charAt(3); // this method extracts the char at the given index

        System.out.println(strCharAtIndex);

        int indexLocation = str.indexOf("is"); //returns the first index of given char or String

        System.out.println(indexLocation);

        int lastIndexLocation =  str.lastIndexOf('t'); // returns the last index of given char or String

        System.out.println(lastIndexLocation);

        boolean strIsEmpty = str.isEmpty(); // boolean value of whether the String is empty

        System.out.println(strIsEmpty);

        boolean strIsBlank = str.isBlank(); // boolean value of whether the string is empty or contains only whitespace chars

        System.out.println(strIsBlank);
    }
}
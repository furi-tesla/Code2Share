package explained;

public class StringFormattingBasics {

    public static void main(String[] args) {
        System.out.println("Java has several escape sequences that " +
                "we may use: \n this one is for a new line \n \t < this " +
                "one is for \"tab,\" < and this one is for quotation " +
                "marks. \n To insert a \\ you must type it twice.");

        System.out.println("""
                To make a text block,
                you must type \"\"\"
                (triple quotation marks)                
                """);

        System.out.printf("To include an integer %d " + // this (%d) specifies and integer data type
                "in your string,%nyou may use " + // this (%n) specifies a new line
                "this formatting option", 15);

        System.out.printf("To specify the number of decimal" +
                "points in printed decimals,%nyou must use this " +
                "notation: %.2f", 34.5678f); //this specifies 2 digits after the decimal point

        System.out.printf("To format integer numbers, you might use" +
                "%nthis notation: %6d", 100); //this essentially added 3 spaces before the number
        String formattedString = String.format("%nYou may also format string%nvariables as such." +
                "%nYou might want to include variables here: %d", 15);

        System.out.println(formattedString);

        String anotherWayToFormat = "This is another way to format strings%nand add variables: %d".formatted(10);

        System.out.println(anotherWayToFormat);
    }
}

package explained;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Sample text";
        String str2 = "sample tExt";

        boolean strContentEquals = str1.contentEquals(str2);

        System.out.println(strContentEquals);

        boolean strEquals = str1.equals(str2);

        System.out.println(strEquals);

        boolean strIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println(strIgnoreCase);

        boolean strContains = str1.contains("text");

        System.out.println(strContains);

        boolean strEndsWith = str1.endsWith("t"); //char values are not accepted

        System.out.println(strEndsWith);

        boolean strStartsWith = str1.startsWith("Hello");

        System.out.println(strStartsWith);

        boolean strRegionMatches = str1.regionMatches(1,str2, 1, 4);

        System.out.println(strRegionMatches);
    }
}

package explained;
/*````~ - _ DATA CASTING _ - ~''''*\
|_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~|
|  Data casting can be performed   |
| either implicitly or explicitly  |
| Implicit data-casting incurs NO  |
|data loss. Explicit casting might |
| result in data loss. In implicit |
| casting, a smaller data type is  |
|  converted into a compatible,    |
|larger data type. Because of this,|
|  it is sometimes referred to as  |
|  Auto-widening. Since explicit   |
|  casting converts a larger data  |
|type into a smaller data type, it |
|   is sometimes referred to as    |
|        explicit-narrowing.       |
|__________________________________|
 */
public class DataCasting {
    public static void main(String[] args) {
        System.out.println("This is what happens " +
                "when you try to cast a long number which is " +
                "higher in value than the int max value " +
                "into an int data type: " + possibleDataLoss(3_000_000_000L));
        System.out.println("Java casts smaller data types into " +
                "larger data types without an explicit command, " +
                "because there will be no data loss: " + noDataLoss(1234567));
    }

    public static int possibleDataLoss(long number) {
        return (int)number; // < this is the casting of long to int
    } // Explicit narrowing ^

    public static long noDataLoss(int number) {
        long num = number; // < implicit data-casting of int to long
        return num;
    } // Auto-widening ^
}

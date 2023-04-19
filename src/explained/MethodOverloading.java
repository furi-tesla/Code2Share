package explained;
/*````~ - __ METHOD OVERLOADING __ - ~''''*\
|_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~|
|  Method overloading is when you create   |
|several different methods within the same |
|   class under the SAME NAME, but with    |
| DIFFERENT PARAMETERS / arguments. Either |
|  the number, order, or the data type of  |
| the overloaded methods' parameters must  |
| be different from any other methods with |
|the same name. The names of the variables |
| declared within the parameters, and the  |
|    return data type of the overloaded    |
|    method is irrelevant to the method    |
|                signature.                |
|__________________________________________|
 */
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("The perimeter of a circle " +
                "with a radius of 5 cm is: "
                + getPerimeter(5) + " cm.");
        System.out.println("The perimeter of a rectangle " +
                "that is 10 cm in length and 5 cm in width is: "
                + getPerimeter(10,5) + " cm.");
        System.out.println("The perimeter of a triangle " +
                "with side lengths of 5 cm, 10 cm, and 11 cm is: "
                + getPerimeter(5, 10,11) + " cm.");
        System.out.println("The perimeter of a quadrilateral " +
                "with the sides measuring 5 cm, 6 cm, 8 cm, and 10 cm is: "
                + getPerimeter(5,6,8,10) + " cm.");
    }

    //gets perimeter of a circle
    public static double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    //gets perimeter of a rectangle
    public static double getPerimeter(double length, double width) {

        return 2 * (length + width);
    }

    //gets perimeter of a triangle
    public static double getPerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    //gets perimeter of any quadrilateral
    public static double getPerimeter(double sideA, double sideB, double sideC, double sideD) {
        return sideA + sideB + sideC + sideD;
    }
}
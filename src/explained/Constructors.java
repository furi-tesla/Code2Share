package explained;

public class Constructors {
    private String name; // to encapsulate (protect) your code,
    // you should set your fields (class variables) to private access.
    private int age;

    public Constructors() { // this is the default constructor.
    } // It has to have the same name as the class.
    // It doesn't set any values for the fields,
    // it just helps to create a new object from this class.

    public Constructors(String name) { // here we have an example of
        this(name, 0); // constructor chaining with the keyword "this()"
        // this ^ passes on the default value for the field "age" as 0.
        this.name = name; // "this." keyword sets the value of the field
    }

    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

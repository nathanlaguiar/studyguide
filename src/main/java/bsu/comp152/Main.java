/**
 * Encapsulation: This refers to the bundling of data and methods that operate on that data into a single unit, i.e., a class. Encapsulation hides the implementation details of an object from the user and provides a clean interface for interacting with the object.
 *
 * Inheritance: This allows a class to inherit the properties and methods of another class. In Java, inheritance is achieved using the keyword "extends". Inheritance facilitates code reuse and helps in creating a hierarchy of classes.
 *
 * Polymorphism: This allows objects of different classes to be treated as if they are objects of the same class. There are two types of polymorphism in Java: compile-time polymorphism (achieved through method overloading) and runtime polymorphism (achieved through method overriding).
 *
 * Abstraction: This refers to the process of hiding the implementation details of an object and only exposing the essential features. In Java, abstraction is achieved through abstract classes and interfaces.
 *
 * Objects: Java is an object-oriented programming language, which means that everything in Java is an object. Objects are instances of classes and have their own state and behavior.
 *
 * Classes: Classes are the blueprints for creating objects in Java. A class is a template that defines the properties and behavior of objects.
 *
 * Overall, these key features of object-oriented programming in Java help in creating modular, reusable, and maintainable code.
 *
 * \t - tab character: This escape sequence is used to add a horizontal tab space. When it is encountered in a string, it adds a horizontal tab space.
 *newline character /n: This escape sequence is used to move the cursor to a new line. When it is encountered in a string, the output will start on a new line.
 * “short” and “long” ways to assign values to strings: String name =
 * "Laura" vs. String name = new String("Laura")
 *
 *
 * Comparison operators: Comparison operators in Java are used to compare two values and return a boolean value (true or false) depending on the result of the comparison. There are six comparison operators in Java:
 * == (equal to): This operator returns true if the two operands are equal, false otherwise.
 * != (not equal to): This operator returns true if the two operands are not equal, false otherwise.
 * < (less than): This operator returns true if the first operand is less than the second operand, false otherwise.
 * (greater than): This operator returns true if the first operand is greater than the second operand, false otherwise.
 *
 * <= (less than or equal to): This operator returns true if the first operand is less than or equal to the second operand, false otherwise.
 * = (greater than or equal to): This operator returns true if the first operand is greater than or equal to the second operand, false otherwise.
 *Modulus operator: The modulus operator in Java is represented by the % symbol. It is used to find the remainder of a division operation between two operands.
 *
 *You will convert strings s to integers and doubles using
 * Integer.parseInt(s) and Double.parseDouble(s), respectively
 *
 * abs: The abs() method is used to return the absolute value of a number. It takes a single parameter, which can be an integer, float, or double.
 * Example usage:
 *
 * int x = -5;
 * double y = -3.14;
 *
 * int absX = Math.abs(x); // 5
 * double absY = Math.abs(y); // 3.14
 *
 * max and min: The max() and min() methods are used to return the maximum and minimum values of two numbers respectively. Both methods take two parameters, which can be integers, floats, or doubles.
 * Example usage:
 *
 * int x = 5;
 * int y = 10;
 *
 * int maxVal = Math.max(x, y); // 10
 * int minVal = Math.min(x, y); // 5
 *
 *exp and log: The exp() method is used to calculate the exponential value of a number, while the log() method is used to calculate the natural logarithm of a number. Both methods take a single parameter, which can be an integer, float, or double.
 *
 * sin, cos, and tan: The sin(), cos(), and tan() methods are used to calculate the trigonometric sine, cosine, and tangent of an angle specified in radians. They take a single parameter, which is the angle in radians.
 *
 * pow: The pow() method is used to calculate the power of a number. It takes two parameters, which are the base and the exponent, both of which can be integers, floats, or doubles.
 *double base = 2;
 * double exponent = 3;
 *
 * double result = Math.pow(base, exponent); // 8.0
 *
 * sqrt: The sqrt() method is used to calculate the square root of a number. It takes a single parameter, which can be an integer, float, or double.
 * Example usage:
 *
 * double x = 16;
 *
 * double sqrtVal = Math.sqrt(x); // 4.0
 *
 *round: The round() method is used to round a floating-point number to the nearest integer. It takes a single parameter, which can be a float or a double.
 * Example usage:
 *
 * double x = 3.6;
 *
 * long roundedVal = Math.round(x); // 4
 *
 *You will generate random integers, such as random integers 0 through 9, by
 * importing java.util.Random and using commands such as Random rand
 * = new Random(); and rand.nextInt(10);
 *
 *In Java, a static method is a method that belongs to the class rather than an instance of the class. This means that you can call a static method without creating an object of the class. Instead, you call the method by using the class name followed by the method name, like this:
 * ClassName.staticMethodName();
 *public class ExampleClass {
 *   public static void printMessage() {
 *     System.out.println("This is a static method.");
 *   }
 * }
 *
 * // Calling the static method without creating an object
 * ExampleClass.printMessage();
 *
 *In Java, the final keyword can be used in several contexts to indicate that a value or reference cannot be changed.
 * final int MAX_VALUE = 100;
 *You will prompt the user for input by importing java.util.Scanner, and creating a
 *Scanner object, for example with Scanner keyboard = new
 *Scanner(System.in);
 *and read user input with commands like keyboard.nextLine();
 *keyboard.next(); keyboard.nextInt(); and
 *keyboard.nextDouble().You will consume a newline character from the
 *keyboard buffer as needed.
 *. You will throw IllegalArgumentExceptions and other exceptions.
 *
 * You will format strings with commands String.format and printf, for
 * example using printf("length %12.2f \n width %12.2f",
 * Math.pi, 1/3); and printf("length %,d \n width %,d",
 * 1e6, 20000); and using %s and %b
 * For loop: A for loop can be used to repeat a block of code a specific number of times, based on a given condition.
 * Example:
 *
 *
 * for (int i = 0; i < 10; i++) {
 *     System.out.println("Iteration " + i);
 *
 * While loop: A while loop can be used to repeat a block of code as long as a certain condition is true.
 * Example:
 *
 * int i = 0;
 * while (i < 10) {
 *     System.out.println("Iteration " + i);
 *     i++;
 * }
 *
 * Do-while loop: A do-while loop is similar to a while loop, but the block of code inside the braces is executed at least once before the condition is checked.
 * Example:
 *
 *
 * int i = 0;
 * do {
 *     System.out.println("Iteration " + i);
 *     i++;
 * } while (i < 10);
 *
 * Switch statement: A switch statement can be used to execute different blocks of code based on the value of a given expression.
 * Example:
 *
 * go
 * Copy code
 * int dayOfWeek = 3;
 * switch (dayOfWeek) {
 *     case 1:
 *         System.out.println("Monday");
 *         break;
 *     case 2:
 *         System.out.println("Tuesday");
 *         break;
 *     case 3:
 *         System.out.println("Wednesday");
 *         break;
 *     case 4:
 *         System.out.println("Thursday");
 *         break;
 *     case 5:
 *         System.out.println("Friday");
 *         break;
 *     default:
 *         System.out.println("Weekend");
 *         break;
 * }
 *. You will format strings with commands String.format and printf, for
 * example using printf("length %12.2f \n width %12.2f",
 * Math.pi, 1/3); and printf("length %,d \n width %,d",
 * 1e6, 20000); and using %s and %b.
 *
 *
 *
 *You will work with ArrayLists by defining, for example,
 * ArrayList<String> list = new ArrayList<String>();
 *
 *. You will use methods add, size, get, set, remove, and contains.
 *  You will process ArrayLists by looping through them item-by-item andindex-byindex.
 * You will write (blueprint) classes with (private) instance fields and (public)
 * instance methods, including constructors, accessors (getters, like the toString
 * and equals methods), and mutators (setters).
 * See car project
 *
 *
 * 1. You will compare/contrast instance fields and instance methods with static fields
 * and static methods.
 * 2. You will compare instance variables with local variables.
 * 3. You will compare/contrast a “blueprint” class and a “utility” class, such as the one
 * in projectMetric.
 * 4. You will use the reference variable this as a reference to the object, e.g., the
 * expression this.width may refer to the Rectangle object's width field.
 * 5. You will write a copy method (because e.g., Rectangle rect2 = rect1 is a reference
 * copy that copies the address rather than the object).
 * 6. You will overload constructors (and other methods), ensuring that the method
 * signatures differ.
 * 7. You will write a copy constructor.
 * 8. You will write and use classes and instance fields and instance methods in an
 * aggregation context, such for Project 3. (For example, an Animal has-a
 * Rehabilitator.)
 * Use Rectangle.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
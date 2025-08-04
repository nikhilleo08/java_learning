# What is a Java Variable?
A variable provides us with named storage that our programs can manipulate. Each variable in Java has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.

## Variable Declaration and Initialization
You must declare all Variables before they can be used. Java Variables are declared by specifying the data type followed by the variable name. To assign a value, use the assignment (=) operator followed by the value. Each declaration or initialization statement must end with a semicolon (;).


### Syntax
Following is the basic form of a variable declaration −

```java
data type variable [ = value][, variable [ = value] ...] ;
```

## Example of Valid Variables.Variables Declarations and Initializations
- `int a, b, c;        ` Declares three ints, a, b, and c.
- `int a = 10, b = 10; ` Example of initialization
- `byte B = 22;        ` initializes a byte type variable B.
- `double pi = 3.14159;` declares and assigns a value of PI.
- `char a = 'a';       ` the char variable a iis initialized with value 'a'

## Java Variables.Variables Types
The following are the three types of Java Variables:

1. Local Variables
2. Instance Variables
3. Class/Static Variables

## 1. Java Local Variables
- Local Variables are `created when the method, constructor or block is entered` and the variable will be `destroyed once it exits the method, constructor, or block`.
- `Local Variables are declared in methods, constructors, or blocks`.
- `Access modifiers cannot be used for local Variables`.
- `Local Variables are visible only within the declared method, constructor, or block`.
- `Local Variables are implemented at stack level internally`.
- There is `no default value for local Variables`, so local Variables should be declared and an `initial value should be assigned before the first use`.

## 2. Java Instance Variables
- Instance Variables are declared in a `class, but outside a method, constructor or any block`.
- When a space is allocated for an object in the heap, a slot for each instance variable value is created.
- Instance Variables are `created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed`.
- Instance Variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.
- Instance Variables can be declared in class level before or after use.
- `Access modifiers can be given for instance Variables`.
- The instance Variables are `visible` for `all methods, constructors and block in the class`. Normally, it is `recommended` to make these Variables `private (access level)`. `However, visibility for subclasses can be given for these Variables with the use of access modifiers`.
- Instance Variables have `default values`. For `numbers`, the default value is `0`, for `Booleans` it is `false`, and for `object references` it is `null`. `Values can be assigned during the declaration or within the constructor`.
- Instance Variables can be `accessed directly by calling the variable name inside the class`. However, `within static methods (when instance Variables are given accessibility), they should be called using the fully qualified name. ObjectReference.VariableName`.

## 3. Java Static Variables
- `Class variables also known as static variables` are `declared with the static keyword in a class, but outside a method, constructor or a block`.
- There would `only` be `one copy of each class variable per class`, regardless of how many objects are created from it.
- `Static variables are rarely used other than being declared as constants`. `Constants are variables that are declared as public/private, final, and static`. Constant variables never change from their initial value.
- `Static variables are stored in the static memory. It is rare to use static variables other than declared final and used as either public or private constants`.
- Static variables are `created when the program starts and destroyed when the program stops`.
- `Visibility` is `similar to instance variables`. However, `most static variables are declared public since they must be available for users of the class`.
- `Default values are same as instance variables`. For `numbers`, the default value is `0`; for `Booleans`, it is `false`; and for `object references`, it is `null`. `Values can be assigned during the declaration or within the constructor`. Additionally, `values can be assigned in special static initializer blocks`.
- `Static variables can be accessed by calling with the class name ClassName.VariableName`.
- `When declaring class variables as public static final, then variable names (constants) are all in upper case`. `If the static variables are not public and final, the naming syntax is the same as instance and local variables`.
- Example of Static Block:
```java
public class Config {
    static String env;
    static int maxUsers;

    static {
        // Complex logic
        if (System.getenv("ENV") != null && System.getenv("ENV").equals("production")) {
            env = "PROD";
            maxUsers = 1000;
        } else {
            env = "DEV";
            maxUsers = 100;
        }
        System.out.println("Static initializer block executed");
    }

    public static void main(String[] args) {
        System.out.println("Env: " + env);
        System.out.println("Max Users: " + maxUsers);
    }
}
```
### 📌 Why do we need static blocks?
- You use a static block when:
    - You want to assign values to static variables.
    - Initialization needs logic (not just int x = 5;).
    - You need to run setup code when the class is loaded.


### Important Note
| Property                  | Static Initializer Block        |
| ------------------------- | ------------------------------- |
| Runs only once            | ✅ Yes, when class is loaded     |
| Used for static variables | ✅ Yes                           |
| Can contain logic         | ✅ Yes (loops, conditions, etc.) |
| Runs before `main()`      | ✅ Yes                           |



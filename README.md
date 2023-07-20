# Core-Java-Training

## Importance

* Data Type	Size in bytes:
  - Byte -	1 
  - short	- 2
  - int	- 4
  - long - 8
  - float	- 4
  - double - 8
  - char -	2  // But in [c programming](https://www.tutorialspoint.com/cprogramming/c_data_types.htm) char size is '1'.
  - string	// Dependent on string length
  - boolean -	1

* Executable code will have a MAIN method but Libraries will not have a main method.

* Values Type variables are stored in a STACK memory. // Value type is faster that reference type.
* Reference Tpye variables are stored in a HEAP memory.

* String s1 = "Name";
  String s2 = "Name";
  System.out.println(s1 = s2); and System.out.println(s1.equals(s2));--> 
  Both are same.

* But,
  String s1 = "Name";  // This keep the value in String POOL/
  String s2 = new String("Name"); // This keep the value in HEAP memory but outside the String POOL.
  System.out.println(s1 = s2); and System.out.println(s1.equals(s2));--> 
  Both are different.

* Because,
  == operator compares reference (or) memory location
  .equals() method will compare the value of the variables

* String is immutable bu int is mutable.

* String data = NULL; // This is not an error.
    -  In Java, null is a valid value that can be assigned to any reference type, including String.
  But;
     int data = NULL; // This will give an error because In Java, you cannot assign null to a primitive data type.

* In Java, you can assign null to an Integer variable [Integer = NULL], which is the wrapper class for the primitive int type. This is because Integer is an object and can hold a reference to null.

* Integer data = 5;
  int age = data; // No error
  Assigning an integer value to a primitive int variable in Java does not give an error. Both integer data = 5; and int data = 5; are valid assignments.

* [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
  
   ![image](https://github.com/thisarakaushan/Core-Java-Training/assets/125348115/2c64fe98-bc9b-4d1d-9448-4219dc61faea)
   - StringBuilder creates a default capasity(16 bytes) in the memory. 

* Operators:

Operator Category	Operators List
 - Arithmetic {	+, -, /, *, % }
 - Relational {	<, >,  =<, =>, !=, == }
 - Logical {	&&, ||, ! }
 - Bitwise {	&, |, ^ }
 - Shift {	<<, >> }
 - Unary	{ ++, - - }
 - Assignment {	+=, -=, *=, /=, = }

* In Java, [Math](https://www.javatpoint.com/java-math) is not alibrary. It is a class.

* USing Copy con filename.java , we can perform [Command Line](https://github.com/thisarakaushan/Core-Java-Training/tree/main/Day_2/Read%20Input%20using%20%20Command%20Line) Coding in Java.

* Object Oriented Concept in Java:

  1. [Encapsulation](https://www.tutorialspoint.com/java/java_encapsulation.htm#:~:text=Encapsulation%20in%20Java%20is%20a,methods%20of%20their%20current%20class.) : Mainly Security and Modularity.
  2. [Inheritance](https://www.javatpoint.com/inheritance-in-java): Mainly Reusability
  3. [Polymorphism](geeksforgeeks.org/polymorphism-in-java/): means many forms - methods like [Overloading](https://www.javatpoint.com/method-overloading-in-java) and [Overriding](https://www.javatpoint.com/method-overriding-in-java)
  4. [Abstraction](https://www.geeksforgeeks.org/abstraction-in-java-2/)

* <u>Normal Class</u> <strong>cannot</strong> have <u>Abstract method</u>.

* <u>Abstract Class</u> <strong>can have</strong> <u>Normal method</u>.

* Abstraction has two categories such as:
    1. Abstract Class:
           - Normal methods: reusability
           - Abstrcts methods: must be implemented in derived class

    2. Interface: acts like a contract and any class implementing interface must override all the methods.

## Note

* When we are creating classes in same package, that time we don't want to import anypackages.

* If any variable common for every objects, keep that variable as Static.
  - ex: when we are calculating salary of employee in a company, this time company name will be same for every employee. So, we create company variable as Static.
    - String static company = "ABC";
* When method is declare as Static, we don't need to call by object it, we can access by class name.
  - ex: we supposed class name is Employee.
     * we can create static method like --> public static void displayEmpData()
     * we can access this method without creating any object;
            - Employee.displayEmpData();
     * Also we can access using object but some warning will display.

* <u>Static method</u> <strong>cannot</strong> access <u>Normal variable</u> but <u>Normal method</u> <strong>can</strong> access <u>Static variable</u>.

* <u>Normal Class</u> <strong>can have</strong> <u>Static method</u>.

* <u>Normal variable</u> should be <strong>Private</strong>, if not anyone can access and modify them.

* Contructors:
    - Constructor is used initialize the class variables.
    - Contructor name should be as same as class name.
    - Class can have multiple constructors.
    - Contructor doesn't have return type or any void.
    - While we are creating a constructor, a default constructor is automatically created but is hidden from view.
 
* Access Modifiers:
  
                               S a m e  P a c k a g e              O t h e r P a c k a g e
|Access Modifiers | Within Class | Derived Class| Other Class  | Derived Class | Other Class |
|-----------------|--------------|--------------|--------------|---------------|-------------|
| Public          | YES          | YES          | YES          | YES           | YES         |
| Private         | YES          | NO           | NO           | NO            | NO          |
| Protected       | YES          | YES          | YES          | YES           | NO          |
| Default         | YES          | YES          | YES          | NO            | NO          |

  

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
  - boolean -	```1 bit```

* Executable code will have a MAIN method but Libraries will not have a main method.

* **Values Type** variables are stored in a **STACK memory**. --> Value type is faster that reference type.
* **Reference Tpye** variables are stored in a **HEAP memory**.

* String s1 = "Name";
  String s2 = "Name";
  System.out.println(s1 = s2); and System.out.println(s1.equals(s2));--> 
  Both are same.

* But,<br>
  _String s1 = "Name";_  This keep the value in String POOL. <br>
  _String s2 = new String("Name");_ --> This keep the value in **HEAP memory** but outside the String POOL.<br>
  _System.out.println(s1 = s2);_ and System.out.println(s1.equals(s2));--> 
  Both are different.

* Because,
 ``` == operator``` compares reference (or) memory location and 
  ```.equals()``` method will compare the value of the variables

* ```String``` is **immutable** but ```int``` is _mutable_.

* String data = NULL; --> This is not an error.
    -  In Java, null is a valid value that can be assigned to any reference type, including String.
  But;
     int data = NULL; --> This will give an error because In Java, you cannot assign null to a primitive data type.

* In Java, you can assign null to an Integer variable [Integer = NULL], which is the wrapper class for the primitive int type. This is because Integer is an object and can hold a reference to null.

* Integer data = 5;
  int age = data; --> No error
  Assigning an integer value to a primitive int variable in Java does not give an error. Both integer data = 5; and int data = 5; are valid assignments.

* [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
  
   ![image](https://github.com/thisarakaushan/Core-Java-Training/assets/125348115/2c64fe98-bc9b-4d1d-9448-4219dc61faea)
   - StringBuilder creates a default capasity(16 bytes) in the memory. 

#### Operators:

Operator Category	Operators List
 - Arithmetic {	+, -, /, *, % }
 - Relational {	<, >,  =<, =>, !=, == }
 - Logical {	&&, ||, ! }
 - Bitwise {	&, |, ^ }
 - Shift {	<<, >> }
 - Unary	{ ++, - - }
 - Assignment {	+=, -=, *=, /=, = }

* In Java, [``Math``](https://www.javatpoint.com/java-math) is not alibrary. It is a class.

* Using Copy con filename.java , we can perform [Command Line](https://github.com/thisarakaushan/Core-Java-Training/tree/main/Day_2/Read%20Input%20using%20%20Command%20Line) Coding in Java.

* **Object Oriented Concept in Java**:

  1. [Encapsulation](https://www.tutorialspoint.com/java/java_encapsulation.htm#:~:text=Encapsulation%20in%20Java%20is%20a,methods%20of%20their%20current%20class.) : Mainly Security and Modularity.
  2. [Inheritance](https://www.javatpoint.com/inheritance-in-java): Mainly Reusability
  3. [Polymorphism](geeksforgeeks.org/polymorphism-in-java/): means many forms - methods like [Overloading](https://www.javatpoint.com/method-overloading-in-java) and [Overriding](https://www.javatpoint.com/method-overriding-in-java)
  4. [Abstraction](https://www.geeksforgeeks.org/abstraction-in-java-2/)

* _Normal Class_ **cannot have** _Abstract method_.

* _Abstract Class_ **can have** _Normal method_.

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
     * we can create static method like --> **public static void** displayEmpData()
     * we can access this method without creating any object;
            - Employee.displayEmpData();
     * Also we can access using object but some warning will display.

* _Static method_ **cannot access** _Normal variable_ but _Normal method_ **can access** _Static variable_.

* _Normal Class_ **can have** _Static method_ .

* _Normal variable_ should be **Private**, if not anyone can access and modify them.

* Contructors:
    - Constructor is used initialize the class variables.
    - Contructor name should be as same as class name.
    - Class can have multiple constructors.
    - Contructor **doesn't have** return type or any void.
    - While we are creating a constructor, a default constructor is automatically created but is hidden from view.
 
* Access Modifiers:
```  
                               S a m e  P a c k a g e              O t h e r P a c k a g e
|Access Modifiers | Within Class | Derived Class| Other Class  | Derived Class | Other Class |
|-----------------|--------------|--------------|--------------|---------------|-------------|
| Public          | YES          | YES          | YES          | YES           | YES         |
| Private         | YES          | NO           | NO           | NO            | NO          |
| Protected       | YES          | YES          | YES          | YES           | NO          |
| Default         | YES          | YES          | YES          | NO            | NO          |
```

#### Arrays

* Arrays are collections of similar data types.
* Array index starts from zero.
* Array elements are stored sequentially in memory location / requires continous memory.
* Array size cannot be modified / cannot modify the size dynamically.
* Array variable size =  data_type X array_size

* Arrays give easy access to elements and simple data struccture. It has sequential processing and index-based sorting. Also array supports for multidimentional data.

* Types of loops

  Example: int[] numbers = new int[n]
    1. For loop -> _for(int i=0; i<n; i++)_ or _for(int i=0; i<numbers.length; i++)_
            - System.out.println(numbers[i])
    2. For Each loop -> _for(int n: numebrs)_
            - - System.out.println(n)
    3. ForEach -> _numbers.forEach(n -> System.out.println(n))_
 
### Note

* In C programming,               
      - int n;  printf(n);
      - output : ```Garbage value```

* In Java programming,
      - for same output will be an error -> ```compilation error```

* Scanner sc = new Scanner(System.io); <br>
  String str = sc.next();<br>
  Input: _Hello World_ but  **Output**: Hello

* When we use ```nextLine()``` we can get full input line as output.

* If we want to get one character we can use _char = sc.next().**charAt(0)**;_

## Collections and Maps:

<img width="458" alt="image" src="https://github.com/thisarakaushan/Core-Java-Training/assets/125348115/b345d99f-7323-4062-a556-4d25a2ea840d">

<img width="458" alt="image" src="https://github.com/thisarakaushan/Core-Java-Training/assets/125348115/1d7f4624-bc65-4809-b7e4-f03957207fc8">

Click here to review more about [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html).<br>
Click here to review more about [LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html).<br>
Click here to review more about [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html).<br>
Click here to review more about [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html).<br>
Click here to review more about [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html).<br>

#### Wrapper Class:

1. byte - BYTE
2. short - SHORT
3. int - ```Integer```
4. long - LONG
5. float - FLOAT
6. double - DOUBLE
7. char - ```Character```
8. boolean - BOOLEAN

#### ARRAY and ARRAYLIST

* **ARRAYs** are fixed size data structures, meaning that once you declare an array with a specific size, you cannot change it. You need to know the size of gthe array at the timr of declaration. arrays generally have better performance than **ARRAYLISTs** because they have direct access to the elemnts using index_based access.

* **ARRAYLISTs**, on the other hand, are dynamically data structures that can increases in size as needed. They automatically handle the resizing of the array to accommodate new elements. **ARRAYLISTs** are part of the standard library (Java Collection Framework) and provide additional features like dynamic resizing, easy addition and removal of elements.

* Declaration ArrayList : Use ```util``` package
 _ ArrayList<Integer> data = new ArrayList<Integer>();_

    - Example:
     ``` 
      import java.util.ArrayList;
      import java.util.Scanner;

      public class AddNumbers {
      
          public static void main(String[] args) {
      
              Scanner scanner = new Scanner(System.in);
              ArrayList<Integer> numbers = new ArrayList<>();

              System.out.println("Enter the first number: ");
              int num1 = scanner.nextInt();
              numbers.add(num1);

              System.out.println("Enter the second number: ");
              int num2 = scanner.nextInt();
              numbers.add(num2);

              int sum = numbers.get(0) + numbers.get(1);
              System.out.println("Sum of the two numbers: " + sum);

              scanner.close();
          }
       }
     ```
  **or**

  _List<Integer> data = Arrays.asList(10,20)_

    - Example:
      ```
      import java.util.ArrayList;
      import java.util.Arrays;
      import java.util.List;
      import java.util.Scanner;

      public class AddNumbers {

          public static void main(String[] args) {
      
              Scanner scanner = new Scanner(System.in);

              System.out.println("Enter the first number: ");
              int num1 = scanner.nextInt();

              System.out.println("Enter the second number: ");
              int num2 = scanner.nextInt();

              List<Integer> numbers = Arrays.asList(num1, num2);

              int sum = numbers.get(0) + numbers.get(1);
              System.out.println("Sum of the two numbers: " + sum);

              scanner.close();
          }
      }
      ```

  * Creating a ```.jar``` file we can run it from command prompt. _Runnable jar_ file has a **main method**. But noraml _jar file_ hasn't main method.

#### ARRAYLIST AND LINKEDLIST

* **ARRAYLIST** provides faster  accesss to elements using index-based access as it can directly calculate the memory location of the elements. However, insertions and deletions in the middle of the list require shifting elements which can be slow for large lists. **ArrayList** generally uses less memory than **Linkedlist** since it only needs to store the elements and the dynamic array that holds them.

  - Using ```eachCapasity()``` we can check the size of the **ArrayList** before initialize the size.
 
##### [ArrayList Predefined Functions](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

<img width="270" alt="image" src="https://github.com/thisarakaushan/Core-Java-Training/assets/125348115/cb454648-86db-4ab7-bb00-57af6c4f7c20">



* **LinkedList** is more efficient for frequent insertions and deletions in the middle of the list because it only requires updating the pointers. However, accessing elements by index, it needs to traverse the list from beginning or end to reach the desired elements. **LinkedList** uses more memory as it needs to store additional pointers(prevoius and next elements addresses) for each elements.

    - Uses ```AddFirst(E e)``` method to add element to the beginning of the list. It takes boolean value.
    - and ```AddLast(E e)``` method to add element to the end of the list. It takes void.
 
##### [LinkedList Predefined Functions](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)

<img width="344" alt="image" src="https://github.com/thisarakaushan/Core-Java-Training/assets/125348115/c59c852e-f101-46b4-ae79-819de6274101"><br>
<img width="341" alt="image" src="https://github.com/thisarakaushan/Core-Java-Training/assets/125348115/3304798c-f67b-44a9-8d77-c118130b1d7f">

 
#### Compilation Error and Runtime Error

* A **compilation error**, also known as a _compile-time error_ or _syntax error_, occurs when the source code written by the programmer does not conform to the rules of the programming language. It happens during the compilation phase when the code is being translated into machine-executable code by the compiler. Compilation errors prevent the successful creation of an executable program and must be fixed before the code can be executed.<br><br>
     Example:
        - missing of ```semicolon ;``` or ```double quote ""```, etc...
        - String assigns to an integer values

  * A **runtime error**, also known as _an exception_ or _a run-time exception_, occurs during the execution of the program. It happens when the code is running, and the program encounters an unexpected situation that it cannot handle. Runtime errors cause the program to terminate abnormally if not caught and handled properly through exception handling mechanism.<br><br>
     Example:
        - [ArrayIndexOutOfboundException](https://docs.oracle.com/javase/8/docs/api/java/lang/ArrayIndexOutOfBoundsException.html)
        - [ArithmeticException](https://docs.oracle.com/javase/8/docs/api/java/lang/ArithmeticException.html)
        - [NumberFormatException](https://docs.oracle.com/javase/8/docs/api/java/lang/NumberFormatException.html)
        - [NullPointerException](https://docs.oracle.com/javase/8/docs/api/java/lang/NullPointerException.html) 
        - [more](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runtime.html#:~:text=Class%20Runtime&text=Every%20Java%20application%20has%20a,own%20instance%20of%20this%20class.)

* We can control using [Exception Handling](https://docs.oracle.com/en/database/other-databases/timesten/22.1/plsql-developer/understanding-exceptions.html#GUID-4789C4D0-E366-4016-AF57-B552377CF6A1).
  

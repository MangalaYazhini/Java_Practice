class Datatypes
{

  enum Day {SUN, MON, TUE,WED, THUR, FRI , SAT} ; 
  public static void main(String[] args) 
  {
    /*
    Primitive Data Types: 
    Store simple values directly in memory.
    These primitive datatypes store raw values and are not objects.
    The primitive datatypes do not have methods and are faster and uses less memory. 

    1. byte     - 8-bit signed integer
    2. short    - 16-bit signed integer
    3. int      - 32-bit signed integer
    4. long     - 64-bit signed integer
    5. float    - 32-bit floating point
    6. double   - 64-bit floating point
    7. char     - 16-bit Unicode character
    8. boolean  - Logical values
       

    Non-Primitive Data Types: 
    Store memory references to objects.
    Non-primitive data types store references (memory addresses) rather than actual values.

    1. String     - Represents a sequence of characters enclosed in double quotes.
    2. Array      - An array stores multiple elements of the same type in a single structure.
    3. Class      - A class is a user-defined blueprint that defines variables and methods. It represents a type of object.  
    4. Object     - An Object is an instance of a class representing real-world entities. It has state (data), behavior (methods), and identity (unique reference).
    5. Interfaces - An interface defines a contract of abstract methods that implementing classes must define. It provides a way to achieve abstraction and multiple inheritance in Java.
    6. Collections (ArrayList, HashMap, etc.) - Collections are advanced data structures used to store and manipulate groups of objects dynamically.


    */

    /*

    Type Conversion	 - Java converts types automatically a smaller data type into a larger one because no data loss will happen.
    Type Casting	   - Programmer converts types manually of a larger data type into a smaller one resulting in Data loss, Overflow, Unexpected values

    */


    // byte datatype
    // 8-bit signed integer  : 1byte (−128 to +127)

    byte byte_val1 = 10 ; 
    byte byte_val2 = (byte) 128 ; // Casting 128 % 256 = -128
    byte byte_val3 = (byte) 260 ; // Casting 260 % 256 = 4 

    System.out.println("\nbyte datatype : ");
    System.out.println("byte_val1 = " + byte_val1); 
    System.out.println("byte_val2 = " + byte_val2); 
    System.out.println("byte_val3 = " + byte_val3); 

    // short datatype
    // 16-bit signed integer : 2byte (−32,768 to 32,767)

    short short_val1 = 30000 ; 
    short short_val2 = (short)40000 ; //  Casting 40000 % 65536 = -25536

    System.out.println("\nshort datatype : ");
    System.out.println("short_val1 = " + short_val1); 
    System.out.println("short_val2 = " + short_val2); 

    // int datatype
    // 32-bit signed integer : 4byte (−2,147,483,648 to 2,147,483,647)

    int int_val1 = 100000 ; 
  
    System.out.println("\nint datatype : ");
    System.out.println("int_val1 = " + int_val1); 

    // long datatype
    // 64-bit signed integer : 8 byte 

    long long_val1 = 9876543210L ; 
  
    System.out.println("\nlong datatype : ");
    System.out.println("long_val1 = " + long_val1); 

    // float datatype
    // 32-bit signed float : 4 byte 

    float float_val1 = 3.14f ; 
  
    System.out.println("\nfloat datatype : ");
    System.out.println("float_val1 = " + float_val1); 
   
    // double datatype
    // 64-bit signed float : 8 byte 

    double double_val1 = 3.1415926535 ; 
  
    System.out.println("\ndouble datatype : ");
    System.out.println("double_val1 = " + double_val1); 


    // char datatype
    // 16-bit single character : 2 byte 

    char char_val1 = 'a' ; 
  
    System.out.println("\nchar datatype : ");
    System.out.println("char_val1 = " + char_val1); 


    // boolean datatype
    // (logical)

    boolean boolean_val1 = true ; 
    boolean boolean_val2 = false ; 
  
    System.out.println("\nboolean datatype : ");
    System.out.println("boolean_val1 = " + boolean_val1); 
    System.out.println("boolean_val2 = " + boolean_val2); 

    // String datatype
    // Stores text and Immutable

    String string_val1 = "Java";
    
    System.out.println("\nString datatype : ");
    System.out.println("string_val1 = " + string_val1); 

    // Array datatype
    // Stores multiple values of same type

    
    
    int[] array_numbers = {1, 2, 3, 4};
    System.out.println("\nArray datatype : ");
    for(int i=0 ; i<array_numbers.length ; i++)
    {
      System.out.println("array_numbers" + "[" + i + "]" + " = " + array_numbers[i]); 
    }
  
    // Class and Object

    System.out.println("\nclass and object datatype : ");
    Student std1 = new Student();
    std1.id = 1;
    std1.name = "Chezhian";
    std1.print_details(); 

    Student std2 = new Student(2,"Priya");
    std2.print_details(); 


    // enum datatype

    Day today = Day.MON ; 
    System.out.println("\nenum datatype : ");
    System.out.println("today is "+today);




    
  }
}

class Student 
{
    int id;
    String name;

    Student() 
    {
      System.out.println("\nStudent object is created!");
    }

    Student(int id, String name) 
    {
      this.id = id;
      this.name = name;
    }

    void print_details() 
    {
      System.out.println("\nStudent Details:");
      System.out.println("Student id = " + id);
      System.out.println("Student name = " + name);
    }
}

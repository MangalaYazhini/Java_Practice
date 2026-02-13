public class Java_Operators {
  public static void main(String[] args) 
  {
    // Operators are used to perform operations on variables and values.
    // Arithmetic Operators

    int x = 10;
    int y = 3;
    int z = 5 ; 
    int w = 25 ; 

    System.out.println("\nArithmetic Operators");
    System.out.println(x + y); // 13  Addition 
    System.out.println(x - y); // 7   Subtraction
    System.out.println(x * y); // 30  Multiplication
    System.out.println(x / y); // 3   Division
    System.out.println(x % y); // 1   Modulus

    // Unary Operators
    // post increment 
    System.out.println("\nUnary Operators");
    System.out.println("\npost increment by 1 , z = "+ (z++));
    System.out.println("After post increment : z = "+ z);
    // post decrement 
    System.out.println("\npost decrement by 1, z = "+ (z--));
    System.out.println("After post decrement : z = "+ z);


    // pre increment 
    System.out.println("\npre increment by 1, w = "+ (++w));
    System.out.println("After pre increment : w = "+ w);
    // pre decrement 
    System.out.println("\npre decrement by 1, w = "+ (--w));
    System.out.println("After pre decrement : w = "+ w);


    // Assignment Operators
    // Assignment operators are used to assign values to variables.

    System.out.println("\nAssignment Operators");
    int a = 200 ; // Assignment 
    System.out.println("\na = "+a);

    a += 10 ; 
    System.out.println("a += 10 : a = "+a); 

    a -= 20 ; 
    System.out.println("a -= 20 : a = "+a); 

    a /= 5 ; 
    System.out.println("a /= 5 : a = "+a); 

    a *= 2 ; 
    System.out.println("a *= 2 : a = "+a); 

    a %= 3 ; 
    System.out.println("a %= 3 : a = "+a); 


    int b = 10 ; 
    System.out.println("\nb = "+b);
    
    b &= 6 ; 
    System.out.println("b &= 6 : b = "+b); 

    b |= 6 ; 
    System.out.println("b |= 6 : b = "+b); 

    b ^= 6 ; 
    System.out.println("b ^= 6 : b = "+b); 

    int c = 35 ; 
    System.out.println("\nc = "+c);

    c >>= 3 ; 
    System.out.println("c >>= 3 : c = "+c); // 35/(2^3) => 35/8 = 4 

    c <<= 4 ; 
    System.out.println("c <<= 4 : c = "+c); // 4*(2^4) => 16*4 = 64 


    //Comparison Operators
    //Comparison operators are used to compare two values (or variables).
    int p = 10;
    int q = 3;
    int r = 5;

    System.out.println("\nComparison Operators");
    System.out.println("p > q: " + (p > q));
    System.out.println("p < q: " + (p < q));
    System.out.println("p >= q: " + (p >= q));
    System.out.println("p <= q: " + (p <= q));
    System.out.println("p == r: " + (p == r));
    System.out.println("p != r: " + (p != r));



    //Logical Operators
    //Logical operators are used to determine the logic between variables or values, by combining multiple conditions.
    boolean m = true;
    boolean n = false;

    System.out.println("\nLogical Operators");
      
    System.out.println("m && n: " + (m && n));
    System.out.println("m || n: " + (m || n));
    System.out.println("!m: " + (!m));

    // Bitwise operators
    int val3 = -8; 
    int val1 = 1;
    int val2 = 11;
    
  
    System.out.println("\nBitwise Operators");
    System.out.println("val1 & val2 : " + (val1 & val2));
    System.out.println("val1 | val2 : " + (val1 | val2));
    System.out.println("val1 ^ val2 : " + (val1 ^ val2));

    System.out.println("~val1 : " + (~val1));

    System.out.println("val2 << 2 : " + (val2 << 2)); // 11 * (2^2) = 11*4 = 44
    System.out.println("val2 >> 1 : " + (val2 >> 1)); // 11 / (2^1) = 11/2 = 5 
    
    System.out.println("val3 >>> 1 : " + (val3 >>> 1));
    System.out.println("val3 >> 1 : " + (val3 >> 1));


    // instanceof Operator
    //The instanceof operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass, or an interface.


    System.out.println("\ninstanceof Operators");
    String str_obj = "Hello";
    System.out.println(str_obj instanceof String); 

    Object int_obj = 10;
    System.out.println(int_obj instanceof Integer); 
    System.out.println(int_obj instanceof String); 
}
}

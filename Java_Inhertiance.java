class BasicMathBook 
{
  BasicMathBook() {
    System.out.println("\nBasic Math Book is used to learn basic math operations.");
  }
  void printBook()
  {
    System.out.println("This is Basic Math book");
  }

  int add(int num1 , int num2) {
    int sum = num1+num2 ; 
    System.out.println("sum : " + sum);
    return sum ; 
  }

  int subtract(int num1 , int num2) {
    int difference = num1 - num2 ; 
    System.out.println("difference : " + difference);
    return difference ; 
  }

  int multiply(int num1 , int num2) {
    int product = num1 * num2 ; 
    System.out.println("product : " + product);
    return product ; 
  }
  
  int divide(int num1 , int num2) {
    int quotient = num1 / num2 ; 
    System.out.println("quotient : " + quotient);
    return quotient ; 
  }

  int pow(int num1){
    int raised = num1 * num1; 
    System.out.println("Raised to power 2 : "+raised);
    return raised ; 
  }
  
  int pow(int num1 , int num2){
    int raised = (int) (Math.pow((double)num1 , (double)num2)); 
    System.out.println("Raised to power "+ num2 +" "+raised);
    return raised ; 
  }

  double calArea(double radius){
    double PI = 3.14  ; 
    double area = radius * radius * PI; 
    System.out.println("Area: "+area);
    return area ; 
  }

}
  
class AdvMathBook extends BasicMathBook
{
  AdvMathBook() {
    System.out.println("Advanced Math Book is used to learn advanced math operations.");
  }
  @Override
  void printBook()
  {
    System.out.println("This is Advanced Math book");
  }

  double calVolume(double radius){
    double PI = 3.14159265359 ; 
    double volume = (4.0/3.0) * PI * Math.pow(radius,3); 
    System.out.println("Volume: "+volume);
    return volume ; 
  }

  @Override
  double calArea(double radius){
    double PI = Math.PI  ; 
    double area = radius * radius * PI; 
    System.out.println("Area: "+area);
    return area ; 
  }

  double calCircumference(double radius){
    double PI = 3.14  ; 
    double circumference = 2 * radius * PI; 
    System.out.println("Circumference: "+circumference);
    return circumference ; 
  }
  
}

class ExpertMathBook extends AdvMathBook
{
  ExpertMathBook() {
    System.out.println("Expert Math Book is used to learn expert math operations.");
  }
  @Override
  void printBook()
  {
    System.out.println("This is Expert Math book");
  }

  double squareRoot(int num1)
  {
    double sqrtVal = Math.sqrt(num1) ;
    System.out.println("Square root of "+num1 + " " + sqrtVal);
    return sqrtVal; 
  }

}


public class Java_Inhertiance {

  public static void main(String[] args) {
    
    BasicMathBook basicMath = new BasicMathBook(); 
    // System.out.println("Basic Math Book");
    basicMath.add(10,20);
    basicMath.subtract(45,28); 
    basicMath.calArea(4); 


    // System.out.println("\n\nAdvanced Math Book");
    AdvMathBook advancedMath = new AdvMathBook(); 
    advancedMath.multiply(3,12);                // Inherited Method
    advancedMath.divide(48,7);                  // Inherited Method
    advancedMath.calArea(4);            // Method Overriding 
    advancedMath.calVolume(4);          // New Method in AdvMathBook
    advancedMath.calCircumference(4);   // New Method in AdvMathBook

    System.out.println("\nPower Function Demonstration: ");

    // Method Overloading 
    advancedMath.pow(5); 
    advancedMath.pow(5,3);  




    // System.out.println("-".repeat(35));
   
    System.out.println("\nUpcasting and Downcasting");

    // Upcasting
    BasicMathBook book =  new AdvMathBook();  // BasicMathBook book = (BasicMathBook) new AdvMathBook();
    book.printBook();                         // Advanced Math Book due to Method Overriding 
    book.add(100,200); 
    book.calArea(4);                  // Method Overriding 

    // book.calCircumference(5);             // This method do not exist for the type BasicMathBook
    // book.calVolume(10);                   // This method do not exist for the type BasicMathBook 


    // Downcasting
    // No new object is created. The reference variable is type casted to the child class type.
    AdvMathBook mybook = (AdvMathBook) book ; // Downcasting - Explicit Type Casting 
    mybook.printBook(); // Advanced Math Book
    mybook.calArea(5); 
    mybook.calVolume(5);


    System.out.println("-".repeat(100));
    System.out.println("Dynamic Method Dispatch");
    
    // Run time polymorphism - Dynamic Method Dispatch
    BasicMathBook book1 = new BasicMathBook(); 
    book1.printBook();

    book1 = new AdvMathBook(); 
    book1.printBook();


    book1 = new ExpertMathBook(); 
    book1.printBook();



  }
  
}

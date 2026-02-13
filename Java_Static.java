public class Java_Static
{
  static int totalInstances ;  // The static variable is common to all the objects. 
  int score ; 
  
  // Static block runs once when the class is loaded into memory.
  // Object creation may trigger class loading, but static blocks can run even without creating objects.
  
  static
  {
    totalInstances = 0 ; 
    System.out.println("Static block");
  }

  // The constructor is called for each object creation.
  StaticVariable() 
  {
    System.out.println("Class constructor");
    totalInstances ++ ; 
  }

  void myPrint()
  {
    System.out.println("Welcome to Java Programming !");
  }


  // The static function can indirectly access the non-static variable by passing the object. 
  static void getScore(StaticVariable obj)
  {
    System.out.println("Score : " + obj.score);
  }

  // The static function can directly access only the static variables 
  static void getTotalInstances()
  {
    System.out.println("Total Instances : " + totalInstances);
  }

  

  public static void main(String[] args) 
  {
    StaticVariable obj1 = new StaticVariable(); 
    StaticVariable obj2 = new StaticVariable(); 
    StaticVariable obj3 = new StaticVariable(); 

    
    obj1.score = 100 ; 
    obj2.score = 500 ; 
    obj3.score = 800 ; 

    obj1.myPrint(); 
    obj2.myPrint(); 
    obj3.myPrint(); 


    StaticVariable.getTotalInstances(); 
    System.out.println(StaticVariable.totalInstances);


    StaticVariable.getScore(obj1); 
    StaticVariable.getScore(obj2); 
    StaticVariable.getScore(obj3); 
  }

}

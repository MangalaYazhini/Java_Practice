class Java_Class
{
  int intVar = 10 ; 
  double doubleVar = 50.454; 
  String strVar = "Hello World"; 
  boolean boolVar = true ; 
  char charVar = 'A'; 

  char[] charArray = {'a','b','c','d'};

  void myPrint(String statement) 
  {
    System.out.println("\n"+statement);
  }

  boolean compareIntValues(int value1 , int value2)
  {
    if(value1 > value2)
      return true; 
    else 
      return false;  
  }


  public static void main(String[] args) 
  {
    MyClass myobj = new MyClass(); 
    
    System.out.println(myobj.intVar);
    System.out.println(myobj.doubleVar);
    System.out.println(myobj.strVar);
    System.out.println(myobj.boolVar);
    System.out.println(myobj.charVar);

    System.out.println("Character Array : ");
    for(char ch : myobj.charArray)
    {
      System.out.print(ch + " ");
    }

    myobj.myPrint("Hello, Welcome to Java Programming!");
    boolean compareResult = myobj.compareIntValues(50, 50); 
    System.out.println("compareResult : "+compareResult);
  }
}

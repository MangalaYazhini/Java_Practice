
public class Java_String {
  
  public static void main(String[] args) {
    

    String mystr1 = "java"; 
    String mystr2 = "java"; 

    String mystr3 = new String("java");
 
    if(mystr1 == mystr2)
    {
      System.out.println("mystr1 and mystr2 are referred to the same string");
    }
    if(mystr1 != mystr3)
    {
      System.out.println("\nmystr1 and mystr3 are not referring the same string");
      System.out.println("mystr1 -> SCP");
      System.out.println("mystr3 -> String object in heap");
    }
    if(mystr2 != mystr3)
    {
      System.out.println("\nmystr2 and mystr3 are not referring the same string");
      System.out.println("mystr1 -> SCP");
      System.out.println("mystr3 -> String object in heap");
    }
  }
  

}

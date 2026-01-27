public class Loops {
  public static void main(String[] args) {
    
    int[] numbers = {10,20,30,40,50};
    

    // For Loop
    for(int i=0 ; i<numbers.length ; i++)
    {
      System.out.println(numbers[i]);
    } 

    // Enhanced For Loop or For Each Loop
    String[] colors = {"red", "green", "yellow", "blue", "white", "black"};

    for (String color : colors) 
    {
      System.out.println(color);
    }


    // While Loop

    int max = 20 ; 
    int num = 1 ; 

    while (num < max)
    {
      System.out.println("num " + num);
      num = num*2 ; 
    }


    // do while loop
    // This loop will execute the code block once, before checking if the condition is true. 
    // Then it will repeat the loop as long as the condition is true.

    boolean value = false;

    do{
      System.out.println("value " + value);
      
    }while (value != false);
    
  }
}

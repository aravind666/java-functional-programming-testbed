import java.util.*;

public class Sample {  
  public static boolean isGT3(int number) {
    System.out.println("isGT3 called for " + number);
    return number > 3;
  }
  
  public static boolean isEven(int number) {
    System.out.println("isEven called for " + number);
    return number % 2 == 0;
  }

  public static int doubleIt(int number) {
    System.out.println("doubleIt called for " + number);
    return number * 2;
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
    
    numbers.stream()
      .filter(Sample::isGT3) 
      .filter(Sample::isEven)
      .map(Sample::doubleIt) 
      //.findFirst() //comment this line only out and run the code to see the laziness
      ;
      
    System.out.println("DONE");
    
    //functional style uses functional composition

    //functional programming is functional composition + lazy evaluation
    
    //Polymorphism is to object-oriented programming as lazy evaluation is
    //to functional programming
    
    //lazy is efficiency
  }
}



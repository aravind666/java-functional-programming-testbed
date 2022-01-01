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
    //functional programming == functional composition + lazy evaluation
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
    
    //find the double of the first even number greater than 3
    //Imperative solution
    Integer result = null; //smell
    
    for(int e: numbers) {
      if(isGT3(e) && isEven(e)) {
        result = doubleIt(e);
        break;
      }
    } 
    
    System.out.println(result); 
    
    //how much work was done in the imperative style?
    //8 units of work
    
    System.out.println("------------");
    //functional style
    System.out.println(
      numbers.stream()
        .filter(Sample::isGT3) // 10 
        .filter(Sample::isEven) //7
        .map(Sample::doubleIt) //4
        .findFirst()
        .orElse(0));
    
    //how much work was done in the functional style?
    //if we look at the code but don't *see* it :)
    // we do 21 operations!!
    //Get me out of here this is not efficient.
    
    //Thankfull that is not the case.
    //streams are fundamentally lazy
    
    //stream does not run a function for all the values
    //Instead, it fuses or merges the functions and executes
    //a collection of functions for elements but only as little as necessary.
  }
}
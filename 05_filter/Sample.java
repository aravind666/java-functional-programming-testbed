import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    //filter
    
    //given a collection of data, pick only those that
    //statisfy the given predicate (lambda) and throw away the rest
    
    //given collection of n values
    //the result may have 0 < result <= n values
    //the output is a subset of the input
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    numbers.stream()
      .filter(e -> e > 6)
      .forEach(System.out::println);  
  }
}
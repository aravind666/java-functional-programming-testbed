import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    //map

    //x1, x2, ..., xn and a function f(x)
    //map performs yi = f(xi)
    
    // # of output == # of input
    // type of the output may be different than the type of the input
        
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    numbers.stream()
      .map(e -> e * 2.0)
      .forEach(System.out::println);
      
    //both map and forEach are higher-order functions  
  
    //given an stream if Integer, we got a stream of Double
    // Stream<Integer>.map( function transform int to double) ===> Stream<Double>
  }
}
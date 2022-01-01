import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 8, 4, 3);

    System.out.println(
      numbers.stream()
        .filter(e -> e % 2 == 0)
        .mapToInt(e -> e * 2)
        .sum()); // sum is also a reduce operation
        
    //max, min, etc. are also reduce
  }
}



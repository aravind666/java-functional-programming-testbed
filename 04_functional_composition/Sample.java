import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");  
    
    //get a list of names of length 4 in uppercase
    
    List<String> result = 
      names.stream()
        .filter(name -> name.length() == 4)
        .map(name -> name.toUpperCase())
        .collect(toList());
        
    System.out.println(result);
    
    //functional composition
    
    //  List                  vs                    Stream
    //  bucket of data                      Pipeline of functions
    //  stores data                         stores functions
    // data structure                       abstraction
    
    //we work with a collection of functions and not a collection of data
    //we form a pipeline of functions to process a stream of data
  }
}
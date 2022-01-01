import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

    System.out.println(
      numbers.stream()
        .filter(e -> e % 2 == 0)
        .map(e -> e * 2)
        .reduce(0, (total, e) -> total + e));

    /*
    reduce goes from a Stream to a non-stream

         filter       map           reduce
  x1       |                      0
  ---------|-----------------------\-----------------------------------
  x2  ---------->     y2  ------>  op
  ---------|--------------------------\--------------------------------
  x3       |                           \
  ---------|----------------------------\------------------------------
  x4  ---------->    y4  ----------->   op
  ---------|-------------------------------\---------------------------
  x5       |                                \
  ---------|---------------------------------\-------------------------
  x6  ---------->    y6  ------------------> op 
                                               \ --- result
  
  
                        ei
                        |
                        |
                        |
        init   ---->    op -------------->
                 ^            |
                 |            |
                 |            |
                 -------------      
        
        
    */
  }
}



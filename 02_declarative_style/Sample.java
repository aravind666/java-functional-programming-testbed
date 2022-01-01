import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<String> names = 
      Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");
      
    //do we have Nemo?
    
//    //imperative: tell what to do and *also* tell how to do it
//    
//    boolean found = false;
//    
//    //for(int i = 0; i < names.count, size, length)
//    
//    for(String name: names) {
//      //if(name == "Nemo")
//      if(name.equals("Nemo")) {
//        found = true;
//        break;
//      }
//    }
//    
//    if(found) {
//      System.out.println("Nemo found");
//    } else {
//      System.out.println("Nemo not found");
//    }

    //smells of imperative style:
    //we use a lot of garbage variables
    //we mutate variable - error prone, hard to understand, 
    //hard to parallelize.
    
    //Declarative style: tell what do to and *not* how to do it
    //we focus on the problem and not on the steps to solve it
    //we rely on underlying library of functions (better abstraction)
    //to take care the "how"
    
    if(names.contains("Nemo")) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
    
  }
}
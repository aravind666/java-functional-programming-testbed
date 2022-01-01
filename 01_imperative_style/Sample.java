import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<String> names = 
      Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");
      
    //do we have Nemo?
    
    //imperative: tell what to do and *also* tell how to do it
    
    boolean found = false;
    
    //for(int i = 0; i < names.count, size, length)
    
    for(String name: names) {
      //if(name == "Nemo")
      if(name.equals("Nemo")) {
        found = true;
        break;
      }
    }
    
    if(found) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo found");
    }
  }
}
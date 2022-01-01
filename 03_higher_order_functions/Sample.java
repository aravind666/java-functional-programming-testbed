import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    //Functional style: we use higher-order function
    
    //functions
    //we pass objects to functions
    //we create objects in functions
    //we can return objects from functions
    
    //higher-order functions
    //we pass functions to functions
    //we create functions in functions
    //we can return functions from functions      
    
    //we did object decomposition so far
    //we can also do functional decomposition
    
    //we once viewed the Thread constructor as a function
    //Thread th = new Thread(new Runnable() {
    //  public void run() {
    //    System.out.println("In another thread");
    //  }
    //});

    //Rather than passing an object, why not pass a function?

    //we now viewed the Thread constructor as a higher-order function
    Thread th = new Thread(() ->System.out.println("In another thread"));
    th.start();
    
    System.out.println("In main");
  }
}
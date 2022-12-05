
package reverse;


public class Reverse {

    
    public static void main(String[] args) {
       
        String x="hassan reverse me";
        System.out.println(test(x));
    }

    public static String test(String x){
    
        return  new StringBuilder(x)
                .reverse()
                .toString();
                
    }
  
}   
package Recursion;

public class SkipApple {

    public static void main(String[] args) {
        System.out.println(removeA("bccappledah"));
       }
   
       public static String removeA(String up) {
   
           if(up.isEmpty()){
               return "";
           }
   
           char ch=up.charAt(0);
   
           if(up.startsWith("apple")){
               return removeA(up.substring("apple".length()));
           }else{
               return ch+removeA(up.substring(1));
           }
   
           
       }
   
    
}

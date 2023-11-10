package Recursion;

public class SkipApple2 {

    public static void main(String[] args) {
        removeA("","bccadappleh");
       }
   
       public static void removeA(String s,String up) {
   
           if(up.isEmpty()){
               System.out.println(s);
               return;
           }
   
           char ch=up.charAt(0);
   
           if(up.startsWith("apple")){
               removeA(s, up.substring("apple".length()));
           }else{
               removeA(s+ch, up.substring(1));
           }
   
           
       }
       
    
}

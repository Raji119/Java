package Recursion;

public class RemoveA4 {

    public static void main(String[] args) {
        System.out.println(removeA("bccadah"));
       }
   
       public static String removeA(String up) {
   
           if(up.isEmpty()){
               return "";
           }
   
           char ch=up.charAt(0);
   
           if(ch=='a'){
               return removeA(up.substring(1));
           }else{
               return ch+removeA(up.substring(1));
           }
   
           
       }
    
}

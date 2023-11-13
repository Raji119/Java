package Recursion;

public class SubsetAscii {

    public static void main(String[] args) {
        subsequence("","abc");
       }
   
       public static void subsequence(String p,String up) {
   
           if(up.isEmpty()){
                System.out.println(p);
               return;
           }
   
           char ch=up.charAt(0);
           subsequence(p+ch, up.substring(1));
           subsequence(p, up.substring(1));
           subsequence(p+(ch+0), up.substring(1));
           
       }
    
}

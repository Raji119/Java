package Recursion;

import java.util.ArrayList;

public class Subset2 {
    static ArrayList<String> ar=new ArrayList<>();

    public static void main(String[] args) {
        subsequence("","abc");
        System.out.println(ar);
       }
   
       public static void subsequence(String p,String up) {
   
           if(up.isEmpty()){
                ar.add(p); 
                return;        
           }
   
           char ch=up.charAt(0);
           subsequence(p+ch, up.substring(1));
           subsequence(p, up.substring(1));
           
   
           
       }
    
}

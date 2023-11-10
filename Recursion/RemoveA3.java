package Recursion;

public class RemoveA3 {
    public static void main(String[] args) {
     removeA("","bccadah");
    }

    public static void removeA(String s,String up) {

        if(up.isEmpty()){
            System.out.println(s);
            return;
        }

        char ch=up.charAt(0);

        if(ch=='a'){
            removeA(s, up.substring(1));
        }else{
            removeA(s+ch, up.substring(1));
        }

        
    }
    
    
}

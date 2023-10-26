package Recursion;

public class RemoveA {

    public static void main(String[] args) {
        String s="bccad";
        String res="";
        res=removeA(s,res,s.length()-1);
        System.out.println(res);
    }

    public static String removeA(String s, String res,int i) {
        
        if(s.charAt(i)!='a'){
            res+=s.charAt(i);
        }

        if(i==0){
            return res;
        }

        return removeA(s, res, --i);
        
    }
    
}

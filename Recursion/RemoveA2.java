package Recursion;

public class RemoveA2 {
    public static void main(String[] args) {
        String s="bccad";
        String res=removeA(s,s.length()-1);
        System.out.println(res);
    }

    public static String removeA(String s,int i) {

        if(i==-1){
            return "";
        }
        
        char ch='\0';
        if(s.charAt(i)!='a'){
          ch=s.charAt(i);
        }


        return removeA(s,--i)+ch;
        
    }
    
}

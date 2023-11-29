package Recursion;

public class PermutationCount {
    public static void main(String[] args) {

        int c=permut("", "abc");
        System.out.println(c);
    }

    public  static int  permut(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }

        int count=0;

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            count+=permut(first+ch+second, up.substring(1));
        }
        return count;
    }
    
}

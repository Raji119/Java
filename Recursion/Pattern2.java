package Recursion;

public class Pattern2 {

    public static void main(String[] args) {
        patrn(5,0);
    }

    public static void patrn(int r,int c) {
        
        if(r==0){
            return;
        }
        if(c<r){
            patrn(r,c+1);
            System.out.print("*");
        }else{
            patrn(r-1,0);
            System.out.println();
        }
    }
    
}

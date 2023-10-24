package Recursion;

public class Pattern1 {

    public static void main(String[] args) {
        patrn(5,0);
    }

    public static void patrn(int r,int c) {
        
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            patrn(r,c+1);
        }else{
            System.out.println();
            patrn(r-1,0);
        }
    }
    
}

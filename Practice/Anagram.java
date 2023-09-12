import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter String1:");
        String s1=sc.next();
        
        System.out.print("Enter String2:");
        String s2=sc.next();

        if(isAnagram(s1.toUpperCase(),s2.toLowerCase())){
            System.out.println("Strings are Anagram");
        }else{
            System.out.println("Strings are not Anagram");
        }

        sc.close();

    }

    private static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }
        int[] A=new int[26];

        for(char c:s1.toCharArray()){
            A[(c-65)%26]++;
        }

        for(char c:s2.toCharArray()){
            if(A[(c-65)%26]!=0)
                A[(c-65%26)]--;
            if(A[(c-65)%26]==-1)
                return false;
        }

        return true;

    }
}

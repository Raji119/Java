import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicate {

    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ar = subsequence(arr);
        System.out.println(ar);
       }
   
       public static List<List<Integer>> subsequence(int arr[]) {

            Arrays.sort(arr);
            List<List<Integer>> outer =new ArrayList<>();

            outer.add(new ArrayList<>());

            int start=0;
            int end=0;

            for(int i=0;i<arr.length;i++){
                start=0;
                if(i>0 && arr[i-1]==arr[i]){
                    start=end;
                }
                end=outer.size();
                for(int j=start;j<end;j++){
                    List<Integer> internal=new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
            }
   
          return outer;
           
       }
    
    
}

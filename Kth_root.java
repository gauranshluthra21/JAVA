import java.util.*;

public class Kth_root {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        int n =sc.nextInt();
        int li = 1;
        int hi = n;
        int ans=0;
        
        while(li<=hi){
            int mi=(li+hi)/2;
            if(mi*mi <= n){
                ans =mi;
                li=mi+1;
            }

            else{
                hi=mi-1;
            }
        }

        System.out.println(ans);


        
    }
    
}

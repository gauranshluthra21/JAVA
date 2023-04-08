import java.util.*;

public class practice5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int trgt = sc.nextInt();
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==trgt){
                index=i;
                break;

            }
        }

        System.out.println(index);


        
    }
    
}

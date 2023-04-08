import java.util.*;

public class InsertionSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i=0;i<size;i++){
            a[i]= sc.nextInt();
        }

        int srch=sc.nextInt();
        int temp=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==srch){
                System.out.println("element found at index" + " " + i);
                temp=temp+1;
            }
        
        }

        if(temp==0){
            System.out.println("element not found");
        }
    
    }
    
}

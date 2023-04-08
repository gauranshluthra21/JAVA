import java.util.*;

public class practice {

    // public static void printArray(int arr[]) {
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i] + " ");
    //     }
    //     System.out.println();

        
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int li =0;
        int hi = arr.length-1;
        int mi=(li+hi)/2;
        int srch=sc.nextInt();

        while(li<=hi){
            if(arr[mi]==srch){
                System.out.println("element is foud at index" + " " + mi);
            }
            else if(arr[mi] < srch){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;

        }
        if(li>hi){
            System.out.println("element not found");
        }





    }

}
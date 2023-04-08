import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[]=new int[size];

        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        // int a[] = {2,5,7,9,12,14,16,17,19,20,24,28};
        int li = 0;
        int srch= sc.nextInt();
        int hi = a.length-1;
        int mi = (li+hi)/2;

        while(li <= hi){
            if(a[mi] == srch){
                System.out.println("element is found at " +" "+ mi+" " + "index");
                break;
            }

            else if ( a[mi]< srch){
                li = mi+1;
            }

            else{
                hi = mi-1;
            }
            mi = (li+hi)/2;
        }

        if(li > hi){
            System.out.println("item not found");
        }


    }
}
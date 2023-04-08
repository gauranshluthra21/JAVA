import java.util.Scanner;
public class LastOccurance {
	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[]=new int[size];

        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        int li = 0;
        int srch=sc.nextInt();
        int hi = size-1;
        
        int ans=-1;

        while(li <= hi){
            int mi = (li+hi)/2;
            if(a[mi] == srch){
                ans = mi;
                hi=mi-1;
            }

            else if ( a[mi]< srch){
                li = mi+1;
            }

            else{
                hi = mi-1;
            }
    
        }

        System.out.println(ans);

        }


    }

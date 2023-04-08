



// done via recursion



import java.util.*;

public class fibonacci {




    public static void printFibonacci(int a , int b , int n) {
        if(n==0){
            return ;
        }
        // if(n<=2){
        //     return 1;
        // }

        int c=a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);

        
    }

    public static void main(String[] args) {
        int a =1,b=1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        printFibonacci(a, b, n-2);

        
    }


    
}

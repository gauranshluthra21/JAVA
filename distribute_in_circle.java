import java.util.Scanner;

import java.util.*;

public class distribute_in_circle {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int ans=(n+pos-1)%size;
        if(ans==0){
            ans=size;
        }
        System.out.println(ans);
        sc.close();
}
}

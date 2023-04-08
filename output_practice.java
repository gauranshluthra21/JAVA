import java.util.*;

public class output_practice {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int a[] = new int[size];
    for(int i=0;i<size;i++){
      a[i]=sc.nextInt();
    } 

    int li=0;
    int hi=size-1;
    int mi=(li+hi)/2;
    int srch=sc.nextInt();

    while(li<=hi){
      if(a[mi]==srch){
        System.out.println("element is found at index" + " " + mi);
        break;
      }
      else if(a[mi] < srch){
        li=mi+1;
      }
      else{
        hi=mi-1;
      }
      mi=(li+hi)/2;
    }

    if(li>hi){
      System.out.println("ELEMENT NOT FOUND");
    }



  }  
    
}

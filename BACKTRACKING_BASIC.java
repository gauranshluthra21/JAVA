

public class BACKTRACKING_BASIC {

    public static void changeArr(int arr[],int i,int var){
        if(i==arr.length){
            printaArr(arr);
            return;
        }

        arr[i]=var;
        changeArr(arr, i+1 , var+1 );
        arr[i]=arr[i]-2;

    }

    public static void printaArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        int arr[]= new int[5];
        changeArr(arr,0,1 );
        printaArr(arr);
        
    }
    
}

// Java program to merge two sorted arrays/
import java.util.*;

public class merge_two_sorted_array {
	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }



		int n2 = sc.nextInt();
        int arr2[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr2[i]=sc.nextInt();
        }

		int arr3[] = new int[n1 + n2];
		mergeArrays(arr1, arr2, n1, n2, arr3);

		System.out.println("Array after merging");
		for (int i=0; i < n1+n2; i++)
			System.out.print(arr3[i] + " ");
			
	}
	
	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
		int i = 0;
		int j = 0;
		int k = 0;
		 
		// traverse the arr1 and insert its element in arr3
		while(i < n1){
		arr3[k++] = arr1[i++];
		}
		
		// now traverse arr2 and insert in arr3
		while(j < n2){
		arr3[k++] = arr2[j++];
		}
		
		// sort the whole array arr3
		Arrays.sort(arr3);
	}
}


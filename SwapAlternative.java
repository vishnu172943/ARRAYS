

public class SwapAlternative {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};    //we need ouput as {2,1,4,3,6,5,7}
	int temp=0;
	for(int i=0;i<arr.length-1;i=i+2) {
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;		
	}
 for(int i=0;i<arr.length;i++) {
	 System.out.print(arr[i]+" ");
 }
	//O(n) time complexity
}
}

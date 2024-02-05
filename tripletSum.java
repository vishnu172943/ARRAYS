

public class tripletSum {
	static void triple(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int p=j+1;p<arr.length;p++) {
					if(arr[i]+arr[j]+arr[p]==k) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[p]);
					}
				}
			}
		}
	}// O(n^3)
public static void main(String[] args) {
	int arr[]= {1 ,2 ,3, 4 ,5, 6 ,7 };
	int k=12;
triple(arr,k);}
}



public class pairSum {
	static void pairs(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {	
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i]+" " +arr[j]);
			                          	}
			}
		}

	}
	public static void main(String[] args) {
		
	int arr[]= {1,2,3,4,5,6};
	int k=7;
	pairs(arr,k);
 	}
	}


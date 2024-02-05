

public class Sort0and1 {
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
public static void main(String[] args) {
	int arr[]= {0,1,1,0,1,0,1};
	int st=0;
	int en=arr.length-1;
	while(st<en) {
		if(arr[st]==1 && arr[en]==0) {
			swap(arr,st,en);
			st++;
			en--;
		}
		else if(arr[st]==0 && arr[en]==1) {
			st++;
			en--;
		}
		else if(arr[st]==0 && arr[en]==0) {
			st++;
		}
		else {
			en--;
		}
 	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}

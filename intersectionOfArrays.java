
import java.util.*;
public class intersectionOfArrays {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {2,4,5,};
	ArrayList<Integer> arrList=new ArrayList<>();
	for(int i: arr1) {
		arrList.add(i);
	}
	for(int i:arr2) {
		if(arrList.contains(i)) {
			System.out.print(" "+i);
		}
	}
	
}
}

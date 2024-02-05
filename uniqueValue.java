
import  java.util.*;
import java.util.Map.Entry;
public class uniqueValue {
public static void main(String[] args) {
	int arr[]= {2,4,7,2,7};//2 4 7 2 7

	HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<arr.length;i++) {
	if(!map.containsKey(arr[i])) {
		map.put(arr[i],1);
	}
	else {
		map.put(arr[i],map.get(arr[i])+1);
	}
}
 for (HashMap.Entry<Integer, Integer> i :map.entrySet() ) {
if(i.getValue()==1) {
	System.out.println(i.getKey());
	break;
	}
}
 System.out.println(map.entrySet());  //0(n)
}
}

package question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	  public static boolean uniqueOccurrences(int[] arr)  {
		  if(arr.length>1000||arr.length<1) {
			  throw new IllegalArgumentException();
		  }
		  for(int s:arr) {
			  if(s<-1000||s>1000) {
				  throw new IllegalArgumentException();
			  }
		  }
		  Map<Integer,Integer> a=new HashMap<Integer,Integer>();
		  Map<Integer,Integer> b=new HashMap<Integer,Integer>();
		  boolean p=true;
		  for(int i=0;i<arr.length;i++) {
			  if(a.get(arr[i])!=null) {
				  a.put(arr[i], a.get(arr[i])+1);
			  }
			  else if(a.get(arr[i])==null)
				  a.put(arr[i], 1);
		  }
		  for(Map.Entry<Integer, Integer> entry:a.entrySet()) {
			  System.out.println("element:"+entry.getKey()+" num:"+entry.getValue());
			  int i=0;  
			  if(b.containsValue(entry.getValue()))
				  p=false;
			  b.put(i, entry.getValue());
			  i++;
		  }
		  
		  	return p;
		
		  
	  }
	  

	public static void main(String[] args) {
		int[] arr = {-3,0,1,-3,1,1,-3,10,0};
		int[] arr2= {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueOccurrences(arr));
		System.out.println(uniqueOccurrences(arr2));
		// TODO Auto-generated method stub

	}

}

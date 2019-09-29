
public class reverseStringSolution {
	public String reverse(String s) {
		  String[] Sentence=s.split(" ");
		   
		   String reversed="";
		   for (int i=Sentence.length-1;i>=0;i--)
			   reversed+=Sentence[i]+" ";
		   System.out.printf("reversed sentence：");
			   System.out.println(reversed);
		return s;
	}


}

package quesiton1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReverseSentences {
	public static void Reverse() {
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		String s;
	    InputStream input = new FileInputStream("src\\quesiton1\\input.txt");
	    int n;
	    StringBuilder sb = new StringBuilder();
	    while ((n = input.read()) != -1) {
	          sb.append((char) n);
	         }
	            s = sb.toString();
	     System.out.println(s);
	     StringBuilder sb2=new StringBuilder();
	     String[] str=s.split(" ");
	     for(int i=str.length-1;i>=0;i--) {
	    	 sb2.append(str[i]);
	     }
	     String s2=sb2.toString();
	     File file = new File("src\\quesiton1\\Output.txt");
	     FileOutputStream fos = new FileOutputStream(file);
	     fos.write(s2.getBytes());
	     fos.close();
	}

}

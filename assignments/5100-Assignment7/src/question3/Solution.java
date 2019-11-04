package question3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
		private static int allCount = 0;
	    private static int fileNum = 0;
	    public static void countLine(File rootFile) {
	        File[] chileFileList = rootFile.listFiles();
	        
	        for (File file : chileFileList) {
	            if(file.isDirectory()) {
	                countLine(file);
	            }else {
	                readCountLine(file);
	            }
	        }
	        
	    }
	    public static void readCountLine(File file) {
	        fileNum++;
	        try {
	            Scanner sc = new Scanner(new FileInputStream(file));
	            int count = 0;
	            while(sc.hasNextLine()) {
	                count++;
	                sc.nextLine();
	            }
	            System.out.println(file.getAbsolutePath()+" : "+count+">>>第"+fileNum+"个文件");
	            allCount+=count;
	            sc.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("nowCount = "+allCount+"   "+"countFile : "+file.getAbsolutePath());
	            e.printStackTrace();
	        }
	    }
}

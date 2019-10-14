package question2;

import java.util.Scanner;

public class Number {
	public static int count(int a,int b) throws ErrorException, HasRemainderException {
		if(b==0)
			throw new ErrorException();
		if(a%b!=0)
			throw new HasRemainderException();
		int res=a/b;
		return res;
		
		
	}
	public static void main(String[] args) {
		int n=0;
		try{
			Scanner scanner = new Scanner(System.in);
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			n=count(a, b);		
		}catch (ErrorException EE)  
        {  
            System.out.println(EE);  
        }  
        catch (HasRemainderException HE)  
        {  
            System.out.println(HE);  
        }  
        catch (Exception e) {
        	//父类 写在此处是为了捕捉其他没预料到的异常 只能写在子类异常的代码后面  
        }
		
         System.out.println("the result is " + n);                 
		
	}
		
}

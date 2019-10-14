package question4;

public class MyIndexOutOfBoundException extends Exception{
	
	public String toString(){
		MyIndexOutOfBoundExceptionTest e=new MyIndexOutOfBoundExceptionTest();
		String res="Error Message: Index: "+e.getIndex() + ", but lower bound: "+ e.getLowerBound() + ", Upper bound: "+ e.getUpperBound();
		return res.toString();
		
	}
	
	
}

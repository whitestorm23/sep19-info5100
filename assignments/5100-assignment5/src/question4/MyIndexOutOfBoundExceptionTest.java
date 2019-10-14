package question4;

public class MyIndexOutOfBoundExceptionTest {
	private int lowerBound;	
	private int upperBound;
	private int index;
	public int getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
	public void indexOufOfBoundException(int index) throws MyIndexOutOfBoundException {
		int lowerBound = getLowerBound();
		int upperBound = getUpperBound();
				
		if ( index < lowerBound||index > upperBound)
			throw new MyIndexOutOfBoundException();
		
	}
	public static void main(String[] args) {
		try {
		MyIndexOutOfBoundExceptionTest test=new MyIndexOutOfBoundExceptionTest();
		test.setLowerBound(0);
		test.setUpperBound(9);
		test.indexOufOfBoundException(10);
		}catch(MyIndexOutOfBoundException e){
			System.out.println(e);
			
		}
	}
}

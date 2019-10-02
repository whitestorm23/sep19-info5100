package question2;

public class SadObject extends MoodyObject{

	@Override
	protected String getMood() {
		// TODO Auto-generated method stub
		return "Sad";
	}

	@Override
	protected void expressFeelings() {
		System.out.println(" 'wah' 'boo hoo' 'weep' 'sob' 'weep' ");
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		return "Subject cries a lot";
		
	}

}

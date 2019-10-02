package question2;

public abstract class MoodyObject {
	protected abstract String getMood();
	
	protected abstract void expressFeelings();
	
	public void queryMood() {
		if(getMood()=="Happy") {
		System.out.println("I feel happy today!");
	}else if(getMood()=="Sad") {
		System.out.println("I feel Sad today!");
	}
	}

}

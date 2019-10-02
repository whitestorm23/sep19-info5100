package question2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyObject happy=new HappyObject();
		SadObject Sad=new SadObject();
		PsychiatristObject test=new PsychiatristObject();
		
		test.examine(happy);
		test.observe(happy);
		
		test.examine(Sad);
		test.observe(Sad);

	}

}

package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		Jyanken_Chapter24 mymethod = new Jyanken_Chapter24();
		String getmychoice = mymethod.getMyChoice();
		String getrandom = mymethod.getRandom();
		mymethod.playGame(getmychoice, getrandom);
	}

}

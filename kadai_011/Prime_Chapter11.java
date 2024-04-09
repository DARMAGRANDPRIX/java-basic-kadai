package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] numArray = new boolean[100];
		for (int i = 1; i < numArray.length; i++ ) {
			numArray[i] = true;
		};
		for ( int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					numArray[i-1] = false;
					break;
				}
			}
		};
		for(int k = 0; k < numArray.length; k++) {
			if(numArray[k] == true) {
				System.out.println(k+1);
			}
		}
	}
}

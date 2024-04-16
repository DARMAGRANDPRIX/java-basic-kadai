package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		Dictionary_Chapter20 myDictionary = new Dictionary_Chapter20();
		String [] wordsArray = {"apple","banana","grape","orange"};
		for (int i = 0; i < wordsArray.length; i++) {
			myDictionary.serch(wordsArray[i]);
		}
     }
}

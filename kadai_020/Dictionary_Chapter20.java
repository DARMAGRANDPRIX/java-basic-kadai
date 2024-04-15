package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	HashMap<String,String> dictionary = new HashMap<String,String>();
	public Dictionary_Chapter20 (String fruits) {
		dictionary.put("apple","アップル");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		if (dictionary.containsKey(fruits)) {
			System.out.println(fruits + "の意味は" + dictionary.get(fruits));
		}
		else {
			System.out.println(fruits + "は辞書に存在しません");
		}
	}
}
package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		
		Dictionary_Chapter20 myDictionary = new Dictionary_Chapter20();
		
		String[] wordsToSerch = {"apple", "banana", "grape", "orange"};
		
		for(String word : wordsToSerch) {
			System.out.println(myDictionary.searchWord(word));
		}
	}
}

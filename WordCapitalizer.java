import java.util.Arrays;

public class WordCapitalizer {
public static void main(String[] arg){
    String sentence = "this is a tree";
    String result[] = getWordsIn(sentence);
    String[] words = capitalizeWordsIn(result);
    
    
    System.out.println(convertToString(words));
}

public static String[] getWordsIn(String sentence){
    String[] words = sentence.split(" ");
    return words;
}

public static String[] capitalizeWordsIn(String[] words){
    for(int index = 0; index < words.length; index++){
      words[index] = words[index].substring(0, 1).toUpperCase() + words[index].substring(1);
    }
    return words;
}

public static String convertToString(String[] words){
	String sentence = "";
	for(int index = 0; index < words.length; index++){
		sentence += words[index] + " ";
	}
	return sentence;
}

	
	







}

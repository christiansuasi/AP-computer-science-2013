
public class PigLatin {

	public static void main (String[] args){
		
		System.out.println("Input word to translate into Pig-Latin");
		String word=IO.readString();
		if(
				word.charAt(0)==('a') || 
				word.charAt(0)==('e') ||
				word.charAt(0)==('i') || 
				word.charAt(0)==('o') ||
				word.charAt(0)==('u') || 
				word.charAt(0)==('A') || 
				word.charAt(0)==('E') ||
				word.charAt(0)==('I') || 
				word.charAt(0)==('O') ||
				word.charAt(0)==('U')){
			IO.outputStringAnswer(word+"way");
		}else{
			String firstChar=word.substring(0,1);
			String base = word.substring(1);
			IO.outputStringAnswer(base+firstChar+"ay");
		}
	}
}

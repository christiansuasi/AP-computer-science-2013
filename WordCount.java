public class WordCount{
	
	private String[][] phoneContacts;
	public static void main (String[] args){
		System.out.println("Enter string");
		String sentence=IO.readString() + ' ';
		System.out.println("Enter minimum word length");
		int min=IO.readInt();
		int pos=0;
		int count=0;
		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i)==' '){
				if(pos>=min){
					count++;
				}
				pos=0;
			}else{
				if(Character.isLetter(sentence.charAt(i))){
					pos++;
				}
			}
		}
		IO.outputIntAnswer(count);
	}
}
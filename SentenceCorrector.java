
public class SentenceCorrector {
	public static void main (String [] args){
		System.out.println("Enter String to correct");
		String draft=IO.readString().trim();
		draft.toLowerCase();
		String s = "";
		for(int i=0; i<draft.length();i++){
			if(draft.charAt(i)==' '){
				s.concat(draft.substring(i).trim());
			}
			if(draft.charAt(i)=='i'&&
					draft.charAt(i-1)==' ' &&
					draft.charAt(i+1)==' '){
				s.concat(draft.substring(i,i+1).toUpperCase());
			}
			
		}
		s.substring(0,1).toUpperCase();
		System.out.println("Result:" + s);
	
	
	}

}



public class ReverseWords {
	
	public static String backwards(String s){
		if(s.length()==1){System.out.print(s);return s;}
		System.out.print(s.charAt(s.length()-1));
		return backwards(s.substring(0,s.length()-1));
	}

	public static void main(String[] args){
		/*System.out.println("Enter String to Reverse");
		String s=IO.readString();
		String draft="";
		for(int i=s.length()-1; i>0; i--){
			s.concat(s.substring(i-1,i));
		}
		System.out.println(s);
		*/
		String hey = "hello";
		backwards(hey);
	}
	
}

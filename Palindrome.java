
public class Palindrome {

	public static boolean isPalindrome(String palindrome){
		String check = "";
		if (palindrome.length()%2==0){
			
		}
		for (int i=1;i<palindrome.length()/2;i++){
			check+=palindrome.substring(palindrome.length()-i-1, palindrome.length()-i-2);
		}
		if (check.equals(palindrome)){
				return true;
			}else{
				return false;
			
			}
			
	}
		
public static void isAnagram(String a, String b){
	String alpha="";
	String bravo="";
	for(int i=0;i<a.length();i++){
		for(int j=0;j<b.length();j++){
			if(a.substring(i,i+1).equals(b.substring(j,j+1))){
				alpha.concat(a.substring(i,i+1));
				bravo.concat(b.substring(j,j+1));
			}
			
			//delete substring
		}
	}
	for (int k=0;k<alpha.length();k++){
		if (alpha.substring(0).equals(bravo.substring(0))){
			System.out.print(alpha + " " + bravo + "yes");
		}else{
			System.out.println(alpha + " " + bravo + "no");
		}
	}
	System.out.print(bravo + " " + alpha);
	}
	
	
public static void longestString(String s){
	int count=0;
	int tempCount=0;
	int tempPos=0;
	int pos=0;
	for(int i=0;i<s.length()-2;i++){
		if (s.charAt(i)==(s.charAt(i+1))){
			tempCount++;
			tempPos=i;
			if(tempCount>count){
				count=tempCount;
				pos=tempPos;
			}
		}else{
			continue;
		}
	}
	
	System.out.print("count=" + count + s.substring(pos));
	for (int i=0;i<pos;i++){
		System.out.print(s.substring(pos));
	}
}
	
	
	
public static void main (String[] args){
	System.out.println("Enter String");
	String s=IO.readString();
	longestString(s);
}
}

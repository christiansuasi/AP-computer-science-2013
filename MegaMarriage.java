
public class MegaMarriage {
	public static void main(String[] args){
		
		System.out.println("Enter person1 info");
		System.out.println("Favorite food?");
		String food1=IO.readString();
		System.out.println("Favorite hobby?");
		String hobby1=IO.readString();
		System.out.println("Long walks on the beach?");
		String beach1=IO.readString();
		System.out.println("Killed anyone?");
		String kill1=IO.readString();
		System.out.println("Now enter person2's info");

		System.out.println("Favorite food?");
		String food2=IO.readString();
		System.out.println("Favorite hobby?");
		String hobby2=IO.readString();
		System.out.println("Long walks on the beach?");
		String beach2=IO.readString();
		System.out.println("Killed anyone?");
		String kill2=IO.readString();
		
		boolean good=true;
		int count=0;
		String[]person1={food1,hobby1,beach1,kill1};
		String[]person2={food2,hobby2,beach2,kill2};
		
		
		
		for(int i=0;i<person1.length;i++){
			if(person1[i].equals(person2[i])){
					count++;
				}
			}
			

		if(count>=3){
			good=true;
		}else{
			good=false;
		}
		System.out.println(good);
		System.out.println(count);
		System.out.println(person1[0]);
	}
}

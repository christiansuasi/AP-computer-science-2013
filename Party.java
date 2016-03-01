
public class Party {
	public static void main(String[]args){
		System.out.println("How many people are attending this party?");
		int numPeople=IO.readInt();
		System.out.println("How many slices can each person eat?");
		int slicePerPerson=IO.readInt();
		System.out.println("How many cans of soda can each person drink?");
		int cansPerPerson=IO.readInt();
		System.out.println("How much does each pizza pie cost?");
		double priceOfPie=IO.readDouble();
		System.out.println("How many slices are in each pizza pie?");
		int slicesPerPie=IO.readInt();
		System.out.println("How much does each case of soda cost?");
		double priceOfCase=IO.readDouble();
		System.out.println("How many cans are in each case of soda?");
		int cansPerCase=IO.readInt();
		
		int totalSlices=numPeople*slicePerPerson;
		double numPies=totalSlices/slicesPerPie;
		if (numPies%10!=0){
			numPies++;
		}
		int totalCans=numPeople*cansPerPerson;
		double numCans=totalCans/cansPerCase;
		if(numCans%10!=0){
			numCans++;
		}
		double total = (numPies*priceOfPie) + (numCans*priceOfCase);
		IO.outputDoubleAnswer(total);
	}
}

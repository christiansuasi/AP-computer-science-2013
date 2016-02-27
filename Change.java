
public class Change {

	public static void main (String[] args){
		System.out.println("What is the total sales change?");
		double sale=IO.readDouble();
		System.out.println("How much is the customer giving?");
		double pay = IO.readDouble();
		double change = pay-sale;
		//declare and initialize bills+coins to 0;
		int twenty=0; int ten=0; int five=0; 
		int one=0; int quarter=0; int dime=0;
		int nickel=0; int penny=0;
		System.out.println("difference " + change);
		if(change>=20.00){
			while(change>=20.00){
				change-=20.00;
				twenty++;
			}
		}
		if (change>=10){
			while(change>=10){
				change-=10;
				ten++;
			}
		}
		if(change>=5){
			while(change>=5){
				change-=5;
				five++;
			}
		}
		if(change>=1){
			while(change>=1){
				change-=1;
				one++;
			}
		}
		if(change>=.25){
			while(change>=.25){
				change-=.25;
				quarter++;
			}
		}
		if(change>=.1){
			while(change>=.1){
				change-=.1;
				dime++;
			}
		}
		if(change>=.05){
			while(change>=.05){
				change-=.05;
				nickel++;
			}
		}
		if(change>=.01){
			while(change>=.01){
				change-=.01;
				penny++;
			}
		}
		//print change
		System.out.println("the change is:");
		if(twenty>0){System.out.println(twenty + " $20 bills");}
		if(ten>0){System.out.println(ten + " $10 bills");}
		if(five>0){System.out.println(five + " $5 bills");}
		if(one>0){System.out.println(one + " $1 bills");}
		if(quarter>0){System.out.println(quarter + " quarters");}
		if(dime>0){System.out.println(dime+ " dimes");}
		if(nickel>0){System.out.println(nickel + " nickels");}
		if(penny>0){System.out.println(penny + " penny");}
		
	}
}

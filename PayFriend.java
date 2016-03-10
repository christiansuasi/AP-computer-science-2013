
public class PayFriend {
	public static void main(String[]args){
		double fee=0;
		double flat=0;
		System.out.println("Enter positive integer payment amount in dollars");
		double payment = IO.readInt();
		if(payment<=0){
			IO.reportBadInput();
			System.exit(0);
		}
		if (payment<=100 && payment>0){
			fee=5;
			flat=5;
		}else if(payment>100 && payment<1000){
			payment*=.03;
			fee=payment;
			flat=6;
		}else if(payment>=1000 && payment<10000){
			payment*=.01;
			fee=payment;
			flat=15;
		}else if(payment==10000){
			flat=100;
		}else if(payment>10000 && payment<15000){
			payment-=10000;
			payment*=.02;
			fee=payment +100;
		}else if(payment==15000){
			fee=200;
		}else if(payment>15000){
			payment-=15000;
			payment*=.03;
			fee= payment+200;
		}
		if(flat>=fee){
			IO.outputDoubleAnswer(flat);
		}else{
			IO.outputDoubleAnswer(fee);
		}
	}
}

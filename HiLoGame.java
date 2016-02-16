//Christian Suasi

import java.util.Random;
public class HiLoGame {

public static void main(String[] args) {

Scanner in = new Scanner( System.in );
Random randGenerator = new Random();
int count = 0;

System.out.println("Guess my random number! I will say if it's higher or lower than my number");
int guess = in.nextInt();
int num = randGenerator.nextInt( 100 ) + 1;
count++;

while( guess != num )
{
if( guess < num )
{
System.out.println("your number was lower, guess another number");
guess = in.nextInt();
count++;
}
if( guess > num )
{
System.out.println( "your number was higher, guess another number");
guess = in.nextInt();
count++;
}
}

//Gives the player an option of playing again with 1 being yes and 0 being no
System.out.println("That's my number! it took you " + count + " guesses. If you want to play again, type 1, if not type 0");
count = 0;

//Below is the code if the player plays again which will loop until he stops.
if( in.nextInt() == 1)
{
System.out.println("Guess my number! I will tell you if it's higher or lower than my number");
guess = in.nextInt();
num = randGenerator.nextInt( 100 ) + 1;

while( guess != num )
{
if( guess < num )
{
System.out.println("Your number was lower, guess another number");
guess = in.nextInt();
}
if( guess > num )
{
System.out.println("Your number was higher, guess another number");
guess = in.nextInt();
}
System.out.println("That's my number! it took you " + count + " guesses. If you want to play again, type 1, if not type 0");
}
}
else
System.out.println("Thanks for playing");

}}

/*
 * 
 * Guess my random number! I will say if it's higher or lower than my number
50
your number was higher, guess another number
25
your number was lower, guess another number
35
your number was lower, guess another number
40
your number was lower, guess another number
45
your number was higher, guess another number
44
That's my number! it took you 6 guesses. If you want to play again, type 1, if not type 0
1
Guess my number! I will tell you if it's higher or lower than my number
50
Your number was higher, guess another number
25
That's my number! it took you 0 guesses. If you want to play again, type 1, if not type 0
Your number was lower, guess another number
*/

/*Keep a secret number between 20 and 30 in your program. Ask the user to predict a number between 20 and 30. Use a do-while loop until the user predicts your secret number and displays the count of attempts.*/

import java.util.*;

class Program_3
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int guess = 24;
        int attempt = 0;
        int predict;

        do
        {
            System.out.println("Predict a number in between 20 and 30");
            predict = s.nextInt();
	    attempt++;
	    if(predict == guess)
	    {
		System.out.println("You have predicted the number at attempt:" +attempt);
	    }
	    else
	    {
		System.out.println("Wrong guess. Try again later!");
	    }

        }while(predict != guess);
    }
}
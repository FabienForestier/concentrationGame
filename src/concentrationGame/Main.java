package concentrationGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Tile t = new Tile(1);
		Board b = new Board(16);
		Scanner scan = new Scanner (System.in);
		int num2=0,num1=0;
		//System.out.println(t.toString());
		//System.out.println(b.toString());
		b.display();
		//Test compare
		//b.compareTiles(0, 1);
		//b.compareTiles(0, 5);

		System.out.println("TEST2");
		
		//Verify that the nbClick increased
		//System.out.println(b.toString());
		while(num1!=-1 && num2!=-1)
		{
			System.out.println("Enter two numbers between 0 and 15, -1 to exit");
			
			num1= scan.nextInt();
			num2= scan.nextInt();
			if(num1>=0 && num2>=0)
			{
			b.compareTiles(num1, num2);
			b.display();
			}else
			{
				if(num1==-1 && num2==-1)
				{
					System.out.println("You quit the game!");
				}else
				{
					System.out.println("You must enter numbers between 0 and 15");
				}
			}
		}
	}

}

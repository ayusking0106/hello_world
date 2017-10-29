import java.util.Scanner;
public class GAME {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int P1=0;   //To store the value of dice thrown by player 1.
		int P2=0;	//To store the value fo dice thrown by player 2.
		int pos_A=0; // To store the current position of player 1.
		int pos_B=0; // To store the current position of player 2.
		int ctr=0;	//To count the number of dice thrown by each player.
		int c1=0,c2=0,c=0; //Other counters.
		String p1=""; //To store the name of player 1.
		String p2=""; //To store the name of player 2.
		char ch=' ';
		System.out.println("\t\t\tTHE SNAKE AND LADDER GAME!!!");
		System.out.println("SHIBANEE MOHAPATRA\nRegd No-1741012208\nBRANCH-CSE\nSEC-I\n");
		System.out.println("Enter the name of the first player ");
		p1=sc.next();
		System.out.println("Enter the name of the second player ");
		p2=sc.next();
		for(int i=0;;i++)
		{
			System.out.println(p1+" press y/Y to throw dice!!!");
			ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y')
				P1=1+(int)(Math.random()*(6+1-1));
			System.out.println(p1+" has thrown "+P1);
			if(pos_A+P1<=30)
				pos_A+=P1;
			System.out.println(p1+" is at "+pos_A);
			
			switch(pos_A) // To check whether player A reaches to mouth of snake of base of a ladder.
			{
			case 3:	System.out.println(p1+" reaches to the base of a ladder.");
					pos_A=22;
					System.out.println(p1+" climbs up to "+pos_A);
					break;
			case 5: System.out.println(p1+" reaches to the base of a ladder.");
					pos_A=8;
					System.out.println(p1+" climbs up to "+pos_A);
					break;
			case 11:System.out.println(p1+" reaches to the base of a ladder.");
					pos_A=26;
					System.out.println(p1+" climbs up to "+pos_A);
					break;
			case 17:System.out.println(p1+" reaches to the mouth of a snake."); 
					pos_A=4;
					System.out.println(p1+" goes down to "+pos_A);
					break;
			case 19:System.out.println(p1+" reaches to the mouth of a snake."); 
					pos_A=7;
					break;
			case 20:System.out.println(p1+" reaches to the base of a ladder."); 
					pos_A=29;
					System.out.println(p1+" climbs up to "+pos_A);
					break;
			case 21: System.out.println(p1+" reaches to the mouth of a snake.");
					pos_A=9;
					System.out.println(p1+" goes down to "+pos_A);
					break;
			case 27: System.out.println(p1+" reaches to the mouth of a snake.");
					pos_A=1;
					System.out.println(p1+" goes down to "+pos_A);
					break;
			case 30: c++;
					break;
			default: break;
			}
			System.out.println(p2+" press y/Y to throw dice!!!");
			ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y')
				P2=1+(int)(Math.random()*(6+1-1));
			System.out.println(p2+" has thrown "+P2);
			if(pos_B+P2<=30)
				pos_B+=P2;
			System.out.println(p2+" is at point "+pos_B);
			ctr++;
			switch(pos_B) //To check whether player B reaches to the base of a ladder or mouth of a snake.
			{
			case 3:	System.out.println(p2+" reaches to the base of a ladder.");
					pos_B=22;
					System.out.println(p2+" climbs up to "+pos_B);
					break;
			case 5: System.out.println(p2+" reaches to the base of a ladder.");
					pos_B=8;
					System.out.println(p2+" climbs up to "+pos_B);
					break;
			case 11:System.out.println(p2+" reaches to the base of a ladder."); 
					pos_B=26;
					System.out.println(p2+" climbs up to "+pos_B);
					break;
			case 17:System.out.println(p2+" reaches to the mouth of a snake."); 
					pos_B=4;
					System.out.println(p2+" goes down to "+pos_B);
					break;
			case 19:System.out.println(p2+" reaches to the mouth of a snake."); 
					pos_B=7;
					System.out.println(p2+" goes down to "+pos_B);
					break;
			case 20:System.out.println(p2+" reaches to the base of a ladder."); 
					pos_B=29;
					System.out.println(p2+" climbs up to "+pos_B);
					break;
			case 21:System.out.println(p2+" reaches to the mouth of a snake."); 
					pos_B=9;
					System.out.println(p2+" goes down to "+pos_B);
					break;
			case 27:System.out.println(p2+" reaches to the mouth of a snake."); 
					pos_B=1;
					System.out.println(p2+" goes down to "+pos_B);
					break;
			case 30: c1++;
					break;
			default: break;
			}
			if(c==1||c1==1) 
				break;
			else if(pos_A==30&&pos_B==30)
			{
				c2++;
				break;
			}
		}
		System.out.println("________RESULT BOARD!!!_________");
		System.out.println("\n\n\nTotal number of throws made by each player = "+ctr);
		if(c==1) // Condition to decide winner.
			System.out.println(p1+" IS THE WINNER.");
		else if(c1==1)//Condition to decide winner.
			System.out.println(p2+" IS THE WINNER.");
		else if(c2==1) //Condition to check for tie match.
			System.out.println("THIS IS A TIE MATCH");
		
	}

}

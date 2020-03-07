import java.util.Scanner;


public class Lab8 {
	
	public static int Jprecinct = 0; 
	public static int Fprecinct = 0;
	public static int votesForJason = 0; 
	public static int votesForFreddie = 0;
	public static int Tieprecinct = 0;
	public static double jasonpercent = 0.0;
	public static double freddiepercent = 0.0;
	
	public static void main(String[] args) 
	{
		//Program 1
		MyWhiley1();
		
		
		// Program 2 
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the number of Precincts");
		Integer numofprecincts = key.nextInt();
		
		ElectionDay(numofprecincts);
		System.out.println();
		//ExtraCredit
		Scanner key4 = new Scanner(System.in);
		System.out.println("Enter test year");
		Integer yeartest = key4.nextInt();
		
		ExtraCredit(yeartest);
		
		
	}
	
	//Program1
	public static void MyWhiley1() 
	{
		
		double num = 1;
		int counter = 0;
		double sums = 0.0;
		
		while(num != 0) 
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Enter a positive Integer");
			num = scan.nextDouble();
			
			if (num < 0) 
			{
				System.out.println("ERROR");
				
			}else {
				
				counter++;
				sums += num;
				if (num == 0 && sums == 0) 
				{
					System.out.println("No Average");
					
				}
				
			}
			
		}
		System.out.println("The average of the numbers you enterd is: " + (sums/ (counter-1)));
		
	}
	
	//Program 2
	public static void ElectionDay(int precinct)
	{
		
		while(precinct > 0) 
		{
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Who won this Precinct?; ");
			String winner = scan.nextLine();
			
			if (winner.charAt(0) == 'J' || winner.charAt(0) == 'j')
			{
				Jprecinct++;
				Scanner scan1 = new Scanner(System.in);
				System.out.println("How many votes did Jason get?:  ");
				Integer numvotes = scan1.nextInt();
				
				votesForJason += numvotes;
				precinct--;
				
				
			}else if (winner.charAt(0) == 'F' || winner.charAt(0) == 'f'){
				
				Fprecinct++;
				Scanner scan1 = new Scanner(System.in);
				System.out.println("How many votes did Freddie get?:  ");
				Integer numvotes = scan1.nextInt();
				
				votesForFreddie += numvotes;
				precinct--;
				
				
			}else {
				
				Tieprecinct++;
				precinct--;

				
				
			}
			
			
		}
		if(precinct == 0) {
		Scanner key2 = new Scanner(System.in);
		System.out.println("Are there anymore Precincts  ");
		String response = key2.nextLine();
		
		if(response.equalsIgnoreCase("y")) 
		{
			
			Scanner key3 = new Scanner(System.in);
			System.out.println("How many more?:  ");
			Integer newprecinct = key3.nextInt();
			
			 
			 
			
			precinct = newprecinct;
			ElectionDay(precinct);
			
			
		}else {
			
			jasonpercent = (votesForJason * 100)/ (votesForJason + votesForFreddie);
			freddiepercent = (votesForFreddie* 100) / (votesForJason + votesForFreddie)  ;
			
			
			System.out.printf("Jason got %d and the percentage is %3.2f  and he won %d precincts \n" , votesForJason, jasonpercent,Jprecinct );
			System.out.printf("Freddie got %d and the percentage is %3.2f and he won %d precincts \n" , votesForFreddie,freddiepercent, Fprecinct);
			System.out.println("There were "  + Tieprecinct + " ties.");
			if(votesForJason > votesForFreddie) 
			{
				
				System.out.println("Jason won the Election");
				
			}else if (votesForJason < votesForFreddie){
				
				System.out.println("Freddie won the Election");
				
			}else {
				
				System.out.println("It was a tie");

				
			}


			
			
		}
	
		}
	}
		
	//Extra Credit
	public static void ExtraCredit(int year) 
	{
		
		boolean leap;
		
		//Question 3
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
		
		
		//Question 4 = 6
		//Question 5 = Error
		
		
		
	}
}

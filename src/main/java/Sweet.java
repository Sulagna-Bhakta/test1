import java.util.Scanner;

public class Sweet extends Gift{
	public void details()
	{
	   int no1,s=0;
		Scanner input = new Scanner (System.in);
	     System.out.print("Enter number of Sweets");
	     no1 = input.nextInt();
	     String[] names = new String[no1];
	     String[] type = new String[no1];
	     int w[] = new int[no1];
	     for(int i=0 ; i<no1; i++)
	     {
	    	 System.out.println("name-");
	    	 names[i] = input.next();
	    	 System.out.println("type-");
	    	 type[i] = input.next();
	    	 
		}

	}
}

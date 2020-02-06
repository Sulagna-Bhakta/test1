import java.util.Scanner;

public class Gift {
	public void weight()
	{
		int no1,s=0;
		Scanner input = new Scanner (System.in);
		System.out.print("total number of gift");
		 no1 = input.nextInt();
		 int w[] = new int[no1];
		 System.out.println("enter weight of gift one by one");
		 for(int i=0 ; i<no1; i++)
		 {
			 
			 w[i] = input.nextInt();
	    	 s=s+w[i];
		 }
		 System.out.println("total weight of gift");
	     System.out.print(s);
	}
}

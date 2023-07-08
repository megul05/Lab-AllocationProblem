package LabAllocation;
import java.util.*;

public class LabAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int number = scan.nextInt();
		while(true)
		{
			number = number + 1;
			if(number==x)
			{
				System.out.println("L1");
				break;
			}
			if(number==y)
			{
				System.out.println("L2");
				break;
			}
			if(number==z)
			{
				System.out.println("L3");
				break;
			}
		}
		
	}

}

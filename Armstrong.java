//wap to check if its an armstrong number//

import java.util.Scanner;


class Armstrong {
	
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int data[] = sc.nextInt();
		
		int remainder,result=0;
		
			
		while(data[j] != 0)
		{
		remainder = data[j] % 10;
        result += Math.pow(remainder, 3);
        data[j] /= 10;
		}
		
		if(result == data)
		{
			System.out.println("number is an armstrong number!!");
		}
		else
		{
			System.out.println("number is not an armstrong number!!");
		}
			
	}
	
	

}

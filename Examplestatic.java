/* simple example to illustrate static method*/

class Examplestatic
{
	static int a=10;
	
	void display_a(){
		System.out.println("a value:"+a);
	}
	/*static void display(int x,int y)
	{
		
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
	}*/
	//static block,it will executed once before main
	//static{System.out.println("Inside static block");a=20;}
	
	//default constructor
	Examplestatic(){
		a++;
	}
	
	public static void main(String args[])
	{
		
		int x=10;
		int y=20;
		/*Examplestatic es = new Examplestatic();   //object instantiation//
		es.display(x,y);*/
		
		Examplestatic d1 = new Examplestatic();
		d1.display_a();
		Examplestatic d2 = new Examplestatic();
		d2.display_a();
		//System.out.println("a value: "+es.a);
	}
}
//normal class to display two vaiables a and b 
// program to call recursive call for main
class A {
	
	int a=10;
	int b=30;
	void display(){
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
}

class Amain{
	
	public static void main(String args[]){
		
		String a[] ={"Hello","World"};//creating a string array to pass as argument to main
		A obj = new A();//instantiating for class A
		Amain Am = new Amain(); //instantiating for class Amain
		obj.display();//calling display method of class A
		//Am.main(a); //recursive call? whether it will loop or only once
		main(a);
		System.out.println(args[0]); //what is the value of args[0]
	}
}

//javac A.java
//java Amain
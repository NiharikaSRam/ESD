//logic gates
class Logicgates{

int or_gate(int in1, int in2){

int a,b;
a=in1;
b=in2;

//int ans;
int or_ans;

or_ans = a|b;
return or_ans;

}

int and_gate(int in3, int in4)
{
 int c,d;
 
 int and_ans;
  
 c= in3;
 d= in4;
 
 and_ans = c & d;
 return and_ans;

}

int nor_gate(int in1,int in2){
	
	int nor_ans;
	int a,b;
	a =in1;
	b=in2;
	
	if(a == 0 && b == 0)
		nor_ans = 1;
	else
		nor_ans = 0;
	return nor_ans;
}

public static void main(String [] args){
	
	int inp1 = 0;
	int inp2 = 0;
	
	Logicgates lg = new Logicgates();
	
	int result_or = lg.or_gate(inp1,inp2);
	int result_nor = lg.nor_gate(inp1,inp2);
	int result_and = lg.and_gate(inp1,inp2);
	
	System.out.println("Result of or gate : "+ result_or);
	System.out.println("Result of and gate : "+ result_and);
	System.out.println("Result of nor gate : "+ result_nor);
}


}
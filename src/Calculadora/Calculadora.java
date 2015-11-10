package Calculadora;

public class Calculadora {
	int a,b,resut;
	char op;

	public int Calculando(int a,int b,char op){
		
		this.a=a;
		this.b=b;
		this.op=op;
		
		switch(op){
		
			case '+':
				resut= a+b;
				break;
	
			case '-':
				resut= a-b;
				break;
				
			case '/':
				resut=a/b;
				break;
				
			case '*':
				resut=a*b;
				break;
	
		}return resut;
	}
}


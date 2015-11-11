package Calculadora;

import java.io.IOException;
import java.util.Scanner;

public class ForneceDados{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int i,a,b,result;
		char op;
		i = 1;
		
		do{
			a = input.nextInt();
			op = input.next().charAt(0);
			b = input.nextInt();
			Arq_Calc arq = new Arq_Calc();
			result = calc.Calculando(a,b,op);
			System.out.println(result);
			try {
				arq.escritor(a,b,op);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(i != 99);

	}
}

package Calculadora;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Arq_Calc {
	public void escrever(int a, int b,char op) throws IOException{
		
		RuntimeMXBean rtb = ManagementFactory.getRuntimeMXBean();
			PrintWriter log = new PrintWriter(new FileWriter("log2.txt",true), true);
			log.println(a+ " " + op + " " + b);
			log.close();
	}
	
	public static void leitor(String path) throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		int a,b;
		char op;

		linha = buffRead.readLine();
		
		String[] dados=linha.split(" ");
		a = Integer.parseInt(dados[0]);
		op = dados[1].charAt(0);
		b = Integer.parseInt(dados[2]);
		
		Calculadora calc=new Calculadora();
		int result=calc.Calculando(a, b, op);
		System.out.println(result);
		buffRead.close(); 
	}

	public static void escritor(int a, int b,char op) throws IOException {
		 File arquivo = new File("log2.txt"); 
         FileWriter fw = new FileWriter(arquivo);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(a+ " "+op+" "+b	);
         bw.close(); 
	} 
}

package lab1;

import java.util.Scanner;

public class PrinterNumberMenu {
	
	public static void main(String[] args) {
		PrinterNumber pN = new PrinterNumber();
		Scanner sc = new Scanner(System.in);
		String entrada = "Y";
		
		String texto = "digite um numero ou aperte Y para sair.";
		while(!(entrada.equals("y"))){
			System.out.println(texto);
			entrada = sc.next();
			if(entrada.equals("<numero>")){
				System.out.println("<numero>");
			}
			else{
				System.out.println(pN.printerNumber(entrada));
			}
			
		}
	}
	
}

package lab1;


import java.util.*;

public class PrinterNumber implements Number{
	
private List listaDeNumeros;
private List listaDeNumerosSent ;
private List listaDeNumerosDesc ;
	
	public PrinterNumber(){
		listaDeNumeros = new ArrayList<>();
		listaDeNumerosSent = new ArrayList<>();
		listaDeNumerosDesc = new ArrayList<>();
		
		listaDeNumeros.add("zero");
		listaDeNumeros.add("um");
		listaDeNumeros.add("dois");
		listaDeNumeros.add("trez");
		listaDeNumeros.add("quatro");
		listaDeNumeros.add("cinco");
		listaDeNumeros.add("seis");
		listaDeNumeros.add("sete");
		listaDeNumeros.add("oito");
		listaDeNumeros.add("nove");
		listaDeNumeros.add("dez");
		listaDeNumeros.add("onze");
		listaDeNumeros.add("doze");
		listaDeNumeros.add("treze");
		listaDeNumeros.add("quartoze");
		listaDeNumeros.add("quinze");
		listaDeNumeros.add("dezesseis");
		listaDeNumeros.add("dezessete");
		listaDeNumeros.add("dezoito");
		listaDeNumeros.add("dezenove");
		
		listaDeNumerosSent.add("cem");
		listaDeNumerosSent.add("cento");
		listaDeNumerosSent.add("dozentos");
		listaDeNumerosSent.add("trezentos");
		listaDeNumerosSent.add("quatrocentos");
		listaDeNumerosSent.add("quinhentos");
		listaDeNumerosSent.add("seiscentos");
		listaDeNumerosSent.add("setecentos");
		listaDeNumerosSent.add("oitocentos");
		listaDeNumerosSent.add("novecentos");
		
		listaDeNumerosDesc.add("vinte");
		listaDeNumerosDesc.add("trinta");
		listaDeNumerosDesc.add("quarenta");
		listaDeNumerosDesc.add("cinquenta");
		listaDeNumerosDesc.add("sescenta");
		listaDeNumerosDesc.add("setenta");
		listaDeNumerosDesc.add("oitenta");
		listaDeNumerosDesc.add("noventa");
	}

	@Override
	public String printerNumber(String numero) {
		int indice = Integer.parseInt(numero);
		String frase = null;
		
		
		if (indice< 20){
			frase = (String)listaDeNumeros.get(indice);
		}
		
		if (indice>19 && indice<100){
			char strD = numero.charAt(0);
			char steU = numero.charAt(1);
			int indice1,indice2;
			indice1 = Character.getNumericValue(strD);
			indice2 = Character.getNumericValue(steU);
			if(!(indice2==0)){
				frase = (String)listaDeNumerosDesc.get(indice1 -2) +" e "+ (String)listaDeNumeros.get(indice2) ;
			}
			else{
				frase = (String)listaDeNumerosDesc.get(indice1 -2);
			}
			
		}
		if (indice > 99){
			char strC = numero.charAt(0);
			char strD = numero.charAt(1);
			char strU = numero.charAt(2);
			int indice1,indice2,indice3;
			indice1 = Character.getNumericValue(strC);
			indice2 = Character.getNumericValue(strD);
			indice3 = Character.getNumericValue(strU);
			
			if( (indice2>1)){
				if( !(indice3==0)){
					frase = (String)listaDeNumerosSent.get(indice1 ) +" e "+ (String)listaDeNumerosDesc.get(indice2 -2)+" e "+ (String)listaDeNumeros.get(indice3) ;
					
				}else{
					frase = (String)listaDeNumerosSent.get(indice1 ) +" e "+ (String)listaDeNumerosDesc.get(indice2 -2);
				}
				
			}
			else if((indice2<2)){
				if(indice2+indice3==0){
					if(indice1==1){
						frase = (String)listaDeNumerosSent.get(indice1 -1) ;
					}
					else{
						frase = (String)listaDeNumerosSent.get(indice1 ) ;
					}
				}
				if(indice2==1){
					frase = (String)listaDeNumerosSent.get(indice1 ) +" e "+ (String)listaDeNumeros.get(indice3+10) ;
				}
				else{
					frase = (String)listaDeNumerosSent.get(indice1 ) +" e "+ (String)listaDeNumeros.get(indice3) ;
				}
							
			}
			
		}
		
		return frase;
	}
//	public static void main(String[] args) {
//		PrinterNumberAte19 pn = new PrinterNumberAte19();
//		System.out.println(pn.printerNumber("2"));
//		System.out.println(pn.printerNumber("12"));
//		System.out.println(pn.printerNumber("14"));
//		System.out.println(pn.printerNumber("10"));
//		System.out.println(pn.printerNumber("21"));
//		System.out.println(pn.printerNumber("76"));
//		System.out.println(pn.printerNumber("92"));
//		System.out.println(pn.printerNumber("90"));
//		System.out.println(pn.printerNumber("100"));
//		System.out.println(pn.printerNumber("112"));
//		System.out.println(pn.printerNumber("176"));
//		System.out.println(pn.printerNumber("128"));
//		System.out.println(pn.printerNumber("137"));
//		
//		
//	}

}

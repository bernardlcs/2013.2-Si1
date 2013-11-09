package lab1;

import org.junit.*;
import org.junit.internal.runners.statements.Fail;
public class TestePrinterNumber {
	
	private PrinterNumber pN;
	
	@Before
	public void construtor(){
		pN = new PrinterNumber();
	}
	@Test
	public void printDezena(){
		System.out.println();
		Assert.assertEquals("um", pN.printerNumber("1"));
		Assert.assertEquals("dez", pN.printerNumber("10"));
		//Assert.assertEquals("<numero>", printerNumero("<numero>"));
//		try{
//			printerNumero("xpto");
//			
//		}catch(Exception e){
//			Assert.assertEquals("deve informar um número",e.getMessage());
//		}
		///vinte e um a 99
		Assert.assertEquals("vinte e um", pN.printerNumber("21"));
		Assert.assertEquals("trinta e dois", pN.printerNumber("32"));
		
		///101 a 199
		Assert.assertEquals("cento e setenta e seis", pN.printerNumber("176"));
		
		///1001 a 1999
		//Assert.assertEquals("mil  e setenta e seis", pN.printerNumber("1076"));
		
		/// 2000 e 1 000000 
		//Assert.assertEquals("1 milhao e setenta e seis", pN.printerNumber("1000076"));
		
		
		
	}
	private Object printerNumero(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

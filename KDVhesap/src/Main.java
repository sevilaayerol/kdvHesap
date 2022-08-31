import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double para, kdv;
		Scanner input = new Scanner(System.in);
		
		//para deðeri giriþi yapýldý
		System.out.print("Para degerini giriniz: ");
		para = input.nextDouble();
		
		
		//kdv oraný hesaplandý
		if(0<para && para<1000) {
			kdv=(para*18)/100;
		}
		else {
			kdv=(para*8)/100;
		}
	
		//sonuçlar yazýldý
		System.out.print("KDV'siz tutar: ");
		System.out.println(para);
		
		System.out.print("KDV tutarý: ");
		System.out.println(kdv);
		
		System.out.print("KDV'li tutar: ");
		System.out.println(para+kdv);
		
		
	}

}

import java.util.Scanner;
public class main {
	
   public static int cikarma(int a, int b) {
	   return(a-b);
   }
   
   public static double bolme(int a, int b) {
	   return((double) a / b);
   }
	
   public static int toplama(int a, int b) {
	   return(a+b);
   }
	
   public static int toplama(int a, int b, int c) {
	   return(a+b+c);
   }
   
   public static int carpma(int a, int b) {
	   return(a*b);
	   
   }
   
   public static int carpma(int a, int b, int c) {
	   return(a*b*c);
   }
   
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	String islemler = "1. Toplama islemi\n"
			+ "2. cikarma islemi\n"
			+ "3. carpma islemi\n"
			+ "4. bölme islemi\n"
			+ "cikis icin q'ya basin"	;
		System.out.println(islemler);
		
	while(true) {
		
		System.out.println("islemi seciniz");
		String islem = scanner.nextLine();
		
		if(islem.equals("q")) {
			System.out.println("programdan cikis yapiliyor");
			break;
		}
		
		else if (islem.equals("1")) {
			System.out.println("kac deger toplayacaksiniz ( 2 veya 3)");
			
			int kacsayi =scanner.nextInt();
			if(kacsayi == 2) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("girilen sayilerin toplamlari " + (toplama(a,b)));
			}
			
			else if (kacsayi ==3) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b");
				int b = scanner.nextInt();
				System.out.println("c:");
				int c = scanner.nextInt();
				scanner.nextLine();
				System.out.println("girilen sayilerin toplamlari " + (toplama(a,b,c)));
			}
			
			else {
				System.out.println("Bunun icin uygun metod bulunamadi");
			}
			
			
		}
		
		
		else if(islem.equals("2")) {
			System.out.println("a:");
			int a = scanner.nextInt();
			System.out.println("b");
			int b = scanner.nextInt();
			scanner.nextLine();
			System.out.println("girilen sayilerin farklari " + (cikarma(a,b)));
		}
		
		
		else if(islem.equals("3")) {
        System.out.println("kac deger carpacaksiniz ( 2 veya 3)");
			
			int kacsayi =scanner.nextInt();
			if(kacsayi == 2) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("girilen sayilerin carpimlari " + (carpma(a,b)));
			}
			
			else if (kacsayi ==3) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b");
				int b = scanner.nextInt();
				System.out.println("c:");
				int c = scanner.nextInt();
				scanner.nextLine();
				System.out.println("girilen sayilerin carpimlari " + (carpma(a,b,c)));
			}
			
			else {
				System.out.println("Bunun icin uygun metod bulunamadi");
			}
			
				
		}
		
		
		else if (islem.equals("4")){
			System.out.println("a:");
			int a = scanner.nextInt();
			System.out.println("b");
			int b = scanner.nextInt();
			scanner.nextLine();
			System.out.println("girilen sayilerin bolumleri " + (bolme(a,b)));
		}
		
		
		else {
			System.out.println("gecersiz islem");
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}

 package gf;
import java.util.Scanner;
	public class praticando {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int number1;
			int number2;
			int number3;
			int number4;
			int sum;
			
			System.out.print("digite primeiro numero:");
			  number1 = input.nextInt();
			  
			System.out.print("digite segundo numero:");
			  number2 = input.nextInt();
			  
			System.out.print("digite terceiro numero:");
			   number3 = input.nextInt();
			
			System.out.print("digite quarto numero:");
			    number4 = input.nextInt();
			    
			 sum = (number1 + number2 + number3 + number4)/4;
			 
			 System.out.println("Resultado = " + sum);
			 
			if (sum >= 6 ) {
				System.out.println("aprovado" );	
			} {
			if (sum < 4) 
				System.out.println("reprovado: " );
			}
		}
}

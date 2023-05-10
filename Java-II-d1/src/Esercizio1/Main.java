package Esercizio1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		int[] numArr = new int[5];
	        for (int i = 0; i < numArr.length; i++) {
	            double randomNumber = Math.random() * 10 + 1;
	            numArr[i] = Math.round((int)randomNumber);
	            
		        System.out.println(numArr[i]);
	        }
	        
	        Scanner scanner = new Scanner(System.in);
			
			System.out.print("inserisci un numero intero:");
			int num = scanner.nextInt();
			
			scanner.close();



	}

}

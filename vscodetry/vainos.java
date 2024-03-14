import java.util.Scanner;
import java.util.Random;

public class vainos {
    
    public static void main(String[] args) {

		double[] valores = new double[10];

		Random random = new Random();
		Scanner sk = new Scanner(System.in);

		String continueFlights = "no";

		do{
			
			for(int n = 9; n != 0; n--) {
					valores[n] = valores[n-1];
				}

			valores[0] = random.nextDouble()*10;
			System.out.print(valores[0]);

			System.out.print("\nIngrese si o no: ");
			continueFlights = sk.nextLine();

		}while(continueFlights.equalsIgnoreCase("si"));

		


		System.out.print("-------------------------");
		for(int n=0; n <= 9; n++) {
			System.out.print("\nVuelo " + (10-n) + ": " + valores[n]);
		}

        sk.close();
    }
}


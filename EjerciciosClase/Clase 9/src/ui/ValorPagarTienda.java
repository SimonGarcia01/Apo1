package ui;

import java.util.Scanner;

public class ValorPagarTienda {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        System.out.print("Ingrese cuantos items va a comprar: ");
        int amount = sk.nextInt();

        System.out.print("$"+ value(amount));

        sk.close();
    }

    public static double value(int amount){
        double totalValue = 0;

        Scanner sk = new Scanner(System.in);

        for (int i=1; i <= amount; i++) {
            System.out.print("Ingrese el valor de la compra: ");
            double price = sk.nextDouble();

            totalValue += price;
        }
        sk.close();

        return totalValue;
    }

}

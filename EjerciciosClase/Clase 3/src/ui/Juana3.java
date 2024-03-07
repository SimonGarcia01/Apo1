package ui;

import java.util.Scanner;

public class Juana3{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
        //input
		System.out.println("Ingrese el peso actual (kg): ");
		double weight = lector.nextDouble();
		System.out.println("Ingrese su estatura actual(m): ");
		double height = lector.nextDouble();
		System.out.println("Ingrese el numero de sesiones de aerobicos por semana que atiende: ");
		int sessions = lector.nextInt();

		//calculations
		double goal = (height*100)-110;
		goal = weight - goal;
		double goalCal = goal*3500;
		double calConversion = 450.0/60.0;
		double goalTime = goalCal/calConversion;
		double goalSessions = goalTime/45;
		double weekGoal = (int)((goalSessions/sessions)+1);
		
		//output
		System.out.print("Se demoraria alrededor de " + weekGoal + " semanas para llegar a su meta.");
    }

}

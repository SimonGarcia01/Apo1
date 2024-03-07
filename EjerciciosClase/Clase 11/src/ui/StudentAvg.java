package ui;
import java.util.Scanner;


public class StudentAvg {
    public static void main(String[] args){


        Scanner sk = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de notas: ");
        final int SCORE_NUMBER = sk.nextInt();


        double[] scores = new double[SCORE_NUMBER];


        for(int i = 0; i < scores.length ; i++) {
            System.out.print("Ingrese la nota " + (i+1) + " del alumno: ");
           
            scores[i] = sk.nextDouble();
        }


        System.out.print("El promedio del estudiante es: " + studentMean(scores,SCORE_NUMBER));


        sk.close();
    }


    public static double studentMean(double[] scoreList, int size) {


        double total = 0;


        for(int i = 0; i < scoreList.length ; i++) {
           
            total +=scoreList[i];


        }


        double avg = total/size;


        return avg;
    }
}

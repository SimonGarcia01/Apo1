package ui;

import java.util.Scanner;

public class BatiMovil {
    public static void main(String[] args) {


        Scanner sk = new Scanner(System.in);


        String changedWord = replaceCharinString(sk);


        System.out.print(changedWord);


        sk.close();
    }


    public static String replaceCharinString (Scanner sk) {


        System.out.print("Ingrese la palabra que va a revisar: ");
        String wordTarget = sk.nextLine();


        System.out.print("Ingrese la letra que va a cambiar: ");
        char firstChar = sk.next().charAt(0);


        System.out.print("Ingrese la letra por la que la va a reemplazar: ");
        char secondChar = sk.next().charAt(0);


        System.out.print("El numero de repeticion de esa letra que desea cambiar: ");
        int number = sk.nextInt();
        sk.nextLine();


        int charCounter = 0;


        String reWrite = "";




        for(int n = 0; n <= wordTarget.length()-1; n++) {


            if(wordTarget.charAt(n) == firstChar) {
                charCounter ++;


                if(charCounter == number) {
                    for(int i = 0; i<= wordTarget.length()-1; i++){
                        if(i == n){
                            reWrite = reWrite + secondChar;
                        } else{
                            reWrite = reWrite + wordTarget.charAt(i);
                        }
                    }
                }
            }
        }


        return reWrite;
    }
}
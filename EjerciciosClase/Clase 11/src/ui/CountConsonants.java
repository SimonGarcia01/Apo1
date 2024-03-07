package ui;


import java.util.Scanner;


public class CountConsonants {
    public static void main(String[] args) {
       
        Scanner sk = new Scanner(System.in);
       
        System.out.print("Ingrese una palabra: ");
        String checkString = sk.nextLine();


        System.out.print("El numero de consonantes es: " + count(checkString));




        sk.close();
    }
    public static int count(String word) {


        int count = 0;


        for(int i = 0 ; i < word.length(); i++){


            if(!(word.charAt(i)=='a'||word.charAt(i)=='e'||
            word.charAt(i)=='i'||word.charAt(i)=='o'||
            word.charAt(i)=='u')){
                count ++;
            }


        }


        return count;
    }
}

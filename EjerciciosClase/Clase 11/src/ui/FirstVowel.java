package ui;


import java.util.Scanner;


public class FirstVowel {
    public static void main(String[] args) {
       
        Scanner sk = new Scanner(System.in);
       
        System.out.print("Ingrese una palabra: ");
        String checkString = sk.nextLine();


        System.out.print("La primera consonante esta en la pocision: " +
        findVowel(checkString));


        sk.close();
    }
   
    public static int findVowel(String word) {


        boolean isVowel = false;
        int position = 0;


        for(int i = 0 ; i < word.length() && !isVowel; i++){


            if(word.charAt(i)=='a'||word.charAt(i)=='e'||
            word.charAt(i)=='i'||word.charAt(i)=='o'||
            word.charAt(i)=='u'){
               
                position = i;
                isVowel = true;
            }
        }
        return position;
    }
}



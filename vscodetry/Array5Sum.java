import java.util.Scanner;

public class Array5Sum {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);

        System.out.print("Ingrese el tamano de arreglo que sumara: ");
        int arraySize = sk.nextInt();

        System.out.print("Ingrese la informacion del primer arreglo: ");
        int[] array1 = new int[arraySize];
        array1 = fillArray(sk, array1);

        System.out.print("Ingrese la informacion del segundo arreglo: ");
        int[] array2 = new int[arraySize];
        array2 = fillArray(sk, array2);
        
        System.out.print("La suma de los arreglos es: ");
        int[]finalArray = arraySum(array1, array2, arraySize);

        System.out.print(printArray(finalArray));

    }

    public static int[] fillArray(Scanner sk, int[] emptyArray){
        
        for(int n = 0; n < emptyArray.length; n++) {
            System.out.print("\nIngrese un entero: ");
            emptyArray[n] = sk.nextInt();

        }
        
        return emptyArray;
    }

    public static int[] arraySum (int[] array1, int[] array2, int arrayLength) {
        int[] sumArray = new int[arrayLength];

        int saveBefore = 0;
        int num = 0;

        for(int n = arrayLength-1; n >= 0; n--){

            if(n == arrayLength){
                if ((array1[n] + array2[n]) > 9) {
                    num = array1[n] + array2[n];
                    saveBefore = 1;
                    num = num - 10;
                    sumArray[n] = num;
                } 
            } else {
                if(saveBefore ==1) {
                    if ((array1[n] + array2[n]) > 9) {
                        num = array1[n] + array2[n] + saveBefore;
                        saveBefore = 1;
                        num = num - 10;
                        sumArray[n] = num;
                    }else {
                        num = array1[n] + array2[n] + saveBefore;
                        saveBefore = 0;
                        num = num - 10;
                        sumArray[n] = num;
                    }
                    
                } else{
                    if ((array1[n] + array2[n]) > 9) {
                        num = array1[n] + array2[n] + saveBefore;
                        saveBefore = 1;
                        num = num - 10;
                        sumArray[n] = num;
                    }else {
                        num = array1[n] + array2[n] + saveBefore;
                        saveBefore = 0;
                        num = num - 10;
                        sumArray[n] = num;
                    }
                }
            }

        }
        
        return sumArray;
    }

    public static String printArray(int[] printingArray) {

        String printedArray = "";

        for(int n = printingArray.length-1; n >= 0; n--) {
            printedArray = printingArray[n] + printedArray;

        }

        return printedArray;

    }
}
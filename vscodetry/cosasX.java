public class cosasX {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        System.out.print(printArray(array));
    }
    
    public static String printArray(int[] printingArray) {

        String printedArray = "";

        for(int n = printingArray.length-1; n >= 0; n--) {
            printedArray = printingArray[n] + printedArray;

        }

        return printedArray;

    }
}

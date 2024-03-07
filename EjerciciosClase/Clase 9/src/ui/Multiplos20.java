package ui;

public class Multiplos20 {
    public static void main(String[] args) {
        
        forLoop();
        whileLoop();

    }

    public static void forLoop() {
        int cont20 = 0;
        
        for (int i =0; i <= 10000; i++) {
            if (i%20 == 0) {
                cont20++;
            }
        }

        System.out.println(cont20);
    }

    public static void whileLoop() {
        int cont20 = 0;
        int i = 0;
        
        while(i <= 10000) {

            if (i%20 == 0) {
                cont20++;
            } 

            i++;
        }

        System.out.println(cont20);
    }
}

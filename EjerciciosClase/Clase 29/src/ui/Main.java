package ui;

import model.Matrix;

public class Main {
    //Attributes
    private Matrix intMatrix;

    //Relations

    //Methods
    public Main(){
        intMatrix = new Matrix(3, 6);
    }

    public static void main(String[] args){
        Main objMain = new Main();

        objMain.intMatrix.fillInts(100);
        System.out.println(objMain.intMatrix.toString());

        objMain.intMatrix.restart();
        System.out.println(objMain.intMatrix.toString());
        
        objMain.intMatrix.fillEven(11); 
        System.out.println(objMain.intMatrix.toString());

        objMain.intMatrix.restart();
        objMain.intMatrix.fillStaircase();
        System.out.println(objMain.intMatrix.toString());

        objMain.intMatrix.restart();
        System.out.println(objMain.intMatrix.toString());

    }

    public Matrix getIntMatrix() {
        return intMatrix;
    }
}

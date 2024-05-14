package model;

public class Matrix {
    //Constants
    public int ROWS;
    public int COLUMNS;
    
    //Attributes
    private int[][] intMatrix;

    //Methods
    public Matrix(int rows, int columns){
        this.ROWS = rows;
        this.COLUMNS = columns;

        this.intMatrix = new int[rows][columns];
    }

    //Fill with whole numbers
    public void fillInts(int start){
        int counter = start;
        for(int i = 0; i < intMatrix.length; i++){
            for(int j = 0; j < intMatrix[i].length; j++){
                intMatrix[i][j] = counter;
                counter++;
            }
        }
    }

    //Restart matrix
    public void restart(){
        this.intMatrix = new int[ROWS][COLUMNS];
    }

    //filling even slots
    public void fillEven(int start){
        int counter = start;
        for(int i = 0; i < intMatrix.length; i++){
            for(int j = 0; j < intMatrix[i].length; j += 2){
                intMatrix[i][j] = counter;
                counter+=2;
            }
        }
    }

    //Fill "Staircase" way
    public void fillStaircase() {
        int counter = 1;
        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j <= i && j < intMatrix[i].length; j++) {
                intMatrix[i][j] = counter;
                counter++;
            }
        }
    }

    //Fill in spiral
    public void fillSpiral(){
        
    }
    
    
    //toString
    public String toString(){
        String message = "";
        for(int[] row : intMatrix){
            for(int number : row){
                message += number + " ";
            }
            message += "\n";
        }
        return message;
    }

}
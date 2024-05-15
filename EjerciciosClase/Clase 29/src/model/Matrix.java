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
    public void fillSpiral() {
        if (ROWS == 0 || COLUMNS == 0) return;

        int num = 1;
        int top = 0, bottom = ROWS - 1, left = 0, right = COLUMNS - 1;

        while (top <= bottom && left <= right) {
            // Move right
            for (int j = left; j <= right; j++) {
                intMatrix[top][j] = num++;
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                intMatrix[i][right] = num++;
            }
            right--;

            // Move left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    intMatrix[bottom][j] = num++;
                }
                bottom--;
            }

            // Move up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    intMatrix[i][left] = num++;
                }
                left++;
            }
        }
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
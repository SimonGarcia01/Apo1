package ui;

import java.util.Scanner;
import model.University;

public class Main{
    //attributes
    private University controller;
    private Scanner sk;

    public Main(){
        controller = new University();
        sk = new Scanner(System.in);
    }

    public static void main(String[] args){

        Main objMain = new Main();

    }


}
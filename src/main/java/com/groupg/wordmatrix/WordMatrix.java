package com.groupg.wordmatrix;

import com.groupg.wordmatrix.Level;
import com.groupg.wordmatrix.EndPage;
import com.groupg.wordmatrix.Matrix;
import java.util.Timer;
import java.util.TimerTask;

public class WordMatrix {

    public static void main(String args[]) {
startprogram();
        

    }
    public static void startprogram(){
        Level testLevel = new Level();
        EndPage remaind;
        remaind =new EndPage(Integer.valueOf(testLevel.determineTimerDuration()),testLevel);
        String testWord = "test";
        System.out.println("Level Class: determineMatrixSize, made to determine the length of the matrix based on the level");
        System.out.println(testLevel.determineMatrixSize());
        System.out.println("Level Class: increaseLevel, incremenets the level by one");
        System.out.println(testLevel.getLevel());
        testLevel.increaseLevel();
        remaind =new EndPage(Integer.valueOf(testLevel.determineTimerDuration()),testLevel);
        System.out.println(testLevel.getLevel());
        System.out.println("Level Class: determineTimerDuration, made for the timer that will eventually be added to determine the time. Gets smaller as the level increases");
        System.out.println(testLevel.determineTimerDuration());

        System.out.println("Matrix Class: generateMatrix, called when constructed and can be called seperatly to make a new matrix");
        Matrix testMatrix = new Matrix(testLevel.determineMatrixSize());
        System.out.println("Matrix Class: toString");
        System.out.println(testMatrix);
        System.out.println("Matrix Class: determineMatrixSize, determines the maximum length of the word that can be placed in the matrix");
        System.out.println(testMatrix.determineWordLength());
        System.out.println("Matrix Class: placeWordInMatrix, randomly places a word in the matrix with random orientation and stores the word along with its position. The test word is test in lowercase");
        testMatrix.placeWordInMatrix("test");
        System.out.println(testMatrix);
    }

    private static EndPage Remainder(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupg.wordmatrix;

import java.util.Random;

/**
 *
 * @author jayas
 */
public class Matrix {
    int matrixWidth = 0;
    int matrixHeight = 0;
    String word = "";
    int orientation = 0;
    int wordLength = 0;
    String[][] matrixArray;
    int xPosOfWord;
    int yPosOfWord;
   
    
    public Matrix (int x){
        this.matrixWidth = x;
        this.matrixHeight = x;
        generateMatrix();
    }
    
    public int determineWordLength() {
        return matrixWidth;
    }
        // Randomly determines the orientation of the word in the matrix
        // 1 = vertical, 0 = horizontal
    public void determineOrientation() {
        Random rng = new Random();
        this.orientation = rng.nextInt(2);
    }
        // Generates a matrix based on dimensions and populates each element with a random letter A-Z
    public void generateMatrix() {
        Random rng2 = new Random();
        char letter = 'A';
        String[][] matrix = new String[matrixWidth][matrixHeight];
        for (int row = 0; row < matrix.length; row++) { // Loops through each element in the matrix
            for (int col = 0; col < matrix[row].length; col++) {
                letter = (char) ('A' + rng2.nextInt(26)); // Randomly generates a character between A and Z
                matrix[row][col] = String.valueOf(letter); // Converts the character to String and assisgns it to each position in the matrix
            }
        }
        // Prints matrix
        /* for (String[] row : matrix) {
                System.out.println(Arrays.toString(row));
            } */
        this.matrixArray = matrix;
    }
    public void placeWordInMatrix(String word){
        determineOrientation();
        this.wordLength = word.length();
        this.word = word;
        
        int offset = this.matrixHeight - this.wordLength; // Calculating the "offset" of the word. AKA, how many digdits the word needs to be shifted to fit into the array.
        Random rng = new Random();
        int importantPos = rng.nextInt(offset + 1); // creating the random pos for the number with respect to the offset.
        int otherPos = rng.nextInt(this.matrixHeight); // creating the other random row / column position for the otherwise not restricted variable.
        int wordPos = 0; // pointer for where we are in the position of the word. 
        
        if (this.orientation == 0){ // If the word is horizontally placed, start at any row and at the offset position and place the word going to the right one character at a time through the row.
            for (int x = importantPos; x < this.wordLength + importantPos; x++){
                this.matrixArray[x][otherPos] = String.valueOf(this.word.charAt(wordPos)); // 
                wordPos++;
            }
            this.xPosOfWord = importantPos;
            this.yPosOfWord = otherPos;
        }
        else{ // If the word is vertically placed, start at any column, and at the offset position and place the word going down one character at a time through the column.
            for (int x = importantPos; x < this.wordLength + importantPos; x++){
                this.matrixArray[otherPos][x] = String.valueOf(this.word.charAt(wordPos));
                wordPos++;
            }
            this.xPosOfWord = otherPos;
            this.yPosOfWord = importantPos;
        }
        
        
    }
    
    @Override
    public String toString(){ // overrided toString to allow for easier printing. Prints the matrix row by row with a space inbetween.
        String returnstring = "";
        
        for (int x = 0; x < this.matrixWidth; x++){
            for (int y = 0; y < this.matrixHeight; y++){
                returnstring = returnstring + this.matrixArray[x][y] + " ";
            }
            returnstring = returnstring + "\n";
        }
        
        return returnstring;
    }
}

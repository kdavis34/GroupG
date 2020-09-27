public class WordMatrix {

    public static void main(String args[]) {

        Level testLevel = new Level();
        Matrix testMatrix = new Matrix(7);
        String testWord = "chicky";
        System.out.println(testMatrix);
        testMatrix.placeWordInMatrix(testWord);
        System.out.println(testMatrix);

    }
}

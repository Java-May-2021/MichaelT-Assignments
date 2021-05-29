import java.util.Arrays;
public class PuzzleJavaTester{
    public static void main(String[] args){
        PuzzleJava test = new PuzzleJava();

        int[] sampleArray = {3,5,1,2,7,9,8,13,25,32};
        test.createArray(sampleArray, 10);
        
        String[] names = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        test.stringArray(names, 5);

        test.alphabetArray();

        System.out.println(test.randomArray());

        System.out.println(test.fiveCharString());

        String[] stringArray = test.tenStringArray();
        System.out.println(Arrays.toString(stringArray));
    }
}
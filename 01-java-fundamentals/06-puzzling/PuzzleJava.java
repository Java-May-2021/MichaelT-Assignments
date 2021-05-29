import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public ArrayList<Integer> createArray(int[] array, int exception){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int sum = 0;
        for(int number: array){
            sum += number;
            if(number > exception){
                
                newList.add(number);
            }
        }
        System.out.println(sum);
        System.out.println(newList);
        return newList;
    }

    public ArrayList<String> stringArray(String[] array, int exception){
        ArrayList<String> names = new ArrayList<String>();
        
        for(String number : array){
            if(number.length() > exception){
                names.add(number);
            }
        }
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);
        return names;
    }

    public ArrayList<Character> alphabetArray(){
        ArrayList<Character> alphabet = new ArrayList<Character>();

        for(char letter = 'a'; letter <= 'z'; ++letter){
            alphabet.add(letter);
        }
        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(25));
        System.out.println(alphabet.get(0));
        if(alphabet.get(0) == 'a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' || alphabet.get(0) == 'o' || alphabet.get(0) == 'u'){
            System.out.println("First letter is a vowel");
        }
        return alphabet;
    }   

    public ArrayList<Integer> randomArray(){
        Random number = new Random();
        ArrayList<Integer> random = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            int num = number.nextInt(46) + 55;
            random.add(num);
        }
        return random;
    }

    public String fiveCharString(){
        Random r = new Random();
        String str;

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        char[] randomLetters = new char[5];
        
        for (int i = 0; i <= 4; i++) {
            int rand = r.nextInt(26);
            randomLetters[i] = letters[rand]; 
        }
        str = new String(randomLetters);
        return str;
    }

    public String[] tenStringArray() {
        String[] randomStrings = new String[10];
        
        for (int i = 0; i <= 9; i++) {
            String str = fiveCharString();
            randomStrings[i] = str;
        }
        return randomStrings;
    }
}
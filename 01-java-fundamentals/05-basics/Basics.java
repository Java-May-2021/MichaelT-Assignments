import java.util.ArrayList;
import java.util.Arrays;

public class Basics{

    public void firstPrint(){
        for (int i=1; i<256; i++){
            System.out.println(i);
        }
    }

    public void printOdds(){
        for (int i=1; i<256; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }

    public void getSum(){
        int sum = 0;
        for(int i=1; i< 256; i++){
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
        }
    }

    public void iterate(int[] array){
        for(int value : array ){
            System.out.println(value);
        }
    } 

    public int findMax(int[] array){
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max is: " + max);
        return max;
    }

    public int findMin(int[] array){
        int min = array[0];
        for (int i=0; i<array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Min is: " + min);
        return min;
    }

    public double findAvg(int[] array) {
        int sum = 0;
        double avg;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println("The average value is: " + avg);
        return avg;
    }

    public static ArrayList<Integer> oddArray() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 1; i <= 255; i++) {
			if(i % 2 != 0)
				nums.add(i);
		}
        System.out.println(nums);
		return nums;
	}

    public int valueArray(int[] array, int y){
        int greater=0;
        for(int i=0; i<array.length; i++){
            if(array[i] > y){
                greater += 1;
            }
        }
        System.out.println("There are " + greater + " numbers greater than " + y);
        return greater;
    }

    public void squareValue(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = array[i] * array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public void subNegatives(int[] array){
        for (int i=0; i<array.length; i++){
            if(array[i] < 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void maxMinAverage(int[] value){
        int min = findMin(value);
        int max = findMax(value);
        double avg = findAvg(value);
        System.out.println("Min:" + min + " Max:" + max + " Avg:" + avg);
    }

    public void shiftValue(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i-1];
        }
        array[array.length-1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
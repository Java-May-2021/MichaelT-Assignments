public class BasicsTester{
    public static void main(String[] args){
        Basics test = new Basics();
        int[] array = {-4,-3,-2,-1,0,1,2,3,4};
        int[] avgArray = {6,3,7,8,2,34,75,32};

        test.firstPrint();
        test.printOdds();
        test.getSum();
        test.iterate(array);
        test.findMax(array);
        test.findMin(array);
        test.findAvg(avgArray);
        test.oddArray();
        test.valueArray(array, 0);
        test.squareValue(array);
        test.maxMinAverage(array);
        test.shiftValue(array);
    }
}
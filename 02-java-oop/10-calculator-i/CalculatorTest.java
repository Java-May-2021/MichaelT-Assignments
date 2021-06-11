public class CalculatorTest{
    public static void main(String[] args){
        Calculator test = new Calculator();
        Calculator testTwo = new Calculator();
        
        test.setNumberOne(10.5);
        test.setNumberTwo(5.2);
        test.setOperation('+');
        test.performOperation();
        test.getResult();
        testTwo.setNumberOne(24.8);
        testTwo.setNumberTwo(15.9);
        testTwo.setOperation('-');
        testTwo.performOperation();
        testTwo.getResult();
    }
}
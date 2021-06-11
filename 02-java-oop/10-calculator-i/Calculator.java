public class Calculator{
    private double numberOne;
    private double numberTwo;
    private char operation;
    private double result;

    public Calculator(){
    }
    public void setNumberOne(double numberOne){
        this.numberOne = numberOne;
    }
    public void setNumberTwo(double numberTwo){
        this.numberTwo = numberTwo;
    }
    public void setOperation(char operation){
        this.operation = operation;
    }
    public Double getNumberOne(double numberOne){
        return numberOne;
    }
    public Double getNumberTwo(double numberTwo){
        return numberTwo;
    }
    public char getOperation(char operation){
        return operation;
    }
    public void performOperation(){
        if(this.operation == '+'){
            this.result = numberOne + numberTwo;
        }
        else if(this.operation == '-'){
            this.result = (numberOne) - (numberTwo);
        }
    }
    public void getResult(){
        System.out.println(this.numberOne + " " + this.operation + " " + this.numberTwo + " = " + this.result);
    }
}
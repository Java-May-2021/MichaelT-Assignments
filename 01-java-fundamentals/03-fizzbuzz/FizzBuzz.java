public class FizzBuzz{
    public static String fizzBuzz(int number){
        if(number %3 == 0 && number %5==0){
            return "FizzBuzz";
        }
        
        else if(number %3 == 0){
            return "Fizz";
        }
            
        else if(number %5 == 0){
            return "Buzz";
        }
            
        else{
            return Integer.toString(number);
        }
    }

    public static void loop(){
        for(int i=0; i<=50; i++){
            String result = fizzBuzz(i);
            System.out.println("Number:" + i + "Result:" + result);
        }
    }
}
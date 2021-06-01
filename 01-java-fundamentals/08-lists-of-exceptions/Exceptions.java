import java.util.ArrayList;


public class Exceptions{
    public static void exceptionList(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted the value " + castedValue);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
    
}
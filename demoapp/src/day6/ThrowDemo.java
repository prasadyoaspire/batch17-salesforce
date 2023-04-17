package day6;

public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("Main starts...");
        int age = 15;
        try {
            if(age < 18) {
                //NullPointerException e = new NullPointerException();
                AgeLimitException e = new AgeLimitException();
                throw e;
            }           
            System.out.println("Eligible for vote");
        }
        catch(AgeLimitException e) {
            System.err.println("Not eligible");
        }   
        System.out.println("Main ends...");        
    }   
}


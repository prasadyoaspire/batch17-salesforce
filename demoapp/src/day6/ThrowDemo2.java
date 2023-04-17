package day6;

public class ThrowDemo2 {
    public static void main(String[] args) {
        System.out.println("Main starts....");
        ThrowDemo2 t2 = new ThrowDemo2();
        try {
            t2.vote(10);
        }
        catch(AgeLimitException e) {
            //System.out.println("Not eligible for vote");
            System.out.println(e.getMessage());
           // System.out.println(e); // e.toString();
           // e.printStackTrace();
        }   
        System.out.println("Main ends....");        
    }

    void vote(int age) throws AgeLimitException {
        if(age <18) {
            AgeLimitException ae = new AgeLimitException("Not eligible for vote!");
            throw ae; 
        }
        System.out.println("Eligible for vote");
    }
}

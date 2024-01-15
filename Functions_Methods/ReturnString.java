package JavaLearning.Functions_Methods;

public class ReturnString {
    public static void main(String[] args) {
        String message = Greet();
        System.out.println(message);
    }
    static String Greet(){
        String greeting = "Hello! How are You";
        return greeting;
    }
}

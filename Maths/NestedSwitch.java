package JavaLearning;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String departmnet = in.next();
        switch (empID) {
            case 1 -> System.out.println("Kamlesh Negi");
            case 2 -> System.out.println("Himanshu Rana");
            case 3 -> {
                System.out.println("Alok Singh");
                switch (departmnet) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    case "HR" -> System.out.println("HR Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}

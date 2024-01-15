package JavaLearning.Functions_Methods;

public class ArgsSum {
    public static void main(String[] args) {
        int ans = sum2(20,85);
        System.out.println("Sum = "+ans);
    }
    static int sum2(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
}

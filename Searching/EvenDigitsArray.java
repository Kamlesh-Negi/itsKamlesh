package JavaLearning.Searching;

public class EvenDigitsArray{
    public static void main(String[] args) {
        int[] nums = {6, 12, 345, 2124, 468};
        System.out.println("total no. of elements having even no. of digits: "+findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(evenDigit(num)){
                count++;
            }
        }
        return count;
    }

    // check if the number contains even number of digits or not

    static boolean evenDigit(int num){
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }

    // count the number of digits in a number

   /* static  int digits(int num){
        if (num < 0){
            num = num * (-1);
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }*/
 static  int digits2(int num){
        if (num < 0){
            num = num * (-1);
        }
    return (int)(Math.log10(num)) + 1;      // short trick to find the number of digits
    }
}

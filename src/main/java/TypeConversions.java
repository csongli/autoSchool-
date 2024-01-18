import java.util.Scanner;

public class TypeConversions {
    public static void main(String[] args){
       task1();
       task2();
       task3();
       task4();
    }
    public static void task1(){
        int q, w;
        q = 21;
        w = 8;
        System.out.println(q + " / " + w + " = " +q/w + " and "+ q%w +" as a remainder.");
    }
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit natural number: ");
        int n = scanner.nextInt();
        if (n >= 10 && n <= 99) {
            int digitSum = calculateDigitSum(n);
            System.out.println("The sum of the digits of " + n + " is: " + digitSum);
        } else {
            System.out.println("Invalid input. Please enter a two-digit natural number.");
        }
        scanner.close();
    }
    private static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
    public static void task3() {
        double n = 565664.488484;
        long roundedNumber = Math.round(n);
        System.out.println("Rounded to the nearest integer: " + roundedNumber);
    }
    public static void task4() {
        int a,b,c;
        a = 0 ; b = 2; c = 5;
        int tempA,tempB,tempC;
        tempA = a; tempB = b; tempC = c;
        a = tempA + tempB;
        b = tempC - tempA;
        c = tempA + tempB + tempC;
        System.out.println("Updated values:\n a = " + a + "; b = " + b + "; c = " + c);
    }
}


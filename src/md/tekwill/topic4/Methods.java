package md.tekwill.topic4;

public class Methods {
    static int sum(int firstNumber, int secondNumber) {
        int summ = 0;
        if (firstNumber > secondNumber) {
            System.out.println("Entered numbers do not correspond to the task conditions. Insert correct numbers");
            return summ;
        } else if (firstNumber == secondNumber) {
            System.out.println("Entered numbers are equal. Insert correct numbers");
            return firstNumber;
        } else {
            for (int i = firstNumber; firstNumber <= secondNumber; firstNumber++) {
                summ = summ + i;
            }
            System.out.println("Cycle FOR execution has finished");
        }
        return summ;
    }

    static void sum(double a) {
        double summ = 0;
        if (a > 0) {
            while (a > 0) {
                summ = summ + a;
                a--;
            }
            System.out.println("WHILE execution has finished");
            System.out.println(summ);
        } else if (a == 0) {
            System.out.println("summ equals zero");
        } else {
            System.out.println("a is less than 0");
        }
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задача 1");
        {
            int[] numbers = new int[]{1, 2, 3};
            numbers[0] = 1;
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
        double[] numbersTwo = {1.57, 7.654, 9.986};
        numbersTwo[0] = 1.57;
        for (int i = 0; i < numbersTwo.length; i++) {
            System.out.println(numbersTwo[i]);
        }


        int[] years = new int[3];
        years[0] = 1988;
        years[1] = 2000;
        years[2] = 2023;
        for (int i = 0; i < 3; i++)
            System.out.println(years[i]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        {
            int[] numbers = new int[]{1, 2, 3};

            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    System.out.println(numbers[i]);
                    break;
                }
                System.out.print(numbers[i] + ",");
            }
        }

        double[] numbersTwo = new double[]{1.57, 7.654, 9.986};

        for (int i = 0; i < numbersTwo.length; i++) {
            if (i == numbersTwo.length - 1) {
                System.out.println(numbersTwo[i]);
                break;
            }
            System.out.print(numbersTwo[i] + ",");
        }


        int[] years = new int[3];
        years[0] = 1988;
        years[1] = 2000;
        years[2] = 2023;
        for (int i = 0; i < years.length; i++) {
            if (i == years.length - 1) {
                System.out.println(years[i]);
                break;
            }
            System.out.print(years[i] + ",");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");

        int[] numbers = new int[]{1, 2, 3};

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        double[] numbersTwo = new double[]{1.57, 7.654, 9.986};

        for (int i = numbersTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbersTwo[i]);
                break;
            }
            System.out.print(numbersTwo[i] + ", ");
        }


        int[] years = new int[3];
        years[0] = 1988;
        years[1] = 2000;
        years[2] = 2023;
        for (int i = years.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(years[i]);
                break;
            }
            System.out.print(years[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] numbers = new int[]{1, 2, 3};

        for (int i = 0; i < numbers.length; ) {

            numbers[0] = numbers[0] + 1;
            numbers[2] = numbers[2] + 1;

            {
                System.out.println(Arrays.toString(numbers));
                break;
            }
        }
    }
}


























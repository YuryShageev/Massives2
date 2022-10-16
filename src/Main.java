public class Main {
    public static void main(String[] args) {
        generateRandomArray();
        reverseIvan();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int maxPayment = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println("Task 1");
        //Вариант 1
        for (int i = 0; i < arr.length; i++) {
            maxPayment += arr[i];
        }
//Вариант 2
//        for (int allPayment : arr) {
//            maxPayment += allPayment;
//        }
        System.out.println("Сумма трат за месяц составила " + maxPayment + " рублей");

        System.out.println("Task 2");
        int maxPaymentPerDay = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPaymentPerDay) {
                maxPaymentPerDay = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPaymentPerDay + " рублей");

        int minPaymentPerDay = 210000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPaymentPerDay) {
                minPaymentPerDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPaymentPerDay + " рублей");

        System.out.println("Task 3");

        int averagePaymentPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            averagePaymentPerMonth = maxPayment / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averagePaymentPerMonth + " рублей");
        return arr;
    }
    public static void reverseIvan() {
        char[] confusedIvan = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int normalName = 0;
        char symbol1 = '"';
        for (int assBackwards : confusedIvan) {
            normalName++;
        }
//        for (int i = 0; i < confusedIvan.length; i++) {
//            normalName++;
//        } Второй вариант
        for (int i = normalName - 1; i >= 0; i--) {
            System.out.print(confusedIvan[i]);
        }

        int quote = confusedIvan.length - 1;
        int quote1 = 12;
        int quote2 = confusedIvan[0];
        int quote3 = -1;

        if (quote1 > quote) {
            if (quote3 < quote2) {
                System.out.print(symbol1);
            }
        }
        System.out.println();
        System.out.println("Trying to put quotation marks");
    }
}
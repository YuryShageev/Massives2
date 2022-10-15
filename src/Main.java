public class Main {
    public static void main(String[] args) {
        generateRandomArray();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int maxPayment = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        //Вариант 1
        for (int i = 0; i < arr.length; i++) {
            maxPayment += arr[i];
        }
//Вариант 2
//        for (int allPayment : arr) {
//            maxPayment += allPayment;
//        }
        System.out.println("Сумма трат за месяц составила " + maxPayment + " рублей");

        int maxPaymentPerDay = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPaymentPerDay) {
                maxPaymentPerDay = arr[i];
            }
        }
        System.out.println(maxPaymentPerDay);

        int minPaymentPerDay = 210000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPaymentPerDay) {
                minPaymentPerDay = arr[i];
            }
        }
        System.out.println(minPaymentPerDay);
        return arr;
    }
}
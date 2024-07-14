public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("\nЗадание 1");
        int totalExpenses = 0;
        for (int expense : arr) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        arr = generateRandomArray();

        System.out.println("\nЗадание 2");
        int minExpense = arr[0];
        int maxExpense = arr[0];
        for (int expense : arr) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        arr = generateRandomArray();

        System.out.println("\nЗадание 3");
        totalExpenses = 0;
        for (int expense : arr) {
            totalExpenses += expense;
        }
        double averageExpenses = (double) totalExpenses / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        System.out.println("\nЗадание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    public static int[] generateRandomArray() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }
}
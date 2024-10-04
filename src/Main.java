public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        int[] month = {13_000, 10_012, 9_987, 11_540, 8_724};
        int allMoney = 00;
        for (int element : month) {
            allMoney += element;
        }
        System.out.println("Сумма трат за месяц составила " + allMoney + " рублей");
        System.out.println(" ");
        System.out.println("задача 2");
        int[] month1 = {13_000, 10_012, 9_987, 11_540, 8_724};
        int maxMoney = -1;
        for (int i = 0; i < month1.length; i++) {
            if (maxMoney < month1[i]) {
                maxMoney = month1[i];
            }
        }
        int minMoney = 100_000;
        for (int i = 0; i < month1.length; i++) {
            if (minMoney > month1[i]) {
                minMoney = month1[i];
            }
        }
        System.out.format("Минимальная сумма трат за неделю составила %s рублей." +
                " Максимальная сумма трат за неделю составила %s рублей", minMoney, maxMoney);
        System.out.println(" ");
        System.out.println("задача 3");
        int[] month2 = {12_000, 10_012, 9_987, 11_500, 8_724};
        double midSum = 0.0;
        for (int element : month2) {
            midSum += element;
        }
        midSum /= month2.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", midSum);
        System.out.println(" ");
        System.out.println("задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
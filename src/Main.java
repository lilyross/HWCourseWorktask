public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int[] number1 = new int[10];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        number1[3] = 4;
        number1[4] = 5;
        number1[5] = 6;
        number1[6] = 7;
        number1[7] = 8;
        number1[8] = 9;
        number1[9] = 10;
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]);
            if (i != number1.length) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println(" Задание 2 ");
        for (int i = 0; i < number1.length; i++) {
            if (number1[i] % 2 == 0) {
                number1[i] += 1;
                System.out.println(number1[i]);
            }
        }
        System.out.println(" Задание 3 ");
        for (int i = 3; i <= 7; i++) {
            number1[i] = i ;
            System.out.println(i);
        }
    }
}
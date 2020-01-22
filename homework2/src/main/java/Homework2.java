import java.util.Arrays;

public class Homework2 {

    // cс помощью цикла и условия заменит 0 на 1, 1 на 0
    static void Task1() {
        int[] ar = new int[] {0,1,1,0,1,0,0,1,0,1,1,0};
        System.out.println(Arrays.toString(ar));
        for(int i = 0; i<ar.length; i++) {
            if(ar[i] == 0) {
                ar[i] = 1;
            } else {
                ar[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    // С помощью цикла заполнить массив значениями 0 3 6 9 12 15 18 21;
    static void Task2() {
        int[] ar = new int[8];
        for(int i = 0; i < 8; i++) {
            ar[i] = i * 3;
        }
        System.out.println(Arrays.toString(ar));
    }

    // пройти по массиву циклом, и числа меньшие 6 умножить на 2
    static void Task3() {
        int[] ar = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(ar));
        for(int i = 0; i<ar.length; i++) {
            if (ar[i]<6) ar[i]=ar[i]*2;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        Task1();
        System.out.println("Task 2");
        Task2();
        System.out.println("Task 3");
        Task3();
    }
}

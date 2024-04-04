public class Main {
    public static void main(String[] args) {


        System.out.println("1 ЗАВДАННЯ");

        int size = 50;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i * 2 + 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


        System.out.println("2 ЗАВДАННЯ");


        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println("Початковий масив:");
        for (int i : array1) {
            System.out.println(i);
        }
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                array1[i] = 0;
            }
        }
        System.out.println("Оновлений масив:");
        for (int i : array1) {
            System.out.println(i);
        }

        System.out.println("3 ЗАВДАННЯ");





        System.out.println("4 ЗАВДАННЯ");

        int[] array2 = new int[10];
        int[] array3 = new int[10];
        int[] summaArray = new int[10];

        for (int i = 0; i < 10; i++) {
            array2[i] = (int) (Math.random() * 11);
            array3[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < 10; i++) {
            summaArray[i] = array2[i] + array3[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(summaArray[i] + " ");
        }
        System.out.println();

        System.out.println("5 ЗАВДАННЯ");
        
    }
}
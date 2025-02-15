import java.util.Scanner;

public class lab2 {
    // Об'явлення констант для обмежень розмірів матриці та діапазону значень
    public static final int МАКС_РОЗМІР = 20;
    public static final int МІН_РОЗМІР = 1;
    public static final int МАКС_ЗНАЧЕННЯ = 100;
    public static final int МІН_ЗНАЧЕННЯ = 5;

    public static void main(String[] args) {
        Scanner сканер = new Scanner(System.in);
        // Введення розмірів матриці
        System.out.println("Введіть розмір ширини матриці: ");
        int x = ввестиРозмірМатриці(сканер);
        System.out.println("Введіть розмір висоти матриці: ");
        int y = ввестиРозмірМатриці(сканер);
        // Вибір методу заповнення матриці
        System.out.println("Виберіть метод заповнення матриці: 1 - вручну, 2 - рандомно");
        int методЗаповнення = сканер.nextInt();
        if (методЗаповнення == 1) {
            ручнеЗаповнення(x, y, сканер); // Заповнення матриці вручну
        } else if (методЗаповнення == 2) {
            рандомнеЗаповнення(x, y); // Заповнення матриці рандомними числами
        }
    }

    // Метод для введення розміру матриці з перевіркою на валідність
    public static int ввестиРозмірМатриці(Scanner сканер) {
        int розмір = сканер.nextInt();
        while (розмір > МАКС_РОЗМІР || розмір < МІН_РОЗМІР) {
            System.out.println("Розмір має бути в діапазоні від " + МІН_РОЗМІР + " до " + МАКС_РОЗМІР);
            розмір = сканер.nextInt();
        }
        return розмір;
    }

    // Метод для ручного заповнення матриці
    public static void ручнеЗаповнення(int x, int y, Scanner сканер) {
        int[][] матриця = new int[x][y];
        System.out.println("Введіть елементи матриці по одному:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                матриця[i][j] = сканер.nextInt();
            }
        }
        вивестиМатрицю(матриця); // Виведення матриці
    }

    // Метод для заповнення матриці випадковими числами
    public static void рандомнеЗаповнення(int x, int y) {
        int[][] матриця = new int[x][y];
        System.out.println("Рандомно згенерована матриця:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                матриця[i][j] = (int) (Math.random() * (МАКС_ЗНАЧЕННЯ - МІН_ЗНАЧЕННЯ + 1)) + МІН_ЗНАЧЕННЯ;
            }
        }
        вивестиМатрицю(матриця); // Виведення матриці
    }

    // Метод для виведення матриці
    private static void вивестиМатрицю(int[][] матриця) {
        for (int[] рядок : матриця) {
            for (int елемент : рядок) {
                System.out.print(елемент + " ");
            }
            System.out.println();
        }
        обчислитиСтатистику(матриця); // Обчислення статистики за матрицею
    }

    // Метод для обчислення статистичних характеристик матриці
    private static void обчислитиСтатистику(int[][] матриця) {
        int сума = 0;
        int мін = Integer.MAX_VALUE;
        int макс = Integer.MIN_VALUE;
        for (int[] рядок : матриця) {
            for (int елемент : рядок) {
                сума += елемент;
                if (елемент < мін) мін = елемент;
                if (елемент > макс) макс = елемент;
            }
        }
        double середнє = (double) сума / (матриця.length * матриця[0].length);
        System.out.println("Середнє значення матриці: " + середнє);
        System.out.println("Мінімальне значення матриці: " + мін);
        System.out.println("Максимальне значення матриці: " + макс);
    }
}


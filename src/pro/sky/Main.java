package pro.sky;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

    }

    public static void task2() {
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.printf("Итерация цикла %d \n", +i);
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.printf("Итерация цикла %d \n", + i);
        }

    }

    public static void task4() {
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i = --i) {
            System.out.printf("Итерация цикла %d \n", + i);
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.printf("%d год является високосным \n", + i);
        }

    }

    public static void task6() {
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.printf("%d \n", +i);
        }
    }

    public static void task7() {
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.printf("%d ", +i);
        }
    }
    /*
    public static void task8() {
        System.out.println("\nTask 8");
        int savings = 29000;
        int start = 0;
        for (int i = 0; i <= 12; i++) {
            start = start + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + start + "рублей");
        }
        */
    public static void task8() {
        System.out.println("\nTask 8");
        int savings = 29000;
        int start = 0;
        String[] monthNames = {
                    "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                    "Июлб", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        for (int i = 0; i < monthNames.length; i++) {
                start = start + savings;
                System.out.println("Месяц - " + monthNames[i] + ", сумма накоплений равна - " + start + " рублей");
        }
    }
    public static void task9() {
        System.out.println("Task 9");
        int savings = 29000;
        int start = 0;
        String[] monthNames = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июлб", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        for (int i = 0; i < monthNames.length; i++) {
            float persentage = 12/100f;
            start = (int) (start + savings + savings * persentage);
            System.out.println("Месяц - " + monthNames[i] + ", сумма накоплений равна " + start + " рублей");
        }
    }

    public static void task10() {
        System.out.println("\nTask 10");
        int multiplication  = 2;


        for (int i = 1; i <= 10; i = i + 1) {
            int result = multiplication * i;
            System.out.printf("%d*%d=%d\n", multiplication, i, result);
        }

    }
}

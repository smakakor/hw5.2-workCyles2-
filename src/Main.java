public class Main {
    public static void main(String[] args) {
        // Циклы урок 2
        task1(); //Домашние задание 1
        task2(); //Домашние задание 2
        task3(); //Домашние задание 3
    }

    public static void task1() {
        System.out.println("Задание 1");
        int money = 29000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month++;
            total = (int) (total + total * 0.01);
            total = total + money;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", month, total);
        }
        System.out.printf("Задание 2\n");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.printf("%d ", number);
        }
        System.out.printf("\n");
        for (number = 10; number > 0; number--) {
            System.out.printf("%d ", number);
        }
        int totalPeople = 12_000_000;
        int total_1000_In_totalPeople = totalPeople / 1000;
        int birthDead = 17-8;
        birthDead *= total_1000_In_totalPeople;
        for (int age = 1; age < 10 ; age++) {
            totalPeople += birthDead;
            System.out.printf("\nГод %d, численность населения составляет %d", age, totalPeople);
        }
    }
    static public void task2(){
        System.out.println("Задание 1");
        int money = 15000;
        int total = 0;
        int month = 0;
        while(total < 12_000_000){
            total += total*0.07;
            total += money;
            month++;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", month, total);

        }
        System.out.println("Задание 2");
        money = 15000;
        total = 0;
        month = 0;
        while(total < 12_000_000){
            total += total*0.07;
            total += money;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", month, total);
            }
        }
        System.out.println("Задание 3");
        money = 15000;
        total = 0;
        month = 0;
        while(month < 108){
            total += total*0.07;
            total += money;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", month, total);
            }
        }
        System.out.println("Задание 4");
        for (int friday = 5; friday <= 31; friday+=7) {
            System.out.println("Сегодня пятница, " +friday + "-е число. Необходимо подготовить отчет.");

        }
    }

    static public void task3() {
        System.out.println("Задание 1");
        int year = 2022;
        int yearPlus100 = year + 100;
        int yearMinus200 = year - 200;
        for (int i = 0; i < yearPlus100; i += 79) {
            if (i >= yearMinus200 && i <= yearPlus100) {
                System.out.println("Комета пролетала/пролетит в "+i+" году");
            }

        }
        System.out.println("Задание 1");
        int numberMultiply = 2;
        for (int i = 1; i <= 10 ; i++) {
            int total = numberMultiply * i;
            System.out.printf("%d * %d = %d\n", numberMultiply, i, total);

        }
    }

}
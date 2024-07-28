//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1\n");

        int sum = 0;
        int i = 0;
        int monthlyPayment = 15_000;
        int requiredAmount = 2_459_000;
        while (sum < requiredAmount){
            sum += monthlyPayment;
            sum += sum/100;// 1 % ежемесячно
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");

        }

        System.out.println("\nЗадание 2\n");

        i=0;
        while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(; i>0; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3\n");

        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;

        for (i = 1; i <= 10; i++){
            population += (population / 1000) * (fertility - mortality);
            System.out.println("Год " + i + ", численность населения составляет " + population + '.');
        }

        System.out.println("\nЗадание 4\n");

        int money = 15_000;
        requiredAmount = 12_000_000;
        i = 0;
        while (money < requiredAmount){
            money += money * 0.07;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений: " + money);
        }
        System.out.println("Потребуется " + i + " месяцев.");

        System.out.println("\nЗадание 5\n");

        money = 15_000;
        requiredAmount = 12_000_000;
        i = 0;
        while (money < requiredAmount){
            money += money * 0.07;
            i++;
            if(i % 6 == 0){
                System.out.println("Месяц " + i + ", сумма накоплений: " + money);
            }
        }
        System.out.println("Потребуется " + i + " месяцев.");

        System.out.println("\nЗадание 6\n");

        money = 15_000;
        float monthlyInterest = 0.07F;
        for (i = 1; i <= 9*12; i++){ // изначально ошибка была не только в том что вывод начинался с нулевого месяца, но и в том что кол-во итераций было 9*12+1 поэтому изменяю i=0 на i=1
            money *= (1+monthlyInterest); // Не совсем понял что вас не устроило в подсчете процентов. Если сделал не так, пожалуйста объясните. Спасибо.
            if(i % 6 == 0){
                System.out.println("Месяц " + i + ", сумма накоплений: " + money);
            }
        }

        System.out.println("\nЗадание 7\n");

        int firstFriday = 3;
        for (; firstFriday <= 31; firstFriday += 7){
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        }


        System.out.println("\nЗадание 8\n");

        for (i = 2024-200; i <= 2024+100; i++){
            if(i % 79 == 0){
                System.out.println(i);
            }
        }
    }
}
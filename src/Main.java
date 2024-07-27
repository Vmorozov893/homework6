//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1\n");

        int sum = 0;
        int i = 1;
        while (sum < 2_459_000){
            sum += 15_000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
            i++;
        }

    }
}
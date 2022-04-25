public class Main {
    public static void main(String[] args) {

        int balance = 1000; // изначальный баланс
        int accountFunding = 1000; // сумма пополнения
        int percent;

        if (accountFunding >= 1000) { // условие начисления бонусов
            percent = 1;
        } else {
            percent = 0;
        }

        int bonus = (accountFunding * percent) / 100; // расчет бонуса

        int newBalance = balance + accountFunding + bonus; // расчет нового баланса
        System.out.println("Ваш баланс: " + newBalance + "р.");
        System.out.println("Из них бонусы: " + bonus + "р.");
    }

}
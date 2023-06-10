import java.time.LocalDate;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] agrs) {


        checkYearIsLeap(2040);
        installApp(0, 200);
        int deliveryDays = calculateDeliveryDays(40);
        System.out.println(deliveryDays);
    }

    public static void checkYearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год высокостный ");
        } else {
            System.out.println(year + " Год не высокостный ");
        }
    }

    public static void installApp(int clientOs, int clientYear) {
        int currentYear = LocalDate.now().getYear();
        int ios = 0;
        int android = 1;
        if (clientOs == ios) {
            if (clientYear >= currentYear) {
                System.out.println(" Установите обычную версию для ios");
            } else {
                System.out.println(" Установите облегченую версию для ios ");
            }
        } else if (clientOs == android) {
            if (clientYear >= currentYear) {
                System.out.println(" Установите обычную версию для android");
            } else {
                System.out.println(" Установите облегченую версию для android ");
            }
        } else {
            System.out.println(" OC не поддерживается ");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = -1;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance < 100) {
            deliveryDays = 3;
        }
        return deliveryDays;

    }

    public static void prindDelivery(int deliveryDays) {
        if (deliveryDays > 0) {
            System.out.println("Время доставки составит " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }
}
import java.util.Scanner;
import java.util.*;
import java.time.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("  ");
        Scanner typeOS = new Scanner(System.in);
        System.out.print("Введите тип операционной системы: 0 - iOS, 1 - Android ");
        int clientOS = typeOS.nextInt();

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        // Task 2
        System.out.println("  ");
        Scanner typeOperationSystem = new Scanner(System.in);
        System.out.print("Введите тип операционной ОС: 0 - iOS, 1 - Android ");
        int client = typeOperationSystem.nextInt();

        Scanner phoneYear = new Scanner(System.in);
        System.out.print("Введите год выпуска телефона : ");
        int clientDeviceYear = phoneYear.nextInt();

        if (client == 0 & clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (client == 0 & clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (client == 1 & clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                if (client == 1 & clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }

        // Task 4
        System.out.println("  ");
        int deliveryDistance = 95;
        int time = 1;
        int shortDistance = 20;
        int middleDistance = 60;
        int longDistance = 100;
        if (deliveryDistance <= shortDistance) {
        } else {
            if (deliveryDistance <= middleDistance) {
                time++;
            } else {
                if (deliveryDistance <= longDistance) {
                    time = time + 1;
                } else {
                    System.out.println("Доставка не осуществляется ");
                    return;
                }
                System.out.println("Ваша карта будет доставлена через " + time + "дней");
            }
        }

        // Task 5
        System.out.println("  ");
        Scanner yearSeason = new Scanner(System.in);
        System.out.println("Введите номер месяца, чтобы узнать время года");
        int monthNumber = yearSeason.nextInt();
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.print(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3, 4, 5:
                System.out.print(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6, 7, 8:
                System.out.print(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9, 10, 11:
                System.out.print(monthNumber + " месяц принадлежит к сезону осень");
                break;
        }
        if (monthNumber > 12) {
            System.out.print(" Номер месяца больше 12");
        }

        // Task 3
        System.out.println("  ");
        Scanner leapYear = new Scanner(System.in);
        System.out.println("Введите год ");
        int year = leapYear.nextInt();

        if (year >= 1584) {
            if (isLeapYear(year)) {
                System.out.println(year + "  год високосный");
            } else {
                System.out.println(year + "  год невисокосный");
            }
        } else {
            System.out.println("Високосный год ввели только в 1584");
        }
        ;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }

        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return true;
    }
}

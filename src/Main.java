public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        checkLeapYear(2022);
        toOfferVersion(1, 2012);
        int deliveryDays = calculateTheDeliveryTime(95);
        {
            System.out.println("Потребуется дней " + deliveryDays);
        }
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным ");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void toOfferVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateTheDeliveryTime(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            return 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        }
        if (deliveryDistance >= 60) {
            return 3;
        }
        return deliveryDays;
    }
}
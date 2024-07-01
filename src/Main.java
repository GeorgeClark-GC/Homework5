public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        switch (clientOS) {
            case 0:
                if (clientDeviceYear > 2014) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                } else
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear > 2014) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
                else
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            default:
                System.out.println("");
        }
        int year = 2021;
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + " год является високосным");
        }
        else if (year < 1584)
        {
            System.out.println(year + " год находится на числовой оси до введения високосного года в 1584");
        }
        else
        {
            System.out.println(year + " год не является високосным");
        }
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20)
        {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance <=60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance <=100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else
            System.out.println("Доставки нет");
        int monthNumber = 12;
        switch (monthNumber)
        {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}
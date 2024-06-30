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
        switch (clientOS)
        {
            case 0:
                if (clientDeviceYear > 2014)
                {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                else
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            case 1:
                if (clientDeviceYear > 2014)
                {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                else
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
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
    }
}
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
    }
}
package Seminar_5;

public class Interface {
    public void inter(int i) {
        switch (i) {
            case 1: // старт
                System.out.println("---------------------------------------------");
                System.out.println("Здравствуйте");
                break;
            case 2: //выбор с какими числами работать
                System.out.println("---------------------------------------------");
                System.out.println("Варианты работы программы");
                System.out.println("1. Калькулятор для работы с рациональными числами");
                System.out.println("2. Калькулятор для работы с комплексными числами");
                System.out.println("3. Выход из программы");
                break;
            case 3: //выбрать какое действие
                System.out.println("---------------------------------------------");
                System.out.println("Варианты работы программы");
                System.out.println("1. Введите '+' чтобы a+b");
                System.out.println("2. Введите '-' чтобы a-b");
                System.out.println("3. Введите '*' чтобы a*b");
                System.out.println("4. Введите '/' чтобы a/b");
                System.out.println("5. Выход из калькулятора, для выбора дальнейших действий");
                break;
            case 4: //ошибка
                System.out.println("---------------------------------------------");
                System.out.println("У вас ошибка");
                System.out.println("Выход из программы");
                break;
            case 5: // финиш
                System.out.println("----------------------------------------------");
                System.out.println("Выберите дальнейшее действие");
                System.out.println("1. Выход в главное меню");
                System.out.println("2. Выход из программы");
                break;
        }
    }
}

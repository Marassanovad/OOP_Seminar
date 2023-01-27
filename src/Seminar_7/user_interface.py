

class user_interface:
    def main_menu(i):
        if i == "Welcome":
            print('=' * 30)
            print('Здравствуйте')
        elif i == "Menu":
            print('=' * 30)
            print('Варианты работы программы')
            print('1. Калькулятор для работы с рациональными числами')
            print('2. Калькулятор для работы с комплексными числами')
            print('3. Выход из программы')
            print('=' * 30)
		
    def choice_actions_menu(i):
        print('=' * 30)
        print('Варианты работы программы')
        print('1. Чтобы a+b')
        print('2. Чтобы a-b')
        print('3. Чтобы a*b')
        print('4. Чтобы a/b')
        print('5. Выход из программы')
        print('=' * 30)

    def error():
        print('=' * 30)
        print('------ Ошибка -------')
        print('=' * 30)
	
	
    def end_menu(i):
        print('----------------------------------------------')
        print('Выберите дальнейшее действие')
        print('1. Выход в главное меню')
        print('2. Выход из программы')
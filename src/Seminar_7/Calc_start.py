from user_interface import user_interface as inter
from logg import logg
from Excep import Excep as ex
import Rational as rat
import sys


class Calc:
    def Start(self):
        inter.main_menu("Welcome")
        while(True):
            inter.main_menu("Menu")
            i = ex.digit()
            if i == 1: 
                print('Калькулятор для работы с рациональными числами')
                inter.choice_actions_menu("Рациональные числа")
                i = ex.action()
                if i == "1":
                    logg.entered_logger('Сложение')
                    print("Результат: ", rat.Rational.sum(ex.digit_number('1ое число: '), ex.digit_number('2ое число: ')))
                elif i == "2":
                    logg.entered_logger('Вычитание')
                    print("Результат: ",rat.Rational.sub(ex.digit_number('1ое число: '), ex.digit_number('2ое число: ')))
                elif i == "3":
                    logg.entered_logger('Умножение')
                    print("Результат: ", rat.Rational.mult(ex.digit_number('1ое число: '), ex.digit_number('2ое число: ')))
                elif i == "4": 
                    logg.entered_logger('Умножение')
                    print("Результат: ",rat.Rational.div(ex.digit_number('1ое число: '), ex.zero_number('2ое число: ')))
                elif i == "5":
                    ex.mistake('Завершение работы')
                    print('---------------------------------------------')
                    print("Программа завершила работу")
                    print('---------------------------------------------')
                    break
                else: 
                    inter.end_menu("Exit the app")
                    if(ex.digit() == 2):
                        print('---------------------------------------------')
                        print("Программа завершила работу")
                        print('---------------------------------------------')
                        break
			
            elif i == 2:
                print('Калькулятор для работы с комплексными числами')
                print('Времено недоступен')

			
            elif i == 3:
                inter.end_menu("Exit the app")
                while True:
                    i = ex.digit()
                    if i == 1:
                        break
                    elif i == 2: 
                        print('---------------------------------------------')
                        print("Программа завершила работу")
                        print('---------------------------------------------')
                        sys.exit()
                    else:
                        print('---------------------------------------------')
                        print("Введите одно из заданных значений")
                        print('---------------------------------------------') 	
            else:
                print('---------------------------------------------')
                print("Введите одно из заданных значений")
                print('---------------------------------------------') 

            
cal = Calc()
cal.Start()
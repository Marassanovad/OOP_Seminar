from logg import logg

class Excep:
    def digit_number(s):
        while(True):
            i = input(s)
            k = i.replace('.','')
            k = k.replace('-','')
            if k.isdigit():
                logg.entered_logger(i)
                return float(i)
            print("Вам надо ввести число")
            text = "Пользователь ввел: " + i + ". Это некорректный ввод"
            logg.actions_logger(text)
    
    def digit():
        while(True):
            i = input("Введите выбранный пункт: ")
            if i.isdigit():
                logg.entered_logger(i)
                return float(i)
            print("Вам надо ввести число")
            text = "Пользователь ввел: " + i + ". Это некорректный ввод"
            logg.actions_logger(text)
    
    def zero_number(s):
        while(True):
            i = Excep.digit_number(s)
            if i !=0 :
                logg.entered_logger(i)
                return i
            print("На ноль делить нельзя")
            text = "Пользователь ввел: 0. Это некорректный ввод"
            logg.actions_logger(text)

    def action():
        ls =['1','2','3','4','5']
        while(True):
            i = input('Введите число: ') 
            if i in ls:
                logg.entered_logger(i)
                return i
            print("Это не корректный ввод")
            text = "Пользователь ввел: " + i + ". Это некорректный ввод"
            logg.actions_logger(text)

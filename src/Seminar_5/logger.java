package Seminar_5;


import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


public class logger {

    public void logger(String text) {
        try (FileWriter writer = new FileWriter("logger.txt", true)) {
            // запись всей строки
            Calendar calendar = new GregorianCalendar();
            Date date = calendar.getTime();
            writer.write(date + " " + text + '\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void start(int i) {
        try (FileWriter writer = new FileWriter("logger.txt", true)) {
            // запись всей строки
            Calendar calendar = new GregorianCalendar();
            Date date = calendar.getTime();
            String text1 = "========== Старт программы ==========";
            String text2 = "===== Программа завершила работу =====";
            String text3 = "---------- Сломали систему ----------";

            if (i == 1) {
                writer.write(date + " " + text1 + '\n');
            } else if (i == 2) {
                writer.write(date + " " + text2 + '\n');
            } else {
                writer.write(date + " " + text3 + '\n');
            }

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}

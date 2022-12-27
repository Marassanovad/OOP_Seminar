package Seminar_4.HW.writePattern;

import Seminar_4.HW.Info;
import Seminar_4.HW.Note;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToText implements WriteTo {

    private final Info infoList;
    private final Note note;

    public WriteToText(Info infoList, Note note) {
        this.infoList = infoList;
        this.note = note;
    }

    public void write() {
        System.out.println("Отработал метод из класса WriteToText");
        try (FileWriter fileWriter = new FileWriter("/Users/dasa/Documents/geekbrains/Java/OOP_Seminar/src/Seminar_4/HW//List.txt", false)) {

//            String text = makeText();
            String text = infoList.toString();
            fileWriter.write(text);// записываем полученные данные из метода makeText() в файл
            fileWriter.write("Заметка пользователя: " + note.toString());
            fileWriter.append('\n');
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public String makeText() {
//        StringBuilder sb = new StringBuilder();
//        for (Info info : infoList) {   // проходим по всем элементам коллекции и проебразуем в нужный формат/вид
//            sb.append(String.format("%s %s=%s\n", info.getId(), info.getName(), info.getDate()));
//        }
//        return sb.toString();
//    }
}

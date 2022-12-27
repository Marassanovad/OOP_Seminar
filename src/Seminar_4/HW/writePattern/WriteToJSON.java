package Seminar_4.HW.writePattern;



import Seminar_4.HW.Info;
import Seminar_4.HW.Note;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToJSON implements WriteTo{
    private final Info infoList;
    private final Note note;

    public WriteToJSON(Info infoList, Note note) {

        this.infoList = infoList;
        this.note = note;
    }


    public void write() {
        System.out.println("Отработал метод из класса WriteToJSON");
        try (FileWriter fileWriter = new FileWriter("/Users/dasa/Documents/geekbrains/Java/OOP_Seminar/src/Seminar_4/HW//List.json", false)) {

//            String text = makeText();
            String text = infoList.toString();
            fileWriter.write(text); // записываем полученные данные из метода makeText() в файл
            fileWriter.write("Заметка пользователя: " + note.toString());
            fileWriter.append('\n');
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public String makeText() {
//        StringBuilder sb = new StringBuilder();
//
//        Iterator<Info> iter = infoList.iterator();
//
//        sb.append("{\n");
//        while (iter.hasNext()) {    // проходим по всей коллекции, пока есть элементы
//            Info st = iter.next();
//            sb.append(String.format("\"%s %s\": %s", st.getId(), st.getName(), st.getDate()));
//            if (iter.hasNext()) { // чтобы последняя строка записывалась без запятой и переноса строки
//                sb.append(",\n");
//            }
//        }
//        sb.append("\n}");
//        return sb.toString();
//    }
}

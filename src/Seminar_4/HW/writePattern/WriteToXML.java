package Seminar_4.HW.writePattern;

import Seminar_4.HW.Info;
import Seminar_4.HW.Note;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public class WriteToXML implements WriteTo {

    private final Info infoList;
    private final Note note;

    public WriteToXML(Info infoList, Note note) {
        this.infoList = infoList;
        this.note = note;
    }

    public void write() {
        System.out.println("Отработал метод из класса WriteToXML");
        try (FileWriter fileWriter = new FileWriter("/Users/dasa/Documents/geekbrains/Java/OOP_Seminar/src/Seminar_4/HW//List.xml", false)) {
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
//        String[] fields = userFields(); // получаем данные из метода studentClassFields()
//
//        Iterator<Info> iter = infoList.iterator();
//
//        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n"); // записываем "шапку" xml-файла
//        sb.append(String.format("<%ss>", fields[0]));   // записываем тэг <students>
//        while (iter.hasNext()) {    // итерируемся по коллекции пока в ней есть элементы
//            Info st = iter.next();
//            sb.append(String.format("\n\t<%s>\n", fields[0]));  // записываем тэг <student>
//            sb.append(String.format("\t\t<%s>%s</%s>\n", fields[1], st.getId(), fields[1])); // записываем тэги <name>
//            sb.append(String.format("\t\t<%s>%s</%s>\n", fields[2], st.getName(), fields[2]));
//            sb.append(String.format("\t\t<%s>%s</%s>\n", fields[3], st.getDate(), fields[3]));
//            sb.append(String.format("\t</%s>", fields[0]));
//        }
//        sb.append(String.format("\n<%ss>", fields[0]));
//        return sb.toString();
//    }

//    private String[] userFields() {
//        Class<Info> users = Info.class;
//        Field[] fields = users.getDeclaredFields();
//
//        String[] fieldsArray = new String[fields.length + 1];
//        fieldsArray[0] = users.getName().toLowerCase().substring(16);
//        fieldsArray[1] = fields[0].getName().toLowerCase();
//        fieldsArray[2] = fields[1].getName().toLowerCase();
//        fieldsArray[3] = fields[2].getName().toLowerCase();
//
//        return fieldsArray;
//    }
}

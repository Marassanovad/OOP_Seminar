package Seminar_4.HW;

import Seminar_4.HW.writePattern.WriteTo;
import Seminar_4.HW.writePattern.WriteToJSON;
import Seminar_4.HW.writePattern.WriteToText;
import Seminar_4.HW.writePattern.WriteToXML;

import java.util.*;
// класс info реализован с помощью обобщение
//класс Note реализован с помощью обобщение
public class Main {
    public static void main(String[] args) {
        List<Info> list = new ArrayList<>();
        int id = 0;
        Date date = new Date();
        list.add(new Info<Integer, String, String>(++id,"Dasha",date.toString()));
        list.add(new Info<Integer, String, String>(++id,"Sasha",date.toString()));
        list.add(new Info<Integer, String, String>(++id,"Roma",date.toString()));
        list.add(new Info<Integer, String, String>(++id,"Liza",date.toString()));


        WriteTo txt = new WriteToText(list.get(0),new Note<String,Integer>("!!!", 5));
        txt.write();
        WriteTo json = new WriteToJSON(list.get(1),new Note<String,String>("!!","Заметка"));
        json.write();
        WriteTo xml = new WriteToXML(list.get(2),new Note<String,Double>("!",5.06));
        xml.write();

    }
}

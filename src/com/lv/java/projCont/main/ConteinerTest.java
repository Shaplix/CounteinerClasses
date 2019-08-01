package com.lv.java.projCont.main;

import com.lv.java.projCont.conteiner.Box;
import com.lv.java.projCont.conteiner.Conteiner;
import com.lv.java.projCont.conteiner.Drum;

public class ConteinerTest {

    public static void main(String[] args) {
        Box box = new Box(5,8,34);
        printConteinerInfo(box);
        int n = box.capacityConteiner();
        printConteinerInfo(n);

        Drum drum = new Drum(7, 6);
        printConteinerInfo(drum);

        Drum drum1 = new Drum(9, 12, "Red");
        printConteinerInfo(drum1);

        boolean b = box.equalCapacity(drum);
        printConteinerInfo(b);
    }
    public static void printConteinerInfo (Conteiner n){
        System.out.println(n.toString());
    }
    public static void printConteinerInfo (int n){
        System.out.println(n);
    }
    public static void printConteinerInfo (boolean n){
        System.out.println(n);
    }
}

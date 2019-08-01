package com.lv.java.projCont.main;

import com.lv.java.projCont.conteiner.Box;
import com.lv.java.projCont.conteiner.Conteiner;
import com.lv.java.projCont.conteiner.Drum;

import java.util.Random;

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

        int daudz = 10;

        Drum cnt[] = new Drum[daudz];
        createConteiner(cnt, daudz);




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

    public static void createConteiner(Conteiner cnt[], int daudz) {
        if (cnt[daudz] instanceof Drum) {
            for (int i = 0; i < daudz; i++) {
                int height = randomInt();
                int radius = randomInt();
                cnt[i] = new Drum(height, radius);
                printConteinerInfo(cnt[i]);
            }
            // if (cnt[daudz] instanof Box){}

        }
    }

    public static int randomInt() {
        Random rnd = new Random();
        return rnd.nextInt(37);
    }
}

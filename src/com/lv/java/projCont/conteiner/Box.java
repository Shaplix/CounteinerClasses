package com.lv.java.projCont.conteiner;

public class Box extends Equality {

    private int lenght;
    private int width;
    private int height;


    public Box (int lenght, int width, int height){
        this.lenght=lenght;
        this.width=width;
        this.height = height;
    }

    @Override
    public int capacityConteiner() {
        return lenght*width*height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

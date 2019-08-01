package com.lv.java.projCont.conteiner;


public class Drum extends Equality implements hasColor {

    private int height;
    private int radius;
    private String color;

    public Drum (int height, int radius){
        this(height, radius, "Black");
    }
    public Drum (int height, int radius, String color){
        this.height=height;
        this.radius=radius;
        this.color = color;
    }
    @Override
    public int capacityConteiner() {
        return (int) (Math.PI*height*radius*radius);
    }



    @Override
    public String toString() {
        return "Drum{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getColor() {
        return color;
    }
}

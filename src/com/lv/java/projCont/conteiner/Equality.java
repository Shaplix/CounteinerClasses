package com.lv.java.projCont.conteiner;

public abstract class Equality implements Conteiner{

    @Override
    public boolean equalCapacity(Conteiner other) {
        return capacityConteiner()==other.capacityConteiner();
    }
}

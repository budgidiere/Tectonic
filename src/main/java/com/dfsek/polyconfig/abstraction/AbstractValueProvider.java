package com.dfsek.polyconfig.abstraction;

import com.dfsek.polyconfig.abstraction.exception.AbstractionException;

import java.util.ArrayList;
import java.util.List;

public class AbstractValueProvider {
    private final List<Prototype> tree = new ArrayList<>();

    public Object get(String key) throws AbstractionException {
        for(Prototype p : tree) {
            //if(p.get)
        }
        return null;
    }

    protected void add(Prototype prototype) {
        tree.add(prototype);
    }
}

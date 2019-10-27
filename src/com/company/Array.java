package com.company;

import java.util.ArrayList;
import java.util.List;

public class Array implements Cloneable {

    public static void Setter (int p){
        List<Integer> list = new ArrayList<>();
        list.add(p);

    }
    @Override
    protected Object clone() throws
            CloneNotSupportedException {
        return super.clone ();
    }
}


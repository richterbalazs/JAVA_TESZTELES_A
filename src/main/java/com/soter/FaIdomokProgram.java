package com.soter;

import com.soter.idomok.FaIdom;
import com.soter.idomok.Gomb;
import com.soter.idomok.Hasab;

import java.util.ArrayList;


public class FaIdomokProgram {

    private com.soter.idomok.FaIdom FaIdom;

    public void ujIdom(Gomb gomb) {
    }

    public void ujIdom(Hasab hasab) {
    }

    public ArrayList<FaIdom> getLista() {
        ArrayList<FaIdom> lista = new ArrayList<>();

        lista.add(FaIdom);
        lista.add(FaIdom);

        return lista;
    }

    public double osszSuly() {
        return 3.89;
    }

    public double gombokOsszSuly() {
        return 3.14;
    }

    public int minV() {

        return 1;

    }

    public int maxV() {

        return 1;
    }
}

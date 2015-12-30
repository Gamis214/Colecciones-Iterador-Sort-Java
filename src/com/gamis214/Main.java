package com.gamis214;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //-->Creacion de una lista String ------------------
        List<String> listString = new ArrayList<>();
        listString.add("A");
        listString.add("B");
        listString.add("C");
        listString.add("D");
        //--------------------------------------------------

        //-->Creacion de una lista de objetos --------------
        List<Persona> listPersona = new ArrayList<>();

        Persona per1 = new Persona("GAMA","HDEZ",461);
        Persona per2 = new Persona("DELTA","PEREZ",261);
        Persona per3 = new Persona("BADI","JIMENEZ",861);
        Persona per4 = new Persona("FER","ORDUÑA",661);

        listPersona.add(per1);
        listPersona.add(per2);
        listPersona.add(per3);
        listPersona.add(per4);
        //--------------------------------------------------

        //-->Forma de recorrer una lista con un FOREACH ----
        System.out.println("---- FOREACH ----");
        for ( Persona per : listPersona ) {
            System.out.println(per.getNombre());
        }
        //--------------------------------------------------

        //-->Forma de recorrer una lista con ITERATOR ------
        Iterator<Persona> iterator = listPersona.iterator();
        System.out.println("---- ITERATOR ----");
        do{
            System.out.println(iterator.next().getNombre());
        }while (iterator.hasNext());
        //--------------------------------------------------

        //-->Ordenamiento de una Lista de objetos por el nombre ---
        System.out.println("---- ORDENAMIENTO ----");
        Collections.sort(listPersona, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.nombre.compareToIgnoreCase(o2.nombre);
            }
        });

        for ( Persona per : listPersona ) {
            System.out.println(per.getNombre());
        }
        //---------------------------------------------------------

    }
}

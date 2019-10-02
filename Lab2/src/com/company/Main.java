package com.company;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    JSONArray collection = JSONReader.getCollectionArray("collection.json");
    System.out.println("Nombre d'albums =" + JSONReader.getNbAlbum(collection));
    System.out.println("Nombre de singles =" + JSONReader.getNbAlbum(collection));
    System.out.println("Album publiés depuis 2003:\n" + JSONReader.getNbAlbum(collection).toString());


    }
}

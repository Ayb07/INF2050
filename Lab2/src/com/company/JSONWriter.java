package com.company;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.IOException;
import java.util.ArrayList;

public class JSONWriter {

    public static void writeJson() throws IOException {

        ArrayList<JSONObject> listAlbum = new ArrayList<>();
        Collection album1 = new Collection("album", "Toto", "My Way", 2009, 4);
        Collection album2 = new Collection("album", "Chat", "Neko", 2018, 3);
        Collection album3 = new Collection("album", "Adele", "Hello", 2015, 5);

        listAlbum.add((JSONObject) JSONSerializer.toJSON(album1));
        listAlbum.add((JSONObject) JSONSerializer.toJSON(album2));
        listAlbum.add((JSONObject) JSONSerializer.toJSON(album3));

        JSONArray albumArray = new JSONArray();
        albumArray.addAll(listAlbum);

        JSONObject object = new JSONObject();
        object.put("Collection", albumArray );

        String jsonString = object.toString(2);
        DiskFile.saveStringIntoFile("MaCollection.json", jsonString);
    }
}
package com.company;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.IOException;

public class JSONReader {
    public static JSONArray getCollectionArray(String filePath) throws IOException{
        String jsonFile = DiskFile.loadFileIntoString(filePath);
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonFile);
        JSONArray array = root.getJSONArray("collection");

        return array;
    }


    public static int getNbAlbum (JSONArray array){
        int nbAlbum = 0;

        for (int i = 0; i < array.size(); i++){
            if(array.getJSONObject(i).getString("type").equals("album")){
                nbAlbum++;
            }
        }
        return nbAlbum;
    }



    public static int getNbrSingle(JSONArray array){
        int nbSingle= 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.getJSONObject(i).getString("type").equals("single")){
                nbSingle++;
            }
        }
        return nbSingle;
    }



    public static JSONArray getAlbum2003(JSONArray array){
        JSONArray albumDepuis2003 = new JSONArray();
        for(int i = 0; i < array.size(); i++){
            if ((int)array.getJSONObject(i).get("pulication") >= 2003 && array.getJSONObject(i).get("type").equals("album")){
               albumDepuis2003.add(array.getJSONObject(i));
            }
        }
        return albumDepuis2003;
    }

    public static JSONArray getRating5 (JSONArray array){
        JSONArray albumRating5 = new JSONArray();
        for(int i = 0; i < array.size(); i ++ ){
            if((int)array.getJSONObject(i).get("rating")==5){
                albumRating5.add(array.getJSONObject(i));
            }
        }
        return  albumRating5;
    }

}

package com.google.firebase.ml.md.java.productsearch;

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ProductList {

    private Context mContext;

    public ArrayList getProducto(String archivo, String code) throws Exception {
        int i = 0;
        JSONObject json;
        String jsonString = AssetJSON(mContext.getAssets().open("file.json"));
        json = new JSONObject(jsonString);

        ArrayList<String> array = new ArrayList<String>();

        System.out.println(json.length());
        Log.i("myTag",String.valueOf(json.length()));

        for(int index = 0; index > json.length(); index++) {
            if (code.equals(json.getJSONArray("sku").getString(index)))
                i = index;
        }

        String nombre = json.getJSONArray("nombre").getString(i);
        String precio = json.getJSONArray("precio").getString(i);
        String departamento = json.getJSONArray("departamento").getString(i);
        String categoria = json.getJSONArray("categoria").getString(i);
        String sku = json.getJSONArray("sku").getString(i);
        String link = json.getJSONArray("link").getString(i);

        array.add("1");
        array.add(nombre);
        array.add(precio);
        array.add(departamento);
        array.add(categoria);
        array.add(sku);
        array.add(link);
        return array;
    }

    public String AssetJSON(InputStream inputStream) {
        try {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, bytes.length);
            String json = new String(bytes);
            return json;
        } catch (IOException e) {
            Log.i("MyError",e.toString());
            return null;
        }
    }
}

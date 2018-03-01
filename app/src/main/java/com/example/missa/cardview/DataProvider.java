package com.example.missa.cardview;



public class DataProvider {
    // 1.1. Definir campos de clase para los elementos del CardView
    private String title;
    private String shortdesc;
    private int image;

    // 1.2. Generar el constructor

    public DataProvider(String title, String shortdesc, int image) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
    }

    // 1.3. Generar los métodos getter.


    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }


    public int getImage() {
        return image;
    }
}

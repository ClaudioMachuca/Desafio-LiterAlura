package com.alura.literatura.model;

public enum Idioma {
    ES("es"),
    EN("en"),
    FR("fr"),
    IT("it"),
    PT("pt");

    private String idioma;

    Idioma (String idioma){
        this.idioma = idioma;
    }

    public static Idioma fromString (String text){
        for (Idioma idioma : Idioma.values()){
            if (idioma.idioma.equalsIgnoreCase(text)){
                return idioma;
            }
        }
        throw new IllegalArgumentException("Ningún idioma encontrado" +  text);
    }
}


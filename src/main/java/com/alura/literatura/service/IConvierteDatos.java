package com.alura.literatura.service;

public interface IConvierteDatos {
    //en esta parte estamos definiendo con <T> T que estamos trabajando con tipos de datos genericos
    <T> T obtenerDatos(String json, Class<T> clase);
}

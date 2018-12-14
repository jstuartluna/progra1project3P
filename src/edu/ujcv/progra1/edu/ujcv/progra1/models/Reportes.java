package edu.ujcv.progra1.edu.ujcv.progra1.models;

public class Reportes {
    private String nombre;
    private String RTN;
    private String Productos;
    private String total;

    public Reportes(String nombre, String RTN, String Productos, String total){
        this.nombre = nombre;
        this.RTN = RTN;
        this.Productos = Productos;
        this.total = total;
    }

    public Reportes(){

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getTotal() {

        return total;
    }

    public void setTotal(String total) {

        this.total = total;
    }

    public String getProductos() {

        return Productos;
    }

    public void setProductos(String Productos) {

        this.Productos = Productos;
    }

    public String getRTN(){

        return RTN;
    }

    public void setRTN (String RTN){

        this.RTN = RTN;
    }

}
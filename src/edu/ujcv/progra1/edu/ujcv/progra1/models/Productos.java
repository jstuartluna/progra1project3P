package edu.ujcv.progra1.edu.ujcv.progra1.models;

public class Productos {
    private String cantidadProducto;
    private String descripcionProducto;
    private String codigoProducto;
    private String precioProducto;

    public Productos( String cantidadProducto, String descripcionProducto, String codigoProducto, String precioProducto) {
       this.cantidadProducto = cantidadProducto;
       this.descripcionProducto = descripcionProducto;
       this.codigoProducto = codigoProducto;
       this.precioProducto = precioProducto;
    }

    public Productos(){

    }

    public String getCantidadProducto(){

        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto){

        this.cantidadProducto = cantidadProducto;
    }

    public String getDescripcionProducto(){

        return  descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto){

        this.descripcionProducto = descripcionProducto;
    }

    public String getCodigoProducto(){

        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {

        this.codigoProducto = codigoProducto;
    }

    public String getPrecioProducto() {

        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {

        this.precioProducto = precioProducto;
    }

}

package edu.ujcv.progra1.edu.ujcv.progra1.models;

public class Facturas {
    private String numeroFactura;
    private String descripcionProd;
    private String totalFactura;
    public  String numeroRTN;
    public String clientes;

    public Facturas( String descripcionProd, String numeroFactura, String totalFactura, String numeroRTN, String clientes) {
        this.numeroFactura = numeroFactura;
        this.descripcionProd = descripcionProd;
        this.totalFactura = totalFactura;
        this.numeroRTN = numeroRTN;
        this.clientes = clientes;
    }

    public String getNumeroFactura() {

        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {

        this.numeroFactura = numeroFactura;
    }

    public String getDescripcionProd() {

        return descripcionProd;
    }

    public void setDescripcionProd(String descripcion) {

        this.descripcionProd = descripcionProd;
    }

    public String getTotalFactura() {

        return totalFactura;
    }

    public void setTotalFactura(String totalFactura) {

        this.totalFactura = totalFactura;
    }

    public String getNumeroRTN() {

        return numeroRTN;
    }

    public void setNumeroRTN(String numeroRTN) {

        this.numeroRTN = numeroRTN;
    }

    public String getClientes(){

        return clientes;
    }

    public void setClientes(String clientes){

        this.clientes = clientes;
    }

}


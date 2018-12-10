package edu.ujcv.progra1.edu.ujcv.progra1.models;

public class Facturas {
    private String numeroFactura;
    private String descripcion;
    private String totalFactura;

    public Facturas( String descripcion, String numeroFactura, String totalFactura) {
        this.numeroFactura = numeroFactura;
        this.descripcion = descripcion;
        this.totalFactura = totalFactura;
    }

    public String getNumeroFactura() {

        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {

        this.numeroFactura = numeroFactura;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    public String getTotalFactura() {

        return totalFactura;
    }

    public void setTotalFactura(String totalFactura) {

        this.totalFactura = totalFactura;
    }

}


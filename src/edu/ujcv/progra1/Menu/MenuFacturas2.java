package edu.ujcv.progra1.Menu;

public class MenuFacturas2 implements IMenuItem {

    public String getLabel() {
        return "Facturas";
    }

    public void runAction() {
        MenuFacturas Bill = new MenuFacturas();
        Bill.verOpcionesFacturas();
        Bill.verOpcionesF();
    }
}
package edu.ujcv.progra1.Menu;

public class MenuProductos2 implements IMenuItem {

    public String getLabel() {
        return "Productos";
    }

    public void runAction() {
        MenuProductos Products = new MenuProductos();
        Products.verOpcionesProductos();
        Products.verOpcionesP();
    }
}
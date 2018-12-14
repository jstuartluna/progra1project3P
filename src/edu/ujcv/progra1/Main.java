package edu.ujcv.progra1;

import edu.ujcv.progra1.Menu.*;

import java.util.ArrayList;

public class Main {

    public static int valorSalida = 0;

    public static void main(String[] args) {

        ArrayList<IMenuItem> itemsMenuPrincipal = new ArrayList<>();
        itemsMenuPrincipal.add(new MenuClientes2());
        itemsMenuPrincipal.add(new MenuProductos2());
        itemsMenuPrincipal.add(new MenuFacturas2());
        //itemsMenuPrincipal.add(new MenuReportes2());
        itemsMenuPrincipal.add(new Salir());
        Menu menuPrincipal = new Menu(itemsMenuPrincipal);
        while (valorSalida == 0) {
            menuPrincipal.mostrarMenu();
            menuPrincipal.leerOpcionLuegoProcessar();
        }
    }
}
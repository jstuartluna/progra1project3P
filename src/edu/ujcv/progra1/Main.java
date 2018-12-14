package edu.ujcv.progra1;

import edu.ujcv.progra1.Menu.IMenuItem;
import edu.ujcv.progra1.Menu.Menu;
import edu.ujcv.progra1.Menu.MenuClientes2;
import edu.ujcv.progra1.Menu.MenuProductos2;
import java.util.ArrayList;

public class Main {

    public static int valorSalida = 0;

    public static void main(String[] args) {

        ArrayList<IMenuItem> itemsMenuPrincipal = new ArrayList<>();
        itemsMenuPrincipal.add(new MenuClientes2());
        itemsMenuPrincipal.add(new MenuProductos2());
        Menu menuPrincipal = new Menu(itemsMenuPrincipal);
        while (valorSalida == 0) {
            menuPrincipal.mostrarMenu();
            menuPrincipal.leerOpcionLuegoProcessar();
        }
    }
}
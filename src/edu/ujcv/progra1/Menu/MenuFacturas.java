package edu.ujcv.progra1.Menu;

import edu.ujcv.progra1.Menu.MenuProductos;
import edu.ujcv.progra1.Menu.MenuClientes;
import edu.ujcv.progra1.Menu.MenuProductos2;
import edu.ujcv.progra1.Menu.MenuClientes2;
import edu.ujcv.progra1.edu.ujcv.progra1.models.Productos;
import edu.ujcv.progra1.util.LectorTeclado;
import edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio.LectorCvsProductos;
import java.util.ArrayList;


public class MenuFacturas {
    ArrayList<Productos> productos = new ArrayList<>();
    ArrayList<Productos> cantidad = new ArrayList<>();
    public static int valorSalida = 0;
    public double total = 0;
    double ISV = 0;
    public int opcion2;


}

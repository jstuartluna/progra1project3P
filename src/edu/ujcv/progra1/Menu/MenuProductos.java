package edu.ujcv.progra1.Menu;

import java.util.ArrayList;

import edu.ujcv.progra1.edu.ujcv.progra1.models.Productos;
import edu.ujcv.progra1.util.LectorTeclado;
import edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio.LectorCvsProductos;
import edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio.EscritorCvsProductos;

public class MenuProductos {

    private ArrayList<Productos> productos1 = new ArrayList<>();

    public void verOpcionesProductos() {
        System.out.println("1.Agregar Producto");
        System.out.println("2.Eliminar Producto");
        System.out.println("3.Ver Lista Productos");
        System.out.println("4.Salir");
    }

    public int verOpcionesP() {
        LectorTeclado lt = new LectorTeclado();
        int opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado un numero no valido");
        switch (opcion) {
            case 1:
                agregarProducto();
                System.out.println("\n");
                break;
            case 2:
                eliminarProducto();
                System.out.println("\n");
                break;
            case 3:
                System.out.println("La lista de productos es:");
                System.out.println("Codigo Producto \t \t Nombre Producto \t \t Tipo Producto \t \t Marca Producto \t \t Precio");
                verProductos();
                System.out.println("\n");
                break;
        }
        return opcion;
    }

    public ArrayList<Productos> agregarProducto(){
        LectorTeclado lt = new LectorTeclado();
        Productos digitardatos = new Productos();
        digitardatos.setCodigoProducto(lt.leerString("Ingrese un codigo unico para el producto"));
        digitardatos.setPrecioProducto(lt.leerString("Ingrese el precio del producto"));
        digitardatos.setDescripcionProducto(lt.leerString("Ingrese uns Descripcion del Producto"));
        digitardatos.setCantidadProducto(lt.leerString("Ingrese la cantidad disponible de producto"));
        productos1.add(new Productos(digitardatos.getCodigoProducto(),digitardatos.getDescripcionProducto(),digitardatos.getCantidadProducto(),digitardatos.getPrecioProducto()));
        EscritorCvsProductos.writeCsvFile("Productos.Csv",productos1,true);
        return productos1;
    }

    public void eliminarProducto(){
        productos1 = LectorCvsProductos.readCsvFile("Productos.Csv");
        int i = 0;
        for (Productos producto:productos1) {
            i++;
            if(productos1.size()== i){
                productos1.remove(productos1.size()-1);
                EscritorCvsProductos.writeCsvFile("Productos.Csv",productos1,false);
                productos1.add(new Productos());
            }
        }
        if(productos1.size() < i)
            System.out.println("No existe ese producto");
    }
    public void verProductos(){
        productos1 = LectorCvsProductos.readCsvFile("Productos.csv");
        for (Productos productos : productos1) {
            System.out.println(productos.getCodigoProducto() + "\t" + productos.getDescripcionProducto() + "\t" + productos.getPrecioProducto() + "\t" + productos.getCantidadProducto());
        }
    }

}

package edu.ujcv.progra1.Menu;

import edu.ujcv.progra1.edu.ujcv.progra1.models.Productos;
import edu.ujcv.progra1.edu.ujcv.progra1.models.Reportes;
import edu.ujcv.progra1.util.LectorTeclado;
import edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio.EscritorCvsReportes;
import edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio.LectorCvsProductos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class MenuFacturas {
    ArrayList<Productos> productos = new ArrayList<>();
    ArrayList<Productos> cantidad = new ArrayList<>();
    ArrayList<Reportes> reportes = new ArrayList<>();
    Reportes rep = new Reportes();
    double SUBTOTAL = 0;
    public double TOTAL = 0;
    double ISV = 0;
    public int opcion;

    public int verOpcionesFacturas() {
        System.out.println("1. Para Facturar");
        System.out.println("2. Para ver Factura");
        return opcion;
    }

    public int verOpcionesF() {
        LectorTeclado lt = new LectorTeclado();
        int opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado un numero no valido");
        productos = LectorCvsProductos.readCsvFile("Productos.csv");
        switch (opcion) {
            case 1: {
                int i = 0;
                for (Productos producto : productos) {
                    i++;
                    if (opcion == i) {
                        SUBTOTAL += Double.parseDouble(producto.getPrecioProducto());
                        System.out.println("Usted ha agregado al carrito de compras" + producto.getDescripcionProducto());
                        cantidad.add(new Productos(producto.getCodigoProducto(), producto.getDescripcionProducto(),
                                producto.getPrecioProducto(), producto.getCantidadProducto()));
                    }
                }
            }
            case 2: {
                System.out.printf("\t \t \t Aqui puede visualizar su factura \t \t \t" + "\n");
                facturar();
            }
        }
        return opcion;
    }

    public int facturar() {
        LectorTeclado lt = new LectorTeclado();
        Scanner sc = new Scanner(System.in);
        int op;
        ISV = Math.round(SUBTOTAL * 0.15) * 100;
        SUBTOTAL = Math.round(SUBTOTAL - ISV) * 100;
        TOTAL = Math.round((SUBTOTAL + ISV) * 100);
        rep.setTotal(String.valueOf(TOTAL));
        System.out.println("");
        rep.setNombre(lt.leerString("Ingrese el nombre que desea en la factura"));
        rep.setRTN(lt.leerString("Ingrese el RTN"));
        System.out.println("\n \t \t Factura al contado \n" + "\t \t Mercadito Luna");
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println("\t \t " + hourdateFormat.format(date) + "\n \t \t Nombre: " + rep.getNombre() + "\n " + " \t \t RTN: " + rep.getRTN());
        for (Productos producto : cantidad) {
            System.out.println(producto.getDescripcionProducto() + "\t \t \t" + producto.getPrecioProducto());
        }
        System.out.println("El subtotal es: " + String.format("%.2f", SUBTOTAL) + "\n" + "El ISV es: " + ISV + "\n" + "Total" + TOTAL);
        System.out.println("Total" + TOTAL);
        reportes.add(new Reportes(rep.getNombre(), rep.getRTN(), rep.getProductos(), rep.getTotal()));
        EscritorCvsReportes.writeCsvFile("Reportes.csv", reportes, true);
        System.out.println("\n \n \n");

        return verOpcionesFacturas();

    }



}

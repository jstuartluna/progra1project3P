package edu.ujcv.progra1.Menu;

import java.util.ArrayList;
import edu.ujcv.progra1.edu.ujcv.progra1.models.Cliente;
import edu.ujcv.progra1.util.LectorTeclado;
import edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio.LectorCvsCliente;
import edu.ujcv.progra1.util.edu.ujcv.progra1.util.fileio.EscritorCvsClientes;

public class MenuClientes {

    private ArrayList<Cliente> clientes1 = new ArrayList<>();

    public void verOpcionesClientes() {
        System.out.println("1.Agregar Cliente");
        System.out.println("2.Eliminar Cliente");
        System.out.println("3.Ver Lista Clientes");
        System.out.println("4.Salir");
    }

    public int verOpcionesC() {
        LectorTeclado lt = new LectorTeclado();
        int opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado un numero no valido");
        switch (opcion) {
            case 1:
                agregarCliente();
                System.out.println("\n");
                break;
            case 2:
                eliminarCliente();
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n La lista de cliente es:");
                System.out.println("Codigo Cliente \t Identidad\t Primer nombre \t Primer Apellido");
                verClientes();
                System.out.println("\n");
                break;
        }
        return opcion;
    }

    public ArrayList<Cliente> agregarCliente() {
        LectorTeclado lt = new LectorTeclado();
        Cliente digitardatos = new Cliente();
        digitardatos.setCodigoCliente(lt.leerString("Ingrese un codigo unico para el cliente"));
        digitardatos.setIdentidad(lt.leerString("Ingrese el numero de identidad del cliente"));
        digitardatos.setPrimerNombre(lt.leerString("Ingrese el Nombre del Cliente"));
        digitardatos.setPrimerApellido(lt.leerString("Ingrese el Primer apellido del Cliente"));
        clientes1.add(new Cliente(digitardatos.getIdentidad(), digitardatos.getPrimerNombre(), digitardatos.getPrimerApellido(), digitardatos.getCodigoCliente()));
        EscritorCvsClientes.writeCsvFile("ClientesLista.Csv", clientes1, true);
        return clientes1;
    }

    public void eliminarCliente() {
            clientes1 = LectorCvsCliente.readCsvFile("Clientes.csv");
            int i = 0;
            for (Cliente cliente:clientes1) {
                i++;
                if(clientes1.size()== i){
                    clientes1.remove(clientes1.size()-1);
                    EscritorCvsClientes.writeCsvFile("Clientes.Csv",clientes1,false);
                    clientes1.add(new Cliente("","","",""));
                }
            }
    }

    public void verClientes() {
        clientes1 = LectorCvsCliente.readCsvFile("ClientesLista.Csv");
        for (Cliente cliente : clientes1) {
            System.out.println(cliente.getCodigoCliente() + "\t" + cliente.getIdentidad() + "\t" + cliente.getPrimerNombre() + "\t"
                    + cliente.getPrimerApellido() + "\t");
        }
    }

}



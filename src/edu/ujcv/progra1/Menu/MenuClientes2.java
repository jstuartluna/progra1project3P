package edu.ujcv.progra1.Menu;


    public class MenuClientes2 implements IMenuItem {

        public String getLabel() {
            return "Clientes";
        }

        public void runAction() {
            MenuClientes Consumers = new MenuClientes();
            Consumers.verOpcionesClientes();
            Consumers.verOpcionesC();
        }
    }


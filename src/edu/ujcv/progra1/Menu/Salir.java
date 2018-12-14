package edu.ujcv.progra1.Menu;

import edu.ujcv.progra1.Main;

public class Salir implements IMenuItem {
        @Override
        public String getLabel() {
            return "Salir!!";
        }

        @Override
        public void runAction() {
            Main.valorSalida = 1;
        }

}

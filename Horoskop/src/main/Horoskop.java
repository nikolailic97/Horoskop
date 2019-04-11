
package main;

import grafika.OdrediHoroskopskiZnak;



public class Horoskop {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdrediHoroskopskiZnak().setVisible(true);
            }
        });
    }
    
}

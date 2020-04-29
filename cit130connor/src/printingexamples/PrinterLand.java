/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingexamples;

/**
 *
 * @author connor.britton
 */
public class PrinterLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapePrinter bp = new ShapePrinter();
        bp.printBox(9,9);
        bp.printPyramid(9);
        bp.printSymmetricPyramid(9);
    }
    
}

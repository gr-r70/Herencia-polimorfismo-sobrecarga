/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Controlador.DimayorControl;
import Vista.DimayorVista;

public class Dimayor {
    public static void main(String[] args) {
        DimayorVista vista = new DimayorVista();
        DimayorControl controlador = new DimayorControl(vista);
        controlador.iniciar();
    }
}
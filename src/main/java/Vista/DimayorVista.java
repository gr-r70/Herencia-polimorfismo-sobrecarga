/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

public class DimayorVista {

    public int menuInicio() {
        String menu = """
                      
                        DIMAYOR - Fútbol Profesional Colombiano
                      
                        1. Listado de Equipos
                        2. Mayor Puntaje Alcanzado
                        3. Buscar Equipo por Nombre
                        4. Equipos con Mayor Puntaje
                        5. Salir
                      
                      
                      Elige una opción:
                      """;
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public String pedirNombreEquipo() {
        return JOptionPane.showInputDialog("Ingrese el nombre del equipo a buscar\n(Ejemplo: America de Cali (Cali)):");
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

   
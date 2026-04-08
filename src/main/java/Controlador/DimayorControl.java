/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DimayorModelo;
import Modelo.EquiposPuntajes;
import Vista.DimayorVista;
import java.util.ArrayList;
public class DimayorControl {

    private ArrayList<DimayorModelo> listaEquipos;
    private DimayorVista vista;

    public DimayorControl(DimayorVista vista) {
        this.vista=vista;
        this.listaEquipos = new ArrayList<>();
        cargarEquipos();
    }

    // Carga los equipos con datos predefinidos
    private void cargarEquipos() {
        listaEquipos.add(new EquiposPuntajes("Atletico Nacional",      11, 1, 3, 15, "1947"));
        listaEquipos.add(new EquiposPuntajes("Deportivo Pasto",         8, 4, 3, 15, "1949"));
        listaEquipos.add(new EquiposPuntajes("Deportes Tolima",         7, 6, 2, 15, "1954"));
        listaEquipos.add(new EquiposPuntajes("Once Caldas",             6, 7, 2, 15, "1961"));
        listaEquipos.add(new EquiposPuntajes("Junior F.C.",             8, 1, 6, 15, "1924"));
        listaEquipos.add(new EquiposPuntajes("America de Cali",         7, 3, 5, 15, "1927"));
        listaEquipos.add(new EquiposPuntajes("Deportivo Cali",          6, 4, 5, 15, "1912"));
        listaEquipos.add(new EquiposPuntajes("Aguilas Doradas",         6, 4, 5, 15, "2001"));
        listaEquipos.add(new EquiposPuntajes("Internacional de Bogota", 5, 7, 3, 15, "1948"));
        listaEquipos.add(new EquiposPuntajes("Millonarios F.C.",        6, 3, 6, 15, "1946"));
        listaEquipos.add(new EquiposPuntajes("Llaneros F.C.",           4, 8, 3, 15, "2010"));
        listaEquipos.add(new EquiposPuntajes("Atletico Bucaramanga",    4, 7, 4, 15, "1949"));
        listaEquipos.add(new EquiposPuntajes("Independiente Santa Fe",  4, 7, 4, 15, "1941"));
        listaEquipos.add(new EquiposPuntajes("Independiente Medellin",  4, 5, 5, 14, "1913"));
        listaEquipos.add(new EquiposPuntajes("Fortaleza",               3, 7, 5, 15, "2005"));
        listaEquipos.add(new EquiposPuntajes("Cucuta Deportivo",        3, 6, 7, 16, "1924"));
        listaEquipos.add(new EquiposPuntajes("Alianza Valledupar",      3, 6, 6, 15, "2018"));
        listaEquipos.add(new EquiposPuntajes("Jaguares F.C.",           4, 2,10, 16, "2007"));
        listaEquipos.add(new EquiposPuntajes("Boyaca Chico F.C.",       3, 2, 9, 14, "2002"));
        listaEquipos.add(new EquiposPuntajes("Deportivo Pereira",       0, 6, 9, 15, "1944"));
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.menuInicio();
            switch (opcion) {
                case 1:
                    listarEquipos();
                    break;
                case 2:
                    mostrarMayorPuntaje();
                    break;
                case 3:
                    buscarEquipo();
                    break;
                case 4:
                    equiposConMayorPuntaje();
                    break;
                case 5:
                    vista.mostrarMensaje("Saliendo del sistema. ¡Hasta pronto!");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    // 1. Listado completo de equipos
    private void listarEquipos() {
        String mensaje = "===== LISTADO DE EQUIPOS =====\n";
        int numero = 1;
        for (DimayorModelo e : listaEquipos) {
            if (e instanceof EquiposPuntajes) {
                mensaje += numero + ". " + e.getNomEquipo() + "\n";
                numero++;
                
            }
        }
        vista.mostrarMensaje(mensaje);
    }

    // 2. Mayor puntaje
    private void mostrarMayorPuntaje() {
        int mayor = mayorPuntaje();
        vista.mostrarMensaje("EL MAYOR PUNTAJE ALCANZADO ES: " + mayor + " puntos");
    }

    // 3. Buscar equipo - SOBRECARGA
    private void buscarEquipo() {
        String nombre = vista.pedirNombreEquipo();
        
        DimayorModelo encontrado = buscar(nombre);
        if (encontrado != null) {
            vista.mostrarMensaje("EQUIPO ENCONTRADO:\n\n" + encontrado.toString());
        } else {
            vista.mostrarMensaje("No se encontró el equipo: " + nombre);
        }
    }

    // 4. Equipos con mayor puntaje
    private void equiposConMayorPuntaje() {
        int mayor = mayorPuntaje();
        int contador = 0;
        String mensaje = "EQUIPOS CON MAYOR PUNTAJE (" + mayor + " pts):\n\n";
        for (DimayorModelo e : listaEquipos) {
            if (e.calcularPuntos() == mayor) {
                mensaje += "- " + e.getNomEquipo() + "\n";
                contador++;
            }
        }
        mensaje += "\nTOTAL DE EQUIPOS CON MAYOR PUNTAJE: " + contador;
        vista.mostrarMensaje(mensaje);
    }

    // Calcula el mayor puntaje de la lista
    private int mayorPuntaje() {
        int mayor = 0;
        for (DimayorModelo e : listaEquipos) {
            if (e.calcularPuntos() > mayor) {
                mayor = e.calcularPuntos();
            }
        }
        return mayor;
    }


    // SOBRECARGA: buscar por nombre (String)
    public DimayorModelo buscar(String nomEquipo) {
        for (DimayorModelo e : listaEquipos) {
            
            if (e.equipo.equalsIgnoreCase(nomEquipo)) {  
                return e;
            }
        }
        return null;
    }

}
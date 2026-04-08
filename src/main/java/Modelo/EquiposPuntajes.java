/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class EquiposPuntajes extends DimayorModelo {
    private String fundacion;

    public EquiposPuntajes(String equipo, int pg, int pe, int pp, int pj, String fundacion) {
        super(equipo, pg, pe, pp, pj);
        this.fundacion = fundacion;
    }

    public String getFundacion() {
        return fundacion;
    }

    @Override // Polimorfismo
    public int calcularPuntos() {
        return (pg * 3) + pe;
    }

    @Override
    public String getNomEquipo() {
        return equipo+"("+fundacion+")";
    }

    @Override
    public String toString() {
        return "Equipo: " + getNomEquipo() +
               "\n  PG: " + pg +
               "\n  PE: " + pe +
               "\n  PP: " + pp +
               "\n  PJ: " + pj +
               "\n  Puntos: " + calcularPuntos();
    }
}
    

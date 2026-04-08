/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class DimayorModelo {
    
    public String equipo;
    protected int pg;
    protected int pe;
    protected int pp;
    protected int pj;

    public DimayorModelo(String nomEquipo, int pg, int pe, int pp, int pj) {
        this.equipo = nomEquipo;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.pj = pj;
    }

    // Método polimórfico (se sobreescribirá en la subclase)
    public int calcularPuntos() {
        return (pg * 3) + pe;
    }

    public String getNomEquipo() {
        return equipo;
    }

    public int getPg() { return pg; }
    public int getPe() { return pe; }
    public int getPp() { return pp; }
    public int getPj() { return pj; }

    @Override
    public String toString() {
        return "Equipo: " + equipo +
               "\n  PG: " + pg +
               "\n  PE: " + pe +
               "\n  PP: " + pp +
               "\n  PJ: " + pj +
               "\n  Puntos: " + calcularPuntos();
    }
}
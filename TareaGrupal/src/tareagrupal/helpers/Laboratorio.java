/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupal.helpers;

/**
 *
 * @author Arian-25
 */
public class Laboratorio extends Hospital {
    
    private String nombreEncargado;
    private int horaInicio;
    private int horaCierre;
    
    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }
    
    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public int getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }
    
    @Override
    public String getDimensionesEdificio() {
        return "150m x 200m";
    }

    @Override
    public String getColorEdificio() {
        return "Verde";
    }

    @Override
    public String getNombreEdificio() {
        return "Laboratorio clinico";
    }

    @Override
    public String getDireccionEdificio() {
        return "Col Suyapa";
    }

    @Override
    public int getNumeroDePisos() {
        return 3;
    }

    @Override
    public int getNumeroEdificio() {
        return 10;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupal;

import tareagrupal.helpers.Farmacia;
import tareagrupal.helpers.Laboratorio;

/**
 *
 * @author evers
 */
public class TareaGrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Clase Farmacia
        Farmacia farmacia = new Farmacia();
        farmacia.setNombreEncargado("Carlos");
        farmacia.setHoraInicio(07);
        farmacia.setHoraCierre(21);
        
        System.out.println("Encargado de farmacia: " + farmacia.getNombreEncargado());
        System.out.println("Hora de apertura: " + farmacia.getHoraInicio());
        System.out.println("Hora de cierre: " + farmacia.getHoraCierre());
        System.out.println("Edificio: " + farmacia.getNombreEdificio());
        System.out.println("Direccion: " + farmacia.getDireccionEdificio());
        System.out.println("Color edificio: " + farmacia.getColorEdificio());
        System.out.println("Numero de edificio: " + farmacia.getNumeroEdificio());
        System.out.println("Numero de pisos: " + farmacia.getNumeroDePisos());
        
        // Clase Laboratorio
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.setNombreEncargado("Arian");
        laboratorio.setHoraInicio(06);
        laboratorio.setHoraCierre(17);
        
        System.out.println("Encargado de laboratorio: " + laboratorio.getNombreEncargado());
        System.out.println("Hora de apertura: " + laboratorio.getHoraInicio());
        System.out.println("Hora de cierre: " + laboratorio.getHoraCierre());
        System.out.println("Edificio: " + laboratorio.getNombreEdificio());
        System.out.println("Direccion: " + laboratorio.getDireccionEdificio());
        System.out.println("Color edificio: " + laboratorio.getColorEdificio());
        System.out.println("Numero de edificio: " + laboratorio.getNumeroEdificio());
        System.out.println("Numero de pisos: " + laboratorio.getNumeroDePisos());
        
    }
    
}

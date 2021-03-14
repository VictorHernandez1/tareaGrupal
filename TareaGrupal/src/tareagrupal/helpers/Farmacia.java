/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupal.helpers;

/**
 *
 * @author carlitosruano10
 */
public class Farmacia extends Hospital {

    @Override
    String getDimensionesEdificio() {
        return "50m x 50m";
    }

    @Override
    String getColorEdificio() {
        return "azul";
    }

    @Override
    String getNombreEdificio() {
        return "Farmacio del hospital";
    }

    @Override
    String getDireccionEdificio() {
        return "Col Suyapa";
    }

    @Override
    int getNumeroDePisos() {
        return 2;
    }

    @Override
    int getNumeroEdificio() {
        return 21;
    }

}
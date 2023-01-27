package com.gs.swing.table;

import java.awt.Color;

import javax.swing.JLabel;

import com.gs.common.FarmaColumnData;


/**
 * Copyright (c) 2006 MIFARMA S.A.C.<br>
 * <br>
 * Entorno de Desarrollo   : Oracle JDeveloper 10g<br>
 * Nombre de la Aplicaci�n : ConstantsVentas.java<br>
 * <br>
 * Hist�rico de Creaci�n/Modificaci�n<br>
 * LMESIA      14.02.2006   Creaci�n<br>
 * AOVIEDO     07.04.2017   Modificaci�n <br>
 * <br>
 * @author Luis Mesia Rivera<br>
 * @version 1.0<br>
 * RECEP_BULTOS
 *Recep
 */

public class ConstantsVentas {

    public ConstantsVentas() {
    }

    public static final FarmaColumnData columnsListaProductosComplementario[] = { 
        new FarmaColumnData("Sel", 30, JLabel.CENTER),          //00
        new FarmaColumnData("Codigo", 50, JLabel.LEFT),         //01
        new FarmaColumnData("Descripcion", 300, JLabel.LEFT),   //02 ICORONADO 22112019
        new FarmaColumnData("Unidad", 90, JLabel.LEFT),         //03 ICORONADO 22112019
        new FarmaColumnData("Laboratorio", 0, JLabel.LEFT),     //04
        new FarmaColumnData("Stock", 35, JLabel.RIGHT),         //05 ICORONADO 22112019
        new FarmaColumnData("Precio", 0, JLabel.RIGHT),         //06 ICORONADO 22112019
        new FarmaColumnData("Gar", 30, JLabel.RIGHT),           //07 HINOPE 04112021 se cambio nombre de "Zan" a "Gar"
        new FarmaColumnData("", 0, JLabel.LEFT),                //indicador producto congelado           //08
        new FarmaColumnData("", 0, JLabel.RIGHT),               //valor de fraccion de local          //09
        new FarmaColumnData("", 0, JLabel.RIGHT),               //valor precio lista                  //10
        new FarmaColumnData("", 0, JLabel.RIGHT),               //valor igv producto                  //11
        new FarmaColumnData("", 0, JLabel.LEFT),                //indicador de producto farma          //12
        new FarmaColumnData("", 0, JLabel.RIGHT),               //indicador prod virtual              //13
        new FarmaColumnData("", 0, JLabel.LEFT),                //tipo de prod virtual                 //14
        new FarmaColumnData("", 0, JLabel.LEFT),                //indicador prod refrigerado           //15
        new FarmaColumnData("", 0, JLabel.LEFT),                //indicador tipo producto              //16
        new FarmaColumnData("", 0, JLabel.LEFT),                //indicador  producto promocion        //17
        new FarmaColumnData("ordLista", 0, JLabel.LEFT),        //18
        new FarmaColumnData("indProdEncarte", 0, JLabel.LEFT),  //19
        new FarmaColumnData("indOrigen", 0, JLabel.LEFT),       //20
        new FarmaColumnData("prodPadre", 0, JLabel.LEFT),       //21 RARGUMEDO 22112019
        new FarmaColumnData("stock", 0, JLabel.LEFT),           //22 RARGUMEDO 22112019
        new FarmaColumnData("%Dscto", 0, JLabel.LEFT),          //23 RARGUMEDO 22112019
        new FarmaColumnData("PrecioSinDcto", 0, JLabel.LEFT),   //24 RARGUMEDO 22112019
        new FarmaColumnData("PrecioOriginal", 0, JLabel.LEFT),  //25 RARGUMEDO 22112019
        new FarmaColumnData("Normal", 65, JLabel.RIGHT),        //26 ICORONADO 22112019
        new FarmaColumnData("Monedero", 0, JLabel.RIGHT),       //27 ICORONADO 22112019
        new FarmaColumnData("50 Aniv", 0, JLabel.RIGHT),        //28 ICORONADO 22112019
        new FarmaColumnData("Tarjetas", 0, JLabel.RIGHT),       //29 Nombre Tarjeta
        new FarmaColumnData("Dscto", 65, JLabel.RIGHT, Color.GREEN) };       //30 Descuento

    public static final Object[] defaultValuesListaProductosComplementario =
    { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
      " ", " ", " ", " ", " ", " ", " ", " " };

}


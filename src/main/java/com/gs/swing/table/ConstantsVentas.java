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

    public static final FarmaColumnData columnsList[] = {
        new FarmaColumnData("Sel", 30, JLabel.CENTER),          //00
        new FarmaColumnData("Codigo", 50, JLabel.LEFT),         //01
        new FarmaColumnData("Descripcion", 300, JLabel.LEFT),   //02
        new FarmaColumnData("Unidad", 90, JLabel.LEFT),         //03
        new FarmaColumnData("Laboratorio", 0, JLabel.LEFT),     //04
        new FarmaColumnData("Stock", 35, JLabel.RIGHT),         //05
        new FarmaColumnData("Precio", 0, JLabel.RIGHT),         //06
        new FarmaColumnData("Ver", 30, JLabel.RIGHT),           //07
        new FarmaColumnData("Normal", 65, JLabel.RIGHT,
                new Color(43, 141, 39)),                          //08
        new FarmaColumnData("Dscto", 65, JLabel.RIGHT,
                new Color(255,130,14)) };                         //09

    public static final Object[] defaultValues =
    { " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };

}


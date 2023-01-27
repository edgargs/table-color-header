package com.gs.common;

import java.awt.*;

/**
 * Copyright (c) 2006 MiFarma S.A.C.<br>
 * <br>
 * Entorno de Desarrollo : Oracle JDeveloper 9.0.4.0<br>
 * Nombre de la Aplicaci�n : FarmaColumnData.java<br>
 * <br>
 * Hist�rico de Creaci�n/Modificaci�n<br>
 * LMESIA 07.01.2006 Creaci�n<br>
 * <br>
 * 
 * @author Luis Mesia Rivera<br>
 * @version 1.0<br>
 * 
 */

public class FarmaColumnData {

    /**
     * Variable que almacena el T�tulo de la Columna.
     */
    public String m_title;

    /**
     * Variable que almacena el ancho de la Columna.
     */
    public int m_width;

    /**
     * Variable que almacena la alineaci�n de la Columna.
     */
    int m_alignment;
    private Color colorBackgraound;

    /**
     * Constructor
     * @param title T�tulo
     * @param width Ancho
     * @param alignment Alineaci�n
     */
    public FarmaColumnData(String title, int width, int alignment) {
        m_title = title;
        m_width = width;
        m_alignment = alignment;
    }

    public FarmaColumnData(String title, int width, int right, Color colorBrackground) {
        this(title,width,right);
        this.colorBackgraound = colorBrackground;
    }

    /**
     * @author ERIOS
     * @since 03.12.2015
     * @return
     */
    public int getAligmment(){
        return this.m_alignment;
    }

    public Color getBackground() {
        return this.colorBackgraound;
    }
}

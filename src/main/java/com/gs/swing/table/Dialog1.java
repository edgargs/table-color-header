package com.gs.swing.table;

import com.gs.mifarma.componentes.ColumnGroup;

import java.awt.Dimension;
import java.awt.Frame;

import java.awt.GridLayout;
import java.awt.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.gs.common.FarmaTableModel;
import com.gs.mifarma.componentes.UtilityTable;


public class Dialog1 extends JDialog {
    private JPanel jPanel1 = new JPanel();
    private GridLayout gridLayout1 = new GridLayout();

    private boolean DEBUG = false;
    private JTable jTable = new JTable();
    private JScrollPane jScrollPane1 = new JScrollPane();

    public Dialog1() {
        this(null, "", false);
    }

    public Dialog1(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
            initTableListaComplementarios();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize( new Dimension( 735, 300 ) );
        this.getContentPane().setLayout( null );
        jPanel1.setBounds(new Rectangle(20, 130, 350, 125));
        jPanel1.setLayout(gridLayout1);

        jScrollPane1.getViewport().add(jTable, null);
        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(jPanel1, null);

        jScrollPane1.setBounds(new Rectangle(20, 20, 675, 100));
    }
    
    private void initTableListaComplementarios() {
        FarmaTableModel tableModel;
        tableModel = new FarmaTableModel(ConstantsVentas.columnsList, ConstantsVentas.defaultValues, 0);

        ColumnGroup columnGroup = null;

        int[] columns = {8,9};
        columnGroup = new ColumnGroup("Precio Venta " + "S/.", columns);
        
        UtilityTable.initSelectList(jTable, tableModel, ConstantsVentas.columnsList, null);
        
        var row = new ArrayList(Arrays.asList("00", "552277", "Producto ABC", "Caja", "04", "66", "06", "No",
                                                    "7.0", "11"));
        tableModel.insertRow(row);
    }
    

    public static void main(String[] args) {
        Dialog1 d = new Dialog1();
        d.setVisible(true);
        d.setDefaultCloseOperation(1);
    }
}

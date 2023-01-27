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
    private JTable jTable2 = new JTable();
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

        jScrollPane1.getViewport().add(jTable2, null);
        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(jPanel1, null);

        jScrollPane1.setBounds(new Rectangle(20, 20, 675, 100));
    }
    
    private void initTableListaComplementarios() {
        FarmaTableModel tableModelListaComplementarios;
        tableModelListaComplementarios = new FarmaTableModel(ConstantsVentas.columnsListaProductosComplementario, ConstantsVentas.defaultValuesListaProductosComplementario, 0);
        
        int[] columns = {26,27,28,30};
        ColumnGroup g_other = new ColumnGroup("Precio Venta " + "S/.", columns);
        
        UtilityTable.initSelectList(jTable2, tableModelListaComplementarios, ConstantsVentas.columnsListaProductosComplementario, g_other);
        
        ArrayList row = new ArrayList(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                                                               "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                                                               "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                                                    "1"));
        tableModelListaComplementarios.insertRow(row);
    }
    

    public static void main(String[] args) {
        Dialog1 d = new Dialog1();
        d.setVisible(true);
        d.setDefaultCloseOperation(1);
    }
}

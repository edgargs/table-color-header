package com.gs.mifarma.componentes;

import com.gs.common.FarmaCheckCellRenderer;
import com.gs.common.FarmaColumnData;
import com.gs.common.FarmaTableModel;
import com.gs.mifarma.componentes.ColorHeaderRenderer;
import com.gs.mifarma.componentes.ColumnGroup;
import com.gs.mifarma.componentes.GroupableTableHeader;

import java.awt.Color;


import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import javax.swing.table.TableColumnModel;

public class UtilityTable {
    public UtilityTable() {
        super();
    }
    
    public static void initSelectList(JTable pTable, 
                                      FarmaTableModel pTableModel,
                                      FarmaColumnData[] pColumnsList,
                                      ColumnGroup g_other) {
        initSelectList(pTable, pTableModel, pColumnsList, new ArrayList(), 
                       null, null, false);
        if (g_other != null) {
            TableColumnModel cm = pTable.getColumnModel();
            GroupableTableHeader header = new GroupableTableHeader(cm);
            for (int column : g_other.getIndexColumns()) {
                g_other.add(cm.getColumn(column));
            }
            header.addColumnGroup(g_other);
            pTable.setTableHeader(header);
        }
    }
    
    public static void initSelectList(JTable pTable,
                                      FarmaTableModel pTableModel,
                                      FarmaColumnData[] pColumnsList,
                                      ArrayList pRowsWithOtherColor,
                                      Color pBackgroundColor,
                                      Color pForegroundColor, boolean pBold) {
        pTable.setAutoCreateColumnsFromModel(false);
        pTable.setModel(pTableModel);
        pTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        pTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        for (int k = 0; k < pTableModel.getColumnCount(); k++) {
            TableCellRenderer renderer;
            if (k == 0) {
                TableCellRenderer rendererCheckBox =
                    new FarmaCheckCellRenderer();
                TableCellEditor editorCheckBox =
                    new DefaultCellEditor(new JCheckBox());
                TableColumn columnCheckBox =
                    new TableColumn(k, pColumnsList[k].m_width,
                                    rendererCheckBox, editorCheckBox);
                pTable.addColumn(columnCheckBox);
            } else {
                DefaultTableCellRenderer textRenderer =
                    new DefaultTableCellRenderer();
                /*
                                 * AttributiveCellRenderer rendererText = new
                                 * AttributiveCellRenderer(pRowsWithOtherColor,
                                 * pBackgroundColor, pForegroundColor, pBold, true);
                                 */
                textRenderer.setHorizontalAlignment(pColumnsList[k].getAligmment());
                // TableCellEditor editorText = new FarmaCustomCellEditor();
                TableCellEditor editorText = null;
                TableColumn columnText =
                    new TableColumn(k, pColumnsList[k].m_width, textRenderer,
                                    editorText);

                Color bg = pColumnsList[k].getBackground();
                if (bg != null) {
                    ColorHeaderRenderer headerRenderer = new ColorHeaderRenderer(bg);
                    columnText.setHeaderRenderer(headerRenderer);
                }

                pTable.addColumn(columnText);
            }
        }
    }

}


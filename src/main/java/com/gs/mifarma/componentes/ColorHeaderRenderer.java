package com.gs.mifarma.componentes;


import java.awt.Color;
import java.awt.Component;


import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;


public class ColorHeaderRenderer extends DefaultTableCellRenderer {
    private Color bgcolor;

    ColorHeaderRenderer(Color bgcolor) {
        this.bgcolor = bgcolor;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        
        setForeground(table.getTableHeader().getForeground());
        setBackground(bgcolor);
        setFont(table.getTableHeader().getFont());

        setHorizontalAlignment(JLabel.CENTER);
        setValue(value.toString());
        setBorder(UIManager.getBorder("TableHeader.cellBorder"));
        return this;

    };
}

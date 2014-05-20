/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.requirements.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gilberto
 */
public class BIEMainViewTableModel extends AbstractTableModel {
    
    private String[] columnNames = {"Descripción", "Hora", "+/-", "Cantidad"};
    private ArrayList list;

    public BIEMainViewTableModel() {
        this.list = new ArrayList();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public int getRowCount() {
        return this.list.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Object item = list.get(rowIndex);
        Object value = "";
        switch (columnIndex) {
            case 1:
                value = item;
                break;
            case 2:
                value = item;
                break;
            case 3:
                value = item;
                break;
            case 4:
                value = item;
                break;
        }

        return value;
    }

}

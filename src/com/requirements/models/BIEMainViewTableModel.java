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

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BIEData item = (BIEData) this.list.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = item.getDescription();
                break;
            case 1:
                value = item.getTime();
                break;
            case 2:
                value = item.getPlus();
                break;
            case 3:
                value = item.getQty();
                break;
        }

        return value;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList list) {
        this.list = list;
    }

    public void addToList(String description, String time, String Qty) {
        BIEData itemToAdd = new BIEData();
        itemToAdd.setDescription(description);
        itemToAdd.setPlus("+");
        itemToAdd.setQty(Qty);
        itemToAdd.setTime(time);
        this.list.add(itemToAdd);
    }

}

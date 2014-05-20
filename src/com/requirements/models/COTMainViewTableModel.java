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
public class COTMainViewTableModel extends AbstractTableModel {

    private String[] columnNames = {"Cantidad", "Descripción", "Precio Unitario", "Importe"};
    private ArrayList list;

    public COTMainViewTableModel() {
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
        COTData item = (COTData) this.list.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = item.getQty();
                break;
            case 1:
                value = item.getDescription();
                break;
            case 2:
                value = item.getUnitPrice();
                break;
            case 3:
                value = item.getSubtotal();
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

    public void addToList() {
        COTData itemToAdd = new COTData();
        itemToAdd.setDescription("Descripción");
        itemToAdd.setUnitPrice("$668.50");
        itemToAdd.setQty("2");
        itemToAdd.setSubtotal("$1337.00");
        this.list.add(itemToAdd);
    }

}

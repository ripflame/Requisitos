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
public class CPCMainViewTableModel extends AbstractTableModel {

    private String[] columnNames = {"Empresa", "Descripción", "Teléfono", "Fecha de pago", "Importe", "Estado"};
    private ArrayList list;

    public CPCMainViewTableModel() {
        this.list = new ArrayList();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return this.getList().size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CPCData item = (CPCData)this.getList().get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = item.getCompany();
                break;
            case 1:
                value = item.getDescription();
                break;
            case 2:
                value = item.getPhoneNumber();
                break;
            case 3:
                value = item.getPaymentDate();
                break;
            case 4:
                value = item.getAmount();
                break;
            case 5:
                value = item.getStatus();
                break;
        }

        return value;
    }

    public Object getValueAt(int rowIndex) {
        CPCData item = (CPCData)this.getList().get(rowIndex);
        return item;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList list) {
        this.list = list;
    }

    /**
     * @return the list
     */
    public ArrayList getList() {
        return list;
    }
    
    public void addToList() {
        CPCData item = new CPCData();
        item.setCompany("Compañía");
        item.setDescription("Descripción");
        item.setPhoneNumber("9999876543");
        item.setPaymentDate("29-05-2014");
        item.setAmount("$1337.00");
        item.setStatus("Pendiente");
        this.getList().add(item);
    }

    public void addToList(CPCData item) {
        this.getList().add(item);
    }

   

}

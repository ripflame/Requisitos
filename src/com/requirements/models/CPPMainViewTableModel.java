/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.requirements.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author keduardo
 */
public class CPPMainViewTableModel extends AbstractTableModel {

    private String[] columnNames = {"Numero de Pago", "Fecha de pago"};
    private ArrayList list;
    
    public CPPMainViewTableModel()
    {
        this.list = new ArrayList();
    }
    @Override
    public int getRowCount() {
        return list.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columnNames.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CPPData dataItem = (CPPData) this.list.get(rowIndex);
        Object word = null;
        switch(columnIndex)
        {
            case 0:
                word = dataItem.getPayNumber();
                break;
            case 1:
                word = dataItem.getPayDay();
                break;
        }
        return word;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addToList(CPPData item)
    {
        list.add(item);
    }
}

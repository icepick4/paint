/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import paint.models.Paint;

/**
 *
 * @author Rémi
 */
public class TableModelInspector extends AbstractTableModel{
    private ArrayList<Paint> paints;

    public TableModelInspector(){
        this.paints = new ArrayList<Paint>();
    }

    public void addPaint(Paint paint) {
        paints.add(paint);
        fireTableRowsInserted(this.paints.size(), this.paints.size());
    }

    @Override
    public int getRowCount() {
        return paints.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return paints.get(rowIndex).getColor();
            case 1:
                return paints.get(rowIndex).getTool();
            case 2:
                return paints.get(rowIndex).getWidth();
            case 3:
                return paints.get(rowIndex).getX();
            case 4:
                return paints.get(rowIndex).getY();
            case 5:
                return paints.get(rowIndex).isSmooth();
            default:
                return null;
        }
    }

    public ArrayList<Paint> getPaints() {
        //return only if not null
        return paints == null ? new ArrayList<Paint>() : paints;
        
    }
}

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
    private final String[] titles = {"Couleur", "Forme", "Taille", "X", "Y", "Lisse?"};
    private Slate slate;

    public TableModelInspector(Slate slate){
        this.paints = new ArrayList<Paint>();
        this.slate = slate;
    }

    /**
     * Add a new paint to the list
     * @param paint
     */
    public void addPaint(Paint paint) {
        paints.add(paint);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return paints.size();
    }

    @Override
    public int getColumnCount() {
        return this.titles.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.titles[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return this.paints.get(rowIndex).getColor();
            case 1:
                return this.paints.get(rowIndex).getTool();
            case 2:
                return this.paints.get(rowIndex).getWidth();
            case 3:
                return this.paints.get(rowIndex).getX();
            case 4:
                return this.paints.get(rowIndex).getY();
            case 5:
                return this.paints.get(rowIndex).isSmooth();
            default:
                return null;
        }
    }

    public ArrayList<Paint> getPaints() {
        //return only if not null
        return paints == null ? new ArrayList<Paint>() : paints;
    }

    /**
     * Remove the paint at the given index
     * @param row
     */
    public void deletePoint(int row) {
        this.paints.remove(row);
        super.fireTableRowsDeleted(row, row);
    }

    /**
     * Modify the paint at the given index
     * @param row
     * @param paint
     */
    public void modifPoint(int row, Paint paint) {
        this.paints.set(row, paint);
        super.fireTableRowsUpdated(row, row);
    }

    /**
     * Get the slate
     * @return
     */
    public Slate getSlate(){
        return this.slate;
    }
}

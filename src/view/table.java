/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Tree.Tree;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asus
 */
public class table extends AbstractTableModel {
    
    private ArrayList<Tree> daftarDokter;
    private String[] columns;
    
    public table() {
    }
    
    public void baca() {
        Tree a = new Tree();
        while (!a.isEmpty()) {            
            a.inOrderHelpera(a.getRoot().getLeftNode());
            daftarDokter.add(a);
        }
        
    }

    public table(Tree daftarDokter) {
        super();
        columns = new String[]{"Id Pegawai", "Nama"};
        
    }
    
    @Override
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
        return daftarDokter.size();
    }
    
    @Override
    public int getColumnCount() {
        //To change body of generated methods, choose Tools | Templates.
        return columns.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //To change body of generated methods, choose Tools | Templates.
        Tree dokter = daftarDokter.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dokter.getRoot().getData().getIndo();
            case 1:
                return dokter.getRoot().getData().getNgoko();
            case 2:
                return dokter.getRoot().getData().getKrama();
            case 3:
                return dokter.getRoot().getData().getKramaInggil();
            default:
                return null;
        }
    }

    // Optional, the name of your column
    public String getColumnName(int col) {
        return columns[col];
    }

    /**
     * @return the daftarDokter
     */
    public ArrayList<Tree> getDaftarDokter() {
        return daftarDokter;
    }

    /**
     * @param daftarDokter the daftarDokter to set
     */
    public void setDaftarDokter(ArrayList<Tree> daftarDokter) {
        this.daftarDokter = daftarDokter;
    }
    
}

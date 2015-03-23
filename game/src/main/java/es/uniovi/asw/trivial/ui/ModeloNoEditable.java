package es.uniovi.asw.trivial.ui;

import javax.swing.table.*;

public class ModeloNoEditable extends DefaultTableModel { //heredamos de DefaultTableModel
	private static final long serialVersionUID = 1L;

	public ModeloNoEditable(Object[] columnNames, int rowCount) {
		super(columnNames, rowCount); //invocamos al constructor del padre
   }
	@Override
	public boolean isCellEditable(int row, int column) {  //Queremos que devuelva falso, para que no deje editar las celdas de la tabla
        return false;
    }
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
}

package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class DialogoEstadisticas extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JScrollPane scrollTabla;
	private JTable tablaEstadisticas;
	private ModeloNoEditable modeloTabla; // Declaramos el modelo para la tabla (antes DefaultTableModel)

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoEstadisticas dialog = new DialogoEstadisticas();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoEstadisticas() {
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Estad\u00EDsticas de Jugadores");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoEstadisticas.class.getResource("/img/ico_32x32_estadisticas.png")));
		setBounds(100, 100, 483, 476);
		getContentPane().setLayout(null);
		getContentPane().add(getPanelPrincipal());

	}
	private JPanel getPanelPrincipal() {
		if (panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBounds(0, 0, 480, 443);
			panelPrincipal.setPreferredSize(new Dimension(480, 443));
			panelPrincipal.setMinimumSize(new Dimension(480, 443));
			panelPrincipal.setMaximumSize(new Dimension(480, 443));
			panelPrincipal.setBackground(new Color(0, 55, 76));
			panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getScrollTabla());
		}
		return panelPrincipal;
	}
	private JScrollPane getScrollTabla() {
		if (scrollTabla == null) {
			scrollTabla = new JScrollPane();
			scrollTabla.setBorder(new EmptyBorder(0, 0, 0, 0));
			scrollTabla.setBounds(25, 25, 432, 392);
			scrollTabla.setViewportView(getTablaEstadisticas());
		}
		return scrollTabla;
	}
	
	private JTable getTablaEstadisticas() {
		if (tablaEstadisticas == null) {
			
			String[] nombreColumnas = {"Jugador", "Ganadas", "Perdidas", "Acertadas"};	//(2) Array con los nombres de las columnas
			modeloTabla = new ModeloNoEditable(nombreColumnas, 0);	//(2) Creamos el modelo (modeloTabla), con 0 filas
			tablaEstadisticas = new JTable(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
				},
				new String[] {
					"Jugador", "Ganadas", "Perdidas", "Acertadas"
				}
			) {
				private static final long serialVersionUID = 1L;
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			tablaEstadisticas.setRowSelectionAllowed(false);

			tablaEstadisticas.setSelectionBackground(UIManager.getColor("Button.darkShadow"));
			tablaEstadisticas.setRequestFocusEnabled(false);
			tablaEstadisticas.setSelectionForeground(new Color(255, 255, 255));
			tablaEstadisticas.setFont(new Font("HelvNueDemi", Font.PLAIN, 13));
			tablaEstadisticas.setFocusable(false);
			tablaEstadisticas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			tablaEstadisticas.setBorder(new EmptyBorder(0, 5, 0, 0));
			tablaEstadisticas.setCellSelectionEnabled(false);
			
			//tablaEstadisticas.setIntercellSpacing(new Dimension(10,0));
			
			tablaEstadisticas.setRowHeight(20); //incrementa el alto de la fila
			tablaEstadisticas.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(200);  //Modifica el ancho de la columna 1
			tablaEstadisticas.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(70);  //Modifica el ancho de la columna 2
			tablaEstadisticas.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(70);  //Modifica el ancho de la columna 3
			tablaEstadisticas.getTableHeader().getColumnModel().getColumn(3).setPreferredWidth(70);  //Modifica el ancho de la columna 4
			
			tablaEstadisticas.getTableHeader().setReorderingAllowed(false); 		// Impedir que se entercambien entre sí

//			añadirFilas(); //Pintar contenido en la tabla.			
		}
		return tablaEstadisticas;
	}
	
//	private void añadirFilas() { 
//		Object[] nuevaFila = new Object[6];
//		java.util.List<Jugador> jugadores = juego.getJugadores();
//		for (Jugador j:jugadores) {
//			nuevaFila[0] = new Integer(j.getCampo1());
//			nuevaFila[1] = new Integer(j.getCampo2());
//			nuevaFila[2] = new Integer(j.getCampo3());
//			nuevaFila[3] = new Integer(j.getCampo4());
//			modeloTabla.addRow(nuevaFila);
//		}
//	}
}

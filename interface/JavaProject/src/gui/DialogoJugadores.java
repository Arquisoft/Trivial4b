package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Dimension;

import javax.swing.ImageIcon;

import java.awt.Cursor;
import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DialogoJugadores extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private final JPanel panelPrincipal = new JPanel();
	private JButton btnComenzar2;
	private JLabel lblQuesitoRo;
	private JLabel lblQuesitoVe;
	private JLabel lblQuesitoAm;
	private JLabel lblQuesitoAz;
	private JTextField txtJug1Nombre;
	private JTextField txtJug2Nombre;
	private JTextField txtJug3Nombre;
	private JTextField txtJug4Nombre;
	private JLabel lblJug1Nuevo;
	private JLabel lblJug2Nuevo;
	private JLabel lblJug3Nuevo;
	private JLabel lblJug4Nuevo;
	private JLabel lblJug1Existente;
	private JLabel lblJug2Existente;
	private JLabel lblJug3Existente;
	private JLabel lblJug4Existente;
	private JComboBox<String> cbxJug1Nombre;
	private JComboBox<String> cbxJug2Nombre;
	private JComboBox<String> cbxJug3Nombre;
	private JComboBox<String> cbxJug4Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoJugadores dialog = new DialogoJugadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoJugadores() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoJugadores.class.getResource("/img/ico_32x32_jugadores.png")));
		setTitle("Selecci\u00F3n de Jugadores");
		getContentPane().setBounds(new Rectangle(0, 0, 480, 443));
		setBounds(100, 100, 498, 491);
		getContentPane().setLayout(null);
		panelPrincipal.setPreferredSize(new Dimension(480, 443));
		panelPrincipal.setMinimumSize(new Dimension(480, 443));
		panelPrincipal.setMaximumSize(new Dimension(480, 443));
		panelPrincipal.setBounds(new Rectangle(0, 0, 480, 443));
		panelPrincipal.setBackground(new Color(0, 55, 76));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.add(getBtnComenzar2());
		panelPrincipal.add(getLblQuesitoRo());
		panelPrincipal.add(getLblJug1Nuevo());
		panelPrincipal.add(getTxtJug1Nombre());
		panelPrincipal.add(getLblJug1Existente());
		panelPrincipal.add(getCbxJug1Nombre());
		panelPrincipal.add(getLblQuesitoVe());
		panelPrincipal.add(getLblJug2Nuevo());
		panelPrincipal.add(getTxtJug2Nombre());
		panelPrincipal.add(getLblJug2Existente());
		panelPrincipal.add(getCbxJug2Nombre());
		panelPrincipal.add(getLblQuesitoAm());
		panelPrincipal.add(getLblJug3Nuevo());
		panelPrincipal.add(getTxtJug3Nombre());
		panelPrincipal.add(getLblJug3Existente());
		panelPrincipal.add(getCbxJug3Nombre());
		panelPrincipal.add(getLblQuesitoAz());
		panelPrincipal.add(getLblJug4Nuevo());
		panelPrincipal.add(getTxtJug4Nombre());
		panelPrincipal.add(getLblJug4Existente());
		panelPrincipal.add(getCbxJug4Nombre());
	}
	private JButton getBtnComenzar2() {
		if (btnComenzar2 == null) {
			btnComenzar2 = new JButton("Comenzar");
			btnComenzar2.setRolloverIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/Mensaje_over.png")));
			btnComenzar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//					((CardLayout)pnContenido.getLayout()).show(pnContenido,"name_9358627801380");
				}
			});
			btnComenzar2.setRequestFocusEnabled(false);
			btnComenzar2.setPreferredSize(new Dimension(245, 43));
			btnComenzar2.setMinimumSize(new Dimension(245, 43));
			btnComenzar2.setMaximumSize(new Dimension(245, 43));
			btnComenzar2.setMargin(new Insets(0, 0, 0, 0));
			btnComenzar2.setHorizontalTextPosition(SwingConstants.CENTER);
			btnComenzar2.setForeground(Color.BLACK);
			btnComenzar2.setFont(new Font("Arial", Font.PLAIN, 20));
			btnComenzar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnComenzar2.setContentAreaFilled(false);
			btnComenzar2.setBorder(null);
			btnComenzar2.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/Mensaje.png")));
			btnComenzar2.setBounds(108, 366, 245, 43);
		}
		return btnComenzar2;
	}
	private JLabel getLblQuesitoRo() {
		if (lblQuesitoRo == null) {
			lblQuesitoRo = new JLabel("");
			lblQuesitoRo.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaRo_00_00_00_00.png")));
			lblQuesitoRo.setBounds(41, 36, 55, 55);
		}
		return lblQuesitoRo;
	}
	private JLabel getLblQuesitoVe() {
		if (lblQuesitoVe == null) {
			lblQuesitoVe = new JLabel("");
			lblQuesitoVe.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaVe_00_00_00_00.png")));
			lblQuesitoVe.setBounds(41, 117, 55, 55);
		}
		return lblQuesitoVe;
	}
	private JLabel getLblQuesitoAm() {
		if (lblQuesitoAm == null) {
			lblQuesitoAm = new JLabel("");
			lblQuesitoAm.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaAm_00_00_00.png")));
			lblQuesitoAm.setBounds(41, 198, 55, 55);
		}
		return lblQuesitoAm;
	}
	private JLabel getLblQuesitoAz() {
		if (lblQuesitoAz == null) {
			lblQuesitoAz = new JLabel("");
			lblQuesitoAz.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			lblQuesitoAz.setBounds(41, 280, 55, 55);
		}
		return lblQuesitoAz;
	}
	private JTextField getTxtJug1Nombre() {
		if (txtJug1Nombre == null) {
			txtJug1Nombre = new JTextField();
			txtJug1Nombre.setMargin(new Insets(0, 0, 0, 0));
			txtJug1Nombre.setBorder(new EmptyBorder(0, 5, 0, 0));
			txtJug1Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			txtJug1Nombre.setBounds(108, 55, 150, 29);
			txtJug1Nombre.setColumns(10);
		}
		return txtJug1Nombre;
	}
	private JTextField getTxtJug2Nombre() {
		if (txtJug2Nombre == null) {
			txtJug2Nombre = new JTextField();
			txtJug2Nombre.setMargin(new Insets(0, 0, 0, 0));
			txtJug2Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			txtJug2Nombre.setColumns(10);
			txtJug2Nombre.setBorder(new EmptyBorder(0, 5, 0, 0));
			txtJug2Nombre.setBounds(108, 137, 150, 29);
		}
		return txtJug2Nombre;
	}
	private JTextField getTxtJug3Nombre() {
		if (txtJug3Nombre == null) {
			txtJug3Nombre = new JTextField();
			txtJug3Nombre.setMargin(new Insets(0, 0, 0, 0));
			txtJug3Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			txtJug3Nombre.setColumns(10);
			txtJug3Nombre.setBorder(new EmptyBorder(0, 5, 0, 0));
			txtJug3Nombre.setBounds(108, 218, 150, 29);
		}
		return txtJug3Nombre;
	}
	private JTextField getTxtJug4Nombre() {
		if (txtJug4Nombre == null) {
			txtJug4Nombre = new JTextField();
			txtJug4Nombre.setMargin(new Insets(0, 0, 0, 0));
			txtJug4Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			txtJug4Nombre.setColumns(10);
			txtJug4Nombre.setBorder(new EmptyBorder(0, 5, 0, 0));
			txtJug4Nombre.setBounds(108, 300, 150, 29);
		}
		return txtJug4Nombre;
	}
	private JLabel getLblJug1Nuevo() {
		if (lblJug1Nuevo == null) {
			lblJug1Nuevo = new JLabel("Nuevo");
			lblJug1Nuevo.setForeground(Color.WHITE);
			lblJug1Nuevo.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug1Nuevo.setBounds(108, 31, 56, 16);
		}
		return lblJug1Nuevo;
	}
	private JLabel getLblJug2Nuevo() {
		if (lblJug2Nuevo == null) {
			lblJug2Nuevo = new JLabel("Nuevo");
			lblJug2Nuevo.setForeground(Color.WHITE);
			lblJug2Nuevo.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug2Nuevo.setBounds(108, 113, 56, 16);
		}
		return lblJug2Nuevo;
	}
	private JLabel getLblJug3Nuevo() {
		if (lblJug3Nuevo == null) {
			lblJug3Nuevo = new JLabel("Nuevo");
			lblJug3Nuevo.setForeground(Color.WHITE);
			lblJug3Nuevo.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug3Nuevo.setBounds(108, 194, 56, 16);
		}
		return lblJug3Nuevo;
	}
	private JLabel getLblJug4Nuevo() {
		if (lblJug4Nuevo == null) {
			lblJug4Nuevo = new JLabel("Nuevo");
			lblJug4Nuevo.setForeground(Color.WHITE);
			lblJug4Nuevo.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug4Nuevo.setBounds(108, 276, 56, 16);
		}
		return lblJug4Nuevo;
	}
	private JLabel getLblJug1Existente() {
		if (lblJug1Existente == null) {
			lblJug1Existente = new JLabel("Existente");
			lblJug1Existente.setForeground(Color.WHITE);
			lblJug1Existente.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug1Existente.setBounds(279, 31, 90, 16);
		}
		return lblJug1Existente;
	}
	private JLabel getLblJug2Existente() {
		if (lblJug2Existente == null) {
			lblJug2Existente = new JLabel("Existente");
			lblJug2Existente.setForeground(Color.WHITE);
			lblJug2Existente.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug2Existente.setBounds(279, 114, 90, 16);
		}
		return lblJug2Existente;
	}
	private JLabel getLblJug3Existente() {
		if (lblJug3Existente == null) {
			lblJug3Existente = new JLabel("Existente");
			lblJug3Existente.setForeground(Color.WHITE);
			lblJug3Existente.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug3Existente.setBounds(279, 195, 90, 16);
		}
		return lblJug3Existente;
	}
	private JLabel getLblJug4Existente() {
		if (lblJug4Existente == null) {
			lblJug4Existente = new JLabel("Existente");
			lblJug4Existente.setForeground(Color.WHITE);
			lblJug4Existente.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug4Existente.setBounds(279, 277, 90, 16);
		}
		return lblJug4Existente;
	}
	private JComboBox<String> getCbxJug1Nombre() {
		if (cbxJug1Nombre == null) {
			cbxJug1Nombre = new JComboBox<String>();
			cbxJug1Nombre.setBorder(null);
			cbxJug1Nombre.setModel(new DefaultComboBoxModel<String>(new String[] {"seleccionar", "NombreJugador1", "NombreJugador2"}));
			cbxJug1Nombre.setBackground(Color.WHITE);
			cbxJug1Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			cbxJug1Nombre.setBounds(272, 55, 150, 29);
		}
		return cbxJug1Nombre;
	}
	private JComboBox<String> getCbxJug2Nombre() {
		if (cbxJug2Nombre == null) {
			cbxJug2Nombre = new JComboBox<String>();
			cbxJug2Nombre.setModel(new DefaultComboBoxModel<String>(new String[] {"seleccionar", "NombreJugador1", "NombreJugador2"}));
			cbxJug2Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			cbxJug2Nombre.setBorder(null);
			cbxJug2Nombre.setBackground(Color.WHITE);
			cbxJug2Nombre.setBounds(272, 137, 150, 29);
		}
		return cbxJug2Nombre;
	}
	private JComboBox<String> getCbxJug3Nombre() {
		if (cbxJug3Nombre == null) {
			cbxJug3Nombre = new JComboBox<String>();
			cbxJug3Nombre.setModel(new DefaultComboBoxModel<String>(new String[] {"seleccionar", "NombreJugador1", "NombreJugador2"}));
			cbxJug3Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			cbxJug3Nombre.setBorder(null);
			cbxJug3Nombre.setBackground(Color.WHITE);
			cbxJug3Nombre.setBounds(272, 218, 150, 29);
		}
		return cbxJug3Nombre;
	}
	private JComboBox<String> getCbxJug4Nombre() {
		if (cbxJug4Nombre == null) {
			cbxJug4Nombre = new JComboBox<String>();
			cbxJug4Nombre.setModel(new DefaultComboBoxModel<String>(new String[] {"seleccionar", "NombreJugador1", "NombreJugador2"}));
			cbxJug4Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			cbxJug4Nombre.setBorder(null);
			cbxJug4Nombre.setBackground(Color.WHITE);
			cbxJug4Nombre.setBounds(272, 300, 150, 29);
		}
		return cbxJug4Nombre;
	}
}

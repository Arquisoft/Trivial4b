package es.uniovi.asw.trivial.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DialogoAjustes extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private final JPanel panelPrincipal = new JPanel();
	private JComboBox<String> cbxEstilo;
	private JLabel lblEstilo;
	private JCheckBox chkGanarQuesito;
	private JLabel lblQuesitos;
	private JComboBox<String> cbxQuesitos;
	private JButton btnGuardar;

	/*
	public static void main(String[] args) {
		try {
			DialogoAjustes dialog = new DialogoAjustes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	

	/**
	 * Create the dialog.
	 */
	public DialogoAjustes() {
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoAjustes.class.getResource("/img/ico_32x32_ajustes.png")));
		setTitle("Ajustes del Juego");
		getContentPane().setBounds(new Rectangle(0, 0, 480, 443));
		setBounds(100, 100, 482, 361);
		getContentPane().setLayout(null);
		panelPrincipal.setPreferredSize(new Dimension(480, 443));
		panelPrincipal.setMinimumSize(new Dimension(480, 443));
		panelPrincipal.setMaximumSize(new Dimension(480, 443));
		panelPrincipal.setBounds(new Rectangle(0, 0, 480, 329));
		panelPrincipal.setBackground(new Color(0, 55, 76));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.add(getLblEstilo());
		panelPrincipal.add(getCbxEstilo());
		panelPrincipal.add(getChkGanarQuesito());
		panelPrincipal.add(getLblQuesitos());
		panelPrincipal.add(getCbxQuesitos());
		panelPrincipal.add(getBtnGuardar());
	}
	
	private JComboBox<String> getCbxEstilo() {
		if (cbxEstilo == null) {
			cbxEstilo = new JComboBox<String>();
			cbxEstilo.setModel(new DefaultComboBoxModel<String>(new String[] {"Tradicional", "Moderno"}));
			cbxEstilo.setFont(new Font("Arial", Font.PLAIN, 17));
			cbxEstilo.setBorder(new EmptyBorder(0, 0, 0, 0));
			cbxEstilo.setBackground(Color.WHITE);
			cbxEstilo.setBounds(35, 54, 150, 29);
		}
		return cbxEstilo;
	}
	private JLabel getLblEstilo() {
		if (lblEstilo == null) {
			lblEstilo = new JLabel("Estilo del Tablero");
			lblEstilo.setForeground(Color.WHITE);
			lblEstilo.setFont(new Font("Arial", Font.PLAIN, 18));
			lblEstilo.setBounds(35, 30, 150, 20);
		}
		return lblEstilo;
	}
	private JCheckBox getChkGanarQuesito() {
		if (chkGanarQuesito == null) {
			chkGanarQuesito = new JCheckBox(" Ganar quesito en cualquier casila");
			chkGanarQuesito.setForeground(Color.WHITE);
			chkGanarQuesito.setFont(new Font("Arial", Font.PLAIN, 18));
			chkGanarQuesito.setContentAreaFilled(false);
			chkGanarQuesito.setBorder(new EmptyBorder(0, 0, 0, 0));
			chkGanarQuesito.setBounds(35, 108, 409, 25);
		}
		return chkGanarQuesito;
	}
	private JLabel getLblQuesitos() {
		if (lblQuesitos == null) {
			lblQuesitos = new JLabel("Quesitos para ganar");
			lblQuesitos.setForeground(Color.WHITE);
			lblQuesitos.setFont(new Font("Arial", Font.PLAIN, 18));
			lblQuesitos.setBounds(35, 155, 174, 20);
		}
		return lblQuesitos;
	}
	private JComboBox<String> getCbxQuesitos() {
		if (cbxQuesitos == null) {
			cbxQuesitos = new JComboBox<String>();
			cbxQuesitos.setModel(new DefaultComboBoxModel<String>(new String[] {"4", "3", "2", "1"}));
			cbxQuesitos.setFont(new Font("Arial", Font.PLAIN, 17));
			cbxQuesitos.setBorder(null);
			cbxQuesitos.setBackground(Color.WHITE);
			cbxQuesitos.setBounds(35, 180, 150, 29);
		}
		return cbxQuesitos;
	}
	private JButton getBtnGuardar() {
		if (btnGuardar == null) {
			btnGuardar = new JButton("Guardar");
			btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGuardar.setRolloverIcon(new ImageIcon(DialogoAjustes.class.getResource("/img/Mensaje_over.png")));
			btnGuardar.setIcon(new ImageIcon(DialogoAjustes.class.getResource("/img/Mensaje.png")));
			btnGuardar.setRequestFocusEnabled(false);
			btnGuardar.setPreferredSize(new Dimension(245, 43));
			btnGuardar.setMinimumSize(new Dimension(245, 43));
			btnGuardar.setMaximumSize(new Dimension(245, 43));
			btnGuardar.setMargin(new Insets(0, 0, 0, 0));
			btnGuardar.setHorizontalTextPosition(SwingConstants.CENTER);
			btnGuardar.setForeground(Color.BLACK);
			btnGuardar.setFont(new Font("Arial", Font.PLAIN, 20));
			btnGuardar.setContentAreaFilled(false);
			btnGuardar.setBorder(null);
			btnGuardar.setBounds(111, 247, 245, 43);
		}
		return btnGuardar;
	}
}

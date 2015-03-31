package es.uniovi.asw.trivial.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
	private JLabel lblJug1Contras;
	private JPasswordField pswJug1;
	private JPasswordField pswJug2;
	private JPasswordField pswJug3;
	private JPasswordField pswJug4;
	private JLabel lblJug2Contras;
	private JLabel lblJug3Contras;
	private JLabel lblJug4Contras;

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
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoJugadores.class.getResource("/img/ico_32x32_jugadores.png")));
		setTitle("Selecci\u00F3n de Jugadores");
		getContentPane().setBounds(new Rectangle(0, 0, 480, 443));
		setBounds(100, 100, 621, 476);
		getContentPane().setLayout(null);
		panelPrincipal.setPreferredSize(new Dimension(480, 443));
		panelPrincipal.setMinimumSize(new Dimension(480, 443));
		panelPrincipal.setMaximumSize(new Dimension(480, 443));
		panelPrincipal.setBounds(new Rectangle(0, 0, 615, 443));
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
		panelPrincipal.add(getLblJug1Contras());
		panelPrincipal.add(getPswJug1());
		panelPrincipal.add(getLblQuesitoVe());
		panelPrincipal.add(getLblJug2Nuevo());
		panelPrincipal.add(getTxtJug2Nombre());
		panelPrincipal.add(getLblJug2Existente());
		panelPrincipal.add(getCbxJug2Nombre());
		panelPrincipal.add(getLblJug2Contras());
		panelPrincipal.add(getPswJug2());
		panelPrincipal.add(getLblQuesitoAm());
		panelPrincipal.add(getLblJug3Nuevo());
		panelPrincipal.add(getTxtJug3Nombre());
		panelPrincipal.add(getLblJug3Existente());
		panelPrincipal.add(getCbxJug3Nombre());
		panelPrincipal.add(getLblJug3Contras());
		panelPrincipal.add(getPswJug3());
		panelPrincipal.add(getLblQuesitoAz());
		panelPrincipal.add(getLblJug4Nuevo());
		panelPrincipal.add(getTxtJug4Nombre());
		panelPrincipal.add(getLblJug4Existente());
		panelPrincipal.add(getCbxJug4Nombre());
		panelPrincipal.add(getLblJug4Contras());
		panelPrincipal.add(getPswJug4());
	}
	private JButton getBtnComenzar2() {
		if (btnComenzar2 == null) {
			btnComenzar2 = new JButton("Comenzar");
			btnComenzar2.setRolloverIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/Mensaje_over.png")));
			btnComenzar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//					((CardLayout)pnContenido.getLayout()).show(pnContenido,"name_9358627801380");
					if (!txtJug1Nombre.getText().equals(" ")) {
						//Crear usuario1 en la base de datos, crear usuario1 en memoria.
					}
					
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
			btnComenzar2.setBounds(183, 367, 245, 43);
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
			lblJug1Existente.setBounds(272, 31, 90, 16);
		}
		return lblJug1Existente;
	}
	private JLabel getLblJug2Existente() {
		if (lblJug2Existente == null) {
			lblJug2Existente = new JLabel("Existente");
			lblJug2Existente.setForeground(Color.WHITE);
			lblJug2Existente.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug2Existente.setBounds(272, 117, 90, 16);
		}
		return lblJug2Existente;
	}
	private JLabel getLblJug3Existente() {
		if (lblJug3Existente == null) {
			lblJug3Existente = new JLabel("Existente");
			lblJug3Existente.setForeground(Color.WHITE);
			lblJug3Existente.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug3Existente.setBounds(272, 194, 90, 16);
		}
		return lblJug3Existente;
	}
	private JLabel getLblJug4Existente() {
		if (lblJug4Existente == null) {
			lblJug4Existente = new JLabel("Existente");
			lblJug4Existente.setForeground(Color.WHITE);
			lblJug4Existente.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug4Existente.setBounds(272, 276, 90, 16);
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
	private JLabel getLblJug1Contras() {
		if (lblJug1Contras == null) {
			lblJug1Contras = new JLabel("Contrase\u00F1a");
			lblJug1Contras.setForeground(Color.WHITE);
			lblJug1Contras.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug1Contras.setBounds(434, 32, 115, 16);
		}
		return lblJug1Contras;
	}
	private JPasswordField getPswJug1() {
		if (pswJug1 == null) {
			pswJug1 = new JPasswordField();
			pswJug1.setFont(new Font("Arial", Font.PLAIN, 17));
			pswJug1.setBorder(new EmptyBorder(0, 0, 0, 0));
			pswJug1.setBounds(434, 55, 150, 29);
		}
		return pswJug1;
	}
	private JPasswordField getPswJug2() {
		if (pswJug2 == null) {
			pswJug2 = new JPasswordField();
			pswJug2.setFont(new Font("Arial", Font.PLAIN, 17));
			pswJug2.setBorder(new EmptyBorder(0, 0, 0, 0));
			pswJug2.setBounds(434, 137, 150, 29);
		}
		return pswJug2;
	}
	private JPasswordField getPswJug3() {
		if (pswJug3 == null) {
			pswJug3 = new JPasswordField();
			pswJug3.setFont(new Font("Arial", Font.PLAIN, 17));
			pswJug3.setBorder(new EmptyBorder(0, 0, 0, 0));
			pswJug3.setBounds(434, 218, 150, 29);
		}
		return pswJug3;
	}
	private JPasswordField getPswJug4() {
		if (pswJug4 == null) {
			pswJug4 = new JPasswordField();
			pswJug4.setFont(new Font("Arial", Font.PLAIN, 17));
			pswJug4.setBorder(new EmptyBorder(0, 0, 0, 0));
			pswJug4.setBounds(434, 300, 150, 29);
		}
		return pswJug4;
	}
	private JLabel getLblJug2Contras() {
		if (lblJug2Contras == null) {
			lblJug2Contras = new JLabel("Contrase\u00F1a");
			lblJug2Contras.setForeground(Color.WHITE);
			lblJug2Contras.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug2Contras.setBounds(434, 114, 115, 16);
		}
		return lblJug2Contras;
	}
	private JLabel getLblJug3Contras() {
		if (lblJug3Contras == null) {
			lblJug3Contras = new JLabel("Contrase\u00F1a");
			lblJug3Contras.setForeground(Color.WHITE);
			lblJug3Contras.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug3Contras.setBounds(434, 195, 115, 16);
		}
		return lblJug3Contras;
	}
	private JLabel getLblJug4Contras() {
		if (lblJug4Contras == null) {
			lblJug4Contras = new JLabel("Contrase\u00F1a");
			lblJug4Contras.setForeground(Color.WHITE);
			lblJug4Contras.setFont(new Font("Arial", Font.PLAIN, 18));
			lblJug4Contras.setBounds(434, 277, 115, 16);
		}
		return lblJug4Contras;
	}
}

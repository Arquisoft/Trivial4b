package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
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

public class DialogoJugadores extends JDialog {

	private final JPanel panelPrincipal = new JPanel();
	private JButton btnComenzar2;
	private JLabel lblQuesitoRo;
	private JLabel lblQuesitoVe;
	private JLabel lblQuesitoAm;
	private JLabel lblQuesitoAz;

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
		panelPrincipal.add(getLblQuesitoVe());
		panelPrincipal.add(getLblQuesitoAm());
		panelPrincipal.add(getLblQuesitoAz());
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
}

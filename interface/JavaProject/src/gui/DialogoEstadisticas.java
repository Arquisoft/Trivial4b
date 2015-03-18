package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DialogoEstadisticas extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;

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
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Estad\u00EDsticas de Jugadores");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoEstadisticas.class.getResource("/img/ico_32x32_estadisticas.png")));
		setBounds(100, 100, 498, 491);
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
		}
		return panelPrincipal;
	}
}

package es.uniovi.asw.trivial.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DialogoAcercade extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private final JPanel panelPrincipal = new JPanel();
	private JLabel lblLogo;
	private JLabel lblEquipo;
	private JLabel lblEquipo01;
	private JLabel lblEquipo02;
	private JLabel lblEquipo03;
	private JLabel lblEquipo04;
	private JLabel lblEquipo05;
	private JLabel lblEquipo06;
	private JLabel lblEquipo07;
	private JLabel lblProyecto;
	private JLabel lblLink;

	
	/*
	public static void main(String[] args) {
		try {
			DialogoAcercade dialog = new DialogoAcercade();
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
	public DialogoAcercade() {
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoAcercade.class.getResource("/img/ico_32x32_acercade.png")));
		setTitle("Aceca de Trivial4b");
		getContentPane().setBounds(new Rectangle(0, 0, 480, 443));
		setBounds(100, 100, 484, 477);
		getContentPane().setLayout(null);
		panelPrincipal.setPreferredSize(new Dimension(480, 443));
		panelPrincipal.setMinimumSize(new Dimension(480, 443));
		panelPrincipal.setMaximumSize(new Dimension(480, 443));
		panelPrincipal.setBounds(new Rectangle(0, 0, 480, 443));
		panelPrincipal.setBackground(Color.WHITE);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.add(getLblLogo());
		panelPrincipal.add(getLblEquipo());
		panelPrincipal.add(getLblEquipo01());
		panelPrincipal.add(getLblEquipo02());
		panelPrincipal.add(getLblEquipo03());
		panelPrincipal.add(getLblEquipo04());
		panelPrincipal.add(getLblEquipo05());
		panelPrincipal.add(getLblEquipo06());
		panelPrincipal.add(getLabel_1());
		panelPrincipal.add(getLabel_2());
		panelPrincipal.add(getLblLink());
	}
	private JLabel getLblLogo() {
		if (lblLogo == null) {
			lblLogo = new JLabel("New label");
			lblLogo.setIcon(new ImageIcon(DialogoAcercade.class.getResource("/img/Acercade_Logo.png")));
			lblLogo.setBounds(0, 0, 480, 183);
		}
		return lblLogo;
	}
	private JLabel getLblEquipo() {
		if (lblEquipo == null) {
			lblEquipo = new JLabel("Equipo Trivial4b");
			lblEquipo.setFont(new Font("Arial", Font.BOLD, 16));
			lblEquipo.setBounds(36, 198, 170, 32);
		}
		return lblEquipo;
	}
	private JLabel getLblEquipo01() {
		if (lblEquipo01 == null) {
			lblEquipo01 = new JLabel("Sergio Rodr\u00EDguez P\u00E9rez");
			lblEquipo01.setFont(new Font("Arial", Font.PLAIN, 16));
			lblEquipo01.setBounds(36, 223, 220, 30);
		}
		return lblEquipo01;
	}
	private JLabel getLblEquipo02() {
		if (lblEquipo02 == null) {
			lblEquipo02 = new JLabel("\u00C1ngela Su\u00E1rez Alonso");
			lblEquipo02.setFont(new Font("Arial", Font.PLAIN, 16));
			lblEquipo02.setBounds(36, 243, 220, 30);
		}
		return lblEquipo02;
	}
	private JLabel getLblEquipo03() {
		if (lblEquipo03 == null) {
			lblEquipo03 = new JLabel("Andr\u00E9s Sampedro Gimeno");
			lblEquipo03.setFont(new Font("Arial", Font.PLAIN, 16));
			lblEquipo03.setBounds(36, 263, 220, 30);
		}
		return lblEquipo03;
	}
	private JLabel getLblEquipo04() {
		if (lblEquipo04 == null) {
			lblEquipo04 = new JLabel("Carlos Alperi Meana");
			lblEquipo04.setFont(new Font("Arial", Font.PLAIN, 16));
			lblEquipo04.setBounds(36, 283, 220, 30);
		}
		return lblEquipo04;
	}
	private JLabel getLblEquipo05() {
		if (lblEquipo05 == null) {
			lblEquipo05 = new JLabel("Joaqu\u00EDn Garc\u00EDa Mu\u00F1iz");
			lblEquipo05.setFont(new Font("Arial", Font.PLAIN, 16));
			lblEquipo05.setBounds(36, 303, 220, 30);
		}
		return lblEquipo05;
	}
	private JLabel getLblEquipo06() {
		if (lblEquipo06 == null) {
			lblEquipo06 = new JLabel("Sergio Fern\u00E1ndez Celorio");
			lblEquipo06.setFont(new Font("Arial", Font.PLAIN, 16));
			lblEquipo06.setBounds(36, 323, 220, 30);
		}
		return lblEquipo06;
	}
	private JLabel getLabel_1() {
		if (lblEquipo07 == null) {
			lblEquipo07 = new JLabel("Natalia Negri");
			lblEquipo07.setFont(new Font("Arial", Font.PLAIN, 16));
			lblEquipo07.setBounds(36, 343, 220, 30);
		}
		return lblEquipo07;
	}
	private JLabel getLabel_2() {
		if (lblProyecto == null) {
			lblProyecto = new JLabel("Proyecto TrivialArquisoft de ASW 2014/15 ");
			lblProyecto.setFont(new Font("Arial", Font.PLAIN, 16));
			lblProyecto.setBounds(36, 375, 311, 30);
		}
		return lblProyecto;
	}
	private JLabel getLblLink() {
		if (lblLink == null) {
			lblLink = new JLabel("https://github.com/Arquisoft/Trivial4b/");
			lblLink.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					try {
				         String url = "https://github.com/Arquisoft/Trivial4b/";
				         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				       }
				       catch (java.io.IOException e) {
				           System.out.println(e.getMessage());
				       }
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					lblLink.setForeground(Color.BLACK);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					lblLink.setForeground(SystemColor.textHighlight);
				}
			});
			lblLink.setForeground(SystemColor.textHighlight);
			lblLink.setFont(new Font("Arial", Font.PLAIN, 16));
			lblLink.setBounds(36, 398, 311, 30);
		}
		return lblLink;
	}
}

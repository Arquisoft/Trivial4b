package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Insets;
import java.awt.Cursor;

import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.CardLayout;

import javax.swing.JLabel;

import java.awt.Rectangle;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JSeparator separator;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JSeparator separator_1;
	private JPanel pnContenido;
	private JPanel panel0;
	private JPanel panel1;
	private JLabel lblFondoInicio;
	private JButton btnComenzar;
	private JLabel lblFondoPcpal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Trivial Arquisoft4b");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 759);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMenuBar_1());
		contentPane.add(getPnContenido());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 1004, 30);
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Juego");
			mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 15));
			mnNewMenu.setMnemonic('j');
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getSeparator());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Ayuda");
			mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 15));
			mnNewMenu_1.setMnemonic('a');
			mnNewMenu_1.add(getMntmNewMenuItem_3());
			mnNewMenu_1.add(getSeparator_1());
			mnNewMenu_1.add(getMntmNewMenuItem_4());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Nueva partida");
			mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
			mntmNewMenuItem.setMnemonic('n');
			mntmNewMenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem.setContentAreaFilled(false);
			mntmNewMenuItem.setBorder(new EmptyBorder(0, 0, 0, 0));
			mntmNewMenuItem.setMargin(new Insets(5, 5, 5, 5));
			mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Nueva.png")));
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Estad\u00EDsticas");
			mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
			mntmNewMenuItem_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Acerca.png")));
			mntmNewMenuItem_1.setMnemonic('e');
			mntmNewMenuItem_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_1.setContentAreaFilled(false);
			mntmNewMenuItem_1.setBorder(new EmptyBorder(0, 0, 0, 0));
			mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_1.setMargin(new Insets(5, 5, 5, 5));
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("Salir");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
			mntmNewMenuItem_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_2.setContentAreaFilled(false);
			mntmNewMenuItem_2.setBorder(new EmptyBorder(0, 0, 0, 0));
			mntmNewMenuItem_2.setMnemonic('s');
			mntmNewMenuItem_2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Salir.png")));
			mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_2.setMargin(new Insets(5, 5, 5, 5));
		}
		return mntmNewMenuItem_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("Ayuda");
			mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
			mntmNewMenuItem_3.setMnemonic('y');
			mntmNewMenuItem_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_3.setBorder(new EmptyBorder(0, 0, 0, 0));
			mntmNewMenuItem_3.setMargin(new Insets(5, 5, 5, 5));
			mntmNewMenuItem_3.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Ayuda.png")));
			mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 15));
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("Acerca de");
			mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_MASK));
			mntmNewMenuItem_4.setMnemonic('c');
			mntmNewMenuItem_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_4.setBorder(new EmptyBorder(0, 0, 0, 0));
			mntmNewMenuItem_4.setMargin(new Insets(5, 5, 5, 5));
			mntmNewMenuItem_4.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Acerca.png")));
			mntmNewMenuItem_4.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_4.setSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Acerca.png")));
		}
		return mntmNewMenuItem_4;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
		}
		return separator_1;
	}
	private JPanel getPnContenido() {
		if (pnContenido == null) {
			pnContenido = new JPanel();
			pnContenido.setBounds(0, 30, 1004, 682);
			pnContenido.setLayout(new CardLayout(0, 0));
			pnContenido.add(getPanel0(), "name_9290375085706");
			pnContenido.add(getPanel1(), "name_9358627801380");
		}
		return pnContenido;
	}
	private JPanel getPanel0() {
		if (panel0 == null) {
			panel0 = new JPanel();
			panel0.setBounds(new Rectangle(0, 0, 1004, 682));
			panel0.setLayout(null);
			panel0.add(getBtnComenzar());
			panel0.add(getLblFondoInicio());
		}
		return panel0;
	}
	private JPanel getPanel1() {
		if (panel1 == null) {
			panel1 = new JPanel();
			panel1.setBounds(new Rectangle(0, 0, 1004, 682));
			panel1.setLayout(null);
			panel1.add(getLblFondoPcpal());
		}
		return panel1;
	}
	private JLabel getLblFondoInicio() {
		if (lblFondoInicio == null) {
			lblFondoInicio = new JLabel("");
			lblFondoInicio.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Fondo_Inicio.png")));
			lblFondoInicio.setBounds(0, 0, 1004, 682);
		}
		return lblFondoInicio;
	}
	private JButton getBtnComenzar() {
		if (btnComenzar == null) {
			btnComenzar = new JButton("Comenzar");
			btnComenzar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					((CardLayout)pnContenido.getLayout()).show(pnContenido,"name_9358627801380");
				}
			});
			btnComenzar.setHorizontalTextPosition(SwingConstants.CENTER);
			btnComenzar.setForeground(Color.BLACK);
			btnComenzar.setPreferredSize(new Dimension(245, 43));
			btnComenzar.setMinimumSize(new Dimension(245, 43));
			btnComenzar.setMaximumSize(new Dimension(245, 43));
			btnComenzar.setRequestFocusEnabled(false);
			btnComenzar.setMargin(new Insets(0, 0, 0, 0));
			btnComenzar.setFont(new Font("Arial", Font.PLAIN, 20));
			btnComenzar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnComenzar.setBorder(null);
			btnComenzar.setContentAreaFilled(false);
			btnComenzar.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Mensaje_over.png")));
			btnComenzar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Mensaje.png")));
			btnComenzar.setBounds(380, 427, 245, 43);
		}
		return btnComenzar;
	}
	private JLabel getLblFondoPcpal() {
		if (lblFondoPcpal == null) {
			lblFondoPcpal = new JLabel("");
			lblFondoPcpal.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Fondo_Tablero.png")));
			lblFondoPcpal.setBounds(0, 0, 1004, 682);
		}
		return lblFondoPcpal;
	}
}

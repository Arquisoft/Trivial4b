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
import java.awt.Component;

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
	private JLabel lblJugador2;
	private JLabel lblJugador1;
	private JLabel lblJugador3;
	private JLabel lblJugador4;
	private JLabel lblQuesoRo;
	private JLabel lblQuesoVe;
	private JLabel lblQuesoAm;
	private JLabel lblQuesoAz;
	private JLabel lblJugador2Off;
	private JLabel lblJugador1Off;
	private JLabel lblJugador3Off;
	private JLabel lblJugador4Off;
	private JButton btnComenzar3;
	private JLabel lblDadoImg;
	private JMenu mnTemppruebas;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JLabel lblDadoTirada;
	private JLabel lblMensajes;
	private JButton btnCasilla01;
	private JButton btnCasilla02;
	private JButton btnCasilla03;
	private JButton btnCasilla04;
	private JButton btnCasilla05;
	private JButton btnCasilla06;
	private JButton btnCasilla07;
	private JButton btnCasilla08;
	private JButton btnCasilla09;
	private JButton btnCasilla10;
	private JButton btnCasilla11;
	private JButton btnCasilla12;
	private JButton btnCasilla13;
	private JButton btnCasilla14;
	private JButton btnCasilla15;
	private JButton btnCasilla16;
	private JButton btnCasilla17;
	private JButton btnCasilla18;
	private JButton btnCasilla19;
	private JButton btnCasilla20;
	private JButton btnCasilla21;
	private JButton btnCasilla22;
	private JButton btnCasilla23;
	private JButton btnCasilla24;
	private JButton btnCasilla25;
	private JButton btnCasilla26;
	private JButton btnCasilla27;
	private JButton btnCasilla28;
	private JButton btnCasilla29;
	private JButton btnCasilla30;
	private JButton btnCasilla31;
	private JButton btnCasilla32;
	private JButton btnCasilla33;
	private JButton btnCasilla34;
	private JButton btnCasilla35;
	private JButton btnCasilla36;
	private JButton btnCasilla37;
	private JButton btnCasilla38;
	private JButton btnCasilla39;
	private JButton btnCasilla40;
	private JButton btnCasilla41;
	private JButton btnCasilla42;
	private JButton btnCasilla43;
	private JButton btnCasilla44;
	private JButton btnCasilla45;

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
			menuBar.add(getMnTemppruebas());
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
			mntmNewMenuItem_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Estadisticas.png")));
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
			panel1.add(getLblDadoTirada());
			panel1.add(getLblMensajes());
			panel1.add(getLblDadoImg());
			panel1.add(getBtnComenzar3());
			panel1.add(getLblJugador1Off());
			panel1.add(getLblQuesoRo());
			panel1.add(getLblJugador1());
			panel1.add(getLblJugador2Off());
			panel1.add(getLblQuesoVe());
			panel1.add(getLblJugador2());
			panel1.add(getLblJugador3Off());
			panel1.add(getLblQuesoAm());
			panel1.add(getLblJugador3());
			panel1.add(getLblJugador4Off());
			panel1.add(getLblQuesoAz());
			panel1.add(getLblJugador4());
			panel1.add(getBtnCasilla01());
			panel1.add(getBtnCasilla02());
			panel1.add(getBtnCasilla03());
			panel1.add(getBtnCasilla04());
			panel1.add(getBtnCasilla05());
			panel1.add(getBtnCasilla06());
			panel1.add(getBtnCasilla07());
			panel1.add(getBtnCasilla08());
			panel1.add(getBtnCasilla09());
			panel1.add(getBtnCasilla10());
			panel1.add(getBtnCasilla11());
			panel1.add(getBtnCasilla12());
			panel1.add(getBtnCasilla13());
			panel1.add(getBtnCasilla14());
			panel1.add(getBtnCasilla15());
			panel1.add(getBtnCasilla16());
			panel1.add(getBtnCasilla17());
			panel1.add(getBtnCasilla18());
			panel1.add(getBtnCasilla19());
			panel1.add(getBtnCasilla20());
			panel1.add(getBtnCasilla21());
			panel1.add(getBtnCasilla22());
			panel1.add(getBtnCasilla23());
			panel1.add(getBtnCasilla24());
			panel1.add(getBtnCasilla25());
			panel1.add(getBtnCasilla26());
			panel1.add(getBtnCasilla27());
			panel1.add(getBtnCasilla28());
			panel1.add(getBtnCasilla29());
			panel1.add(getBtnCasilla30());
			panel1.add(getBtnCasilla31());
			panel1.add(getBtnCasilla32());
			panel1.add(getBtnCasilla33());
			panel1.add(getBtnCasilla34());
			panel1.add(getBtnCasilla35());
			panel1.add(getBtnCasilla36());
			panel1.add(getBtnCasilla37());
			panel1.add(getBtnCasilla38());
			panel1.add(getBtnCasilla39());
			panel1.add(getBtnCasilla40());
			panel1.add(getBtnCasilla41());
			panel1.add(getBtnCasilla42());
			panel1.add(getBtnCasilla43());
			panel1.add(getBtnCasilla44());
			panel1.add(getBtnCasilla45());
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
					
					// Mostrar Panel principal con tablero
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
	private JLabel getLblJugador2() {
		if (lblJugador2 == null) {
			lblJugador2 = new JLabel("Jugador 02");
			lblJugador2.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador2.setBorder(null);
			lblJugador2.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador2.setSize(new Dimension(221, 43));
			lblJugador2.setRequestFocusEnabled(false);
			lblJugador2.setFocusTraversalKeysEnabled(false);
			lblJugador2.setFocusable(false);
			lblJugador2.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador2.setForeground(new Color(222, 191, 40));
			lblJugador2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador.png")));
			lblJugador2.setBounds(84, 353, 221, 43);
		}
		return lblJugador2;
	}
	private JLabel getLblJugador1() {
		if (lblJugador1 == null) {
			lblJugador1 = new JLabel("Jugador 01");
			lblJugador1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador.png")));
			lblJugador1.setSize(new Dimension(221, 43));
			lblJugador1.setRequestFocusEnabled(false);
			lblJugador1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador1.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador1.setForeground(new Color(222, 191, 40));
			lblJugador1.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador1.setFocusable(false);
			lblJugador1.setFocusTraversalKeysEnabled(false);
			lblJugador1.setBorder(null);
			lblJugador1.setBounds(84, 266, 221, 43);
		}
		return lblJugador1;
	}
	private JLabel getLblJugador3() {
		if (lblJugador3 == null) {
			lblJugador3 = new JLabel("Jugador 03");
			lblJugador3.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador.png")));
			lblJugador3.setSize(new Dimension(221, 43));
			lblJugador3.setRequestFocusEnabled(false);
			lblJugador3.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador3.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador3.setForeground(new Color(222, 191, 40));
			lblJugador3.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador3.setFocusable(false);
			lblJugador3.setFocusTraversalKeysEnabled(false);
			lblJugador3.setBorder(null);
			lblJugador3.setBounds(84, 440, 221, 43);
		}
		return lblJugador3;
	}
	private JLabel getLblJugador4() {
		if (lblJugador4 == null) {
			lblJugador4 = new JLabel("Jugador 04");
			lblJugador4.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador.png")));
			lblJugador4.setSize(new Dimension(221, 43));
			lblJugador4.setRequestFocusEnabled(false);
			lblJugador4.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador4.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador4.setForeground(new Color(222, 191, 40));
			lblJugador4.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador4.setFocusable(false);
			lblJugador4.setFocusTraversalKeysEnabled(false);
			lblJugador4.setBorder(null);
			lblJugador4.setBounds(84, 527, 221, 43);
		}
		return lblJugador4;
	}
	private JLabel getLblQuesoRo() {
		if (lblQuesoRo == null) {
			lblQuesoRo = new JLabel("");
			lblQuesoRo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaRo.png")));
			lblQuesoRo.setSize(new Dimension(221, 43));
			lblQuesoRo.setRequestFocusEnabled(false);
			lblQuesoRo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblQuesoRo.setHorizontalAlignment(SwingConstants.CENTER);
			lblQuesoRo.setForeground(new Color(222, 191, 40));
			lblQuesoRo.setFont(new Font("Arial", Font.PLAIN, 20));
			lblQuesoRo.setFocusable(false);
			lblQuesoRo.setFocusTraversalKeysEnabled(false);
			lblQuesoRo.setBorder(null);
			lblQuesoRo.setBounds(57, 248, 80, 80);
		}
		return lblQuesoRo;
	}
	private JLabel getLblQuesoVe() {
		if (lblQuesoVe == null) {
			lblQuesoVe = new JLabel("");
			lblQuesoVe.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaVe.png")));
			lblQuesoVe.setSize(new Dimension(221, 43));
			lblQuesoVe.setRequestFocusEnabled(false);
			lblQuesoVe.setHorizontalTextPosition(SwingConstants.CENTER);
			lblQuesoVe.setHorizontalAlignment(SwingConstants.CENTER);
			lblQuesoVe.setForeground(new Color(222, 191, 40));
			lblQuesoVe.setFont(new Font("Arial", Font.PLAIN, 20));
			lblQuesoVe.setFocusable(false);
			lblQuesoVe.setFocusTraversalKeysEnabled(false);
			lblQuesoVe.setBorder(null);
			lblQuesoVe.setBounds(57, 335, 80, 80);
		}
		return lblQuesoVe;
	}
	private JLabel getLblQuesoAm() {
		if (lblQuesoAm == null) {
			lblQuesoAm = new JLabel("");
			lblQuesoAm.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaAm.png")));
			lblQuesoAm.setSize(new Dimension(221, 43));
			lblQuesoAm.setRequestFocusEnabled(false);
			lblQuesoAm.setHorizontalTextPosition(SwingConstants.CENTER);
			lblQuesoAm.setHorizontalAlignment(SwingConstants.CENTER);
			lblQuesoAm.setForeground(new Color(222, 191, 40));
			lblQuesoAm.setFont(new Font("Arial", Font.PLAIN, 20));
			lblQuesoAm.setFocusable(false);
			lblQuesoAm.setFocusTraversalKeysEnabled(false);
			lblQuesoAm.setBorder(null);
			lblQuesoAm.setBounds(57, 422, 80, 80);
		}
		return lblQuesoAm;
	}
	private JLabel getLblQuesoAz() {
		if (lblQuesoAz == null) {
			lblQuesoAz = new JLabel("");
			lblQuesoAz.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaAz.png")));
			lblQuesoAz.setSize(new Dimension(221, 43));
			lblQuesoAz.setRequestFocusEnabled(false);
			lblQuesoAz.setHorizontalTextPosition(SwingConstants.CENTER);
			lblQuesoAz.setHorizontalAlignment(SwingConstants.CENTER);
			lblQuesoAz.setForeground(new Color(222, 191, 40));
			lblQuesoAz.setFont(new Font("Arial", Font.PLAIN, 20));
			lblQuesoAz.setFocusable(false);
			lblQuesoAz.setFocusTraversalKeysEnabled(false);
			lblQuesoAz.setBorder(null);
			lblQuesoAz.setBounds(57, 509, 80, 80);
		}
		return lblQuesoAz;
	}
	private JLabel getLblJugador2Off() {
		if (lblJugador2Off == null) {
			lblJugador2Off = new JLabel("");
			lblJugador2Off.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador_off.png")));
			lblJugador2Off.setSize(new Dimension(221, 43));
			lblJugador2Off.setRequestFocusEnabled(false);
			lblJugador2Off.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador2Off.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador2Off.setForeground(new Color(222, 191, 40));
			lblJugador2Off.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador2Off.setFocusable(false);
			lblJugador2Off.setFocusTraversalKeysEnabled(false);
			lblJugador2Off.setBorder(null);
			lblJugador2Off.setBounds(51, 333, 254, 79);
		}
		return lblJugador2Off;
	}
	private JLabel getLblJugador1Off() {
		if (lblJugador1Off == null) {
			lblJugador1Off = new JLabel("");
			lblJugador1Off.setVisible(false);
			lblJugador1Off.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador_off.png")));
			lblJugador1Off.setSize(new Dimension(221, 43));
			lblJugador1Off.setRequestFocusEnabled(false);
			lblJugador1Off.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador1Off.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador1Off.setForeground(new Color(222, 191, 40));
			lblJugador1Off.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador1Off.setFocusable(false);
			lblJugador1Off.setFocusTraversalKeysEnabled(false);
			lblJugador1Off.setBorder(null);
			lblJugador1Off.setBounds(51, 244, 254, 79);
		}
		return lblJugador1Off;
	}
	private JLabel getLblJugador3Off() {
		if (lblJugador3Off == null) {
			lblJugador3Off = new JLabel("");
			lblJugador3Off.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador_off.png")));
			lblJugador3Off.setSize(new Dimension(221, 43));
			lblJugador3Off.setRequestFocusEnabled(false);
			lblJugador3Off.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador3Off.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador3Off.setForeground(new Color(222, 191, 40));
			lblJugador3Off.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador3Off.setFocusable(false);
			lblJugador3Off.setFocusTraversalKeysEnabled(false);
			lblJugador3Off.setBorder(null);
			lblJugador3Off.setBounds(51, 420, 254, 79);
		}
		return lblJugador3Off;
	}
	private JLabel getLblJugador4Off() {
		if (lblJugador4Off == null) {
			lblJugador4Off = new JLabel("");
			lblJugador4Off.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Jugador_off.png")));
			lblJugador4Off.setSize(new Dimension(221, 43));
			lblJugador4Off.setRequestFocusEnabled(false);
			lblJugador4Off.setHorizontalTextPosition(SwingConstants.CENTER);
			lblJugador4Off.setHorizontalAlignment(SwingConstants.CENTER);
			lblJugador4Off.setForeground(new Color(222, 191, 40));
			lblJugador4Off.setFont(new Font("Arial", Font.PLAIN, 20));
			lblJugador4Off.setFocusable(false);
			lblJugador4Off.setFocusTraversalKeysEnabled(false);
			lblJugador4Off.setBorder(null);
			lblJugador4Off.setBounds(51, 508, 254, 79);
		}
		return lblJugador4Off;
	}
	private JButton getBtnComenzar3() {
		if (btnComenzar3 == null) {
			btnComenzar3 = new JButton("pulsa para tirar");
			btnComenzar3.setDisabledIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Mensaje.png")));
			btnComenzar3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnComenzar3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//Acción al pulsar
					
				}
			});
			btnComenzar3.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Mensaje_over.png")));
			btnComenzar3.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Mensaje.png")));
			btnComenzar3.setRequestFocusEnabled(false);
			btnComenzar3.setPreferredSize(new Dimension(245, 43));
			btnComenzar3.setMinimumSize(new Dimension(245, 43));
			btnComenzar3.setMaximumSize(new Dimension(245, 43));
			btnComenzar3.setMargin(new Insets(0, 0, 0, 0));
			btnComenzar3.setHorizontalTextPosition(SwingConstants.CENTER);
			btnComenzar3.setForeground(Color.BLACK);
			btnComenzar3.setFont(new Font("Arial", Font.PLAIN, 20));
			btnComenzar3.setContentAreaFilled(false);
			btnComenzar3.setBorder(null);
			btnComenzar3.setBounds(61, 172, 245, 43);
		}
		return btnComenzar3;
	}
	private JLabel getLblDadoImg() {
		if (lblDadoImg == null) {
			lblDadoImg = new JLabel("");
			lblDadoImg.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Dado.png")));
			lblDadoImg.setSize(new Dimension(221, 43));
			lblDadoImg.setRequestFocusEnabled(false);
			lblDadoImg.setHorizontalTextPosition(SwingConstants.CENTER);
			lblDadoImg.setHorizontalAlignment(SwingConstants.CENTER);
			lblDadoImg.setForeground(new Color(222, 191, 40));
			lblDadoImg.setFont(new Font("Arial", Font.PLAIN, 20));
			lblDadoImg.setFocusable(false);
			lblDadoImg.setFocusTraversalKeysEnabled(false);
			lblDadoImg.setBorder(null);
			lblDadoImg.setBounds(160, 131, 55, 56);
		}
		return lblDadoImg;
	}
	private JMenu getMnTemppruebas() {
		if (mnTemppruebas == null) {
			mnTemppruebas = new JMenu("TempPruebas");
			mnTemppruebas.setMnemonic('t');
			mnTemppruebas.setFont(new Font("Arial", Font.PLAIN, 15));
			mnTemppruebas.add(getMntmNewMenuItem_5());
			mnTemppruebas.add(getMntmNewMenuItem_6());
		}
		return mnTemppruebas;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("Selecci\u00F3n de jugadores");
			mntmNewMenuItem_5.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Acerca.png")));
			mntmNewMenuItem_5.setBounds(new Rectangle(0, 0, 0, 40));
			mntmNewMenuItem_5.setMargin(new Insets(10, 10, 10, 10));
			mntmNewMenuItem_5.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_5.setBorder(new EmptyBorder(0, 0, 0, 0));
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Menú TempPruebas > Selección de jugadores
					// Mostrar Diálogo de selección de jugadores
					DialogoJugadores frame = new DialogoJugadores(); 
					frame.setLocationRelativeTo(null); 
					frame.setVisible(true);
					frame.setModalityType(DialogoJugadores.ModalityType.MODELESS);
					
				}
			});
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("Tirar dado");
			mntmNewMenuItem_6.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Acerca.png")));
			mntmNewMenuItem_6.setMargin(new Insets(5, 5, 5, 5));
			mntmNewMenuItem_6.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_6.setBorder(new EmptyBorder(0, 0, 0, 0));
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Menú TempPruebas > Tirar dado
					lblDadoImg.setVisible(false); //Ocultar imagen de dado
					btnComenzar3.setVisible(false); //Ocultar botón mensaje tirar
					lblDadoTirada.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Dado_06.png"))); //Cargar imagen con resultado de tirada
					lblDadoTirada.setVisible(true); //Mostrar imagen con tirada de dado
					lblMensajes.setText("elije casilla en el tablero"); //Cargar mensaje a mostrar
					lblMensajes.setVisible(true); //Mostrar label mensajes
					
					btnCasilla01.setVisible(true); //Mostrar botones de las casillas
					btnCasilla02.setVisible(true);
					btnCasilla03.setVisible(true);
					btnCasilla04.setVisible(true);
					btnCasilla05.setVisible(true);
					btnCasilla06.setVisible(true);
					btnCasilla07.setVisible(true);
					btnCasilla08.setVisible(true);
					btnCasilla09.setVisible(true);
					btnCasilla10.setVisible(true);
					btnCasilla11.setVisible(true);
					btnCasilla12.setVisible(true);
					btnCasilla13.setVisible(true);
					btnCasilla14.setVisible(true);
					btnCasilla15.setVisible(true);
					btnCasilla16.setVisible(true);
					btnCasilla17.setVisible(true);
					btnCasilla18.setVisible(true);
					btnCasilla19.setVisible(true);
					btnCasilla20.setVisible(true);
					btnCasilla21.setVisible(true);
					btnCasilla22.setVisible(true);
					btnCasilla23.setVisible(true);
					btnCasilla24.setVisible(true);
					btnCasilla25.setVisible(true);
					btnCasilla26.setVisible(true);
					btnCasilla27.setVisible(true);
					btnCasilla28.setVisible(true);
					btnCasilla29.setVisible(true);
					btnCasilla30.setVisible(true);
					btnCasilla31.setVisible(true);
					btnCasilla32.setVisible(true);
					btnCasilla33.setVisible(true);
					btnCasilla34.setVisible(true);
					btnCasilla35.setVisible(true);
					btnCasilla36.setVisible(true);
					btnCasilla37.setVisible(true);
					btnCasilla38.setVisible(true);
					btnCasilla39.setVisible(true);
					btnCasilla40.setVisible(true);
					btnCasilla41.setVisible(true);
					btnCasilla42.setVisible(true);
					btnCasilla43.setVisible(true);
					btnCasilla44.setVisible(true);
					btnCasilla45.setVisible(true);

				}
			});
		}
		return mntmNewMenuItem_6;
	}
	private JLabel getLblDadoTirada() {
		if (lblDadoTirada == null) {
			lblDadoTirada = new JLabel("");
			lblDadoTirada.setVisible(false);
			lblDadoTirada.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Dado_05.png")));
			lblDadoTirada.setSize(new Dimension(221, 43));
			lblDadoTirada.setRequestFocusEnabled(false);
			lblDadoTirada.setHorizontalTextPosition(SwingConstants.CENTER);
			lblDadoTirada.setHorizontalAlignment(SwingConstants.CENTER);
			lblDadoTirada.setForeground(new Color(222, 191, 40));
			lblDadoTirada.setFont(new Font("Arial", Font.PLAIN, 20));
			lblDadoTirada.setFocusable(false);
			lblDadoTirada.setFocusTraversalKeysEnabled(false);
			lblDadoTirada.setBorder(null);
			lblDadoTirada.setBounds(159, 129, 60, 60);
		}
		return lblDadoTirada;
	}
	private JLabel getLblMensajes() {
		if (lblMensajes == null) {
			lblMensajes = new JLabel("elije casilla en el tablero");
			lblMensajes.setVisible(false);
			lblMensajes.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Mensaje.png")));
			lblMensajes.setSize(new Dimension(221, 43));
			lblMensajes.setRequestFocusEnabled(false);
			lblMensajes.setHorizontalTextPosition(SwingConstants.CENTER);
			lblMensajes.setHorizontalAlignment(SwingConstants.CENTER);
			lblMensajes.setForeground(Color.BLACK);
			lblMensajes.setFont(new Font("Arial", Font.PLAIN, 20));
			lblMensajes.setFocusable(false);
			lblMensajes.setFocusTraversalKeysEnabled(false);
			lblMensajes.setBorder(null);
			lblMensajes.setBounds(61, 172, 245, 43);
		}
		return lblMensajes;
	}
	private JButton getBtnCasilla01() {
		if (btnCasilla01 == null) {
			btnCasilla01 = new JButton("01");
			btnCasilla01.setVisible(false);
			btnCasilla01.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla01.setRequestFocusEnabled(false);
			btnCasilla01.setPreferredSize(new Dimension(245, 43));
			btnCasilla01.setMinimumSize(new Dimension(245, 43));
			btnCasilla01.setMaximumSize(new Dimension(245, 43));
			btnCasilla01.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla01.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla01.setForeground(Color.WHITE);
			btnCasilla01.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla01.setContentAreaFilled(false);
			btnCasilla01.setBorder(null);
			btnCasilla01.setBounds(382, 62, 55, 55);
		}
		return btnCasilla01;
	}
	private JButton getBtnCasilla02() {
		if (btnCasilla02 == null) {
			btnCasilla02 = new JButton("02");
			btnCasilla02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla02.setVisible(false);
			btnCasilla02.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla02.setRequestFocusEnabled(false);
			btnCasilla02.setPreferredSize(new Dimension(245, 43));
			btnCasilla02.setMinimumSize(new Dimension(245, 43));
			btnCasilla02.setMaximumSize(new Dimension(245, 43));
			btnCasilla02.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla02.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla02.setForeground(Color.WHITE);
			btnCasilla02.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla02.setContentAreaFilled(false);
			btnCasilla02.setBorder(null);
			btnCasilla02.setBounds(445, 62, 55, 55);
		}
		return btnCasilla02;
	}

	private JButton getBtnCasilla03() {
		if (btnCasilla03 == null) {
			btnCasilla03 = new JButton("03");
			btnCasilla03.setVisible(false);
			btnCasilla03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla03.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla03.setRequestFocusEnabled(false);
			btnCasilla03.setPreferredSize(new Dimension(245, 43));
			btnCasilla03.setMinimumSize(new Dimension(245, 43));
			btnCasilla03.setMaximumSize(new Dimension(245, 43));
			btnCasilla03.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla03.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla03.setForeground(Color.WHITE);
			btnCasilla03.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla03.setContentAreaFilled(false);
			btnCasilla03.setBorder(null);
			btnCasilla03.setBounds(508, 62, 55, 55);
		}
		return btnCasilla03;
	}
	private JButton getBtnCasilla04() {
		if (btnCasilla04 == null) {
			btnCasilla04 = new JButton("04");
			btnCasilla04.setVisible(false);
			btnCasilla04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla04.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla04.setRequestFocusEnabled(false);
			btnCasilla04.setPreferredSize(new Dimension(245, 43));
			btnCasilla04.setMinimumSize(new Dimension(245, 43));
			btnCasilla04.setMaximumSize(new Dimension(245, 43));
			btnCasilla04.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla04.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla04.setForeground(Color.WHITE);
			btnCasilla04.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla04.setContentAreaFilled(false);
			btnCasilla04.setBorder(null);
			btnCasilla04.setBounds(571, 62, 55, 55);
		}
		return btnCasilla04;
	}
	private JButton getBtnCasilla05() {
		if (btnCasilla05 == null) {
			btnCasilla05 = new JButton("05");
			btnCasilla05.setVisible(false);
			btnCasilla05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla05.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla05.setRequestFocusEnabled(false);
			btnCasilla05.setPreferredSize(new Dimension(245, 43));
			btnCasilla05.setMinimumSize(new Dimension(245, 43));
			btnCasilla05.setMaximumSize(new Dimension(245, 43));
			btnCasilla05.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla05.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla05.setForeground(Color.WHITE);
			btnCasilla05.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla05.setContentAreaFilled(false);
			btnCasilla05.setBorder(null);
			btnCasilla05.setBounds(634, 62, 55, 55);
		}
		return btnCasilla05;
	}
	private JButton getBtnCasilla06() {
		if (btnCasilla06 == null) {
			btnCasilla06 = new JButton("06");
			btnCasilla06.setVisible(false);
			btnCasilla06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla06.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla06.setRequestFocusEnabled(false);
			btnCasilla06.setPreferredSize(new Dimension(245, 43));
			btnCasilla06.setMinimumSize(new Dimension(245, 43));
			btnCasilla06.setMaximumSize(new Dimension(245, 43));
			btnCasilla06.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla06.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla06.setForeground(Color.WHITE);
			btnCasilla06.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla06.setContentAreaFilled(false);
			btnCasilla06.setBorder(null);
			btnCasilla06.setBounds(697, 62, 55, 55);
		}
		return btnCasilla06;
	}
	private JButton getBtnCasilla07() {
		if (btnCasilla07 == null) {
			btnCasilla07 = new JButton("07");
			btnCasilla07.setVisible(false);
			btnCasilla07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla07.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla07.setRequestFocusEnabled(false);
			btnCasilla07.setPreferredSize(new Dimension(245, 43));
			btnCasilla07.setMinimumSize(new Dimension(245, 43));
			btnCasilla07.setMaximumSize(new Dimension(245, 43));
			btnCasilla07.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla07.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla07.setForeground(Color.WHITE);
			btnCasilla07.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla07.setContentAreaFilled(false);
			btnCasilla07.setBorder(null);
			btnCasilla07.setBounds(760, 62, 55, 55);
		}
		return btnCasilla07;
	}
	private JButton getBtnCasilla08() {
		if (btnCasilla08 == null) {
			btnCasilla08 = new JButton("08");
			btnCasilla08.setVisible(false);
			btnCasilla08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla08.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla08.setRequestFocusEnabled(false);
			btnCasilla08.setPreferredSize(new Dimension(245, 43));
			btnCasilla08.setMinimumSize(new Dimension(245, 43));
			btnCasilla08.setMaximumSize(new Dimension(245, 43));
			btnCasilla08.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla08.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla08.setForeground(Color.WHITE);
			btnCasilla08.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla08.setContentAreaFilled(false);
			btnCasilla08.setBorder(null);
			btnCasilla08.setBounds(823, 62, 55, 55);
		}
		return btnCasilla08;
	}
	private JButton getBtnCasilla09() {
		if (btnCasilla09 == null) {
			btnCasilla09 = new JButton("09");
			btnCasilla09.setVisible(false);
			btnCasilla09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla09.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla09.setRequestFocusEnabled(false);
			btnCasilla09.setPreferredSize(new Dimension(245, 43));
			btnCasilla09.setMinimumSize(new Dimension(245, 43));
			btnCasilla09.setMaximumSize(new Dimension(245, 43));
			btnCasilla09.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla09.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla09.setForeground(Color.WHITE);
			btnCasilla09.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla09.setContentAreaFilled(false);
			btnCasilla09.setBorder(null);
			btnCasilla09.setBounds(886, 62, 55, 55);
		}
		return btnCasilla09;
	}
	private JButton getBtnCasilla10() {
		if (btnCasilla10 == null) {
			btnCasilla10 = new JButton("10");
			btnCasilla10.setVisible(false);
			btnCasilla10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla10.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla10.setRequestFocusEnabled(false);
			btnCasilla10.setPreferredSize(new Dimension(245, 43));
			btnCasilla10.setMinimumSize(new Dimension(245, 43));
			btnCasilla10.setMaximumSize(new Dimension(245, 43));
			btnCasilla10.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla10.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla10.setForeground(Color.WHITE);
			btnCasilla10.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla10.setContentAreaFilled(false);
			btnCasilla10.setBorder(null);
			btnCasilla10.setBounds(886, 125, 55, 55);
		}
		return btnCasilla10;
	}
	private JButton getBtnCasilla11() {
		if (btnCasilla11 == null) {
			btnCasilla11 = new JButton("11");
			btnCasilla11.setVisible(false);
			btnCasilla11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla11.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla11.setRequestFocusEnabled(false);
			btnCasilla11.setPreferredSize(new Dimension(245, 43));
			btnCasilla11.setMinimumSize(new Dimension(245, 43));
			btnCasilla11.setMaximumSize(new Dimension(245, 43));
			btnCasilla11.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla11.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla11.setForeground(Color.WHITE);
			btnCasilla11.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla11.setContentAreaFilled(false);
			btnCasilla11.setBorder(null);
			btnCasilla11.setBounds(886, 188, 55, 55);
		}
		return btnCasilla11;
	}
	private JButton getBtnCasilla12() {
		if (btnCasilla12 == null) {
			btnCasilla12 = new JButton("12");
			btnCasilla12.setVisible(false);
			btnCasilla12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla12.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla12.setRequestFocusEnabled(false);
			btnCasilla12.setPreferredSize(new Dimension(245, 43));
			btnCasilla12.setMinimumSize(new Dimension(245, 43));
			btnCasilla12.setMaximumSize(new Dimension(245, 43));
			btnCasilla12.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla12.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla12.setForeground(Color.WHITE);
			btnCasilla12.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla12.setContentAreaFilled(false);
			btnCasilla12.setBorder(null);
			btnCasilla12.setBounds(886, 251, 55, 55);
		}
		return btnCasilla12;
	}
	private JButton getBtnCasilla13() {
		if (btnCasilla13 == null) {
			btnCasilla13 = new JButton("13");
			btnCasilla13.setVisible(false);
			btnCasilla13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla13.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla13.setRequestFocusEnabled(false);
			btnCasilla13.setPreferredSize(new Dimension(245, 43));
			btnCasilla13.setMinimumSize(new Dimension(245, 43));
			btnCasilla13.setMaximumSize(new Dimension(245, 43));
			btnCasilla13.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla13.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla13.setForeground(Color.WHITE);
			btnCasilla13.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla13.setContentAreaFilled(false);
			btnCasilla13.setBorder(null);
			btnCasilla13.setBounds(886, 314, 55, 55);
		}
		return btnCasilla13;
	}
	private JButton getBtnCasilla14() {
		if (btnCasilla14 == null) {
			btnCasilla14 = new JButton("14");
			btnCasilla14.setVisible(false);
			btnCasilla14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla14.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla14.setRequestFocusEnabled(false);
			btnCasilla14.setPreferredSize(new Dimension(245, 43));
			btnCasilla14.setMinimumSize(new Dimension(245, 43));
			btnCasilla14.setMaximumSize(new Dimension(245, 43));
			btnCasilla14.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla14.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla14.setForeground(Color.WHITE);
			btnCasilla14.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla14.setContentAreaFilled(false);
			btnCasilla14.setBorder(null);
			btnCasilla14.setBounds(886, 377, 55, 55);
		}
		return btnCasilla14;
	}
	private JButton getBtnCasilla15() {
		if (btnCasilla15 == null) {
			btnCasilla15 = new JButton("15");
			btnCasilla15.setVisible(false);
			btnCasilla15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla15.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla15.setRequestFocusEnabled(false);
			btnCasilla15.setPreferredSize(new Dimension(245, 43));
			btnCasilla15.setMinimumSize(new Dimension(245, 43));
			btnCasilla15.setMaximumSize(new Dimension(245, 43));
			btnCasilla15.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla15.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla15.setForeground(Color.WHITE);
			btnCasilla15.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla15.setContentAreaFilled(false);
			btnCasilla15.setBorder(null);
			btnCasilla15.setBounds(886, 440, 55, 55);
		}
		return btnCasilla15;
	}
	private JButton getBtnCasilla16() {
		if (btnCasilla16 == null) {
			btnCasilla16 = new JButton("16");
			btnCasilla16.setVisible(false);
			btnCasilla16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla16.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla16.setRequestFocusEnabled(false);
			btnCasilla16.setPreferredSize(new Dimension(245, 43));
			btnCasilla16.setMinimumSize(new Dimension(245, 43));
			btnCasilla16.setMaximumSize(new Dimension(245, 43));
			btnCasilla16.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla16.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla16.setForeground(Color.WHITE);
			btnCasilla16.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla16.setContentAreaFilled(false);
			btnCasilla16.setBorder(null);
			btnCasilla16.setBounds(886, 503, 55, 55);
		}
		return btnCasilla16;
	}
	private JButton getBtnCasilla17() {
		if (btnCasilla17 == null) {
			btnCasilla17 = new JButton("17");
			btnCasilla17.setVisible(false);
			btnCasilla17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla17.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla17.setRequestFocusEnabled(false);
			btnCasilla17.setPreferredSize(new Dimension(245, 43));
			btnCasilla17.setMinimumSize(new Dimension(245, 43));
			btnCasilla17.setMaximumSize(new Dimension(245, 43));
			btnCasilla17.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla17.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla17.setForeground(Color.WHITE);
			btnCasilla17.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla17.setContentAreaFilled(false);
			btnCasilla17.setBorder(null);
			btnCasilla17.setBounds(886, 566, 55, 55);
		}
		return btnCasilla17;
	}
	private JButton getBtnCasilla18() {
		if (btnCasilla18 == null) {
			btnCasilla18 = new JButton("18");
			btnCasilla18.setVisible(false);
			btnCasilla18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla18.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla18.setRequestFocusEnabled(false);
			btnCasilla18.setPreferredSize(new Dimension(245, 43));
			btnCasilla18.setMinimumSize(new Dimension(245, 43));
			btnCasilla18.setMaximumSize(new Dimension(245, 43));
			btnCasilla18.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla18.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla18.setForeground(Color.WHITE);
			btnCasilla18.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla18.setContentAreaFilled(false);
			btnCasilla18.setBorder(null);
			btnCasilla18.setBounds(823, 566, 55, 55);
		}
		return btnCasilla18;
	}
	private JButton getBtnCasilla19() {
		if (btnCasilla19 == null) {
			btnCasilla19 = new JButton("19");
			btnCasilla19.setVisible(false);
			btnCasilla19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla19.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla19.setRequestFocusEnabled(false);
			btnCasilla19.setPreferredSize(new Dimension(245, 43));
			btnCasilla19.setMinimumSize(new Dimension(245, 43));
			btnCasilla19.setMaximumSize(new Dimension(245, 43));
			btnCasilla19.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla19.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla19.setForeground(Color.WHITE);
			btnCasilla19.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla19.setContentAreaFilled(false);
			btnCasilla19.setBorder(null);
			btnCasilla19.setBounds(760, 566, 55, 55);
		}
		return btnCasilla19;
	}
	private JButton getBtnCasilla20() {
		if (btnCasilla20 == null) {
			btnCasilla20 = new JButton("20");
			btnCasilla20.setVisible(false);
			btnCasilla20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla20.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla20.setRequestFocusEnabled(false);
			btnCasilla20.setPreferredSize(new Dimension(245, 43));
			btnCasilla20.setMinimumSize(new Dimension(245, 43));
			btnCasilla20.setMaximumSize(new Dimension(245, 43));
			btnCasilla20.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla20.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla20.setForeground(Color.WHITE);
			btnCasilla20.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla20.setContentAreaFilled(false);
			btnCasilla20.setBorder(null);
			btnCasilla20.setBounds(697, 566, 55, 55);
		}
		return btnCasilla20;
	}
	private JButton getBtnCasilla21() {
		if (btnCasilla21 == null) {
			btnCasilla21 = new JButton("21");
			btnCasilla21.setVisible(false);
			btnCasilla21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla21.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla21.setRequestFocusEnabled(false);
			btnCasilla21.setPreferredSize(new Dimension(245, 43));
			btnCasilla21.setMinimumSize(new Dimension(245, 43));
			btnCasilla21.setMaximumSize(new Dimension(245, 43));
			btnCasilla21.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla21.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla21.setForeground(Color.WHITE);
			btnCasilla21.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla21.setContentAreaFilled(false);
			btnCasilla21.setBorder(null);
			btnCasilla21.setBounds(634, 566, 55, 55);
		}
		return btnCasilla21;
	}
	private JButton getBtnCasilla22() {
		if (btnCasilla22 == null) {
			btnCasilla22 = new JButton("22");
			btnCasilla22.setVisible(false);
			btnCasilla22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla22.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla22.setRequestFocusEnabled(false);
			btnCasilla22.setPreferredSize(new Dimension(245, 43));
			btnCasilla22.setMinimumSize(new Dimension(245, 43));
			btnCasilla22.setMaximumSize(new Dimension(245, 43));
			btnCasilla22.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla22.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla22.setForeground(Color.WHITE);
			btnCasilla22.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla22.setContentAreaFilled(false);
			btnCasilla22.setBorder(null);
			btnCasilla22.setBounds(571, 566, 55, 55);
		}
		return btnCasilla22;
	}
	private JButton getBtnCasilla23() {
		if (btnCasilla23 == null) {
			btnCasilla23 = new JButton("23");
			btnCasilla23.setVisible(false);
			btnCasilla23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla23.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla23.setRequestFocusEnabled(false);
			btnCasilla23.setPreferredSize(new Dimension(245, 43));
			btnCasilla23.setMinimumSize(new Dimension(245, 43));
			btnCasilla23.setMaximumSize(new Dimension(245, 43));
			btnCasilla23.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla23.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla23.setForeground(Color.WHITE);
			btnCasilla23.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla23.setContentAreaFilled(false);
			btnCasilla23.setBorder(null);
			btnCasilla23.setBounds(508, 566, 55, 55);
		}
		return btnCasilla23;
	}
	private JButton getBtnCasilla24() {
		if (btnCasilla24 == null) {
			btnCasilla24 = new JButton("24");
			btnCasilla24.setVisible(false);
			btnCasilla24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla24.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla24.setRequestFocusEnabled(false);
			btnCasilla24.setPreferredSize(new Dimension(245, 43));
			btnCasilla24.setMinimumSize(new Dimension(245, 43));
			btnCasilla24.setMaximumSize(new Dimension(245, 43));
			btnCasilla24.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla24.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla24.setForeground(Color.WHITE);
			btnCasilla24.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla24.setContentAreaFilled(false);
			btnCasilla24.setBorder(null);
			btnCasilla24.setBounds(445, 566, 55, 55);
		}
		return btnCasilla24;
	}
	private JButton getBtnCasilla25() {
		if (btnCasilla25 == null) {
			btnCasilla25 = new JButton("25");
			btnCasilla25.setVisible(false);
			btnCasilla25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla25.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla25.setRequestFocusEnabled(false);
			btnCasilla25.setPreferredSize(new Dimension(245, 43));
			btnCasilla25.setMinimumSize(new Dimension(245, 43));
			btnCasilla25.setMaximumSize(new Dimension(245, 43));
			btnCasilla25.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla25.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla25.setForeground(Color.WHITE);
			btnCasilla25.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla25.setContentAreaFilled(false);
			btnCasilla25.setBorder(null);
			btnCasilla25.setBounds(382, 566, 55, 55);
		}
		return btnCasilla25;
	}
	private JButton getBtnCasilla26() {
		if (btnCasilla26 == null) {
			btnCasilla26 = new JButton("26");
			btnCasilla26.setVisible(false);
			btnCasilla26.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla26.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla26.setRequestFocusEnabled(false);
			btnCasilla26.setPreferredSize(new Dimension(245, 43));
			btnCasilla26.setMinimumSize(new Dimension(245, 43));
			btnCasilla26.setMaximumSize(new Dimension(245, 43));
			btnCasilla26.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla26.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla26.setForeground(Color.WHITE);
			btnCasilla26.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla26.setContentAreaFilled(false);
			btnCasilla26.setBorder(null);
			btnCasilla26.setBounds(382, 503, 55, 55);
		}
		return btnCasilla26;
	}
	private JButton getBtnCasilla27() {
		if (btnCasilla27 == null) {
			btnCasilla27 = new JButton("27");
			btnCasilla27.setVisible(false);
			btnCasilla27.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla27.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla27.setRequestFocusEnabled(false);
			btnCasilla27.setPreferredSize(new Dimension(245, 43));
			btnCasilla27.setMinimumSize(new Dimension(245, 43));
			btnCasilla27.setMaximumSize(new Dimension(245, 43));
			btnCasilla27.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla27.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla27.setForeground(Color.WHITE);
			btnCasilla27.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla27.setContentAreaFilled(false);
			btnCasilla27.setBorder(null);
			btnCasilla27.setBounds(382, 440, 55, 55);
		}
		return btnCasilla27;
	}
	private JButton getBtnCasilla28() {
		if (btnCasilla28 == null) {
			btnCasilla28 = new JButton("28");
			btnCasilla28.setVisible(false);
			btnCasilla28.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla28.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla28.setRequestFocusEnabled(false);
			btnCasilla28.setPreferredSize(new Dimension(245, 43));
			btnCasilla28.setMinimumSize(new Dimension(245, 43));
			btnCasilla28.setMaximumSize(new Dimension(245, 43));
			btnCasilla28.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla28.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla28.setForeground(Color.WHITE);
			btnCasilla28.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla28.setContentAreaFilled(false);
			btnCasilla28.setBorder(null);
			btnCasilla28.setBounds(382, 377, 55, 55);
		}
		return btnCasilla28;
	}
	private JButton getBtnCasilla29() {
		if (btnCasilla29 == null) {
			btnCasilla29 = new JButton("29");
			btnCasilla29.setVisible(false);
			btnCasilla29.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla29.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla29.setRequestFocusEnabled(false);
			btnCasilla29.setPreferredSize(new Dimension(245, 43));
			btnCasilla29.setMinimumSize(new Dimension(245, 43));
			btnCasilla29.setMaximumSize(new Dimension(245, 43));
			btnCasilla29.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla29.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla29.setForeground(Color.WHITE);
			btnCasilla29.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla29.setContentAreaFilled(false);
			btnCasilla29.setBorder(null);
			btnCasilla29.setBounds(382, 314, 55, 55);
		}
		return btnCasilla29;
	}
	private JButton getBtnCasilla30() {
		if (btnCasilla30 == null) {
			btnCasilla30 = new JButton("30");
			btnCasilla30.setVisible(false);
			btnCasilla30.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla30.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla30.setRequestFocusEnabled(false);
			btnCasilla30.setPreferredSize(new Dimension(245, 43));
			btnCasilla30.setMinimumSize(new Dimension(245, 43));
			btnCasilla30.setMaximumSize(new Dimension(245, 43));
			btnCasilla30.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla30.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla30.setForeground(Color.WHITE);
			btnCasilla30.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla30.setContentAreaFilled(false);
			btnCasilla30.setBorder(null);
			btnCasilla30.setBounds(382, 251, 55, 55);
		}
		return btnCasilla30;
	}
	private JButton getBtnCasilla31() {
		if (btnCasilla31 == null) {
			btnCasilla31 = new JButton("31");
			btnCasilla31.setVisible(false);
			btnCasilla31.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla31.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla31.setRequestFocusEnabled(false);
			btnCasilla31.setPreferredSize(new Dimension(245, 43));
			btnCasilla31.setMinimumSize(new Dimension(245, 43));
			btnCasilla31.setMaximumSize(new Dimension(245, 43));
			btnCasilla31.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla31.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla31.setForeground(Color.WHITE);
			btnCasilla31.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla31.setContentAreaFilled(false);
			btnCasilla31.setBorder(null);
			btnCasilla31.setBounds(382, 188, 55, 55);
		}
		return btnCasilla31;
	}
	private JButton getBtnCasilla32() {
		if (btnCasilla32 == null) {
			btnCasilla32 = new JButton("32");
			btnCasilla32.setVisible(false);
			btnCasilla32.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla32.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla32.setRequestFocusEnabled(false);
			btnCasilla32.setPreferredSize(new Dimension(245, 43));
			btnCasilla32.setMinimumSize(new Dimension(245, 43));
			btnCasilla32.setMaximumSize(new Dimension(245, 43));
			btnCasilla32.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla32.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla32.setForeground(Color.WHITE);
			btnCasilla32.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla32.setContentAreaFilled(false);
			btnCasilla32.setBorder(null);
			btnCasilla32.setBounds(382, 125, 55, 55);
		}
		return btnCasilla32;
	}
	private JButton getBtnCasilla33() {
		if (btnCasilla33 == null) {
			btnCasilla33 = new JButton("33");
			btnCasilla33.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla33.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla33.setVisible(false);
			btnCasilla33.setRequestFocusEnabled(false);
			btnCasilla33.setPreferredSize(new Dimension(245, 43));
			btnCasilla33.setMinimumSize(new Dimension(245, 43));
			btnCasilla33.setMaximumSize(new Dimension(245, 43));
			btnCasilla33.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla33.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla33.setForeground(Color.WHITE);
			btnCasilla33.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla33.setContentAreaFilled(false);
			btnCasilla33.setBorder(null);
			btnCasilla33.setBounds(634, 125, 55, 55);
		}
		return btnCasilla33;
	}
	private JButton getBtnCasilla34() {
		if (btnCasilla34 == null) {
			btnCasilla34 = new JButton("34");
			btnCasilla34.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla34.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla34.setVisible(false);
			btnCasilla34.setRequestFocusEnabled(false);
			btnCasilla34.setPreferredSize(new Dimension(245, 43));
			btnCasilla34.setMinimumSize(new Dimension(245, 43));
			btnCasilla34.setMaximumSize(new Dimension(245, 43));
			btnCasilla34.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla34.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla34.setForeground(Color.WHITE);
			btnCasilla34.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla34.setContentAreaFilled(false);
			btnCasilla34.setBorder(null);
			btnCasilla34.setBounds(634, 188, 55, 55);
		}
		return btnCasilla34;
	}
	private JButton getBtnCasilla35() {
		if (btnCasilla35 == null) {
			btnCasilla35 = new JButton("35");
			btnCasilla35.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla35.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla35.setVisible(false);
			btnCasilla35.setRequestFocusEnabled(false);
			btnCasilla35.setPreferredSize(new Dimension(245, 43));
			btnCasilla35.setMinimumSize(new Dimension(245, 43));
			btnCasilla35.setMaximumSize(new Dimension(245, 43));
			btnCasilla35.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla35.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla35.setForeground(Color.WHITE);
			btnCasilla35.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla35.setContentAreaFilled(false);
			btnCasilla35.setBorder(null);
			btnCasilla35.setBounds(634, 251, 55, 55);
		}
		return btnCasilla35;
	}
	private JButton getBtnCasilla36() {
		if (btnCasilla36 == null) {
			btnCasilla36 = new JButton("36");
			btnCasilla36.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla36.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla36.setVisible(false);
			btnCasilla36.setRequestFocusEnabled(false);
			btnCasilla36.setPreferredSize(new Dimension(245, 43));
			btnCasilla36.setMinimumSize(new Dimension(245, 43));
			btnCasilla36.setMaximumSize(new Dimension(245, 43));
			btnCasilla36.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla36.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla36.setForeground(Color.WHITE);
			btnCasilla36.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla36.setContentAreaFilled(false);
			btnCasilla36.setBorder(null);
			btnCasilla36.setBounds(634, 314, 55, 55);
		}
		return btnCasilla36;
	}
	private JButton getBtnCasilla37() {
		if (btnCasilla37 == null) {
			btnCasilla37 = new JButton("37");
			btnCasilla37.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla37.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla37.setVisible(false);
			btnCasilla37.setRequestFocusEnabled(false);
			btnCasilla37.setPreferredSize(new Dimension(245, 43));
			btnCasilla37.setMinimumSize(new Dimension(245, 43));
			btnCasilla37.setMaximumSize(new Dimension(245, 43));
			btnCasilla37.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla37.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla37.setForeground(Color.WHITE);
			btnCasilla37.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla37.setContentAreaFilled(false);
			btnCasilla37.setBorder(null);
			btnCasilla37.setBounds(634, 377, 55, 55);
		}
		return btnCasilla37;
	}
	private JButton getBtnCasilla38() {
		if (btnCasilla38 == null) {
			btnCasilla38 = new JButton("38");
			btnCasilla38.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla38.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla38.setVisible(false);
			btnCasilla38.setRequestFocusEnabled(false);
			btnCasilla38.setPreferredSize(new Dimension(245, 43));
			btnCasilla38.setMinimumSize(new Dimension(245, 43));
			btnCasilla38.setMaximumSize(new Dimension(245, 43));
			btnCasilla38.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla38.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla38.setForeground(Color.WHITE);
			btnCasilla38.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla38.setContentAreaFilled(false);
			btnCasilla38.setBorder(null);
			btnCasilla38.setBounds(634, 440, 55, 55);
		}
		return btnCasilla38;
	}
	private JButton getBtnCasilla39() {
		if (btnCasilla39 == null) {
			btnCasilla39 = new JButton("39");
			btnCasilla39.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla39.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla39.setVisible(false);
			btnCasilla39.setRequestFocusEnabled(false);
			btnCasilla39.setPreferredSize(new Dimension(245, 43));
			btnCasilla39.setMinimumSize(new Dimension(245, 43));
			btnCasilla39.setMaximumSize(new Dimension(245, 43));
			btnCasilla39.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla39.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla39.setForeground(Color.WHITE);
			btnCasilla39.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla39.setContentAreaFilled(false);
			btnCasilla39.setBorder(null);
			btnCasilla39.setBounds(634, 503, 55, 55);
		}
		return btnCasilla39;
	}
	private JButton getBtnCasilla40() {
		if (btnCasilla40 == null) {
			btnCasilla40 = new JButton("40");
			btnCasilla40.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla40.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla40.setVisible(false);
			btnCasilla40.setRequestFocusEnabled(false);
			btnCasilla40.setPreferredSize(new Dimension(245, 43));
			btnCasilla40.setMinimumSize(new Dimension(245, 43));
			btnCasilla40.setMaximumSize(new Dimension(245, 43));
			btnCasilla40.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla40.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla40.setForeground(Color.WHITE);
			btnCasilla40.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla40.setContentAreaFilled(false);
			btnCasilla40.setBorder(null);
			btnCasilla40.setBounds(445, 314, 55, 55);
		}
		return btnCasilla40;
	}
	private JButton getBtnCasilla41() {
		if (btnCasilla41 == null) {
			btnCasilla41 = new JButton("41");
			btnCasilla41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla41.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla41.setVisible(false);
			btnCasilla41.setRequestFocusEnabled(false);
			btnCasilla41.setPreferredSize(new Dimension(245, 43));
			btnCasilla41.setMinimumSize(new Dimension(245, 43));
			btnCasilla41.setMaximumSize(new Dimension(245, 43));
			btnCasilla41.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla41.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla41.setForeground(Color.WHITE);
			btnCasilla41.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla41.setContentAreaFilled(false);
			btnCasilla41.setBorder(null);
			btnCasilla41.setBounds(508, 314, 55, 55);
		}
		return btnCasilla41;
	}
	private JButton getBtnCasilla42() {
		if (btnCasilla42 == null) {
			btnCasilla42 = new JButton("42");
			btnCasilla42.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla42.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla42.setVisible(false);
			btnCasilla42.setRequestFocusEnabled(false);
			btnCasilla42.setPreferredSize(new Dimension(245, 43));
			btnCasilla42.setMinimumSize(new Dimension(245, 43));
			btnCasilla42.setMaximumSize(new Dimension(245, 43));
			btnCasilla42.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla42.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla42.setForeground(Color.WHITE);
			btnCasilla42.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla42.setContentAreaFilled(false);
			btnCasilla42.setBorder(null);
			btnCasilla42.setBounds(571, 314, 55, 55);
		}
		return btnCasilla42;
	}
	private JButton getBtnCasilla43() {
		if (btnCasilla43 == null) {
			btnCasilla43 = new JButton("43");
			btnCasilla43.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla43.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla43.setVisible(false);
			btnCasilla43.setRequestFocusEnabled(false);
			btnCasilla43.setPreferredSize(new Dimension(245, 43));
			btnCasilla43.setMinimumSize(new Dimension(245, 43));
			btnCasilla43.setMaximumSize(new Dimension(245, 43));
			btnCasilla43.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla43.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla43.setForeground(Color.WHITE);
			btnCasilla43.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla43.setContentAreaFilled(false);
			btnCasilla43.setBorder(null);
			btnCasilla43.setBounds(697, 314, 55, 55);
		}
		return btnCasilla43;
	}
	private JButton getBtnCasilla44() {
		if (btnCasilla44 == null) {
			btnCasilla44 = new JButton("44");
			btnCasilla44.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla44.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla44.setVisible(false);
			btnCasilla44.setRequestFocusEnabled(false);
			btnCasilla44.setPreferredSize(new Dimension(245, 43));
			btnCasilla44.setMinimumSize(new Dimension(245, 43));
			btnCasilla44.setMaximumSize(new Dimension(245, 43));
			btnCasilla44.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla44.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla44.setForeground(Color.WHITE);
			btnCasilla44.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla44.setContentAreaFilled(false);
			btnCasilla44.setBorder(null);
			btnCasilla44.setBounds(760, 314, 55, 55);
		}
		return btnCasilla44;
	}
	private JButton getBtnCasilla45() {
		if (btnCasilla45 == null) {
			btnCasilla45 = new JButton("45");
			btnCasilla45.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla45.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_00_00_00.png")));
			btnCasilla45.setVisible(false);
			btnCasilla45.setRequestFocusEnabled(false);
			btnCasilla45.setPreferredSize(new Dimension(245, 43));
			btnCasilla45.setMinimumSize(new Dimension(245, 43));
			btnCasilla45.setMaximumSize(new Dimension(245, 43));
			btnCasilla45.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla45.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla45.setForeground(Color.WHITE);
			btnCasilla45.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla45.setContentAreaFilled(false);
			btnCasilla45.setBorder(null);
			btnCasilla45.setBounds(823, 314, 55, 55);
		}
		return btnCasilla45;
	}
}

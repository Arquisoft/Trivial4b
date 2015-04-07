package es.uniovi.asw.trivial.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Usuario;
import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.main.Main;
import es.uniovi.asw.trivial.model.pregunta.PreguntaGame;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
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
	private JMenuItem mntmNewMenuItem_6;
	private JLabel lblDadoTirada;
	private JLabel lblMensajes;
	private JButton btnCasilla_04;
	private JButton btnCasilla_05;
	private JButton btnCasilla_06;
	private JButton btnCasilla_07;
	private JButton btnCasilla_08;
	private JButton btnCasilla_09;
	private JButton btnCasilla_10;
	private JButton btnCasilla_11;
	private JButton btnCasilla_12;
	private JButton btnCasilla_13;
	private JButton btnCasilla_14;
	private JButton btnCasilla_15;
	private JButton btnCasilla_16;
	private JButton btnCasilla_17;
	private JButton btnCasilla_18;
	private JButton btnCasilla_19;
	private JButton btnCasilla_20;
	private JButton btnCasilla_21;
	private JButton btnCasilla_22;
	private JButton btnCasilla_23;
	private JButton btnCasilla_24;
	private JButton btnCasilla_25;
	private JButton btnCasilla_26;
	private JButton btnCasilla_27;
	private JButton btnCasilla_28;
	private JButton btnCasilla_29;
	private JButton btnCasilla_30;
	private JButton btnCasilla_31;
	private JButton btnCasilla_00;
	private JButton btnCasilla_01;
	private JButton btnCasilla_02;
	private JButton btnCasilla_03;
	private JButton btnCasilla_35;
	private JButton btnCasilla_36;
	private JButton btnCasilla_37;
	private JButton btnCasilla_44;
	private JButton btnCasilla_43;
	private JButton btnCasilla_42;
	private JButton btnCasilla_41;
	private JButton btnCasilla_32;
	private JButton btnCasilla_33;
	private JButton btnCasilla_34;
	private JButton btnCasilla_40;
	private JButton btnCasilla_39;
	private JButton btnCasilla_38;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_9;
	private JLabel lblCasilla_33;
	private JLabel lblCasilla_34;
	private JLabel lblCasilla_02;
	private JLabel lblCasilla_30;
	private JLabel lblCasilla_16;
	private JLabel lblCasilla_08;
	private JLabel lblCasilla_24;
	private JLabel lblCasilla_36;
	private JLabel lblCasilla_40;
	private JLabel lblCasilla_04;
	private JLabel lblCasilla_05;
	private JLabel lblCasilla_06;
	private JLabel lblCasilla_07;
	private JLabel lblCasilla_09;
	private JLabel lblCasilla_10;
	private JLabel lblCasilla_38;
	private JLabel lblCasilla_39;
	private JLabel lblCasilla_32;
	private JLabel lblCasilla_41;
	private JLabel lblCasilla_42;
	private JLabel lblCasilla_43;
	private JLabel lblCasilla_44;
	private JLabel lblCasilla_37;
	private JLabel lblCasilla_35;
	private JLabel lblCasilla_03;
	private JLabel lblCasilla_01;
	private JLabel lblCasilla_00;
	private JLabel lblCasilla_31;
	private JLabel lblCasilla_29;
	private JLabel lblCasilla_28;
	private JLabel lblCasilla_27;
	private JLabel lblCasilla_26;
	private JLabel lblCasilla_25;
	private JLabel lblCasilla_23;
	private JLabel lblCasilla_22;
	private JLabel lblCasilla_21;
	private JLabel lblCasilla_20;
	private JLabel lblCasilla_19;
	private JLabel lblCasilla_18;
	private JLabel lblCasilla_17;
	private JLabel lblCasilla_15;
	private JLabel lblCasilla_14;
	private JLabel lblCasilla_13;
	private JLabel lblCasilla_12;
	private JLabel lblCasilla_11;
	private static VentanaPrincipal ventanaPrincipal;
	private List<Usuario> listaJugadores;
	private Trivial trivial;
	private int nJugadorTurnoActual;
	private List<JButton> botonesTablero;
	private List<JLabel> labelTablero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal(null);
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
	public VentanaPrincipal(Trivial t) {
		this.trivial = t;
		nJugadorTurnoActual = -1;
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/ico_150x150_app.png")));
		setTitle("Trivial Arquisoft4b");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 744);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMenuBar_1());
		contentPane.add(getPnContenido());
		ventanaPrincipal = this;
		
		botonesTablero = new ArrayList<JButton>();
		botonesTablero.add(btnCasilla_00);
		botonesTablero.add(btnCasilla_01);
		botonesTablero.add(btnCasilla_02);
		botonesTablero.add(btnCasilla_03);
		botonesTablero.add(btnCasilla_04);
		botonesTablero.add(btnCasilla_05);
		botonesTablero.add(btnCasilla_06);
		botonesTablero.add(btnCasilla_07);
		botonesTablero.add(btnCasilla_08);
		botonesTablero.add(btnCasilla_09);
		botonesTablero.add(btnCasilla_10);
		botonesTablero.add(btnCasilla_11);
		botonesTablero.add(btnCasilla_12);
		botonesTablero.add(btnCasilla_13);
		botonesTablero.add(btnCasilla_14);
		botonesTablero.add(btnCasilla_15);
		botonesTablero.add(btnCasilla_16);
		botonesTablero.add(btnCasilla_17);
		botonesTablero.add(btnCasilla_18);
		botonesTablero.add(btnCasilla_19);
		botonesTablero.add(btnCasilla_20);
		botonesTablero.add(btnCasilla_21);
		botonesTablero.add(btnCasilla_22);
		botonesTablero.add(btnCasilla_23);
		botonesTablero.add(btnCasilla_24);
		botonesTablero.add(btnCasilla_25);
		botonesTablero.add(btnCasilla_26);
		botonesTablero.add(btnCasilla_27);
		botonesTablero.add(btnCasilla_28);
		botonesTablero.add(btnCasilla_29);
		botonesTablero.add(btnCasilla_30);
		botonesTablero.add(btnCasilla_31);
		botonesTablero.add(btnCasilla_32);
		botonesTablero.add(btnCasilla_33);
		botonesTablero.add(btnCasilla_34);
		botonesTablero.add(btnCasilla_35);
		botonesTablero.add(btnCasilla_36);
		botonesTablero.add(btnCasilla_37);
		botonesTablero.add(btnCasilla_38);
		botonesTablero.add(btnCasilla_39);
		botonesTablero.add(btnCasilla_40);
		botonesTablero.add(btnCasilla_41);
		botonesTablero.add(btnCasilla_42);
		botonesTablero.add(btnCasilla_43);
		botonesTablero.add(btnCasilla_44);
		
		labelTablero = new ArrayList<JLabel>();
		labelTablero.add(lblCasilla_00);
		labelTablero.add(lblCasilla_01);
		labelTablero.add(lblCasilla_02);
		labelTablero.add(lblCasilla_03);
		labelTablero.add(lblCasilla_04);
		labelTablero.add(lblCasilla_05);
		labelTablero.add(lblCasilla_06);
		labelTablero.add(lblCasilla_07);
		labelTablero.add(lblCasilla_08);
		labelTablero.add(lblCasilla_09);
		labelTablero.add(lblCasilla_10);
		labelTablero.add(lblCasilla_11);
		labelTablero.add(lblCasilla_12);
		labelTablero.add(lblCasilla_13);
		labelTablero.add(lblCasilla_14);
		labelTablero.add(lblCasilla_15);
		labelTablero.add(lblCasilla_16);
		labelTablero.add(lblCasilla_17);
		labelTablero.add(lblCasilla_18);
		labelTablero.add(lblCasilla_19);
		labelTablero.add(lblCasilla_20);
		labelTablero.add(lblCasilla_21);
		labelTablero.add(lblCasilla_22);
		labelTablero.add(lblCasilla_23);
		labelTablero.add(lblCasilla_24);
		labelTablero.add(lblCasilla_25);
		labelTablero.add(lblCasilla_26);
		labelTablero.add(lblCasilla_27);
		labelTablero.add(lblCasilla_28);
		labelTablero.add(lblCasilla_29);
		labelTablero.add(lblCasilla_30);
		labelTablero.add(lblCasilla_31);
		labelTablero.add(lblCasilla_32);
		labelTablero.add(lblCasilla_33);
		labelTablero.add(lblCasilla_34);
		labelTablero.add(lblCasilla_35);
		labelTablero.add(lblCasilla_36);
		labelTablero.add(lblCasilla_37);
		labelTablero.add(lblCasilla_38);
		labelTablero.add(lblCasilla_39);
		labelTablero.add(lblCasilla_40);
		labelTablero.add(lblCasilla_41);
		labelTablero.add(lblCasilla_42);
		labelTablero.add(lblCasilla_43);
		labelTablero.add(lblCasilla_44);
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
			mnNewMenu.add(getMntmNewMenuItem_8());
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
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.dispose();	
				//Men� Juego > Nueva partida
					// Mostrar Di�logo de selecci�n de jugadores
					Main.main(null);
					
				}
			});
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
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Men� Juego > Estad�sticas
					// Mostrar Di�logo de estad�siticas
					DialogoEstadisticas frame = new DialogoEstadisticas(); 
					frame.setLocationRelativeTo(null); 
					frame.setVisible(true);
					frame.setModalityType(DialogoEstadisticas.ModalityType.APPLICATION_MODAL);
				}
			});
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
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//Men� Ayuda > Acerca de
					// Mostrar Di�logo de Acerca de
					DialogoAcercade frame = new DialogoAcercade(); 
					frame.setLocationRelativeTo(null); 
					frame.setVisible(true);
					frame.setModalityType(DialogoAcercade.ModalityType.APPLICATION_MODAL);
				}
			});
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
			panel1.add(getLblCasilla_04());
			panel1.add(getBtnCasilla_04());
			panel1.add(getLblCasilla_05());
			panel1.add(getBtnCasilla_05());
			panel1.add(getLblCasilla_06());
			panel1.add(getBtnCasilla_06());
			panel1.add(getLblCasilla_07());
			panel1.add(getBtnCasilla_07());
			panel1.add(getLblCasilla_08());
			panel1.add(getBtnCasilla_08());
			panel1.add(getLblCasilla_09());
			panel1.add(getBtnCasilla_09());
			panel1.add(getLblCasilla_10());
			panel1.add(getBtnCasilla_10());
			panel1.add(getLblCasilla_11());
			panel1.add(getBtnCasilla_11());
			panel1.add(getLblCasilla_12());
			panel1.add(getBtnCasilla_12());
			panel1.add(getLblCasilla_13());
			panel1.add(getBtnCasilla_13());
			panel1.add(getLblCasilla_14());
			panel1.add(getBtnCasilla_14());
			panel1.add(getLblCasilla_15());
			panel1.add(getBtnCasilla_15());
			panel1.add(getLblCasilla_16());
			panel1.add(getBtnCasilla_16());
			panel1.add(getLblCasilla_17());
			panel1.add(getBtnCasilla_17());
			panel1.add(getLblCasilla_18());
			panel1.add(getBtnCasilla_18());
			panel1.add(getLblCasilla_19());
			panel1.add(getBtnCasilla_19());
			panel1.add(getLblCasilla_20());
			panel1.add(getBtnCasilla_20());
			panel1.add(getLblCasilla_21());
			panel1.add(getBtnCasilla_21());
			panel1.add(getLblCasilla_22());
			panel1.add(getBtnCasilla_22());
			panel1.add(getLblCasilla_23());
			panel1.add(getBtnCasilla_23());
			panel1.add(getLblCasilla_24());
			panel1.add(getBtnCasilla_24());
			panel1.add(getLblCasilla_25());
			panel1.add(getBtnCasilla_25());
			panel1.add(getLblCasilla_26());
			panel1.add(getBtnCasilla_26());
			panel1.add(getLblCasilla_27());
			panel1.add(getBtnCasilla_27());
			panel1.add(getLblCasilla_28());
			panel1.add(getBtnCasilla_28());
			panel1.add(getLblCasilla_29());
			panel1.add(getBtnCasilla_29());
			panel1.add(getLblCasilla_30());
			panel1.add(getBtnCasilla_30());
			panel1.add(getLblCasilla_31());
			panel1.add(getBtnCasilla_31());
			panel1.add(getLblCasilla_00());
			panel1.add(getBtnCasilla_00());
			panel1.add(getLblCasilla_01());
			panel1.add(getBtnCasilla_01());
			panel1.add(getLblCasilla_02());
			panel1.add(getBtnCasilla_02());
			panel1.add(getLblCasilla_03());
			panel1.add(getBtnCasilla_03());
			panel1.add(getLblCasilla_35());
			panel1.add(getBtnCasilla_35());
			panel1.add(getLblCasilla_36());
			panel1.add(getBtnCasilla_36());
			panel1.add(getLblCasilla_37());
			panel1.add(getBtnCasilla_37());
			panel1.add(getLblCasilla_44());
			panel1.add(getBtnCasilla_44());
			panel1.add(getLblCasilla_43());
			panel1.add(getBtnCasilla_43());
			panel1.add(getLblCasilla_42());
			panel1.add(getBtnCasilla_42());
			panel1.add(getLblCasilla_41());
			panel1.add(getBtnCasilla_41());
			panel1.add(getLblCasilla_32());
			panel1.add(getBtnCasilla_32());
			panel1.add(getLblCasilla_33());
			panel1.add(getBtnCasilla_33());
			panel1.add(getLblCasilla_34());
			panel1.add(getBtnCasilla_34());
			panel1.add(getLblCasilla_40());
			panel1.add(getBtnCasilla_40());
			panel1.add(getLblCasilla_39());
			panel1.add(getBtnCasilla_39());
			panel1.add(getLblCasilla_38());
			panel1.add(getBtnCasilla_38());
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

					// Pedir número de usuarios antes de empezar.
					DialogoJugadores frame = new DialogoJugadores(ventanaPrincipal); 
					frame.setLocationRelativeTo(null); 
					frame.setDialogoJugadores(frame);
					frame.setVisible(true);
					frame.setModalityType(DialogoJugadores.ModalityType.APPLICATION_MODAL);
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
			lblFondoPcpal.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Fondo_Tablero_01.png")));
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
			lblQuesoRo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaRo_00_00_Az_Am.png")));
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
			lblQuesoVe.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaVe_Ro_Ve_00_00.png")));
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
			lblQuesoAm.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaAm_Ro_Ve_00_Am.png")));
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
			lblQuesoAz.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasBig/FichaAz_00_Ve_00_00.png")));
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
					
					//Acci�n al pulsar
					int numDado = trivial.lanzarDado();		
					lblDadoTirada.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Dado_0" + numDado +".png"))); //Cargar imagen con resultado de tirada
					lblDadoTirada.setVisible(true); //Mostrar imagen con tirada de dado
					lblMensajes.setText("elije casilla en el tablero"); //Cargar mensaje a mostrar
					lblMensajes.setVisible(true); //Mostrar label mensajes
					
					List<Integer> destinos = trivial.obtenerDestinos(listaJugadores.get(nJugadorTurnoActual).getCasillaActual(), numDado);
					
					for (Integer destino : destinos) {
						botonesTablero.get(destino).setVisible(true);
					}
					
					btnComenzar3.setVisible(false);					
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
			mnTemppruebas.add(getMntmNewMenuItem_6());
			mnTemppruebas.add(getMntmNewMenuItem_7());
			mnTemppruebas.add(getMntmNewMenuItem_5());
			mnTemppruebas.add(getMntmNewMenuItem_9());
		}
		return mnTemppruebas;
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
					
					//Men� TempPruebas > Tirar dado
					lblDadoImg.setVisible(false); //Ocultar imagen de dado
					btnComenzar3.setVisible(false); //Ocultar bot�n mensaje tirar
					lblDadoTirada.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Dado_06.png"))); //Cargar imagen con resultado de tirada
					lblDadoTirada.setVisible(true); //Mostrar imagen con tirada de dado
					lblMensajes.setText("elije casilla en el tablero"); //Cargar mensaje a mostrar
					lblMensajes.setVisible(true); //Mostrar label mensajes
					
					btnCasilla_04.setVisible(true); //Mostrar botones de las casillas
					btnCasilla_05.setVisible(true);
					btnCasilla_06.setVisible(true);
					btnCasilla_07.setVisible(true);
					btnCasilla_08.setVisible(true);
					btnCasilla_09.setVisible(true);
					btnCasilla_10.setVisible(true);
					btnCasilla_11.setVisible(true);
					btnCasilla_12.setVisible(true);
					btnCasilla_13.setVisible(true);
					btnCasilla_14.setVisible(true);
					btnCasilla_15.setVisible(true);
					btnCasilla_16.setVisible(true);
					btnCasilla_17.setVisible(true);
					btnCasilla_18.setVisible(true);
					btnCasilla_19.setVisible(true);
					btnCasilla_20.setVisible(true);
					btnCasilla_21.setVisible(true);
					btnCasilla_22.setVisible(true);
					btnCasilla_23.setVisible(true);
					btnCasilla_24.setVisible(true);
					btnCasilla_25.setVisible(true);
					btnCasilla_26.setVisible(true);
					btnCasilla_27.setVisible(true);
					btnCasilla_28.setVisible(true);
					btnCasilla_29.setVisible(true);
					btnCasilla_30.setVisible(true);
					btnCasilla_31.setVisible(true);
					btnCasilla_00.setVisible(true);
					btnCasilla_01.setVisible(true);
					btnCasilla_02.setVisible(true);
					btnCasilla_03.setVisible(true);
					btnCasilla_35.setVisible(true);
					btnCasilla_36.setVisible(true);
					btnCasilla_37.setVisible(true);
					btnCasilla_44.setVisible(true);
					btnCasilla_43.setVisible(true);
					btnCasilla_42.setVisible(true);
					btnCasilla_41.setVisible(true);
					btnCasilla_32.setVisible(true);
					btnCasilla_33.setVisible(true);
					btnCasilla_34.setVisible(true);
					btnCasilla_40.setVisible(true);
					btnCasilla_39.setVisible(true);
					btnCasilla_38.setVisible(true);

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
	private JButton getBtnCasilla_04() {
		if (btnCasilla_04 == null) {
			btnCasilla_04 = new JButton("");
			btnCasilla_04.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(4);
				}
			});
			btnCasilla_04.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_04.setVisible(false);
			btnCasilla_04.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_04.setRequestFocusEnabled(false);
			btnCasilla_04.setPreferredSize(new Dimension(245, 43));
			btnCasilla_04.setMinimumSize(new Dimension(245, 43));
			btnCasilla_04.setMaximumSize(new Dimension(245, 43));
			btnCasilla_04.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_04.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_04.setForeground(Color.WHITE);
			btnCasilla_04.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_04.setContentAreaFilled(false);
			btnCasilla_04.setBorder(null);
			btnCasilla_04.setBounds(382, 62, 55, 55);
		}
		return btnCasilla_04;
	}
	private JButton getBtnCasilla_05() {
		if (btnCasilla_05 == null) {
			btnCasilla_05 = new JButton("");
			btnCasilla_05.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(5);
				}
			});
			btnCasilla_05.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_05.setVisible(false);
			btnCasilla_05.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_05.setRequestFocusEnabled(false);
			btnCasilla_05.setPreferredSize(new Dimension(245, 43));
			btnCasilla_05.setMinimumSize(new Dimension(245, 43));
			btnCasilla_05.setMaximumSize(new Dimension(245, 43));
			btnCasilla_05.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_05.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_05.setForeground(Color.WHITE);
			btnCasilla_05.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_05.setContentAreaFilled(false);
			btnCasilla_05.setBorder(null);
			btnCasilla_05.setBounds(445, 62, 55, 55);
		}
		return btnCasilla_05;
	}

	private JButton getBtnCasilla_06() {
		if (btnCasilla_06 == null) {
			btnCasilla_06 = new JButton("");
			btnCasilla_06.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(6);
				}
			});
			btnCasilla_06.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_06.setVisible(false);
			btnCasilla_06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_06.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_06.setRequestFocusEnabled(false);
			btnCasilla_06.setPreferredSize(new Dimension(245, 43));
			btnCasilla_06.setMinimumSize(new Dimension(245, 43));
			btnCasilla_06.setMaximumSize(new Dimension(245, 43));
			btnCasilla_06.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_06.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_06.setForeground(Color.WHITE);
			btnCasilla_06.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_06.setContentAreaFilled(false);
			btnCasilla_06.setBorder(null);
			btnCasilla_06.setBounds(508, 62, 55, 55);
		}
		return btnCasilla_06;
	}
	private JButton getBtnCasilla_07() {
		if (btnCasilla_07 == null) {
			btnCasilla_07 = new JButton("");
			btnCasilla_07.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(7);
				}
			});
			btnCasilla_07.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_07.setVisible(false);
			btnCasilla_07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_07.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_07.setRequestFocusEnabled(false);
			btnCasilla_07.setPreferredSize(new Dimension(245, 43));
			btnCasilla_07.setMinimumSize(new Dimension(245, 43));
			btnCasilla_07.setMaximumSize(new Dimension(245, 43));
			btnCasilla_07.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_07.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_07.setForeground(Color.WHITE);
			btnCasilla_07.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_07.setContentAreaFilled(false);
			btnCasilla_07.setBorder(null);
			btnCasilla_07.setBounds(571, 62, 55, 55);
		}
		return btnCasilla_07;
	}
	protected JButton getBtnCasilla_08() {
		if (btnCasilla_08 == null) {
			btnCasilla_08 = new JButton("");
			btnCasilla_08.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(8);
				}
			});
			btnCasilla_08.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_08.setVisible(false);
			btnCasilla_08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_08.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_08.setRequestFocusEnabled(false);
			btnCasilla_08.setPreferredSize(new Dimension(245, 43));
			btnCasilla_08.setMinimumSize(new Dimension(245, 43));
			btnCasilla_08.setMaximumSize(new Dimension(245, 43));
			btnCasilla_08.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_08.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_08.setForeground(Color.WHITE);
			btnCasilla_08.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_08.setContentAreaFilled(false);
			btnCasilla_08.setBorder(null);
			btnCasilla_08.setBounds(634, 62, 55, 55);
		}
		return btnCasilla_08;
	}
	private JButton getBtnCasilla_09() {
		if (btnCasilla_09 == null) {
			btnCasilla_09 = new JButton("");
			btnCasilla_09.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(9);
				}
			});
			btnCasilla_09.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_09.setVisible(false);
			btnCasilla_09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_09.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_09.setRequestFocusEnabled(false);
			btnCasilla_09.setPreferredSize(new Dimension(245, 43));
			btnCasilla_09.setMinimumSize(new Dimension(245, 43));
			btnCasilla_09.setMaximumSize(new Dimension(245, 43));
			btnCasilla_09.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_09.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_09.setForeground(Color.WHITE);
			btnCasilla_09.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_09.setContentAreaFilled(false);
			btnCasilla_09.setBorder(null);
			btnCasilla_09.setBounds(697, 62, 55, 55);
		}
		return btnCasilla_09;
	}
	private JButton getBtnCasilla_10() {
		if (btnCasilla_10 == null) {
			btnCasilla_10 = new JButton("");
			btnCasilla_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(10);
				}
			});
			btnCasilla_10.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_10.setVisible(false);
			btnCasilla_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_10.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_10.setRequestFocusEnabled(false);
			btnCasilla_10.setPreferredSize(new Dimension(245, 43));
			btnCasilla_10.setMinimumSize(new Dimension(245, 43));
			btnCasilla_10.setMaximumSize(new Dimension(245, 43));
			btnCasilla_10.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_10.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_10.setForeground(Color.WHITE);
			btnCasilla_10.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_10.setContentAreaFilled(false);
			btnCasilla_10.setBorder(null);
			btnCasilla_10.setBounds(760, 62, 55, 55);
		}
		return btnCasilla_10;
	}
	private JButton getBtnCasilla_11() {
		if (btnCasilla_11 == null) {
			btnCasilla_11 = new JButton("");
			btnCasilla_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(11);
				}
			});
			btnCasilla_11.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_11.setVisible(false);
			btnCasilla_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_11.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_11.setRequestFocusEnabled(false);
			btnCasilla_11.setPreferredSize(new Dimension(245, 43));
			btnCasilla_11.setMinimumSize(new Dimension(245, 43));
			btnCasilla_11.setMaximumSize(new Dimension(245, 43));
			btnCasilla_11.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_11.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_11.setForeground(Color.WHITE);
			btnCasilla_11.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_11.setContentAreaFilled(false);
			btnCasilla_11.setBorder(null);
			btnCasilla_11.setBounds(823, 62, 55, 55);
		}
		return btnCasilla_11;
	}
	private JButton getBtnCasilla_12() {
		if (btnCasilla_12 == null) {
			btnCasilla_12 = new JButton("");
			btnCasilla_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(12);
				}
			});
			btnCasilla_12.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_12.setVisible(false);
			btnCasilla_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_12.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_12.setRequestFocusEnabled(false);
			btnCasilla_12.setPreferredSize(new Dimension(245, 43));
			btnCasilla_12.setMinimumSize(new Dimension(245, 43));
			btnCasilla_12.setMaximumSize(new Dimension(245, 43));
			btnCasilla_12.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_12.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_12.setForeground(Color.WHITE);
			btnCasilla_12.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_12.setContentAreaFilled(false);
			btnCasilla_12.setBorder(null);
			btnCasilla_12.setBounds(886, 62, 55, 55);
		}
		return btnCasilla_12;
	}
	private JButton getBtnCasilla_13() {
		if (btnCasilla_13 == null) {
			btnCasilla_13 = new JButton("");
			btnCasilla_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(13);
				}
			});
			btnCasilla_13.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_13.setVisible(false);
			btnCasilla_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_13.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_13.setRequestFocusEnabled(false);
			btnCasilla_13.setPreferredSize(new Dimension(245, 43));
			btnCasilla_13.setMinimumSize(new Dimension(245, 43));
			btnCasilla_13.setMaximumSize(new Dimension(245, 43));
			btnCasilla_13.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_13.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_13.setForeground(Color.WHITE);
			btnCasilla_13.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_13.setContentAreaFilled(false);
			btnCasilla_13.setBorder(null);
			btnCasilla_13.setBounds(886, 125, 55, 55);
		}
		return btnCasilla_13;
	}
	private JButton getBtnCasilla_14() {
		if (btnCasilla_14 == null) {
			btnCasilla_14 = new JButton("");
			btnCasilla_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(14);
				}
			});
			btnCasilla_14.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_14.setVisible(false);
			btnCasilla_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_14.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_14.setRequestFocusEnabled(false);
			btnCasilla_14.setPreferredSize(new Dimension(245, 43));
			btnCasilla_14.setMinimumSize(new Dimension(245, 43));
			btnCasilla_14.setMaximumSize(new Dimension(245, 43));
			btnCasilla_14.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_14.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_14.setForeground(Color.WHITE);
			btnCasilla_14.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_14.setContentAreaFilled(false);
			btnCasilla_14.setBorder(null);
			btnCasilla_14.setBounds(886, 188, 55, 55);
		}
		return btnCasilla_14;
	}
	private JButton getBtnCasilla_15() {
		if (btnCasilla_15 == null) {
			btnCasilla_15 = new JButton("");
			btnCasilla_15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(15);
				}
			});
			btnCasilla_15.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_15.setVisible(false);
			btnCasilla_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_15.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_15.setRequestFocusEnabled(false);
			btnCasilla_15.setPreferredSize(new Dimension(245, 43));
			btnCasilla_15.setMinimumSize(new Dimension(245, 43));
			btnCasilla_15.setMaximumSize(new Dimension(245, 43));
			btnCasilla_15.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_15.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_15.setForeground(Color.WHITE);
			btnCasilla_15.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_15.setContentAreaFilled(false);
			btnCasilla_15.setBorder(null);
			btnCasilla_15.setBounds(886, 251, 55, 55);
		}
		return btnCasilla_15;
	}
	JButton getBtnCasilla_16() {
		if (btnCasilla_16 == null) {
			btnCasilla_16 = new JButton("");
			btnCasilla_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(16);
				}
			});
			btnCasilla_16.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_16.setVisible(false);
			btnCasilla_16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_16.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_16.setRequestFocusEnabled(false);
			btnCasilla_16.setPreferredSize(new Dimension(245, 43));
			btnCasilla_16.setMinimumSize(new Dimension(245, 43));
			btnCasilla_16.setMaximumSize(new Dimension(245, 43));
			btnCasilla_16.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_16.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_16.setForeground(Color.WHITE);
			btnCasilla_16.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_16.setContentAreaFilled(false);
			btnCasilla_16.setBorder(null);
			btnCasilla_16.setBounds(886, 314, 55, 55);
		}
		return btnCasilla_16;
	}
	private JButton getBtnCasilla_17() {
		if (btnCasilla_17 == null) {
			btnCasilla_17 = new JButton("");
			btnCasilla_17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(17);
				}
			});
			btnCasilla_17.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_17.setVisible(false);
			btnCasilla_17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_17.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_17.setRequestFocusEnabled(false);
			btnCasilla_17.setPreferredSize(new Dimension(245, 43));
			btnCasilla_17.setMinimumSize(new Dimension(245, 43));
			btnCasilla_17.setMaximumSize(new Dimension(245, 43));
			btnCasilla_17.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_17.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_17.setForeground(Color.WHITE);
			btnCasilla_17.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_17.setContentAreaFilled(false);
			btnCasilla_17.setBorder(null);
			btnCasilla_17.setBounds(886, 377, 55, 55);
		}
		return btnCasilla_17;
	}
	private JButton getBtnCasilla_18() {
		if (btnCasilla_18 == null) {
			btnCasilla_18 = new JButton("");
			btnCasilla_18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(18);
				}
			});
			btnCasilla_18.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_18.setVisible(false);
			btnCasilla_18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_18.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_18.setRequestFocusEnabled(false);
			btnCasilla_18.setPreferredSize(new Dimension(245, 43));
			btnCasilla_18.setMinimumSize(new Dimension(245, 43));
			btnCasilla_18.setMaximumSize(new Dimension(245, 43));
			btnCasilla_18.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_18.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_18.setForeground(Color.WHITE);
			btnCasilla_18.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_18.setContentAreaFilled(false);
			btnCasilla_18.setBorder(null);
			btnCasilla_18.setBounds(886, 440, 55, 55);
		}
		return btnCasilla_18;
	}
	private JButton getBtnCasilla_19() {
		if (btnCasilla_19 == null) {
			btnCasilla_19 = new JButton("");
			btnCasilla_19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(19);
				}
			});
			btnCasilla_19.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_19.setVisible(false);
			btnCasilla_19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_19.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_19.setRequestFocusEnabled(false);
			btnCasilla_19.setPreferredSize(new Dimension(245, 43));
			btnCasilla_19.setMinimumSize(new Dimension(245, 43));
			btnCasilla_19.setMaximumSize(new Dimension(245, 43));
			btnCasilla_19.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_19.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_19.setForeground(Color.WHITE);
			btnCasilla_19.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_19.setContentAreaFilled(false);
			btnCasilla_19.setBorder(null);
			btnCasilla_19.setBounds(886, 503, 55, 55);
		}
		return btnCasilla_19;
	}
	private JButton getBtnCasilla_20() {
		if (btnCasilla_20 == null) {
			btnCasilla_20 = new JButton("");
			btnCasilla_20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(20);
				}
			});
			btnCasilla_20.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_20.setVisible(false);
			btnCasilla_20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_20.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_20.setRequestFocusEnabled(false);
			btnCasilla_20.setPreferredSize(new Dimension(245, 43));
			btnCasilla_20.setMinimumSize(new Dimension(245, 43));
			btnCasilla_20.setMaximumSize(new Dimension(245, 43));
			btnCasilla_20.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_20.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_20.setForeground(Color.WHITE);
			btnCasilla_20.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_20.setContentAreaFilled(false);
			btnCasilla_20.setBorder(null);
			btnCasilla_20.setBounds(886, 566, 55, 55);
		}
		return btnCasilla_20;
	}
	private JButton getBtnCasilla_21() {
		if (btnCasilla_21 == null) {
			btnCasilla_21 = new JButton("");
			btnCasilla_21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(21);
				}
			});
			btnCasilla_21.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_21.setVisible(false);
			btnCasilla_21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_21.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_21.setRequestFocusEnabled(false);
			btnCasilla_21.setPreferredSize(new Dimension(245, 43));
			btnCasilla_21.setMinimumSize(new Dimension(245, 43));
			btnCasilla_21.setMaximumSize(new Dimension(245, 43));
			btnCasilla_21.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_21.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_21.setForeground(Color.WHITE);
			btnCasilla_21.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_21.setContentAreaFilled(false);
			btnCasilla_21.setBorder(null);
			btnCasilla_21.setBounds(823, 566, 55, 55);
		}
		return btnCasilla_21;
	}
	private JButton getBtnCasilla_22() {
		if (btnCasilla_22 == null) {
			btnCasilla_22 = new JButton("");
			btnCasilla_22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(22);
				}
			});
			btnCasilla_22.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_22.setVisible(false);
			btnCasilla_22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_22.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_22.setRequestFocusEnabled(false);
			btnCasilla_22.setPreferredSize(new Dimension(245, 43));
			btnCasilla_22.setMinimumSize(new Dimension(245, 43));
			btnCasilla_22.setMaximumSize(new Dimension(245, 43));
			btnCasilla_22.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_22.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_22.setForeground(Color.WHITE);
			btnCasilla_22.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_22.setContentAreaFilled(false);
			btnCasilla_22.setBorder(null);
			btnCasilla_22.setBounds(760, 566, 55, 55);
		}
		return btnCasilla_22;
	}
	private JButton getBtnCasilla_23() {
		if (btnCasilla_23 == null) {
			btnCasilla_23 = new JButton("");
			btnCasilla_23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(23);
				}
			});
			btnCasilla_23.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_23.setVisible(false);
			btnCasilla_23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_23.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_23.setRequestFocusEnabled(false);
			btnCasilla_23.setPreferredSize(new Dimension(245, 43));
			btnCasilla_23.setMinimumSize(new Dimension(245, 43));
			btnCasilla_23.setMaximumSize(new Dimension(245, 43));
			btnCasilla_23.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_23.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_23.setForeground(Color.WHITE);
			btnCasilla_23.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_23.setContentAreaFilled(false);
			btnCasilla_23.setBorder(null);
			btnCasilla_23.setBounds(697, 566, 55, 55);
		}
		return btnCasilla_23;
	}
	JButton getBtnCasilla_24() {
		if (btnCasilla_24 == null) {
			btnCasilla_24 = new JButton("");
			btnCasilla_24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(24);
				}
			});
			btnCasilla_24.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_24.setVisible(false);
			btnCasilla_24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_24.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_24.setRequestFocusEnabled(false);
			btnCasilla_24.setPreferredSize(new Dimension(245, 43));
			btnCasilla_24.setMinimumSize(new Dimension(245, 43));
			btnCasilla_24.setMaximumSize(new Dimension(245, 43));
			btnCasilla_24.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_24.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_24.setForeground(Color.WHITE);
			btnCasilla_24.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_24.setContentAreaFilled(false);
			btnCasilla_24.setBorder(null);
			btnCasilla_24.setBounds(634, 566, 55, 55);
		}
		return btnCasilla_24;
	}
	private JButton getBtnCasilla_25() {
		if (btnCasilla_25 == null) {
			btnCasilla_25 = new JButton("");
			btnCasilla_25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(25);
				}
			});
			btnCasilla_25.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_25.setVisible(false);
			btnCasilla_25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_25.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_25.setRequestFocusEnabled(false);
			btnCasilla_25.setPreferredSize(new Dimension(245, 43));
			btnCasilla_25.setMinimumSize(new Dimension(245, 43));
			btnCasilla_25.setMaximumSize(new Dimension(245, 43));
			btnCasilla_25.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_25.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_25.setForeground(Color.WHITE);
			btnCasilla_25.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_25.setContentAreaFilled(false);
			btnCasilla_25.setBorder(null);
			btnCasilla_25.setBounds(571, 566, 55, 55);
		}
		return btnCasilla_25;
	}
	private JButton getBtnCasilla_26() {
		if (btnCasilla_26 == null) {
			btnCasilla_26 = new JButton("");
			btnCasilla_26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					nuevaTirada(26);
				}
			});
			btnCasilla_26.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_26.setVisible(false);
			btnCasilla_26.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_26.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_26.setRequestFocusEnabled(false);
			btnCasilla_26.setPreferredSize(new Dimension(245, 43));
			btnCasilla_26.setMinimumSize(new Dimension(245, 43));
			btnCasilla_26.setMaximumSize(new Dimension(245, 43));
			btnCasilla_26.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_26.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_26.setForeground(Color.WHITE);
			btnCasilla_26.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_26.setContentAreaFilled(false);
			btnCasilla_26.setBorder(null);
			btnCasilla_26.setBounds(508, 566, 55, 55);
		}
		return btnCasilla_26;
	}
	private JButton getBtnCasilla_27() {
		if (btnCasilla_27 == null) {
			btnCasilla_27 = new JButton("");
			btnCasilla_27.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(27);
				}
			});
			btnCasilla_27.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_27.setVisible(false);
			btnCasilla_27.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_27.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_27.setRequestFocusEnabled(false);
			btnCasilla_27.setPreferredSize(new Dimension(245, 43));
			btnCasilla_27.setMinimumSize(new Dimension(245, 43));
			btnCasilla_27.setMaximumSize(new Dimension(245, 43));
			btnCasilla_27.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_27.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_27.setForeground(Color.WHITE);
			btnCasilla_27.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_27.setContentAreaFilled(false);
			btnCasilla_27.setBorder(null);
			btnCasilla_27.setBounds(445, 566, 55, 55);
		}
		return btnCasilla_27;
	}
	private JButton getBtnCasilla_28() {
		if (btnCasilla_28 == null) {
			btnCasilla_28 = new JButton("");
			btnCasilla_28.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(28);
				}
			});
			btnCasilla_28.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_28.setVisible(false);
			btnCasilla_28.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_28.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_28.setRequestFocusEnabled(false);
			btnCasilla_28.setPreferredSize(new Dimension(245, 43));
			btnCasilla_28.setMinimumSize(new Dimension(245, 43));
			btnCasilla_28.setMaximumSize(new Dimension(245, 43));
			btnCasilla_28.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_28.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_28.setForeground(Color.WHITE);
			btnCasilla_28.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_28.setContentAreaFilled(false);
			btnCasilla_28.setBorder(null);
			btnCasilla_28.setBounds(382, 566, 55, 55);
		}
		return btnCasilla_28;
	}
	private JButton getBtnCasilla_29() {
		if (btnCasilla_29 == null) {
			btnCasilla_29 = new JButton("");
			btnCasilla_29.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(29);
				}
			});
			btnCasilla_29.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_29.setVisible(false);
			btnCasilla_29.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_29.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_29.setRequestFocusEnabled(false);
			btnCasilla_29.setPreferredSize(new Dimension(245, 43));
			btnCasilla_29.setMinimumSize(new Dimension(245, 43));
			btnCasilla_29.setMaximumSize(new Dimension(245, 43));
			btnCasilla_29.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_29.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_29.setForeground(Color.WHITE);
			btnCasilla_29.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_29.setContentAreaFilled(false);
			btnCasilla_29.setBorder(null);
			btnCasilla_29.setBounds(382, 503, 55, 55);
		}
		return btnCasilla_29;
	}
	private JButton getBtnCasilla_30() {
		if (btnCasilla_30 == null) {
			btnCasilla_30 = new JButton("");
			btnCasilla_30.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(30);
				}
			});
			btnCasilla_30.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_30.setVisible(false);
			btnCasilla_30.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_30.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_30.setRequestFocusEnabled(false);
			btnCasilla_30.setPreferredSize(new Dimension(245, 43));
			btnCasilla_30.setMinimumSize(new Dimension(245, 43));
			btnCasilla_30.setMaximumSize(new Dimension(245, 43));
			btnCasilla_30.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_30.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_30.setForeground(Color.WHITE);
			btnCasilla_30.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_30.setContentAreaFilled(false);
			btnCasilla_30.setBorder(null);
			btnCasilla_30.setBounds(382, 440, 55, 55);
		}
		return btnCasilla_30;
	}
	private JButton getBtnCasilla_31() {
		if (btnCasilla_31 == null) {
			btnCasilla_31 = new JButton("");
			btnCasilla_31.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(31);
				}
			});
			btnCasilla_31.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_31.setVisible(false);
			btnCasilla_31.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_31.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_31.setRequestFocusEnabled(false);
			btnCasilla_31.setPreferredSize(new Dimension(245, 43));
			btnCasilla_31.setMinimumSize(new Dimension(245, 43));
			btnCasilla_31.setMaximumSize(new Dimension(245, 43));
			btnCasilla_31.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_31.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_31.setForeground(Color.WHITE);
			btnCasilla_31.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_31.setContentAreaFilled(false);
			btnCasilla_31.setBorder(null);
			btnCasilla_31.setBounds(382, 377, 55, 55);
		}
		return btnCasilla_31;
	}
	public JButton getBtnCasilla_00() {
		if (btnCasilla_00 == null) {
			btnCasilla_00 = new JButton("");
			btnCasilla_00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(0);
				}
			});
			btnCasilla_00.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_00.setVisible(false);
			btnCasilla_00.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_00.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_00.setRequestFocusEnabled(false);
			btnCasilla_00.setPreferredSize(new Dimension(245, 43));
			btnCasilla_00.setMinimumSize(new Dimension(245, 43));
			btnCasilla_00.setMaximumSize(new Dimension(245, 43));
			btnCasilla_00.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_00.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_00.setForeground(Color.WHITE);
			btnCasilla_00.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_00.setContentAreaFilled(false);
			btnCasilla_00.setBorder(null);
			btnCasilla_00.setBounds(382, 314, 55, 55);
		}
		return btnCasilla_00;
	}
	private JButton getBtnCasilla_01() {
		if (btnCasilla_01 == null) {
			btnCasilla_01 = new JButton("");
			btnCasilla_01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(1);
				}
			});
			btnCasilla_01.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_01.setVisible(false);
			btnCasilla_01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_01.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_01.setRequestFocusEnabled(false);
			btnCasilla_01.setPreferredSize(new Dimension(245, 43));
			btnCasilla_01.setMinimumSize(new Dimension(245, 43));
			btnCasilla_01.setMaximumSize(new Dimension(245, 43));
			btnCasilla_01.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_01.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_01.setForeground(Color.WHITE);
			btnCasilla_01.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_01.setContentAreaFilled(false);
			btnCasilla_01.setBorder(null);
			btnCasilla_01.setBounds(382, 251, 55, 55);
		}
		return btnCasilla_01;
	}
	private JButton getBtnCasilla_02() {
		if (btnCasilla_02 == null) {
			btnCasilla_02 = new JButton("");
			btnCasilla_02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(2);
				}
			});
			btnCasilla_02.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_02.setVisible(false);
			btnCasilla_02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_02.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_02.setRequestFocusEnabled(false);
			btnCasilla_02.setPreferredSize(new Dimension(245, 43));
			btnCasilla_02.setMinimumSize(new Dimension(245, 43));
			btnCasilla_02.setMaximumSize(new Dimension(245, 43));
			btnCasilla_02.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_02.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_02.setForeground(Color.WHITE);
			btnCasilla_02.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_02.setContentAreaFilled(false);
			btnCasilla_02.setBorder(null);
			btnCasilla_02.setBounds(382, 188, 55, 55);
		}
		return btnCasilla_02;
	}
	private JButton getBtnCasilla_03() {
		if (btnCasilla_03 == null) {
			btnCasilla_03 = new JButton("");
			btnCasilla_03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(3);
				}
			});
			btnCasilla_03.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_03.setVisible(false);
			btnCasilla_03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_03.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_03.setRequestFocusEnabled(false);
			btnCasilla_03.setPreferredSize(new Dimension(245, 43));
			btnCasilla_03.setMinimumSize(new Dimension(245, 43));
			btnCasilla_03.setMaximumSize(new Dimension(245, 43));
			btnCasilla_03.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_03.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_03.setForeground(Color.WHITE);
			btnCasilla_03.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_03.setContentAreaFilled(false);
			btnCasilla_03.setBorder(null);
			btnCasilla_03.setBounds(382, 125, 55, 55);
		}
		return btnCasilla_03;
	}
	private JButton getBtnCasilla_35() {
		if (btnCasilla_35 == null) {
			btnCasilla_35 = new JButton("");
			btnCasilla_35.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(35);
				}
			});
			btnCasilla_35.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_35.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_35.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_35.setVisible(false);
			btnCasilla_35.setRequestFocusEnabled(false);
			btnCasilla_35.setPreferredSize(new Dimension(245, 43));
			btnCasilla_35.setMinimumSize(new Dimension(245, 43));
			btnCasilla_35.setMaximumSize(new Dimension(245, 43));
			btnCasilla_35.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_35.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_35.setForeground(Color.WHITE);
			btnCasilla_35.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_35.setContentAreaFilled(false);
			btnCasilla_35.setBorder(null);
			btnCasilla_35.setBounds(634, 125, 55, 55);
		}
		return btnCasilla_35;
	}
	private JButton getBtnCasilla_36() {
		if (btnCasilla_36 == null) {
			btnCasilla_36 = new JButton("");
			btnCasilla_36.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(36);
				}
			});
			btnCasilla_36.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_36.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_36.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_36.setVisible(false);
			btnCasilla_36.setRequestFocusEnabled(false);
			btnCasilla_36.setPreferredSize(new Dimension(245, 43));
			btnCasilla_36.setMinimumSize(new Dimension(245, 43));
			btnCasilla_36.setMaximumSize(new Dimension(245, 43));
			btnCasilla_36.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_36.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_36.setForeground(Color.WHITE);
			btnCasilla_36.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_36.setContentAreaFilled(false);
			btnCasilla_36.setBorder(null);
			btnCasilla_36.setBounds(634, 188, 55, 55);
		}
		return btnCasilla_36;
	}
	private JButton getBtnCasilla_37() {
		if (btnCasilla_37 == null) {
			btnCasilla_37 = new JButton("");
			btnCasilla_37.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(37);
				}
			});
			btnCasilla_37.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_37.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_37.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_37.setVisible(false);
			btnCasilla_37.setRequestFocusEnabled(false);
			btnCasilla_37.setPreferredSize(new Dimension(245, 43));
			btnCasilla_37.setMinimumSize(new Dimension(245, 43));
			btnCasilla_37.setMaximumSize(new Dimension(245, 43));
			btnCasilla_37.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_37.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_37.setForeground(Color.WHITE);
			btnCasilla_37.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_37.setContentAreaFilled(false);
			btnCasilla_37.setBorder(null);
			btnCasilla_37.setBounds(634, 251, 55, 55);
		}
		return btnCasilla_37;
	}
	private JButton getBtnCasilla_44() {
		if (btnCasilla_44 == null) {
			btnCasilla_44 = new JButton("");
			btnCasilla_44.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(44);
				}
			});
			btnCasilla_44.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_44.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_44.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_44.setVisible(false);
			btnCasilla_44.setRequestFocusEnabled(false);
			btnCasilla_44.setPreferredSize(new Dimension(245, 43));
			btnCasilla_44.setMinimumSize(new Dimension(245, 43));
			btnCasilla_44.setMaximumSize(new Dimension(245, 43));
			btnCasilla_44.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_44.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_44.setForeground(Color.WHITE);
			btnCasilla_44.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_44.setContentAreaFilled(false);
			btnCasilla_44.setBorder(null);
			btnCasilla_44.setBounds(634, 314, 55, 55);
		}
		return btnCasilla_44;
	}
	private JButton getBtnCasilla_43() {
		if (btnCasilla_43 == null) {
			btnCasilla_43 = new JButton("");
			btnCasilla_43.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(43);
				}
			});
			btnCasilla_43.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_43.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_43.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_43.setVisible(false);
			btnCasilla_43.setRequestFocusEnabled(false);
			btnCasilla_43.setPreferredSize(new Dimension(245, 43));
			btnCasilla_43.setMinimumSize(new Dimension(245, 43));
			btnCasilla_43.setMaximumSize(new Dimension(245, 43));
			btnCasilla_43.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_43.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_43.setForeground(Color.WHITE);
			btnCasilla_43.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_43.setContentAreaFilled(false);
			btnCasilla_43.setBorder(null);
			btnCasilla_43.setBounds(634, 377, 55, 55);
		}
		return btnCasilla_43;
	}
	private JButton getBtnCasilla_42() {
		if (btnCasilla_42 == null) {
			btnCasilla_42 = new JButton("");
			btnCasilla_42.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(42);
				}
			});
			btnCasilla_42.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_42.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_42.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_42.setVisible(false);
			btnCasilla_42.setRequestFocusEnabled(false);
			btnCasilla_42.setPreferredSize(new Dimension(245, 43));
			btnCasilla_42.setMinimumSize(new Dimension(245, 43));
			btnCasilla_42.setMaximumSize(new Dimension(245, 43));
			btnCasilla_42.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_42.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_42.setForeground(Color.WHITE);
			btnCasilla_42.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_42.setContentAreaFilled(false);
			btnCasilla_42.setBorder(null);
			btnCasilla_42.setBounds(634, 440, 55, 55);
		}
		return btnCasilla_42;
	}
	private JButton getBtnCasilla_41() {
		if (btnCasilla_41 == null) {
			btnCasilla_41 = new JButton("");
			btnCasilla_41.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(41);
				}
			});
			btnCasilla_41.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_41.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_41.setVisible(false);
			btnCasilla_41.setRequestFocusEnabled(false);
			btnCasilla_41.setPreferredSize(new Dimension(245, 43));
			btnCasilla_41.setMinimumSize(new Dimension(245, 43));
			btnCasilla_41.setMaximumSize(new Dimension(245, 43));
			btnCasilla_41.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_41.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_41.setForeground(Color.WHITE);
			btnCasilla_41.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_41.setContentAreaFilled(false);
			btnCasilla_41.setBorder(null);
			btnCasilla_41.setBounds(634, 503, 55, 55);
		}
		return btnCasilla_41;
	}
	private JButton getBtnCasilla_32() {
		if (btnCasilla_32 == null) {
			btnCasilla_32 = new JButton("");
			btnCasilla_32.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(32);
				}
			});
			btnCasilla_32.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_32.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_32.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_32.setVisible(false);
			btnCasilla_32.setRequestFocusEnabled(false);
			btnCasilla_32.setPreferredSize(new Dimension(245, 43));
			btnCasilla_32.setMinimumSize(new Dimension(245, 43));
			btnCasilla_32.setMaximumSize(new Dimension(245, 43));
			btnCasilla_32.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_32.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_32.setForeground(Color.WHITE);
			btnCasilla_32.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_32.setContentAreaFilled(false);
			btnCasilla_32.setBorder(null);
			btnCasilla_32.setBounds(445, 314, 55, 55);
		}
		return btnCasilla_32;
	}
	private JButton getBtnCasilla_33() {
		if (btnCasilla_33 == null) {
			btnCasilla_33 = new JButton("");
			btnCasilla_33.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(33);
				}
			});
			btnCasilla_33.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_33.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_33.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_33.setVisible(false);
			btnCasilla_33.setRequestFocusEnabled(false);
			btnCasilla_33.setPreferredSize(new Dimension(245, 43));
			btnCasilla_33.setMinimumSize(new Dimension(245, 43));
			btnCasilla_33.setMaximumSize(new Dimension(245, 43));
			btnCasilla_33.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_33.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_33.setForeground(Color.WHITE);
			btnCasilla_33.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_33.setContentAreaFilled(false);
			btnCasilla_33.setBorder(null);
			btnCasilla_33.setBounds(508, 314, 55, 55);
		}
		return btnCasilla_33;
	}
	private JButton getBtnCasilla_34() {
		if (btnCasilla_34 == null) {
			btnCasilla_34 = new JButton("");
			btnCasilla_34.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(34);
				}
			});
			btnCasilla_34.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_34.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_34.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_34.setVisible(false);
			btnCasilla_34.setRequestFocusEnabled(false);
			btnCasilla_34.setPreferredSize(new Dimension(245, 43));
			btnCasilla_34.setMinimumSize(new Dimension(245, 43));
			btnCasilla_34.setMaximumSize(new Dimension(245, 43));
			btnCasilla_34.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_34.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_34.setForeground(Color.WHITE);
			btnCasilla_34.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_34.setContentAreaFilled(false);
			btnCasilla_34.setBorder(null);
			btnCasilla_34.setBounds(571, 314, 55, 55);
		}
		return btnCasilla_34;
	}
	private JButton getBtnCasilla_40() {
		if (btnCasilla_40 == null) {
			btnCasilla_40 = new JButton("");
			btnCasilla_40.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(40);
				}
			});
			btnCasilla_40.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_40.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_40.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_40.setVisible(false);
			btnCasilla_40.setRequestFocusEnabled(false);
			btnCasilla_40.setPreferredSize(new Dimension(245, 43));
			btnCasilla_40.setMinimumSize(new Dimension(245, 43));
			btnCasilla_40.setMaximumSize(new Dimension(245, 43));
			btnCasilla_40.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_40.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_40.setForeground(Color.WHITE);
			btnCasilla_40.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_40.setContentAreaFilled(false);
			btnCasilla_40.setBorder(null);
			btnCasilla_40.setBounds(697, 314, 55, 55);
		}
		return btnCasilla_40;
	}
	private JButton getBtnCasilla_39() {
		if (btnCasilla_39 == null) {
			btnCasilla_39 = new JButton("");
			btnCasilla_39.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(39);
				}
			});
			btnCasilla_39.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_39.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_39.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_39.setVisible(false);
			btnCasilla_39.setRequestFocusEnabled(false);
			btnCasilla_39.setPreferredSize(new Dimension(245, 43));
			btnCasilla_39.setMinimumSize(new Dimension(245, 43));
			btnCasilla_39.setMaximumSize(new Dimension(245, 43));
			btnCasilla_39.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_39.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_39.setForeground(Color.WHITE);
			btnCasilla_39.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_39.setContentAreaFilled(false);
			btnCasilla_39.setBorder(null);
			btnCasilla_39.setBounds(760, 314, 55, 55);
		}
		return btnCasilla_39;
	}
	private JButton getBtnCasilla_38() {
		if (btnCasilla_38 == null) {
			btnCasilla_38 = new JButton("");
			btnCasilla_38.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nuevaTirada(38);
				}
			});
			btnCasilla_38.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir_over.png")));
			btnCasilla_38.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCasilla_38.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Casilla_ir.png")));
			btnCasilla_38.setVisible(false);
			btnCasilla_38.setRequestFocusEnabled(false);
			btnCasilla_38.setPreferredSize(new Dimension(245, 43));
			btnCasilla_38.setMinimumSize(new Dimension(245, 43));
			btnCasilla_38.setMaximumSize(new Dimension(245, 43));
			btnCasilla_38.setMargin(new Insets(0, 0, 0, 0));
			btnCasilla_38.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCasilla_38.setForeground(Color.WHITE);
			btnCasilla_38.setFont(new Font("Arial", Font.PLAIN, 20));
			btnCasilla_38.setContentAreaFilled(false);
			btnCasilla_38.setBorder(null);
			btnCasilla_38.setBounds(823, 314, 55, 55);
		}
		return btnCasilla_38;
	}
	private JMenuItem getMntmNewMenuItem_8() {
		if (mntmNewMenuItem_8 == null) {
			mntmNewMenuItem_8 = new JMenuItem("Ajustes");
			mntmNewMenuItem_8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
			mntmNewMenuItem_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Men� Juego > Ajustes
					// Mostrar Di�logo de ajustes
					DialogoAjustes frame = new DialogoAjustes(); 
					frame.setLocationRelativeTo(null); 
					frame.setVisible(true);
					frame.setModalityType(DialogoAjustes.ModalityType.APPLICATION_MODAL);
					
				}
			});
			mntmNewMenuItem_8.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ico_16x16_Ajustes.png")));
			mntmNewMenuItem_8.setFont(new Font("Arial", Font.PLAIN, 15));
		}
		return mntmNewMenuItem_8;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("1 - Tirar dado > tirada: 4");
			mntmNewMenuItem_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_5.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Código de la acción
					
					//Mostrar posibles casillas destino para mover 4 (mostrar botones)
					btnCasilla_35.setVisible(true);
					btnCasilla_38.setVisible(true);
					btnCasilla_41.setVisible(true);
					btnCasilla_01.setVisible(true);
					btnCasilla_31.setVisible(true);
					
					//Mostrar Dado con la tirada (4)
					lblDadoImg.setVisible(false); //Ocultar imagen de dado
					btnComenzar3.setVisible(false); //Ocultar botón mensaje tirar
					lblDadoTirada.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Dado_04.png"))); //Cargar imagen con resultado de tirada
					lblDadoTirada.setVisible(true); //Mostrar imagen con tirada de dado
					lblMensajes.setText("elije casilla en el tablero"); //Cargar mensaje a mostrar
					lblMensajes.setVisible(true); //Mostrar label mensajes
					
					
				}
			});
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_7() {
		if (mntmNewMenuItem_7 == null) {
			mntmNewMenuItem_7 = new JMenuItem("0 - Posición de partida");
			mntmNewMenuItem_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_7.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//Código de la acción
					
					//Ficha Rosa del jugador 1 en la casilla 34 (imagen en la label, label visible)
					lblCasilla_34.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaRo_00_00_Az_Am.png")));
					lblCasilla_34.setVisible(true);
					
					//Ficha Verde del jugador 2 en la casilla 36 (imagen en la label, label visible)
					lblCasilla_36.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaVe_Ro_Ve_00_00.png")));
					lblCasilla_36.setVisible(true);
					
					//Ficha Amarilla del jugador 3 en la casilla 02 (imagen en la label, label visible)
					lblCasilla_02.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAm_Ro_Ve_00_Am.png")));
					lblCasilla_02.setVisible(true);
					
					//Ficha Azul del jugador 4 en la casilla 40 (imagen en la label, label visible)
					lblCasilla_40.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaAz_00_Ve_00_Am.png")));
					lblCasilla_40.setVisible(true);
						
				}
			});
		}
		return mntmNewMenuItem_7;
	}
	private JMenuItem getMntmNewMenuItem_9() {
		if (mntmNewMenuItem_9 == null) {
			mntmNewMenuItem_9 = new JMenuItem("2 - Casilla destino > mover");
			mntmNewMenuItem_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmNewMenuItem_9.setFont(new Font("Arial", Font.PLAIN, 15));
			mntmNewMenuItem_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Código de la acción
					
					//Mover 34 --> 38
					lblCasilla_34.setVisible(false);
					
					lblCasilla_38.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/FichasSmall/FichaRo_00_00_Az_Am.png")));
					lblCasilla_38.setVisible(true);
					
					btnCasilla_35.setVisible(false);
					btnCasilla_38.setVisible(false);
					btnCasilla_41.setVisible(false);
					btnCasilla_01.setVisible(false);
					btnCasilla_31.setVisible(false);

				}
			});
		}
		return mntmNewMenuItem_9;
	}
	private JLabel getLblCasilla_33() {
		if (lblCasilla_33 == null) {
			lblCasilla_33 = new JLabel("");
			lblCasilla_33.setVisible(false);
			lblCasilla_33.setBounds(508, 314, 55, 55);
		}
		return lblCasilla_33;
	}
	private JLabel getLblCasilla_34() {
		if (lblCasilla_34 == null) {
			lblCasilla_34 = new JLabel("");
			lblCasilla_34.setVisible(false);
			lblCasilla_34.setBounds(571, 314, 55, 55);
		}
		return lblCasilla_34;
	}
	private JLabel getLblCasilla_02() {
		if (lblCasilla_02 == null) {
			lblCasilla_02 = new JLabel("");
			lblCasilla_02.setVisible(false);
			lblCasilla_02.setBounds(382, 188, 55, 55);
		}
		return lblCasilla_02;
	}
	private JLabel getLblCasilla_30() {
		if (lblCasilla_30 == null) {
			lblCasilla_30 = new JLabel("");
			lblCasilla_30.setVisible(false);
			lblCasilla_30.setBounds(382, 440, 55, 55);
		}
		return lblCasilla_30;
	}
	JLabel getLblCasilla_16() {
		if (lblCasilla_16 == null) {
			lblCasilla_16 = new JLabel("");
			lblCasilla_16.setVisible(false);
			lblCasilla_16.setBounds(886, 314, 55, 55);
		}
		return lblCasilla_16;
	}
	JLabel getLblCasilla_08() {
		if (lblCasilla_08 == null) {
			lblCasilla_08 = new JLabel("");
			lblCasilla_08.setVisible(false);
			lblCasilla_08.setBounds(634, 62, 55, 55);
		}
		return lblCasilla_08;
	}
	JLabel getLblCasilla_24() {
		if (lblCasilla_24 == null) {
			lblCasilla_24 = new JLabel("");
			lblCasilla_24.setVisible(false);
			lblCasilla_24.setBounds(634, 566, 55, 55);
		}
		return lblCasilla_24;
	}
	private JLabel getLblCasilla_36() {
		if (lblCasilla_36 == null) {
			lblCasilla_36 = new JLabel("");
			lblCasilla_36.setVisible(false);
			lblCasilla_36.setBounds(634, 188, 55, 55);
		}
		return lblCasilla_36;
	}
	private JLabel getLblCasilla_40() {
		if (lblCasilla_40 == null) {
			lblCasilla_40 = new JLabel("");
			lblCasilla_40.setVisible(false);
			lblCasilla_40.setBounds(697, 314, 55, 55);
		}
		return lblCasilla_40;
	}
	private JLabel getLblCasilla_04() {
		if (lblCasilla_04 == null) {
			lblCasilla_04 = new JLabel("");
			lblCasilla_04.setVisible(false);
			lblCasilla_04.setBounds(382, 62, 55, 55);
		}
		return lblCasilla_04;
	}
	private JLabel getLblCasilla_05() {
		if (lblCasilla_05 == null) {
			lblCasilla_05 = new JLabel("");
			lblCasilla_05.setVisible(false);
			lblCasilla_05.setBounds(445, 62, 55, 55);
		}
		return lblCasilla_05;
	}
	private JLabel getLblCasilla_06() {
		if (lblCasilla_06 == null) {
			lblCasilla_06 = new JLabel("");
			lblCasilla_06.setVisible(false);
			lblCasilla_06.setBounds(508, 62, 55, 55);
		}
		return lblCasilla_06;
	}
	private JLabel getLblCasilla_07() {
		if (lblCasilla_07 == null) {
			lblCasilla_07 = new JLabel("");
			lblCasilla_07.setVisible(false);
			lblCasilla_07.setBounds(571, 62, 55, 55);
		}
		return lblCasilla_07;
	}
	private JLabel getLblCasilla_09() {
		if (lblCasilla_09 == null) {
			lblCasilla_09 = new JLabel("");
			lblCasilla_09.setVisible(false);
			lblCasilla_09.setBounds(697, 62, 55, 55);
		}
		return lblCasilla_09;
	}
	private JLabel getLblCasilla_10() {
		if (lblCasilla_10 == null) {
			lblCasilla_10 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_10.setBounds(760, 62, 55, 55);
		}
		return lblCasilla_10;
	}
	private JLabel getLblCasilla_38() {
		if (lblCasilla_38 == null) {
			lblCasilla_38 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_38.setBounds(823, 314, 55, 55);
		}
		return lblCasilla_38;
	}
	private JLabel getLblCasilla_39() {
		if (lblCasilla_39 == null) {
			lblCasilla_39 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_39.setBounds(760, 314, 55, 55);
		}
		return lblCasilla_39;
	}
	private JLabel getLblCasilla_32() {
		if (lblCasilla_32 == null) {
			lblCasilla_32 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_32.setBounds(445, 314, 55, 55);
		}
		return lblCasilla_32;
	}
	private JLabel getLblCasilla_41() {
		if (lblCasilla_41 == null) {
			lblCasilla_41 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_41.setBounds(634, 503, 55, 55);
		}
		return lblCasilla_41;
	}
	private JLabel getLblCasilla_42() {
		if (lblCasilla_42 == null) {
			lblCasilla_42 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_42.setBounds(634, 440, 55, 55);
		}
		return lblCasilla_42;
	}
	private JLabel getLblCasilla_43() {
		if (lblCasilla_43 == null) {
			lblCasilla_43 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_43.setBounds(634, 377, 55, 55);
		}
		return lblCasilla_43;
	}
	private JLabel getLblCasilla_44() {
		if (lblCasilla_44 == null) {
			lblCasilla_44 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_44.setBounds(634, 314, 55, 55);
		}
		return lblCasilla_44;
	}
	private JLabel getLblCasilla_37() {
		if (lblCasilla_37 == null) {
			lblCasilla_37 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_37.setBounds(634, 251, 55, 55);
		}
		return lblCasilla_37;
	}
	private JLabel getLblCasilla_35() {
		if (lblCasilla_35 == null) {
			lblCasilla_35 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_35.setBounds(634, 125, 55, 55);
		}
		return lblCasilla_35;
	}
	private JLabel getLblCasilla_03() {
		if (lblCasilla_03 == null) {
			lblCasilla_03 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_03.setBounds(382, 125, 55, 55);
		}
		return lblCasilla_03;
	}
	private JLabel getLblCasilla_01() {
		if (lblCasilla_01 == null) {
			lblCasilla_01 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_01.setBounds(382, 251, 55, 55);
		}
		return lblCasilla_01;
	}
	JLabel getLblCasilla_00() {
		if (lblCasilla_00 == null) {
			lblCasilla_00 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_00.setBounds(382, 314, 55, 55);
		}
		return lblCasilla_00;
	}
	private JLabel getLblCasilla_31() {
		if (lblCasilla_31 == null) {
			lblCasilla_31 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_31.setBounds(382, 377, 55, 55);
		}
		return lblCasilla_31;
	}
	private JLabel getLblCasilla_29() {
		if (lblCasilla_29 == null) {
			lblCasilla_29 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_29.setBounds(382, 503, 55, 55);
		}
		return lblCasilla_29;
	}
	private JLabel getLblCasilla_28() {
		if (lblCasilla_28 == null) {
			lblCasilla_28 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_28.setBounds(382, 566, 55, 55);
		}
		return lblCasilla_28;
	}
	private JLabel getLblCasilla_27() {
		if (lblCasilla_27 == null) {
			lblCasilla_27 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_27.setBounds(445, 566, 55, 55);
		}
		return lblCasilla_27;
	}
	private JLabel getLblCasilla_26() {
		if (lblCasilla_26 == null) {
			lblCasilla_26 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_26.setBounds(508, 566, 55, 55);
		}
		return lblCasilla_26;
	}
	private JLabel getLblCasilla_25() {
		if (lblCasilla_25 == null) {
			lblCasilla_25 = new JLabel("");
			lblCasilla_10.setVisible(false);
			lblCasilla_25.setBounds(571, 566, 55, 55);
		}
		return lblCasilla_25;
	}
	private JLabel getLblCasilla_23() {
		if (lblCasilla_23 == null) {
			lblCasilla_23 = new JLabel("");
			lblCasilla_23.setVisible(false);
			lblCasilla_23.setBounds(697, 566, 55, 55);
		}
		return lblCasilla_23;
	}
	private JLabel getLblCasilla_22() {
		if (lblCasilla_22 == null) {
			lblCasilla_22 = new JLabel("");
			lblCasilla_22.setVisible(false);
			lblCasilla_22.setBounds(760, 566, 55, 55);
		}
		return lblCasilla_22;
	}
	private JLabel getLblCasilla_21() {
		if (lblCasilla_21 == null) {
			lblCasilla_21 = new JLabel("");
			lblCasilla_21.setVisible(false);
			lblCasilla_21.setBounds(823, 566, 55, 55);
		}
		return lblCasilla_21;
	}
	private JLabel getLblCasilla_20() {
		if (lblCasilla_20 == null) {
			lblCasilla_20 = new JLabel("");
			lblCasilla_20.setVisible(false);
			lblCasilla_20.setBounds(886, 566, 55, 55);
		}
		return lblCasilla_20;
	}
	private JLabel getLblCasilla_19() {
		if (lblCasilla_19 == null) {
			lblCasilla_19 = new JLabel("");
			lblCasilla_19.setVisible(false);
			lblCasilla_19.setBounds(886, 503, 55, 55);
		}
		return lblCasilla_19;
	}
	private JLabel getLblCasilla_18() {
		if (lblCasilla_18 == null) {
			lblCasilla_18 = new JLabel("");
			lblCasilla_18.setVisible(false);
			lblCasilla_18.setBounds(884, 440, 55, 55);
		}
		return lblCasilla_18;
	}
	private JLabel getLblCasilla_17() {
		if (lblCasilla_17 == null) {
			lblCasilla_17 = new JLabel("");
			lblCasilla_17.setVisible(false);
			lblCasilla_17.setBounds(886, 377, 55, 55);
		}
		return lblCasilla_17;
	}
	private JLabel getLblCasilla_15() {
		if (lblCasilla_15 == null) {
			lblCasilla_15 = new JLabel("");
			lblCasilla_15.setVisible(false);
			lblCasilla_15.setBounds(886, 251, 55, 55);
		}
		return lblCasilla_15;
	}
	private JLabel getLblCasilla_14() {
		if (lblCasilla_14 == null) {
			lblCasilla_14 = new JLabel("");
			lblCasilla_14.setVisible(false);
			lblCasilla_14.setBounds(886, 188, 55, 55);
		}
		return lblCasilla_14;
	}
	private JLabel getLblCasilla_13() {
		if (lblCasilla_13 == null) {
			lblCasilla_13 = new JLabel("");
			lblCasilla_13.setVisible(false);
			lblCasilla_13.setBounds(886, 125, 55, 55);
		}
		return lblCasilla_13;
	}
	private JLabel getLblCasilla_12() {
		if (lblCasilla_12 == null) {
			lblCasilla_12 = new JLabel("");
			lblCasilla_12.setVisible(false);
			lblCasilla_12.setBounds(886, 62, 55, 55);
		}
		return lblCasilla_12;
	}
	private JLabel getLblCasilla_11() {
		if (lblCasilla_11 == null) {
			lblCasilla_11 = new JLabel("");
			lblCasilla_11.setVisible(false);
			lblCasilla_11.setBounds(823, 62, 55, 55);
		}
		return lblCasilla_11;
	}

	public void setListaJugadores(List<Usuario> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	public List<Usuario> getListaJugadores(){
		return listaJugadores;
	}

	public void setNJugadorActual(int i) {
		this.nJugadorTurnoActual = i;
	}
	
	private void nuevaTirada(int casilla){
		for (JButton jButton : botonesTablero)
			jButton.setVisible(false);
		for (JLabel jLabel : labelTablero)
			jLabel.setVisible(false);
		
		for (Usuario usuario : listaJugadores) {
			int casillaJugador = usuario.getCasillaActual();
			labelTablero.get(casillaJugador).setVisible(true);
			labelTablero.get(casillaJugador).setIcon(new ImageIcon(VentanaPrincipal.class.getResource(usuario.getIcono())));
		}
		
		Usuario jugadorActual = listaJugadores.get(nJugadorTurnoActual);
		int casillaActual = jugadorActual.getCasillaActual();
		labelTablero.get(casillaActual).setVisible(false);
		
		labelTablero.get(casilla).setVisible(true);
		labelTablero.get(casilla).setIcon(new ImageIcon(VentanaPrincipal.class.getResource(jugadorActual.getIcono())));
		
		listaJugadores.get(nJugadorTurnoActual).setCasillaActual(casilla);
		
		trivial.usarCasilla(casilla);
		boolean isVuelveATirar = trivial.isVuelveATirar();
		boolean isCasillaFinal = trivial.isCasillaFinal();
		
		if(isVuelveATirar){
			System.out.println("Vuelve A Tirar");
			trivial.setVuelveATirar(false);
		}
		else if(isCasillaFinal){
			System.out.println("Casilla Final");
			trivial.setCasillaFinal(false);
		}
		else{
			PreguntaGame pregunta = trivial.getPreguntaActual();			
			System.out.println(pregunta.getPregunta().getPregunta());
			
			DialogoPregunta dialogoPregunta = new DialogoPregunta(pregunta, this);
			dialogoPregunta.setVisible(true);
		}
		
		btnComenzar3.setVisible(true);		
	}
	
}


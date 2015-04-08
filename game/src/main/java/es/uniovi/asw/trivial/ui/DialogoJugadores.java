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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.PersistenceFactory;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl.SimplePersistenceFactory;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Usuario;

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
	private String[] nicks;
	private DialogoJugadores vJugadores;
	private List<Usuario> usuariosBD;
	private VentanaPrincipal vPrincipal;
	private List<Usuario> listaJugadores;
	private final String[] colores = {"Ro", "Ve", "Am", "Az"};

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoJugadores dialog1 = new DialogoJugadores(null);
			dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog1.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void setDialogoJugadores(DialogoJugadores d){
		this.vJugadores = d;
	}

	/**
	 * Create the dialog.
	 * @param ventanaPrincipal 
	 * @param vJugadores 
	 */
	public DialogoJugadores(VentanaPrincipal ventanaPrincipal) {
		this.vPrincipal = ventanaPrincipal;
		this.listaJugadores = new ArrayList<Usuario>();
		  for (int i = 0; i < 4; i++) {
		   this.listaJugadores.add(null);
		  }
		PersistenceFactory pf = new SimplePersistenceFactory();
		usuariosBD = pf.createUsuarioFinder().findAll();
		nicks = new String[usuariosBD.size() + 1];
		nicks[0] = "";
		for (int i = 1; i < usuariosBD.size() + 1; i++) {
			nicks[i] = usuariosBD.get(i - 1).getUsuario();
		}	
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
					boolean valido = true;
					boolean passValido = true;
					// Para Nuevos Jugadores.
					int nJugadores = 0;
					PersistenceFactory finder = new SimplePersistenceFactory();
					List<Usuario> usuariosDB =  finder.createUsuarioFinder().findAll();
					Long numUsuarios = (long) usuariosDB.size();
					//TODO Comprobar que no existen dos usuarios iguales
					//Por la noche lo miran Pedro y Juako
					if (!txtJug1Nombre.getText().equals("") && cbxJug1Nombre.getSelectedItem().equals("")) {
						if(!(getPswJug1().getPassword().length == 0)){
							Usuario usuario = new Usuario(numUsuarios + 1,
									txtJug1Nombre.getText(), new String(getPswJug1()
											.getPassword()),
									txtJug1Nombre.getText());
							passValido = true;
							nJugadores++;
							try {
								finder.createUsuarioFinder().save(usuario);
								numUsuarios++;
								String icono = "/img/FichasSmall/Ficha" + colores[0] + "_null_null_null_null.png";
								usuario.setColor(colores[0]);
								usuario.setCasillaActual(24);
								usuario.setIcono(icono);
								listaJugadores.set(0,usuario);
								todoUnable1();
								vPrincipal.getLblCasilla_24().setVisible(true);
								vPrincipal.getLblCasilla_24().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));		
							} catch (IOException e) {
								JOptionPane.showMessageDialog(null, "¡El jugador ya existe!","¡Atención!",JOptionPane.WARNING_MESSAGE);
								nJugadores = -1;
							}						
												
						} else if (!txtJug1Nombre.getText().equals("")) {
						       passValido = false;					
						}
					}
					if (!txtJug2Nombre.getText().equals("") && cbxJug2Nombre.getSelectedItem().equals("")) {
						if(!(getPswJug2().getPassword().length == 0)){
							Usuario usuario = new Usuario(numUsuarios + 1,
									txtJug2Nombre.getText(), new String(getPswJug2()
											.getPassword()),
									txtJug2Nombre.getText());
							passValido = true;
							nJugadores++;
							try {
								finder.createUsuarioFinder().save(usuario);
								numUsuarios++;
								String icono = "/img/FichasSmall/Ficha" + colores[1] + "_null_null_null_null.png";
								usuario.setColor(colores[1]);
								usuario.setCasillaActual(00);
								usuario.setIcono(icono);
								listaJugadores.set(1,usuario);
								todoUnable2();
								vPrincipal.getLblCasilla_00().setVisible(true);
								vPrincipal.getLblCasilla_00().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));
							} catch (IOException e) {
								JOptionPane.showMessageDialog(null, "¡El jugador ya existe!","¡Atención!",JOptionPane.WARNING_MESSAGE);
								nJugadores = -1;
							} 						
							
						} else if (!txtJug2Nombre.getText().equals("")) {
						       passValido = false;				
						}
					}
					if (!txtJug3Nombre.getText().equals("") && cbxJug3Nombre.getSelectedItem().equals("")) {
						if(!(getPswJug3().getPassword().length == 0)){
							Usuario usuario = new Usuario(numUsuarios + 1,
									txtJug3Nombre.getText(), new String(getPswJug3()
											.getPassword()),
									txtJug3Nombre.getText());
							passValido = true;
							nJugadores++;
							try {
								finder.createUsuarioFinder().save(usuario);
								numUsuarios++;
								String icono = "/img/FichasSmall/Ficha" + colores[2] + "_null_null_null_null.png";
								usuario.setColor(colores[2]);
								usuario.setCasillaActual(16);
								usuario.setIcono(icono);
								listaJugadores.set(2,usuario);
								todoUnable3();
								vPrincipal.getLblCasilla_16().setVisible(true);
								vPrincipal.getLblCasilla_16().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));
							} catch (IOException e) {
								JOptionPane.showMessageDialog(null, "¡El jugador ya existe!","¡Atención!",JOptionPane.WARNING_MESSAGE);
								nJugadores = -1;
							}
							
						} else if (!txtJug3Nombre.getText().equals("")) {
						       passValido = false;				
						}
					}
					if (!txtJug4Nombre.getText().equals("") && cbxJug4Nombre.getSelectedItem().equals("")) {
						if(!(getPswJug4().getPassword().length == 0)){
							Usuario usuario = new Usuario(numUsuarios + 1,
									txtJug4Nombre.getText(), new String(getPswJug4()
											.getPassword()),
									txtJug4Nombre.getText());
							passValido = true;
							nJugadores++;
							try {
								finder.createUsuarioFinder().save(usuario);
								numUsuarios++;
								String icono = "/img/FichasSmall/Ficha" + colores[3] + "_null_null_null_null.png";
								usuario.setColor(colores[3]);
								usuario.setCasillaActual(8);
								usuario.setIcono(icono);
								listaJugadores.set(3,usuario);
								todoUnable4();
								vPrincipal.getLblCasilla_08().setVisible(true);
								vPrincipal.getLblCasilla_08().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));
							} catch (IOException e) {
								JOptionPane.showMessageDialog(null, "¡El jugador ya existe!","¡Atención!",JOptionPane.WARNING_MESSAGE);
								nJugadores = -1;
							}
							
						} else if (!txtJug4Nombre.getText().equals("")) {
						       passValido = false;				
						}
					}
					
						//Para Jugadores existentes.
						//Comprobación de contraseñas.
						if (cbxJug1Nombre.isEnabled() && !cbxJug1Nombre.getSelectedItem().equals("")) {
							for (int i = 0; i < listaJugadores.size(); i++) {
								if (listaJugadores.get(i) != null && listaJugadores.get(i).getUsuario().equals(cbxJug1Nombre.getSelectedItem())) {
									valido = false;
									JOptionPane.showMessageDialog(null, "¡ Jugador 1 - Este nombre ya está elegido. !","¡Atención!",JOptionPane.WARNING_MESSAGE);
								}
							}	
							for (int i = 0; i < usuariosBD.size() && valido == true; i++) {
								if (usuariosBD.get(i).getUsuario().equals(cbxJug1Nombre.getSelectedItem())) {								
									String pass = usuariosBD.get(i).getContrasenia();
									if (new String (pswJug1.getPassword()).equals(pass)) {
										String icono = "/img/FichasSmall/Ficha" + colores[0] + "_null_null_null_null.png";
										usuariosBD.get(i).setColor(colores[0]);
										usuariosBD.get(i).setCasillaActual(24);
										usuariosBD.get(i).setIcono(icono);
										listaJugadores.set(0,usuariosBD.get(i));
										todoUnable1();
										vPrincipal.getLblCasilla_24().setVisible(true);
										vPrincipal.getLblCasilla_24().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));
										nJugadores++;
									} else {
										JOptionPane.showMessageDialog(null, "¡ Jugador 1 - Contraseña Incorrecta !","¡Atención!",JOptionPane.WARNING_MESSAGE);
									}
								}
							}
							
						}
						if (cbxJug2Nombre.isEnabled() && !cbxJug2Nombre.getSelectedItem().equals("")) {
							for (int i = 0; i < listaJugadores.size(); i++) {
								if (listaJugadores.get(i) != null && listaJugadores.get(i).getUsuario().equals(cbxJug2Nombre.getSelectedItem())) {
									valido = false;
									JOptionPane.showMessageDialog(null, "¡ Jugador 2 - Este nombre ya está elegido. !","¡Atención!",JOptionPane.WARNING_MESSAGE);
								}
							}	
							for (int i = 0; i < usuariosBD.size() && valido == true; i++) {
								if (usuariosBD.get(i).getUsuario().equals(cbxJug2Nombre.getSelectedItem())) {
									String pass = usuariosBD.get(i).getContrasenia();
									if (new String (pswJug2.getPassword()).equals(pass)) {
										String icono = "/img/FichasSmall/Ficha" + colores[1] + "_null_null_null_null.png";
										usuariosBD.get(i).setColor(colores[1]);
										usuariosBD.get(i).setCasillaActual(0);
										usuariosBD.get(i).setIcono(icono);
										listaJugadores.set(1,usuariosBD.get(i));
										todoUnable2();
										vPrincipal.getLblCasilla_00().setVisible(true);
										vPrincipal.getLblCasilla_00().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));
										nJugadores++;
									} else {
										JOptionPane.showMessageDialog(null, "¡ Jugador 2 - Contraseña Incorrecta !","¡Atención!",JOptionPane.WARNING_MESSAGE);
									}
								}
							}
							
						}
						if (cbxJug3Nombre.isEnabled() && !cbxJug3Nombre.getSelectedItem().equals("")) {
							for (int i = 0; i < listaJugadores.size(); i++) {
								if (listaJugadores.get(i) != null && listaJugadores.get(i).getUsuario().equals(cbxJug3Nombre.getSelectedItem())) {
									valido = false;
									JOptionPane.showMessageDialog(null, "¡ Jugador 3 - Este nombre ya está elegido. !","¡Atención!",JOptionPane.WARNING_MESSAGE);
								}
							}	
							for (int i = 0; i < usuariosBD.size() && valido == true; i++) {
								if (usuariosBD.get(i).getUsuario().equals(cbxJug3Nombre.getSelectedItem())) {
									String pass = usuariosBD.get(i).getContrasenia();
									if (new String (pswJug3.getPassword()).equals(pass)) {
										String icono = "/img/FichasSmall/Ficha" + colores[2] + "_null_null_null_null.png";
										usuariosBD.get(i).setColor(colores[2]);
										usuariosBD.get(i).setCasillaActual(16);
										usuariosBD.get(i).setIcono(icono);
										listaJugadores.set(2,usuariosBD.get(i));
										todoUnable3();
										vPrincipal.getLblCasilla_16().setVisible(true);
										vPrincipal.getLblCasilla_16().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));
										nJugadores++;
									} else {
										JOptionPane.showMessageDialog(null, "¡ Jugador 3 - Contraseña Incorrecta !","¡Atención!",JOptionPane.WARNING_MESSAGE);
									}
								}
							}
							
						}
						if (cbxJug4Nombre.isEnabled() && !cbxJug4Nombre.getSelectedItem().equals("")) {
							for (int i = 0; i < listaJugadores.size(); i++) {
								if (listaJugadores.get(i) != null && listaJugadores.get(i).getUsuario().equals(cbxJug4Nombre.getSelectedItem())) {
									valido = false;
									JOptionPane.showMessageDialog(null, "¡ Jugador 4 - Este nombre ya está elegido. !","¡Atención!",JOptionPane.WARNING_MESSAGE);
								}
							}		
							for (int i = 0; i < usuariosBD.size() && valido == true; i++) {
								if (usuariosBD.get(i).getUsuario().equals(cbxJug4Nombre.getSelectedItem())) {
									String pass = usuariosBD.get(i).getContrasenia();
									if (new String (pswJug4.getPassword()).equals(pass)) {
										String icono = "/img/FichasSmall/Ficha" + colores[3] + "_null_null_null_null.png";
										usuariosBD.get(i).setColor(colores[3]);
										usuariosBD.get(i).setCasillaActual(8);
										usuariosBD.get(i).setIcono(icono);
										listaJugadores.set(3,usuariosBD.get(i));
										todoUnable4();
										vPrincipal.getLblCasilla_08().setVisible(true);
										vPrincipal.getLblCasilla_08().setIcon(new ImageIcon(VentanaPrincipal.class.getResource(icono)));
										nJugadores++;
									} else {
										JOptionPane.showMessageDialog(null, "¡ Jugador 4 - Contraseña Incorrecta !","¡Atención!",JOptionPane.WARNING_MESSAGE);
									}
								}
							}
							
						}
						if(passValido == false){
							JOptionPane.showMessageDialog(null, "¡ Las contraseñas han de tener 1 caracter !","¡Atención!",JOptionPane.WARNING_MESSAGE);
						} else if (nJugadores == 0) {
							JOptionPane.showMessageDialog(null, "Se necesitan elegir al menos un jugador"," Trivial4B",JOptionPane.PLAIN_MESSAGE);
						}
						else if(nJugadores > 0) {
							vPrincipal.setListaJugadores(listaJugadores);
							vPrincipal.setNJugadorActual(0);
							vJugadores.dispose();
							
						Usuario j1 = null;
						for (int i = 0; i < listaJugadores.size() && j1 == null; i++) {
							if (listaJugadores.get(i) != null) {
								j1 = listaJugadores.get(i);
							}
						}
							
							JOptionPane.showMessageDialog(null, "¡ Bienvenido a Trivial4B para - " + nJugadores + " jugadores !"," Trivial4B",JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, "Turno del jugador : " + j1.getUsuario()," Trivial4B",JOptionPane.PLAIN_MESSAGE);
						}		
					
				}


				private void todoUnable4() {
					cbxJug4Nombre.setEnabled(false);
					txtJug4Nombre.setEnabled(false);
					pswJug4.setEnabled(false);
				}

				private void todoUnable3() {
					cbxJug3Nombre.setEnabled(false);
					txtJug3Nombre.setEnabled(false);
					pswJug3.setEnabled(false);
				}

				private void todoUnable2() {
					cbxJug2Nombre.setEnabled(false);
					txtJug2Nombre.setEnabled(false);
					pswJug2.setEnabled(false);
				}

				private void todoUnable1() {
					cbxJug1Nombre.setEnabled(false);
					txtJug1Nombre.setEnabled(false);
					pswJug1.setEnabled(false);
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
			lblQuesitoRo.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaRo_null_null_null_null.png")));
			lblQuesitoRo.setBounds(41, 36, 55, 55);
		}
		return lblQuesitoRo;
	}
	private JLabel getLblQuesitoVe() {
		if (lblQuesitoVe == null) {
			lblQuesitoVe = new JLabel("");
			lblQuesitoVe.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaVe_null_null_null_null.png")));
			lblQuesitoVe.setBounds(41, 117, 55, 55);
		}
		return lblQuesitoVe;
	}
	private JLabel getLblQuesitoAm() {
		if (lblQuesitoAm == null) {
			lblQuesitoAm = new JLabel("");
			lblQuesitoAm.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaAm_null_null_null_null.png")));
			lblQuesitoAm.setBounds(41, 198, 55, 55);
		}
		return lblQuesitoAm;
	}
	private JLabel getLblQuesitoAz() {
		if (lblQuesitoAz == null) {
			lblQuesitoAz = new JLabel("");
			lblQuesitoAz.setIcon(new ImageIcon(DialogoJugadores.class.getResource("/img/FichasSmall/FichaAz_null_null_null_null.png")));
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
			cbxJug1Nombre.setModel(new DefaultComboBoxModel<String>(nicks));
			cbxJug1Nombre.setBackground(Color.WHITE);
			cbxJug1Nombre.setFont(new Font("Arial", Font.PLAIN, 17));
			cbxJug1Nombre.setBounds(272, 55, 150, 29);
		}
		return cbxJug1Nombre;
	}
	private JComboBox<String> getCbxJug2Nombre() {
		if (cbxJug2Nombre == null) {
			cbxJug2Nombre = new JComboBox<String>();
			cbxJug2Nombre.setModel(new DefaultComboBoxModel<String>(nicks));
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
			cbxJug3Nombre.setModel(new DefaultComboBoxModel<String>(nicks));
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
			cbxJug4Nombre.setModel(new DefaultComboBoxModel<String>(nicks));
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

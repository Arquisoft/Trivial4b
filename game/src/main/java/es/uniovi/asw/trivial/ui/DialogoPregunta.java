package es.uniovi.asw.trivial.ui;

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
import javax.swing.JPasswordField;
import javax.swing.JTextPane;

public class DialogoPregunta extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private final JPanel panelPrincipal = new JPanel();
	private JLabel lblImgFondoPreguntas;
	private JLabel lblImgCategoria;
	private JTextPane txtPregunta;
	private JButton btnRespuesta1;
	private JButton btnRespuesta2;
	private JButton btnRespuesta3;
	private JLabel lblImgCheck1;
	private JLabel lblImgCheck2;
	private JLabel lblImgCheck3;
	private JButton btnContinuar;
	private JLabel lblImgQuesito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoPregunta dialog = new DialogoPregunta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoPregunta() {
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoPregunta.class.getResource("/img/ico_32x32_pregunta.png")));
		setTitle("Pregunta: Ciencias y Naturaleza");
		getContentPane().setBounds(new Rectangle(0, 0, 480, 443));
		setBounds(100, 100, 484, 476);
		getContentPane().setLayout(null);
		panelPrincipal.setPreferredSize(new Dimension(480, 443));
		panelPrincipal.setMinimumSize(new Dimension(480, 443));
		panelPrincipal.setMaximumSize(new Dimension(480, 443));
		panelPrincipal.setBounds(new Rectangle(0, 0, 478, 442));
		panelPrincipal.setBackground(new Color(0, 55, 76));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.add(getLblImgQuesito());
		panelPrincipal.add(getBtnContinuar());
		panelPrincipal.add(getLblImgCheck3());
		panelPrincipal.add(getLblImgCheck2());
		panelPrincipal.add(getLblImgCheck1());
		panelPrincipal.add(getBtnRespuesta3());
		panelPrincipal.add(getBtnRespuesta2());
		panelPrincipal.add(getBtnRespuesta1());
		panelPrincipal.add(getTxtPregunta());
		panelPrincipal.add(getLblImgCategoria());
		panelPrincipal.add(getLblImgFondoPreguntas());
	}
	private JLabel getLblImgFondoPreguntas() {
		if (lblImgFondoPreguntas == null) {
			lblImgFondoPreguntas = new JLabel("");
			lblImgFondoPreguntas.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Fondo_Preguntas.png")));
			lblImgFondoPreguntas.setBounds(0, 0, 478, 442);
		}
		return lblImgFondoPreguntas;
	}
	private JLabel getLblImgCategoria() {
		if (lblImgCategoria == null) {
			lblImgCategoria = new JLabel("");
			lblImgCategoria.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Tema_Ciencias.png")));
			lblImgCategoria.setBounds(197, 20, 75, 55);
		}
		return lblImgCategoria;
	}
	private JTextPane getTxtPregunta() {
		if (txtPregunta == null) {
			txtPregunta = new JTextPane();
			txtPregunta.setEditable(false);
			txtPregunta.setFocusable(false);
			txtPregunta.setRequestFocusEnabled(false);
			txtPregunta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txtPregunta.setText("\u00BFC\u00F3mo es conocido popularmente el animal marino llamado hipocampo?");
			txtPregunta.setBounds(64, 81, 357, 60);
		}
		return txtPregunta;
	}
	private JButton getBtnRespuesta1() {
		if (btnRespuesta1 == null) {
			btnRespuesta1 = new JButton("Caballito de mar");
			btnRespuesta1.setBorderPainted(false);
			btnRespuesta1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Acci�n al pulsar la Respuesta1
					
					// Check1 > Mostrar
					lblImgCheck1.setVisible(true); 
					// Respuesta1 > icon verde
					btnRespuesta1.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Verde.png"))); 
					// Respuesta1 > texto blanco
					btnRespuesta1.setForeground(Color.WHITE);
					// Bot�n Continuar > Texto Correcta
					btnContinuar.setText("Correcta > Continuar");
					// Bot�n Continuar > Mostrar
					btnContinuar.setVisible(true);
					// Quesito > Mostrar
					lblImgQuesito.setVisible(true);
					// Respuesta1, 2 y 3 > Deshabilitar botones
					btnRespuesta1.setRolloverEnabled(false);
					btnRespuesta2.setRolloverEnabled(false);
					btnRespuesta3.setRolloverEnabled(false);

				}
			});
			btnRespuesta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnRespuesta1.setRolloverIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Over.png")));
			btnRespuesta1.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Blanco.png")));
			btnRespuesta1.setRequestFocusEnabled(false);
			btnRespuesta1.setPreferredSize(new Dimension(245, 43));
			btnRespuesta1.setMinimumSize(new Dimension(245, 43));
			btnRespuesta1.setMaximumSize(new Dimension(245, 43));
			btnRespuesta1.setMargin(new Insets(0, 0, 0, 0));
			btnRespuesta1.setHorizontalTextPosition(SwingConstants.CENTER);
			btnRespuesta1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnRespuesta1.setContentAreaFilled(false);
			btnRespuesta1.setBorder(null);
			btnRespuesta1.setBounds(110, 152, 267, 43);
		}
		return btnRespuesta1;
	}
	private JButton getBtnRespuesta2() {
		if (btnRespuesta2 == null) {
			btnRespuesta2 = new JButton("Estrella de mar");
			btnRespuesta2.setBorderPainted(false);
			btnRespuesta2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Acci�n al pulsar la Respuesta2
					
					// Check1 > Mostrar
					lblImgCheck1.setVisible(true); 
					// Respuesta2 > icon rojo
					btnRespuesta2.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Rojo.png"))); 
					// Respuesta2 > texto blanco
					btnRespuesta2.setForeground(Color.WHITE);
					// Bot�n Continuar > Texto Correcta
					btnContinuar.setText("Incorrecta > Continuar");
					// Bot�n Continuar > Mostrar
					btnContinuar.setVisible(true);
					// Respuesta1, 2 y 3 > Deshabilitar botones
					btnRespuesta1.setRolloverEnabled(false);
					btnRespuesta2.setRolloverEnabled(false);
					btnRespuesta3.setRolloverEnabled(false);
					
				}
			});
			btnRespuesta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnRespuesta2.setRolloverIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Over.png")));
			btnRespuesta2.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Blanco.png")));
			btnRespuesta2.setRequestFocusEnabled(false);
			btnRespuesta2.setPreferredSize(new Dimension(245, 43));
			btnRespuesta2.setMinimumSize(new Dimension(245, 43));
			btnRespuesta2.setMaximumSize(new Dimension(245, 43));
			btnRespuesta2.setMargin(new Insets(0, 0, 0, 0));
			btnRespuesta2.setHorizontalTextPosition(SwingConstants.CENTER);
			btnRespuesta2.setForeground(Color.BLACK);
			btnRespuesta2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnRespuesta2.setContentAreaFilled(false);
			btnRespuesta2.setBorder(null);
			btnRespuesta2.setBounds(110, 216, 267, 43);
		}
		return btnRespuesta2;
	}
	private JButton getBtnRespuesta3() {
		if (btnRespuesta3 == null) {
			btnRespuesta3 = new JButton("Calamar");
			btnRespuesta3.setBorderPainted(false);
			btnRespuesta3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Acci�n al pulsar la Respuesta1
					
					// Check1 > Mostrar
					lblImgCheck1.setVisible(true); 
					// Respuesta3 > icon rojo
					btnRespuesta3.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Rojo.png"))); 
					// Respuesta3 > texto blanco
					btnRespuesta3.setForeground(Color.WHITE);
					// Bot�n Continuar > Texto Correcta
					btnContinuar.setText("Incorrecta > Continuar");
					// Bot�n Continuar > Mostrar
					btnContinuar.setVisible(true);
					// Respuesta1, 2 y 3 > Deshabilitar botones
					btnRespuesta1.setRolloverEnabled(false);
					btnRespuesta2.setRolloverEnabled(false);
					btnRespuesta3.setRolloverEnabled(false);
					
				}
			});
			btnRespuesta3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnRespuesta3.setRolloverIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Over.png")));
			btnRespuesta3.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Blanco.png")));
			btnRespuesta3.setRequestFocusEnabled(false);
			btnRespuesta3.setPreferredSize(new Dimension(245, 43));
			btnRespuesta3.setMinimumSize(new Dimension(245, 43));
			btnRespuesta3.setMaximumSize(new Dimension(245, 43));
			btnRespuesta3.setMargin(new Insets(0, 0, 0, 0));
			btnRespuesta3.setHorizontalTextPosition(SwingConstants.CENTER);
			btnRespuesta3.setForeground(Color.BLACK);
			btnRespuesta3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnRespuesta3.setContentAreaFilled(false);
			btnRespuesta3.setBorder(null);
			btnRespuesta3.setBounds(110, 280, 267, 43);
		}
		return btnRespuesta3;
	}
	private JLabel getLblImgCheck1() {
		if (lblImgCheck1 == null) {
			lblImgCheck1 = new JLabel("");
			lblImgCheck1.setVisible(false);
			lblImgCheck1.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_IcoCorrecta.png")));
			lblImgCheck1.setBounds(65, 156, 30, 30);
		}
		return lblImgCheck1;
	}
	private JLabel getLblImgCheck2() {
		if (lblImgCheck2 == null) {
			lblImgCheck2 = new JLabel("");
			lblImgCheck2.setVisible(false);
			lblImgCheck2.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_IcoCorrecta.png")));
			lblImgCheck2.setBounds(64, 220, 30, 30);
		}
		return lblImgCheck2;
	}
	private JLabel getLblImgCheck3() {
		if (lblImgCheck3 == null) {
			lblImgCheck3 = new JLabel("");
			lblImgCheck3.setVisible(false);
			lblImgCheck3.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_IcoCorrecta.png")));
			lblImgCheck3.setBounds(65, 284, 30, 30);
		}
		return lblImgCheck3;
	}
	private JButton getBtnContinuar() {
		if (btnContinuar == null) {
			btnContinuar = new JButton("? > Continuar");
			btnContinuar.setBorderPainted(false);
			btnContinuar.setVisible(false);
			btnContinuar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//Acci�n al pulsar "Continuar"
					
				}
			});
			btnContinuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnContinuar.setRolloverIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Continuar_Over.png")));
			btnContinuar.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Respuesta_Continuar.png")));
			btnContinuar.setRequestFocusEnabled(false);
			btnContinuar.setPreferredSize(new Dimension(245, 43));
			btnContinuar.setMinimumSize(new Dimension(245, 43));
			btnContinuar.setMaximumSize(new Dimension(245, 43));
			btnContinuar.setMargin(new Insets(0, 0, 0, 0));
			btnContinuar.setHorizontalTextPosition(SwingConstants.CENTER);
			btnContinuar.setForeground(new Color(222, 191, 39));
			btnContinuar.setFont(new Font("Arial", Font.PLAIN, 20));
			btnContinuar.setContentAreaFilled(false);
			btnContinuar.setBorder(null);
			btnContinuar.setBounds(110, 344, 267, 43);
		}
		return btnContinuar;
	}
	private JLabel getLblImgQuesito() {
		if (lblImgQuesito == null) {
			lblImgQuesito = new JLabel("");
			lblImgQuesito.setVisible(false);
			lblImgQuesito.setIcon(new ImageIcon(DialogoPregunta.class.getResource("/img/Quesito_Ro.png")));
			lblImgQuesito.setBounds(346, 337, 60, 66);
		}
		return lblImgQuesito;
	}
}

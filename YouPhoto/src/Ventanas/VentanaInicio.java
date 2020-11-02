package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BD.BD;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre, txtContraseya;
	private JLabel lblTitulo, lblNombre, lblContraseya;
	private JButton btnSalir, btnEntrar, btnRegistrarte;

	/**
	 * Create the frame.
	 */
	public VentanaInicio() {
		Connection con = BD.initBD("youPhoto.db");
		Statement st = BD.usarCrearTablasBD(con);
		BD.cerrarBD(con, st);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pNorte = new JPanel();
		contentPane.add(pNorte, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("YouPhoto");
		lblTitulo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblTitulo.setToolTipText("");
		pNorte.add(lblTitulo);
		
		JPanel pCentro = new JPanel();
		contentPane.add(pCentro, BorderLayout.CENTER);
		
		lblNombre = new JLabel("Introduce tu nombre de usuario");
		pCentro.add(lblNombre);
		
		txtNombre = new JTextField();
		pCentro.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblContraseya = new JLabel("Introduce tu contrasenya ");
		pCentro.add(lblContraseya);
		
		txtContraseya = new JTextField();
		pCentro.add(txtContraseya);
		txtContraseya.setColumns(10);
		
	    btnRegistrarte = new JButton("Eres nuevo? Registrate aqui");
		pCentro.add(btnRegistrarte);
		
		JPanel pSur = new JPanel();
		contentPane.add(pSur, BorderLayout.SOUTH);
		
		btnSalir = new JButton("Salir");
		pSur.add(btnSalir);
		
		btnEntrar = new JButton("Entrar");
		pSur.add(btnEntrar);
		
		setVisible(true);
	
		JFrame ventana = this;
		
		btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nick = txtNombre.getText();
				String con = txtContraseya.getText();
				if(nick.equals("admin") && con.equals("admin")){
					//new VentanaInsertarNuevoLibro();
				}else {
					int resul = BD.comprobarUsuario(nick, con);
					if(resul==0) {
						JOptionPane.showMessageDialog(null, "Debes registrarte antes", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
					}
					else if(resul==1)
						JOptionPane.showMessageDialog(null, "La contraseya no es correcta", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
					else {
						JOptionPane.showMessageDialog(null, "Bienvenido a YouPhoto", "ACCESO CORRECTO", JOptionPane.INFORMATION_MESSAGE);
						new VentanaYouPhoto();
					}
					vaciarCampos();
				}
				
			}
		});
		
		
		btnRegistrarte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null, "Tienes que registrarte", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
				String nickUsuario = JOptionPane.showInputDialog("Introduce tu nick: ");
				while (BD.existeUsuario(nickUsuario)) {
					nickUsuario = JOptionPane.showInputDialog("Nick repetido, introduce otro: ");
				}
				String conUsuario = JOptionPane.showInputDialog("Introduce tu contraseya: ");
				int seguidores = 0;
				int seguidos = 0;
				String RutaFotoUsuario = JOptionPane.showInputDialog("Introduce la ruta de tu avatar: ");
				BD.insertarUsuario(nickUsuario, conUsuario, seguidores, seguidos, "/Imagenes/Avatares/s" +RutaFotoUsuario);
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ventana.dispose();
			}
		});
	}
	public void vaciarCampos() {
		txtNombre.setText("");
		txtContraseya.setText("");
	}

}

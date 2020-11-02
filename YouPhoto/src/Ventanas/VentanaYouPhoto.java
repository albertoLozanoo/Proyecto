package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class VentanaYouPhoto extends JFrame {

	private JPanel contentPane;
	private JButton btnYouPhoto, btnUsuario;
	private JLabel lblTitulo;
	private JScrollPane sp;

	/**
	 * Create the frame.
	 */
	public VentanaYouPhoto() {
		ImageIcon fotoUsuario = new ImageIcon("/Imagenes/fotoAmigos.png");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pSur = new JPanel();
		contentPane.add(pSur, BorderLayout.SOUTH);
		pSur.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnYouPhoto = new JButton(fotoUsuario);
		pSur.add(btnYouPhoto);
		
		btnUsuario = new JButton("Icono usuario");
		pSur.add(btnUsuario);
		
		JPanel pNorte = new JPanel();
		contentPane.add(pNorte, BorderLayout.NORTH);
		
		
		
		lblTitulo = new JLabel("YouPhoto");
		lblTitulo.setFont(new Font("Forte", Font.PLAIN, 36));
		pNorte.add(lblTitulo);
		
		JPanel pCentro = new JPanel();
		contentPane.add(pCentro, BorderLayout.CENTER);
		
		sp = new JScrollPane();
		pCentro.add(sp);
		
		setVisible(true);
	}

}

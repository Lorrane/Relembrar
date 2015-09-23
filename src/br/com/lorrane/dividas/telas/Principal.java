package br.com.lorrane.dividas.telas;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.text.ParseException;

import br.com.lorrane.dividas.telas.CadastroDividas;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public Principal() throws ParseException {
		setForeground(new Color(153, 255, 51));
		setFont(new Font("Calibri", Font.PLAIN, 14));
		setTitle("Controle de Dividas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 1000, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painel = new JPanel(new CardLayout());
		painel.setBounds(0, 0, 982, 653);
		
		getContentPane().add(painel);
		
		JPanel inicial = new JPanel();
		painel.add(inicial, "Inicial");
		
		
		CadastroDividas cadastroDivida = new CadastroDividas();
		painel.add(cadastroDivida, "Cadastro Dividas");
		
		JPanel cadastroRenda = new JPanel();
		painel.add(cadastroRenda, "Cadastro Rendas");
		
		CardLayout cl = (CardLayout) painel.getLayout();
		cl.show(painel, "Inicial");
		
		
		JButton btnCadastroDivida = new JButton("Cadastro Divida");
		btnCadastroDivida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(painel, "Cadastro Dividas");
			}
		});
		btnCadastroDivida.setBounds(33, 32, 160, 25);
		inicial.add(btnCadastroDivida);
		
	}
}

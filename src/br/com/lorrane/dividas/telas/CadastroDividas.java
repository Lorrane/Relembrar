package br.com.lorrane.dividas.telas;

import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.swing.JRadioButton;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.MaskFormatter;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CadastroDividas extends JPanel {
	private JTextField nomeDespesa;
	private JTextField txtValor;
	private JFormattedTextField textField_2;
	private JTextField textfieldQtdParcelas;

	/**
	 * Create the panel.
	 * @throws ParseException 
	 */
	public CadastroDividas() throws ParseException {
		setLayout(null);
		setBounds(0, 0, 982, 653);

		JLabel lblNomeDaDispesa = new JLabel("Nome da Dispesa:");
		lblNomeDaDispesa.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNomeDaDispesa.setBounds(30, 30, 250, 30);
		add(lblNomeDaDispesa);

		JLabel lblValorDaDispesa = new JLabel("Valor da Dispesa:");
		lblValorDaDispesa.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblValorDaDispesa.setBounds(30, 90, 250, 30);
		add(lblValorDaDispesa);
		
		JLabel lblDataDoVencimento = new JLabel("Data do Vencimento:");
		lblDataDoVencimento.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDataDoVencimento.setBounds(30, 150, 250, 30);
		add(lblDataDoVencimento);
		
		JLabel lblQtdParcelas = new JLabel("Quantidade de Parcelas:");
		lblQtdParcelas.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblQtdParcelas.setBounds(30, 210, 300, 30);
		lblQtdParcelas.setVisible(false);
		add(lblQtdParcelas);
		

		nomeDespesa = new JTextField();
		nomeDespesa.setFont(new Font("Monotype Corsiva", Font.ITALIC, 22));
		nomeDespesa.setBounds(350, 36, 300, 30);
		add(nomeDespesa);
		nomeDespesa.setColumns(10);
		
		txtValor = new JNumberFormatField(new DecimalFormat("R$ 0.00")){    
            {// limita a 6   
                // caracteres    
                setLimit(6);    
            }    
        };
		txtValor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtValor.setText("");
			}
		});
		txtValor.setText("Insira apenas n\u00FAmeros");
		txtValor.setFont(new Font("Monotype Corsiva", Font.ITALIC, 22));
		txtValor.setBounds(350, 96, 300, 30);
		add(txtValor);
		txtValor.setColumns(10);
		
		textField_2 = new JFormattedTextField();
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_2.setCaretPosition(0);
		    }
		});
			
		textField_2.setFont(new Font("Monotype Corsiva", Font.ITALIC, 22));
		textField_2.setBounds(350, 156, 300, 30);
		MaskFormatter formater = new MaskFormatter(); 
		textField_2.setColumns(8); 

		try { 
		formater.setMask("##/##/####"); 
		formater.install(textField_2); 
		} 
		catch (ParseException pe) { 
		pe.printStackTrace(); 
		} 
		catch ( Exception ex ) { 
		// process remaining Exceptions here 
		ex.printStackTrace(); 
		}
		
		add(textField_2);
		textField_2.setColumns(10);
		
		textfieldQtdParcelas = new JTextField();
		textfieldQtdParcelas.setFont(new Font("Monotype Corsiva", Font.ITALIC, 22));
		textfieldQtdParcelas.setBounds(350, 216, 300, 30);
		add(textfieldQtdParcelas);
		textfieldQtdParcelas.setVisible(false);
		textfieldQtdParcelas.setColumns(10);
		
		
		JButton btnSalvarDespesa = new JButton("Salvar despesa");
		btnSalvarDespesa.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSalvarDespesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resultOption = JOptionPane.showConfirmDialog(null, "Deseja fazer um novo cadastro?");
				if (resultOption == JOptionPane.YES_OPTION){
					nomeDespesa.setText("");
					txtValor.setText("");
					textField_2.setText("");
					nomeDespesa.getCursor();
				}
			}
		});
		btnSalvarDespesa.setBounds(275, 350, 400, 200);
		add(btnSalvarDespesa);
		
		JRadioButton rButtonAVista = new JRadioButton("A Vista");
		rButtonAVista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblQtdParcelas.setVisible(false);
				textfieldQtdParcelas.setVisible(false);
			}
		});
		rButtonAVista.setFont(new Font("Tahoma", Font.BOLD, 22));
		rButtonAVista.setBounds(100, 255, 125, 30);
		add(rButtonAVista);
		
		
		JRadioButton rButtonParcelado = new JRadioButton("Parcelado");
		rButtonParcelado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblQtdParcelas.setVisible(true);
				textfieldQtdParcelas.setVisible(true);
			}
		});
		rButtonParcelado.setFont(new Font("Tahoma", Font.BOLD, 22));
		rButtonParcelado.setBounds(400, 255, 150, 30);
		add(rButtonParcelado);
		
		ButtonGroup parcelas = new ButtonGroup();
		parcelas.add(rButtonAVista);
		parcelas.add(rButtonParcelado);
		rButtonAVista.setSelected(true);

		
		
		
	}
}

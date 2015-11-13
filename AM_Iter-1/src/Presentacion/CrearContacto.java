package Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class CrearContacto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JPanel panel = new JPanel();
	private final JButton btnCrear = new JButton("Crear");
	private final JPanel panel_1 = new JPanel();
	private final JLabel label = new JLabel("Nombre:");
	private final JTextField textField = new JTextField();
	private final JLabel label_1 = new JLabel("Tel\u00E9fono:");
	private final JTextField textField_1 = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CrearContacto dialog = new CrearContacto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CrearContacto() {
		setTitle("Crear");
		setBounds(100, 100, 224, 175);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		contentPanel.add(panel, BorderLayout.SOUTH);
		
		panel.add(btnCrear);
		
		contentPanel.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{63, 0, 0};
		gbl_panel_1.rowHeights = new int[]{29, 20, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		textField.setColumns(10);
		panel_1.add(textField, gbc_textField);
		
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel_1.add(label_1, gbc_label_1);
		
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		textField_1.setColumns(10);
		panel_1.add(textField_1, gbc_textField_1);
	}

}

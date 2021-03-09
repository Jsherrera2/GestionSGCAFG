import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class FigurasG extends JFrame {

	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtBaseT;
	private JTextField txtAlturaT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FigurasG frame = new FigurasG();
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
	public FigurasG() {
		setForeground(new Color(50, 205, 50));
		setTitle("Figuras Geom\u00E9tricas ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setForeground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(321, 10, 390, 43);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setForeground(new Color(95, 158, 160));
		panel.setBounds(10, 83, 336, 244);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese el valor del lado del cuadrado:  ");
		lblNewLabel_2.setBounds(10, 60, 253, 15);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(610, 7, 10, 10);
		panel.add(panel_1);
		
		JTextArea txtLado = new JTextArea();
		txtLado.setBounds(252, 56, 71, 22);
		panel.add(txtLado);
		
		JLabel lblResultado = new JLabel("New label");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado.setBounds(21, 171, 258, 36);
		panel.add(lblResultado);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double lado= Double.parseDouble(txtLado.getText());
				double area=lado*lado;
				String cadena = String.valueOf(area);
				lblResultado.setText("El área del cuadrado es:   "+cadena+" m²");
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(128, 98, 118, 28);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("\u00C1REA DEL CUADRADO ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(104, 7, 142, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Resultado");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(21, 142, 71, 28);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("GESTI\u00D3N DE PROCESOS DE SOFTWARE ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(359, 44, 309, 28);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBounds(358, 83, 336, 244);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Ingrese la base del rect\u00E1ngulo: ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 60, 188, 13);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("\u00C1REA DEL RECT\u00C1NGULO ");
		lblNewLabel_5.setBounds(112, 10, 148, 15);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6_1 = new JLabel("Ingrese la altura del rect\u00E1ngulo: ");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(10, 92, 203, 13);
		panel_2.add(lblNewLabel_6_1);
		
		txtBase = new JTextField();
		txtBase.setBounds(218, 58, 96, 19);
		panel_2.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(218, 90, 96, 19);
		panel_2.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(10, 162, 71, 28);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblResultado_1 = new JLabel("New label");
		lblResultado_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado_1.setBounds(10, 187, 258, 36);
		panel_2.add(lblResultado_1);
		
		JButton btnRectangulo = new JButton("CALCULAR");
		btnRectangulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double base= Double.parseDouble(txtBase.getText());
				double altura= Double.parseDouble(txtAltura.getText());
				double area=base*altura;
				String cadena = String.valueOf(area);
				lblResultado_1.setText("El área del rectángulo es:   "+cadena+" m²");
			}
		});
		btnRectangulo.setForeground(Color.WHITE);
		btnRectangulo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRectangulo.setBackground(new Color(50, 205, 50));
		btnRectangulo.setBounds(112, 124, 118, 28);
		panel_2.add(btnRectangulo);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(152, 251, 152));
		panel_2_1.setBounds(707, 83, 336, 244);
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Ingrese la base del tri\u00E1ngulo: ");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_2.setBounds(10, 60, 188, 13);
		panel_2_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("\u00C1REA DEL TRI\u00C1NGULO ");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(112, 10, 148, 15);
		panel_2_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Ingrese la altura del tri\u00E1ngulo: ");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1_1.setBounds(10, 92, 203, 13);
		panel_2_1.add(lblNewLabel_6_1_1);
		
		txtBaseT = new JTextField();
		txtBaseT.setColumns(10);
		txtBaseT.setBounds(218, 58, 96, 19);
		panel_2_1.add(txtBaseT);
		
		txtAlturaT = new JTextField();
		txtAlturaT.setColumns(10);
		txtAlturaT.setBounds(218, 90, 96, 19);
		panel_2_1.add(txtAlturaT);
		
		JLabel lblNewLabel_3_2 = new JLabel("Resultado");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 162, 71, 28);
		panel_2_1.add(lblNewLabel_3_2);
		
		JLabel lblRTriangulo = new JLabel("New label");
		lblRTriangulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRTriangulo.setBounds(10, 187, 258, 36);
		panel_2_1.add(lblRTriangulo);
		
		JButton btnTriangulo = new JButton("CALCULAR");
		btnTriangulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnTriangulo.setForeground(Color.WHITE);
		btnTriangulo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnTriangulo.setBackground(new Color(50, 205, 50));
		btnTriangulo.setBounds(112, 124, 118, 28);
		panel_2_1.add(btnTriangulo);
		
		
	}
}

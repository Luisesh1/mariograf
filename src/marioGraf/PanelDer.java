package marioGraf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelDer extends JPanel implements ActionListener
{
	private Lienzo copia;
	private JLabel etiq, etiq1, etiq2, etiq3, etiq4, etiq5, etiq6, etiq7, etiq8,etiq9;
	private JTextField sx, sy, tx, ty, px, py, g;
	private JButton trasladar, borrar, escalar,rotar,reflejar,linea,circulo,relleno,punto;
	private JButton rojo,amarillo,azul,negro;
	
	int [] color = {0,0,0};
	
	public PanelDer(Lienzo panel)
	{
		copia     = panel;
		etiq      = new JLabel("traslacion:");
		etiq1     = new JLabel("TX:");
		etiq2     = new JLabel("TY:");
		etiq3     = new JLabel("Escalacion:");
		etiq4     = new JLabel("SX:");
		etiq5     = new JLabel("SY:");
		sx        = new JTextField();
		sy        = new JTextField();
		tx        = new JTextField();
		ty        = new JTextField();
		etiq6	  = new JLabel("Punto fijo:");
		etiq7	  = new JLabel("PX:");
		etiq8	  = new JLabel("PY:");
		etiq9     = new JLabel("Grados:");
		px        = new JTextField();
		py        = new JTextField();
		g     = new JTextField();
		trasladar = new JButton ("Trasladar");
		escalar = new JButton ("Escalar");
		rotar = new JButton ("Rotar");
		reflejar= new JButton ("Reflejar");
		borrar    = new JButton ("Borrar");
		rojo = new JButton ("rojo");
		amarillo = new JButton ("amarillo");
		azul = new JButton ("azul");
		negro = new JButton ("negro");
		linea=new JButton("Linea");
		circulo=new JButton("Circulo");
		relleno=new JButton("Rellenar");
		punto=new JButton("Punto fijo");
		setLayout(null);
		agregarComponentes();
		asignarOyentes();
	}

	private void asignarOyentes() 
	{	
		linea.addActionListener(this);
		circulo.addActionListener(this);
		relleno.addActionListener(this);
		punto.addActionListener(this);
		rojo.addActionListener(this);
		amarillo.addActionListener(this);
		azul.addActionListener(this);
		negro.addActionListener(this);
		rotar.addActionListener(this);
		reflejar.addActionListener(this);
		trasladar.addActionListener(this);
		escalar.addActionListener(this);
		   borrar.addActionListener(this);
	}

	private void agregarComponentes() 
	{
		add(etiq);
		add(etiq1);
		add(tx);
		add(etiq2);
		add(ty);
		add(etiq3);
		add(etiq4);
		add(sx);
		add(sy);
		add(etiq5);
		add(etiq6);
		add(etiq7);
		add(etiq8);
		add(px);
		add(py);
		add(etiq9);
		add(g);
		add(trasladar);
		add(escalar);
		add(rotar);
		add(reflejar);
		add(borrar);
		add(rojo);
		add(amarillo);
		add(azul);
		add(negro);
		
		add(linea);
		add(circulo);
		add(punto);
		add(relleno);
		etiq.setBounds(85, 0, 80, 30);
		
		etiq1.setBounds(25, 20, 20, 20);
		tx.setBounds(50, 20, 30, 20);
		
		etiq2.setBounds(125, 20, 20, 20);
		ty.setBounds(150, 20, 30, 20);
		
		etiq3.setBounds(85, 30, 80, 30);
		etiq4.setBounds(25, 50, 20, 20);
		sx.setBounds(50, 50, 30, 20);
		
		etiq5.setBounds(125, 50, 20, 20);
		sy.setBounds(150, 50, 30, 20);
		
		etiq6.setBounds(85, 60, 80, 30);
		etiq7.setBounds(25, 80, 20, 20);
		px.setBounds(50, 80, 30, 20);
		
		etiq8.setBounds(90, 80, 20, 20);
		py.setBounds(150, 80, 30, 20);
		
		etiq9.setBounds(90, 110, 80, 20);
		g.setBounds(150, 110, 30, 20);
		trasladar.setBounds(10, 190, 80, 30);
		escalar.setBounds(10, 220, 80, 30);
		rotar.setBounds(10, 250, 80, 30);
		reflejar.setBounds(10, 280, 80, 30);
		
		
		rojo.setBounds(110,190, 80, 30);
		amarillo.setBounds(110, 220, 80, 30);
		azul.setBounds(110, 250, 80, 30);
		negro.setBounds(110, 280, 80, 30);
		
		linea.setBounds(220, 20, 100, 30);
		circulo.setBounds(220, 50, 100, 30);
		relleno.setBounds(220, 80, 100, 30);
		punto.setBounds(220, 110, 100, 30);
		
		borrar.setBounds(220, 190, 80, 30);
		
	}
	public void setPx(String v){
		px.setText(v);
	}
	public void setPY(String v){
		py.setText(v);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==borrar){
			copia.borrar();
			return;
		}
		if (e.getSource()==trasladar){
			try 
			{
				copia.m.trasladar(Integer.parseInt(tx.getText()),Integer.parseInt(ty.getText()));
			} 
			catch (Exception ex) 
			{
				JOptionPane.showMessageDialog(null, "Campo vacío.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource()==escalar){
			try 
			{
				copia.m.escalar(Integer.parseInt(sx.getText()),Integer.parseInt(sy.getText()));
			} 
			catch (Exception ex) 
			{
				JOptionPane.showMessageDialog(null, "Campo vacío.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource()==rotar){
			try 
			{
				copia.m.rotar(Integer.parseInt(g.getText()),Integer.parseInt(px.getText()),Integer.parseInt(py.getText()));
			} 
			catch (Exception ex) 
			{
				JOptionPane.showMessageDialog(null, "Campo vacío.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource()==reflejar){
			try 
			{
				copia.m.reflejar(Integer.parseInt(px.getText()),Integer.parseInt(py.getText()));
			} 
			catch (Exception ex) 
			{
				JOptionPane.showMessageDialog(null, "Campo vacío.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource()==rojo){
			copia.m.color =new int[]{231,037,18};
		}
		if (e.getSource()==amarillo){
			copia.m.color =new int[]{250,210,001};
		}
		if (e.getSource()==azul){
			copia.m.color =new int[]{073,103,141};
		}
		if (e.getSource()==negro){
			copia.m.color =new int[]{0,0,0};
		}
		if (e.getSource()==linea){
			copia.figura=3;
		}
		if (e.getSource()==circulo){
			copia.figura=2;
		}
		if (e.getSource()==relleno){
			copia.figura=4;
		}
		if (e.getSource()==punto){
			copia.figura=5;
		}
		copia.repaint();
	}
}

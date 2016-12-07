package marioGraf;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Interfaz extends JFrame {
	private BufferedImage bi = null;
	private int [] color = {0,0,0};
	Lienzo l;
	PanelDer pd;
	Interfaz(){
		
		bi = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB); //Inicializa el área de trabajo.
		bi.getGraphics().fillRect(0, 0, bi.getWidth(), bi.getHeight());
		l=new Lienzo(bi);
		pd=new PanelDer(l);
		l.copia=pd;
		this.setSize(800, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		creaTnterdaz();
		creaEscuchadores();
	}

	private void creaEscuchadores() {
		
		
	}

	private void creaTnterdaz() {
	this.setLayout(new GridLayout(1,0));
		this.add(l);
		this.add(pd);
		
		
	}
	public static void main(String []sdsad){
		new Interfaz();
	}
}

package marioGraf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Lienzo extends JPanel implements MouseListener{
	BufferedImage bi=null;
	Manejador m=null;
	PanelDer copia = null;
	int x1,x2,y1,y2,figura=3;
	Lienzo(BufferedImage bi){
		m=new Manejador(bi);
		this.bi=bi;
		this.addMouseListener(this);
	}
	public void borrar()
	{
		bi.getGraphics().fillRect(0, 0, bi.getWidth(), bi.getHeight());
		m=new Manejador(bi);
		repaint();
	}

	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		g.drawImage(bi, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
	
		if(figura == 1)
		{
			
		}
		else if(figura == 2)
		{
			m.addCirculo(x1, y1, x2, y2);
			
		}else if (figura==3){
			m.addLinea(x1, y1, x2, y2);
		}
		else if (figura==4){
			m.addRelleno(x2, y2);
		}
		else if (figura==5){
			copia.setPx(x2+"");
			copia.setPY(y2+"");
		}
		m.dibujar();
		repaint();
	}

}

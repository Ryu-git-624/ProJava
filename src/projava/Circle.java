package projava;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Circle {
	public static void main(String[] args)
	{
		var image = new BufferedImage(600,400,BufferedImage.TYPE_3BYTE_BGR);
		var g = image.createGraphics();
		for(int x = 0; x < 12; x++)
		{
			for(int y = 0; y < 12; y++)
			{
				if(x == y)
				{
					g.setColor(Color.RED);
				}
				else {
					g.setColor(Color.WHITE);
				}
				g.fillOval(x * 30 + 50, y * 30 + 20, 25,25);
			}
		}
		
		var f = new JFrame("格子");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new JLabel(new ImageIcon(image)));
		f.pack();
		f.setVisible(true);
	}

}

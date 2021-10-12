import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 800, 600);
		
		final int x1 = 45, y1 = 40, a = 40, n = 10;
		
		g.setColor(Color.black);
		
		for (int i=0;i<=n;i++) {
			g.drawLine(x1, y1+i*a, x1+n*a, y1+i*a);
			g.drawLine(x1+i*a, y1, x1+i*a, y1+n*a);
		}
		
		int [][] board = new int[n][n];
		
		for (int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				board[i][j] = (int) (Math.random()*100+1);
		
	
		
		int cnt = 1;
		
		for (int row=0;row<n;row++)
			for (int col=0;col<n;col++) {
				
				if (row>col)
					g.drawString("1", x1+col*a+a/3, y1+row*a+a/2);
				
				else if (row<col)
					g.drawString("3", x1+col*a+a/3, y1+row*a+a/2);
				
				else 
					g.drawString("2", x1+col*a+a/3, y1+row*a+a/2);
		
				/*g.drawString(cnt + "", x1+col*a+a/3, y1+row*a+a/2);*/
				cnt++;
			}
	}

}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class MazePanel extends JPanel{
	private int[][] maze;
	public static final int FREE = 0, WALL = 1, START = 2, END = 3, PATH = 4;
	
	public MazePanel(Maze m) {
		maze = m.getArray();
		this.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				if(maze[e.getY()/50][e.getX()/50] == WALL)
					maze[e.getY()/50][e.getX()/50] = FREE;
				else maze[e.getY()/50][e.getX()/50] = WALL;
				repaint();
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
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	public void paintComponent(Graphics g){
		if(MazeSolver.getArray() != null)
			maze = MazeSolver.getArray();
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[i].length; j++)
			{
				if (maze[j][i] == FREE) {
					g.setColor(Color.WHITE);
					g.fillRect(i*50, j*50, 50, 50);
				}
				else if (maze[j][i] == WALL)
				{
					g.setColor(Color.BLACK);
					g.fillRect(i*50, j*50, 50, 50);
				}
				else if (maze[j][i] == START){
					g.setColor(Color.BLUE);
					g.fillRect(i*50, j*50, 50, 50);
				}
				else if (maze[j][i] == PATH){
					g.setColor(Color.GREEN);
					g.fillRect(i*50, j*50, 50, 50);
				}
				else
					g.setColor(Color.MAGENTA);
					g.fillRect(i*50, j*50, 50, 50);
			}
			System.out.println();
		}
	}
	public int[][] getArray(){ return maze; }
	
}

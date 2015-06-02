import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MazeFrame extends JFrame{
	
	public MazeFrame(Maze m){
		MazePanel panel = new MazePanel(m);
		this.add(panel);
		panel.setSize(500,500);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton solveButton = new JButton("Solve");
		solveButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new MazeSolver(panel.getArray(), MazeFrame.this);
			}

		});
		solveButton.setSize(100,50);
		this.add(solveButton, BorderLayout.SOUTH);
		panel.setVisible(true);
		this.setVisible(true);
	}
}

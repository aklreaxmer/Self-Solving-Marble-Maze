import java.util.ArrayList;


public class MazeSolver {
	private Maze maze;
	private ArrayList<int[]> open, closed;
		public MazeSolver(Maze maze)
		{
			this.maze = maze;
			int[][] mazeArr = maze.getArray();
			for(int[] i : mazeArr)
				open.add(i);
			
		}
		
		public ArrayList<int[]> get(){
			return null;
		}
}


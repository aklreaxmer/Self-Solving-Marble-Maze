import java.util.ArrayList;

public class MazeSolver {
	private static int[][] maze;
	public static final int FREE = 0, WALL = 1, START = 2, END = 3,  PATH = 4;
	
	private ArrayList<int[]> currPath = new ArrayList<int[]>();
	ArrayList<int[]> checked = new ArrayList<int[]>();
	ArrayList<int[]> path = new ArrayList<int[]>(); // The solution to the maze
	int endX, endY;     // Ending X and Y values of maze
	 
		public MazeSolver(int[][] maze, MazeFrame frame)
		{
			this.maze = maze;
			endX = 10;
			endY = 10;
			boolean b = solve(0, 0);
			
			System.out.println(b);
			for (int[] i : path)
			{
				System.out.println(i[0] + ", " + i[1]);
				maze[i[0]][i[1]] = PATH;
				
			}
			frame.repaint();
		}
		
		
		public boolean solve(int x, int y) {
		    if (maze[x][y] == END) return true; 
		    int[] step = {x,y};
		    for(int[] i : checked)
		    	if(step[0] == i[0] && step[1] == i[1])
		    		return false;
		    if (maze[x][y] == WALL) return false;  
		    checked.add(step);
		    if (x != 0) 
		        if (solve(x-1, y)) { 
		            path.add(step);
		            return true;
		        }
		    if (x != maze[0].length - 1)
		        if (solve(x+1, y)) { 
		            path.add(step);
		            return true;
		        }
		    if (y != 0)  
		        if (solve(x, y-1)) { 
		            path.add(step);
		            return true;
		        }
		    if (y != maze.length- 1) 
		        if (solve(x, y+1)) { 
		            path.add(step);
		            return true;
		        }
		    return false;
		}
		public static int[][] getArray(){
			return maze;
		}
}


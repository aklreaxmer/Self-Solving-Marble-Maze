import java.util.ArrayList;

public class Maze
{
	public int NUM_ROWS, NUM_COLS;
	public static final int  START = 2, END = 3;
	public static int[][] mazeArray;
	

	public Maze(int NUM_ROWS, int NUM_COLS)
	{
		this.NUM_ROWS = NUM_ROWS;
		this.NUM_COLS = NUM_COLS;
		mazeArray = new int[this.NUM_ROWS][this.NUM_COLS];
	}

	public static void main(String[] args)
	{
		Maze m = new Maze(10, 10);
		setStart(0, 0);
		setEnd(9, 9);
		new MazeFrame(m);
		
	}
	public int[][] getArray()
	{
		return mazeArray;
	}
	public static void setStart(int row, int col)
	{
		mazeArray[row][col] = START;
	}

	public static void setEnd(int row, int col)
	{
		mazeArray[row][col] = END;
	}
}

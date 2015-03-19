import java.util.ArrayList;

public class Maze
{
	public int NUM_ROWS, NUM_COLS;
	public static final int PATH = 0, WALL = 1, START = 2, END = 3, MARKED = 4, DONE = 5;
	public static int[][] mazeArray;
	

	public Maze(int NUM_ROWS, int NUM_COLS)
	{
		this.NUM_ROWS = NUM_ROWS;
		this.NUM_COLS = NUM_COLS;
		mazeArray = new int[this.NUM_ROWS][this.NUM_COLS];
	}

	public static void main(String[] args)
	{
		new Maze(8, 8);
		addWall(1,1);
		addWall(0,1);
		
		addWall(2, 4);
		addWall(2, 5);
		addWall(2, 6);
		addWall(2, 7);
		addWall(3, 2);
		addWall(4, 2);
		addWall(4, 3);
		addWall(4, 4);
		addWall(4, 1);
		addWall(4, 0);
		addWall(3,6);
		addWall(4,6);
		addWall(5,6);
		addWall(6,6);
		addWall(5,3);
		addWall(1,6);
		addWall(5, 2);
		addWall(6, 2);
		addWall(7, 2);

		setStart(0, 0);
		setEnd(7, 7);
		printMaze();
	}
	public int[][] getArray()
	{
		return mazeArray;
	}
	public static void addWall(int row, int col)
	{
		mazeArray[row][col] = WALL;
	}

	public static void setStart(int row, int col)
	{
		mazeArray[row][col] = START;
	}

	public static void setEnd(int row, int col)
	{
		mazeArray[row][col] = END;
	}

	public static void printMaze()
	{
		for (int[] i : mazeArray)
		{
			for (int j : i)
			{
				if (j == PATH)
					System.out.print("[ ] ");
				else if (j == WALL)
					System.out.print("[X] ");
				else if (j == START)
					System.out.print("[S] ");
				else
					System.out.print("[E] ");
			}
			System.out.println();
		}
	}
	public void solve(int[][] mazeArray)
	{
		for(int i = 0; i < mazeArray.length; i++)
		{
			for(int j = 0; j < mazeArray[0].length; j++)
			{
				
			}
		}
	}
	public void mark(int row, int col)
	{
		mazeArray[row][col] = MARKED;
	}
	public void done(int row, int col)
	{
		mazeArray[row][col] = DONE;
	}
	public int getNumNeighbors(int row, int col)
	{
		int numNeighbors = 0;
		if(mazeArray[row-1][col-1] == PATH)
			numNeighbors++;
		if(mazeArray[row-1][col] == PATH)
			numNeighbors++;
		if(mazeArray[row-1][col+1] == PATH)
			numNeighbors++;
		if(mazeArray[row][col-1] == PATH)
			numNeighbors++;
		if(mazeArray[row][col+1] == PATH)
			numNeighbors++;
		if(mazeArray[row+1][col-1] == PATH)
			numNeighbors++;
		if(mazeArray[row+1][col] == PATH)
			numNeighbors++;
		if(mazeArray[row+1][col+1] == PATH)
			numNeighbors++;
		return numNeighbors;
	}
}

import java.util.ArrayList;

public class Maze
{
	public int NUM_ROWS, NUM_COLS;
	public static final int PATH = 0, WALL = 1, START = 2, END = 3;
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

		addWall(2, 4);
		addWall(2, 5);
		addWall(2, 6);
		addWall(2, 7);
		addWall(3, 2);
		addWall(4, 2);
		addWall(4, 3);
		addWall(4, 4);
		addWall(5, 2);
		addWall(6, 2);
		addWall(7, 2);

		setStart(1, 1);
		setEnd(6, 7);

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
}

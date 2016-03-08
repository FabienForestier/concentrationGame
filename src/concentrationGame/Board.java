package concentrationGame;

import java.util.Arrays;

public class Board {

	private int size;
	private int[] tiles;
	
	public Board(int size) {
		setSize(size);
		setTiles(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getTiles() {
		return tiles;
	}

	public void setTiles(int size) {
		this.tiles = new int[size];
		for(int i = 0; i < size; i++)
		{
			
			tiles[i]=i;
		}
	}
	
	@Override
	public String toString() {
		return "Board [tiles=" + Arrays.toString(tiles) + "]";
	}


}

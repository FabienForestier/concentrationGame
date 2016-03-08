package concentrationGame;

import java.util.Arrays;

public class Board {

	private int size;
	private Tile[] tiles;
	
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

	public Tile[] getTiles() {
		return tiles;
	}

	public void setTiles(int size) {
		this.tiles = new Tile[size];
		for(int i = 0; i < size; i++)
		{
			if(i%2==0)
			{
				tiles[i]= new Tile(i);
			}else
			{
				tiles[i]= new Tile(i-1);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Board [tiles=" + Arrays.toString(tiles) + "]";
	}
	
	public void compareTiles(int t,int r)
	{
		this.tiles[t].click();
		this.tiles[r].click();
		if(this.tiles[t].compareTo(this.tiles[r]))
		{
			System.out.println("The tiles match");
		}else
		{
			System.out.println("The tiles don't match");
		}
	}
	
	public void display() {
		String result ="";
		for(int i = 0; i < size; i++){
			if(tiles[i].getMatched()==true)
			{
				result+="["+i+"]["+tiles[i].getNumber()+"]";
			}else
			{
				result+="["+i+"][X]";
			}
			if(i!=(size-1))
			{
				result+=",";
			}
		}
		System.out.println(result);
	}


}

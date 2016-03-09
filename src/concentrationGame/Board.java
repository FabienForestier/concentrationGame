package concentrationGame;

import java.util.Arrays;
import java.util.Random;

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
		Random rand = new Random();
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
		for(int i = 0; i< 51; i++)
		{
			int t1 = rand.nextInt(15);
			int t2 = rand.nextInt(15);
			int temp = tiles[t1].getNumber();
			tiles[t1].setNumber(tiles[t2].getNumber());
			tiles[t2].setNumber(temp);
		}
	}
	
	@Override
	public String toString() {
		return "Board [tiles=" + Arrays.toString(tiles) + "]";
	}
	
	public void guess(int t,int r)
	{
		this.tiles[t].click();
		this.tiles[r].click();
		if(this.tiles[t].compareTo(this.tiles[r]))
		{
			System.out.println("["+t+"]["+tiles[t].getNumber()+"] and ["+r+"]["+tiles[r].getNumber()+"] match");
		}else
		{
			System.out.println("["+t+"]["+tiles[t].getNumber()+"] and ["+r+"]["+tiles[r].getNumber()+"] don't match");
		}
	}
	
	public void display() {
		String result ="";
		for(int i = 0; i < size; i++){
			if(tiles[i].getMatched()==true || tiles[i].getMatched()==false)
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
	
	public boolean boardSolved()
	{
		boolean result = true;
		int i =0;
		while(i < size && result==true)
		{
			if(tiles[i].getMatched()==false)
			{
				result=false;
			}
			i++;
		}
		return result;
	}


}

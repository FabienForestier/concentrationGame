package concentrationGame;

public class Tile {

	private int number;
	private boolean matched;
	private int nbClick;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean getMatched() {
		return matched;
	}

	public void setMatched(boolean matched) {
		this.matched = matched;
	}

	public int getNbClick() {
		return nbClick;
	}

	public void setNbClick(int nbClick) {
		this.nbClick = nbClick;
	}

	public Tile(int number) {
		setNumber(number);
		setMatched(false);
		setNbClick(0);
		
	}

	@Override
	public String toString() {
		return "Tile [number=" + number + ", matched=" + matched + ", nbClick=" + nbClick + "]";
	}
	
	public boolean compareTo(Tile t) {
		boolean result = false;
		if(this.number == t.number)
		{
			result = true;
			this.matched = true;
			t.matched = true;
		}
		return result;
	}
	
	public void click() {
		nbClick++;
	}
	

}

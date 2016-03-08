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

	public boolean isMatched() {
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
	

}

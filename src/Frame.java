public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		//to be implemented
		
		BowlingGame game = new BowlingGame();
				
		int rez = getFirstThrow() + getSecondThrow();
		if (isSpare()) {
			rez = rez + game.setBonus(firstThrow, secondThrow);
		}
		if (isStrike()) {
			
		}
		
		return rez;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		
		if (firstThrow == 10) {
			return true;
		}
		
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		
		if ((firstThrow + secondThrow) == 10) {
			return true;
		}
		
		return false;
	}
}

package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.setRow(row);
		this.setColumn(column);
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	@Override
	public String toString() {
		return "Row -> " + this.getRow() + ", Column -> " + this.getColumn() + "\n";
	}

}

package main.java.models;

public class Cell {
    private int row;
    private int col;
    private Player player;
    private CellState cellState;

    public Cell(int row,int col,CellState cellState){
        this.row = row;
        this.col = col;
        this.cellState = cellState;
        this.player = null;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public Cell setPlayer(Player player) {
        this.player = player;
        this.cellState = CellState.OCCUPIED;
        return this;
    }
}

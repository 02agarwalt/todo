package com.oose2017.tagarwa2.hareandhounds;

public interface Piece {
    public String getPieceType();
    public int[] getPos();
    public boolean moveTo(int newX, int newY);
}

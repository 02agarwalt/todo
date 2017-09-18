package com.oose2017.tagarwa2.hareandhounds;

import static java.lang.Math.abs;

public class Hound implements Piece {
    private String pieceType;
    private int x;
    private int y;

    /**
     * Constructor
     * @param x initial x position
     * @param y initial y position
     */
    public Hound(int x, int y) {
        this.pieceType = "HOUND";
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return Hare or Hound
     */
    public String getPieceType() {
        return this.pieceType;
    }

    /**
     *
     * @return return current position
     */
    public int[] getPos() {
        return new int[] {this.x, this.y};
    }

    /**
     * Validates and moves to new position
     * @param newX desired x position
     * @param newY desired y position
     * @return
     */
    public boolean moveTo(int newX, int newY) {
        if (newX < this.x) {
            return false;
        }
        boolean traversable = false;
        if (abs(newX - this.x) + abs(newY - this.y) == 1) { // vertical or horizontal 1-step move
            traversable = true;
        } else if (((newX + newY) % 2 != 0) && ((this.x + this.y) % 2 != 0)) { // potential for diagonal move
            if ((abs(this.x - newX) == 1) && (abs(this.y - newY) == 1)) {
                traversable = true;
            }
        }
        if (!traversable) {
            return false;
        }

        this.x = newX;
        this.y = newY;
        return true;
    }
}

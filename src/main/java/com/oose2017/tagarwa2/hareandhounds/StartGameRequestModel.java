package com.oose2017.tagarwa2.hareandhounds;

public class StartGameRequestModel {
    private String pieceType;

    public StartGameRequestModel(String pieceType) {
        this.pieceType = pieceType;
    }

    public String getPieceType() {
        return this.pieceType;
    }
}

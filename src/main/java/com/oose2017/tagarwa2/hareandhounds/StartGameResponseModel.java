package com.oose2017.tagarwa2.hareandhounds;

public class StartGameResponseModel {
    private String gameId;
    private String playerId;
    private String pieceType;

    public StartGameResponseModel(String gameId, String playerId, String pieceType) {
        this.gameId = gameId;
        this.playerId = playerId;
        this.pieceType = pieceType;
    }
}

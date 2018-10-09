package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {

    protected int playerID;
    protected int player0Score;
    protected int player1Score;
    protected int currentDieVal; //1 thru 6
    protected int runningTotal;

    public PigGameState() {
        playerID = 0;
        player0Score = 0;
        player1Score = 0;
        currentDieVal = 1;
        runningTotal = 0;
    }

    public PigGameState(PigGameState newGame) {
        playerID = newGame.playerID;
        player0Score = newGame.player0Score;
        player1Score = newGame.player1Score;
        currentDieVal = newGame.currentDieVal;
        runningTotal = newGame.runningTotal;
    }

    //SETTERS
    public void setPlayerID(int id) {
        playerID = id;
    }

    public void setPlayer0Score (int score) {
        player0Score = score;
    }

    public void setPlayer1Score (int score) {
        player1Score = score;
    }

    public void setCurrentDieVal(int dieVal) {
        currentDieVal = dieVal;
    }

    public void setRunningTotal(int total) {
        runningTotal = total;
    }

    //GETTERS
    public int getPlayerID(){
        return playerID;
    }

    public int getPlayer0Score () {
        return player0Score;
    }

    public int getPlayer1Score () {
        return player1Score;
    }

    public int getCurrentDieVal() {
        return currentDieVal;
    }

    public int getRunningTotal() {
        return runningTotal;
    }
}

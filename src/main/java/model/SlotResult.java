package model;

public class SlotResult {

    private Symbol[] reels;
    private boolean win;
    private int payout;

    public SlotResult(Symbol[] reels, boolean win, int payout) {
        this.reels = reels;
        this.win = win;
        this.payout = payout;
    }

    public Symbol[] getReels() {
        return reels;
    }

    public boolean isWin() {
        return win;
    }

    public int getPayout() {
        return payout;
    }
}


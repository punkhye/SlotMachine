package service;

import model.SlotResult;
import model.Symbol;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SlotService {

    private final Random random = new Random();
    private final Symbol[] symbols = Symbol.values();

    public SlotResult spin() {
        Symbol[] reels = spinReels();
        int payout = calculatePayout(reels);
        boolean win = payout > 0;

        return new SlotResult(reels, win, payout);
    }

    private Symbol[] spinReels() {
        Symbol[] reels = new Symbol[4];
        for (int i = 0; i < 4; i++) {
            reels[i] = symbols[random.nextInt(symbols.length)];
        }
        return reels;
    }

    private int calculatePayout(Symbol[] reels) {
        if (reels[0] == reels[1] && reels[1] == reels[2]) {
            return switch (reels[0]) {
                case SEVEN -> 100;
                case BAR -> 50;
                default -> 10;
            };
        }
        return 0;
    }
}


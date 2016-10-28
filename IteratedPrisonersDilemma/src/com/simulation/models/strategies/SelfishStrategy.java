package com.simulation.models.strategies;

/**
 * This Strategy will always be selfish.
 */
public class SelfishStrategy extends BaseStrategy {

    public SelfishStrategy() {
    }

    @Override
    public boolean makeMove() {
        //always selfish
        return false;
    }

    @Override
    public void updateOpponentMove(boolean opponentMove) {
        //doesn't need opponent move info because its always selfish
    }

    @Override
    public void resetStrategy() {
        //nothing changes in the strat. Nothing to reset
    }
}

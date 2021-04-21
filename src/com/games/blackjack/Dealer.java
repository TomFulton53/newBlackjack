package com.games.blackjack;

public class Dealer extends Player{
    private Deck deck;

    public Dealer(String _name, Deck deck) {
        super(_name);
        this.deck = deck;
    }
}

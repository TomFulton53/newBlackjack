package com.games.blackjack.client;

import com.games.blackjack.Dealer;
import com.games.blackjack.Deck;

public class BlackJackClient {
    public static void main(String[] args) {
        System.out.println("Blackjack Game Initialized");
        Dealer dealer = new Dealer("Dealer", new Deck());
    }
}

package com.example;

import java.util.Random;

public class Cavallo extends Thread {
    private String nome;
    private int lunghezza;
    private int distanza;

    public Cavallo(String nome, int lunghezza, int distanza) {
        this.nome = nome;
        this.lunghezza = lunghezza;
        this.distanza = distanza;
    }

    public String getNome(){
        return nome;
    }

    public void run() {
        while (lunghezza < distanza) {
            Random random = new Random();
            int metri = random.nextInt(10) + 1;
            lunghezza += metri;
            System.out.println("["  + nome +"] ha percorso " + lunghezza);
            try {
                int tempoSleep = random.nextInt(400) + 400; // Tra 400 e 800 ms
                Thread.sleep(tempoSleep);
            } catch (InterruptedException e) {
                System.out.println("Il thread è stato interrotto");
            }

        }
    }

}

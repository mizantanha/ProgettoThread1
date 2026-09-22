package com.example;

public class Main {
    public static void main(String[] args) {

        Cavallo c1 = new Cavallo("Monica", 0, 98);
        Cavallo c2 = new Cavallo("Sonia", 0, 98);
        Cavallo c3 = new Cavallo("Suma", 0, 98);
        Cavallo c4 = new Cavallo("Nabila", 0, 98);
        Cavallo c5 = new Cavallo("Sara", 0 ,98);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        boolean finish = false;
        while(!finish){
            if(!c1.isAlive() && !finish){
                System.out.println(c1.getNome() + " ha vinto");
                finish = true;
            }
            if(!c2.isAlive() && !finish){
                System.out.println(c2.getNome() + " ha vinto");
                finish = true;
            }
            if(!c3.isAlive() && !finish){
                System.out.println(c3.getNome() + " ha vinto");
                finish = true;
            }
            if(!c4.isAlive() && !finish){
                System.out.println(c4.getNome() + " ha vinto");
                finish = true;
            }
            if(!c5.isAlive() && !finish){
                System.out.println(c5.getNome() + " ha vinto");
                finish = true;
            }
        }

    }
}
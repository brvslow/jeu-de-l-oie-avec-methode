package fr.wasson;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static int Lancer() {
        Random generateur = new Random();
        int lancer = generateur.nextInt(6) + 1;
        return lancer;
    }

    public static void Gagner(){
        System.out.println("Vous avez gagné !");
    }

    public static void Perdu(){
        System.out.println("Vous avez perdu !");
    }

    public static void caseActuelle(int caseActuelle, int nb, int i){
        System.out.println("Lancer " + (i + 1) + " : vous avez faits " + nb + ". Vous êtes sur la case " + caseActuelle + ". (Encore " + (20 - caseActuelle) + " cases).");
    }

    public static int Jouer(Scanner clavier) {
        int caseActuelle = 0;
        for (int i = 0; i < 5; i++) {
            int nb = Lancer();
            caseActuelle += nb;
            caseActuelle(caseActuelle, nb, i);
            // clavier.nextLine();
        }
        return caseActuelle;
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int caseActuelle = Jouer(clavier);
        if (20 - caseActuelle == 0) {
            Gagner();
        } else {
            Perdu();
        }
        clavier.close();
    }
}
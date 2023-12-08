package fr.pgah;

import java.util.Random;

public class App {

  public static void main(String[] args) {
    int caseObjectif = 20;
    int caseCourante = 0;
    int nbLancers = 5;
    Random generateur = new Random();

    System.out.println("Bienvenue ! Commençons...");

    for (int i = 1; i <= nbLancers; i++) {
      caseCourante = lancerDeDés(generateur, caseCourante, i);
    }

    afficherResultatPartie(caseCourante, caseObjectif);
  }

  public static int lancerDeDés(Random generateur, int caseCourante, int numéroLancer) {
    int lancer = generateur.nextInt(6) + 1;
    caseCourante = caseCourante + lancer;
    System.out.println(String.format("Lancer %d : vous avez fait %d. Vous êtes sur la case %d.",
        numéroLancer, lancer, caseCourante));
    return caseCourante;
  }

  public static void afficherResultatPartie(int caseCourante, int caseObjectif) {
    if (caseCourante == caseObjectif) {
      System.out.println("Vous avez gagné !");
    } else if (caseCourante > caseObjectif) {
      System.out.print("Vous dépassez, vous avez perdu !");
    } else {
      System.out.println("Il vous en manque pour arriver à " + caseObjectif + " !");
    }
  }
}

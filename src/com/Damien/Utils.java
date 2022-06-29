package com.Damien;

import javax.swing.*;

/**
 * The type Utils.
 */
public class Utils {

    /**
     * Gets nb 1.
     *
     * @return the nb 1
     */
    public static int getNb1() {
        return nb1;
    }

    /**
     * Sets nb 1.
     *
     * @param nb1 the nb 1
     */
    public static void setNb1(int nb1) {
        Utils.nb1 = nb1;
    }

    /**
     * Gets nb 2.
     *
     * @return the nb 2
     */
    public static int getNb2() {
        return nb2;
    }

    /**
     * Sets nb 2.
     *
     * @param nb2 the nb 2
     */
    public static void setNb2(int nb2) {
        Utils.nb2 = nb2;
    }

    /**
     * Gets op.
     *
     * @return the op
     */
    public static char getOp() {
        return op;
    }

    /**
     * Sets op.
     *
     * @param op the op
     */
    public static void setOp(char op) {
        Utils.op = op;
    }

    /**
     * Gets resultat.
     *
     * @return the resultat
     */
    public static double getResultat() {
        return resultat;
    }

    /**
     * Sets resultat.
     *
     * @param resultat the resultat
     */
    public static void setResultat(double resultat) {
        Utils.resultat = resultat;
    }

    /**
     * The Nb 1.
     */
    static int nb1;
    /**
     * The Nb 2.
     */
    static int nb2;
    /**
     * The Op.
     */
    static char op;
    /**
     * The Resultat.
     */
    static double resultat;

    /**
     * Gets choix user.
     *
     * @return the choix user
     */
    public static String getChoixUser() {
        return choixUser;
    }

    /**
     * Sets choix user.
     *
     * @param choixUser the choix user
     */
    public static void setChoixUser(String choixUser) {
        Utils.choixUser = choixUser;
    }

    /**
     * The Choix user.
     */
    static String choixUser;

    /**
     * Demander entier 1 double.
     *
     * @return the double
     */
    protected static double demanderEntier1() {

        String var1;
        do {
            var1 = JOptionPane.showInputDialog(
                    null,
                    "Veuillez saisir le premier entier",
                    "Saisir entier",
                    JOptionPane.QUESTION_MESSAGE);
            nb1IsInteger(var1); // vérification de la conformité de la saisie

        } while (!nb1IsInteger(var1));

        return nb1;
    }

    /**
     * Demander entier 2 double.
     *
     * @return the double
     */
    protected static double demanderEntier2() {
        String var2;
        do {
            var2 = JOptionPane.showInputDialog(
                    null,
                    "Veuillez saisir le second entier",
                    "Saisir entier",
                    JOptionPane.QUESTION_MESSAGE);
            nb2IsInteger(var2);
        } while (!nb2IsInteger(var2));

        return nb2;
    }

    /**
     * Demander operateur char.
     *
     * @return the char
     */
    protected static char demanderOperateur() {
        String operateur;
        do {
            operateur = JOptionPane.showInputDialog(
                    null,
                    "Veuillez saisir l'opérateur désiré ( +, -, *, /)",
                    "Saisir opérateur",
                    JOptionPane.QUESTION_MESSAGE);
            if (operateur.length() > 1) {
                JOptionPane.showMessageDialog(
                        null,
                        "Vous avez saisi trop de caractères",
                        "Erreur : trop de caractères",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (operateur.length() > 1);

        op = operateur.charAt(0);
        return op;
    }

    /**
     * Afficher resultat.
     *
     * @param resultat the resultat
     */
    protected static void afficherResultat(double resultat) {
        JOptionPane.showMessageDialog(
                null,
                "Résultat de l'opération demandée :\n " + getNb1() + " " + getOp() + " " + getNb2() + " = " + resultat,
                "Résultat",
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Afficher resultat factorielle.
     *
     * @param resultat the resultat
     */
    protected static void afficherResultatFactorielle(double resultat) {
        JOptionPane.showMessageDialog(
                null,
                "Résultat de l'opération demandée :\n " + getNb1() + "! = " + resultat,
                "Résultat",
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Nb 1 is integer boolean.
     *
     * @param var1 the var 1
     * @return the boolean
     */
    public static boolean nb1IsInteger(String var1) {
        boolean isInt;
        try {
            nb1 = Integer.parseInt(var1);
            isInt = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Saisie erronée, merci de saisir un entier",
                    "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
            isInt = false;
        }
        return isInt;
    }

    /**
     * Nb 2 is integer boolean.
     *
     * @param var2 the var 2
     * @return the boolean
     */
    public static boolean nb2IsInteger(String var2) {
        boolean isInt;
        try {
            nb2 = Integer.parseInt(var2);
            isInt = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Saisie erronée, merci de saisir un entier",
                    "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
            isInt = false;
        }
        return isInt;
    }

    /**
     * Choix operation string.
     *
     * @return the string
     */
    public static String choixOperation() {
        String[] optionsPossibles = {" ", "Calculatrice", "Factorielle"};

        choixUser = (String) JOptionPane.showInputDialog(
                null,
                "Quelle opération souhaitez vous faire ?",
                "Choix opération",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsPossibles,
                optionsPossibles[0]);

        return choixUser;
    }
}

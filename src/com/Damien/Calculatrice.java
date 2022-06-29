package com.Damien;

import javax.swing.*;

/**
 * The type Calculatrice.
 */
public class Calculatrice {

    /**
     * Calculer double.
     *
     * @param nb1 the nb 1
     * @param op  the op
     * @param nb2 the nb 2
     * @return the double
     */
    public static double calculer(final double nb1, final char op, final double nb2) {

        double resultat = 0;

        try {
            switch (op) {
                case '+':
                    resultat = nb1 + nb2;
                    break;
                case '-':
                    resultat = nb1 - nb2;
                    break;
                case '*':
                    resultat = nb1 * nb2;
                    break;
                case '/':
                    if (nb2 != 0) {
                        resultat = nb1 / nb2;
                    } else {
                        throw new ArithmeticException("Division par zero interdite !");
                    }
                    break;
                default:
                    throw new SaisieErroneeException("Operateur inconnu !");
            }
        } catch (SaisieErroneeException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Quel est cet opérateur inconnu ? ---> " + Utils.getOp(),
                    "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
            // Il faut bien stocker la valeur du résultat dans la variable car la récursivité fait que résultat = 0
//            comme défini au début de la méthode
            resultat = calculer(nb1, Utils.demanderOperateur(), nb2);

        }

        return resultat;
    }
}

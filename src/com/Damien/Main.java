package com.Damien;

import javax.swing.*;

import static com.Damien.Utils.*;

/**
 * The type Main.
 */
public class Main {

    /**
     * The Res 1.
     */
    static double res1;

    /**
     * Gets resultat.
     *
     * @return the resultat
     */
    public static double getResultat() {
        return res1;
    }

    /**
     * Sets resultat.
     *
     * @param resultat the resultat
     */
    public static void setResultat(double resultat) {
        res1 = resultat;
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws SaisieErroneeException the saisie erronee exception
     */
    public static void main(String[] args) throws SaisieErroneeException {
        Utils.choixOperation();

        switch (getChoixUser()) {
            case "Calculatrice":
                try {
                    setResultat(Calculatrice.calculer(demanderEntier1(), Utils.demanderOperateur(), Utils.demanderEntier2()));
                    Utils.afficherResultat(getResultat());
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Divison par 0 interdite !",
                            "Erreur",
                            JOptionPane.ERROR_MESSAGE);
                    do {
                        Utils.demanderEntier2();
                        if (getNb2() == 0) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Divison par 0 interdite !",
                                    "Erreur",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    while (getNb2() == 0);
                    setResultat(Calculatrice.calculer(getNb1(), getOp(), getNb2()));
                    Utils.afficherResultat(getResultat());
                }
                break;
            case "Factorielle":
                try {
                    setResultat(Factorielle.factorielle((int) demanderEntier1()));
                    afficherResultatFactorielle(getResultat());
                } catch (SaisieErroneeException see) {
                    while (getNb1() < 0 || getNb1() > 20) {
                        JOptionPane.showMessageDialog(
                                null,
                                "La valeur ne peut être comprise qu'entre 0 et 20!",
                                "Erreur de saisie",
                                JOptionPane.ERROR_MESSAGE);
                        demanderEntier1();
                    }
                    setResultat(Factorielle.factorielle(nb1));
                    afficherResultatFactorielle(getResultat());
                }
                break;
            case " ":
                break;
        }

    }

}

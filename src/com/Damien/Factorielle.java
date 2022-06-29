package com.Damien;

/**
 * The type Factorielle.
 */
public class Factorielle {

    /**
     * Factorielle long.
     *
     * @param nb1 the nb 1
     * @return the long
     * @throws SaisieErroneeException the saisie erronee exception
     */
    public static long factorielle(int nb1) throws SaisieErroneeException {
        if (nb1 < 0 || nb1 > 20) {
            throw new SaisieErroneeException("La valeur doit être 0 < valeur < 20");
        }
        if (nb1 <= 1) {
            return 1;
        } else {
            return nb1 * factorielle(nb1 - 1);
        }
    }
}

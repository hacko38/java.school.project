/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Hakim
 */
public class StockException extends Exception {

    public StockException(String Erreur) {
        super("Erreur lors de l'initialisation de l'objet Stock : " + Erreur);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author quent
 */
public class Presse {
    
private int numPresse;
private boolean etatPresse;
private boolean supprimee;


    public Presse(int numPresse, boolean etatPresse, boolean supprimee) {
        this.numPresse = numPresse;
        this.etatPresse = etatPresse;
        this.supprimee = supprimee;
       
    }
    
     public Presse(int numPresse, boolean etatPresse) {
        this.numPresse = numPresse;
        this.etatPresse = etatPresse;
    }

    public int getNumPresse() {
        return numPresse;
    }

    public boolean isEtatPresse() {
        return etatPresse;
    }

    public boolean isSupprimee() {
        return supprimee;
    }

    public void setEtatPresse(boolean etatPresse) {
        this.etatPresse = etatPresse;
    }

    public void setSupprimee(boolean supprimee) {
        this.supprimee = supprimee;
    }

    @Override
    public String toString() {
       String retour = null;
        
        if(supprimee==false)
        {
            if(etatPresse==false)
            {
                retour = "Presse" + " n° " + numPresse + " Disponible";
            }
            else if(etatPresse==true)
            {
                retour = "Presse" + " n° " + numPresse + " Indisponible";
            }
        }
        else if(supprimee == true)
        {
                retour = "Presse" + " n° " + numPresse + " Supprimée";      
        }
        return retour;
        }
    
}

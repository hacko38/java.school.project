package entities;

import tools.Datefr;

/**
 *
 * @author quentin meunier
 */
public class Lot {

    private int idLot;
    private String modele;
    private int nbPiecesDemandees;
    private Datefr dateFab;
    private int numPresse;
    private int codeEtat;
    private float avgHL;
    private float avgHT;
    private float avgBL;
    private float avgBT;
    private float maxHL;
    private float maxHT;
    private float maxBL;
    private float maxBT;
    private float minHL;
    private float minHT;
    private float minBL;
    private float minBT;
    private float ecartHL;
    private float ecartHT;
    private float ecartBL;
    private float ecartBT;
    private String etatLottxt;
    

    public Lot(int idLot, String modele, int nbPiecesDemandees, Datefr dateFab, int numPresse, int codeEtat, float avgHL, float avgHT, float avgBL, float avgBT, float maxHL, float maxHT, float maxBL, float maxBT, float minHL, float minHT, float minBL, float minBT, float ecartHL, float ecartHT, float ecartBL, float ecartBT) {
        this.idLot = idLot;
        this.modele = modele;
        this.nbPiecesDemandees = nbPiecesDemandees;
        this.dateFab = dateFab;
        this.numPresse = numPresse;
        this.codeEtat = codeEtat;
        this.avgHL = avgHL;
        this.avgHT = avgHT;
        this.avgBL = avgBL;
        this.avgBT = avgBT;
        this.maxHL = maxHL;
        this.maxHT = maxHT;
        this.maxBL = maxBL;
        this.maxBT = maxBT;
        this.minHL = minHL;
        this.minHT = minHT;
        this.minBL = minBL;
        this.minBT = minBT;
        this.ecartHL = ecartHL;
        this.ecartHT = ecartHT;
        this.ecartBL = ecartBL;
        this.ecartBT = ecartBT;       
    }

    public Lot(int idLot, String modele, int nbPiecesDemandees) {
        this.idLot = idLot;
        this.modele = modele;
        this.nbPiecesDemandees = nbPiecesDemandees;

    }
    
    public Lot (int idLot, String modele, String etatLot )
    {
        this.idLot = idLot;
        this.modele = modele;
        this.etatLottxt = etatLot;
        
    }
	
	public Lot(int idLot, String modele,int nbPiecesDemandees, int NumPresse, int codeEtat) {
        this.idLot = idLot;
        this.modele = modele;
         this.nbPiecesDemandees = nbPiecesDemandees; 
         this.numPresse = NumPresse;
         this.codeEtat = codeEtat;
        
    }

    public int getIdLot() {
        return idLot;
    }

    public int getNbPiecesDemandees() {
        return nbPiecesDemandees;
    }

    public Datefr getDateFab() {
        return dateFab;
    }

    public int getNumPresse() {
        return numPresse;
    }

    public String getModele() {
        return modele;
    }

    public int getCodeEtat() {
        return codeEtat;
    }

    public float getAvgHL() {
        return avgHL;
    }

    public float getAvgHT() {
        return avgHT;
    }

    public float getAvgBL() {
        return avgBL;
    }

    public float getAvgBT() {
        return avgBT;
    }

    public float getMaxHL() {
        return maxHL;
    }

    public float getMaxHT() {
        return maxHT;
    }

    public float getMaxBL() {
        return maxBL;
    }

    public float getMaxBT() {
        return maxBT;
    }

    public float getMinHL() {
        return minHL;
    }

    public float getMinHT() {
        return minHT;
    }

    public float getMinBL() {
        return minBL;
    }

    public float getMinBT() {
        return minBT;
    }

    public float getEcartHL() {
        return ecartHL;
    }

    public float getEcartHT() {
        return ecartHT;
    }

    public float getEcartBL() {
        return ecartBL;
    }

    public float getEcartBT() {
        return ecartBT;
    }

    public String getEtatLottxt() {
        return etatLottxt;
    }

    public void setNbPiecesDemandees(int nbPiecesDemandees) {
        this.nbPiecesDemandees = nbPiecesDemandees;
    }
    
    @Override
    public String toString() {
        return "Lot : " + this.getIdLot() + "\t - modèle : " + this.getModele() +"\t - Pièces demandées : " + this.getNbPiecesDemandees()+ "\t - Etat du lot : " + this.getCodeEtat();
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author BOUGHANMI
 */
public class Piece 
{
    private int m_IdPiece;
    private float m_DiametreHT;
    private float m_DiametreHL;
    private float m_DiametreBT;
    private float m_DiametreBL;
    private String m_Categorie;
    private int m_IdLot;
    private String m_Commentaire;
    

    public Piece(int idPiece, float diametreHT, float diametreHL, float diametreBT, float diametreBL, String categorie, int idLot, String commentaire) 
    {
        this.m_IdPiece = idPiece;
        this.m_DiametreHT = diametreHT;
        this.m_DiametreHL = diametreHL;
        this.m_DiametreBT = diametreBT;
        this.m_DiametreBL = diametreBL;
        this.m_Categorie = categorie;
        this.m_IdLot = idLot;
        this.m_Commentaire = commentaire;
    }

    public int getIdPiece() 
    {
        return m_IdPiece;
    }

    public void setIdPiece(int idPiece) 
    {
        this.m_IdPiece = idPiece;
    }

    public float getDiametreHT() 
    {
        return m_DiametreHT;
    }

    public void setDiametreHT(float diametreHT) 
    {
        this.m_DiametreHT = diametreHT;
    }

    public float getDiametreHL() 
    {
        return m_DiametreHL;
    }

    public void setDiametreHL(float diametreHL) 
    {
        this.m_DiametreHL = diametreHL;
    }

    public float getDiametreBT() 
    {
        return m_DiametreBT;
    }

    public void setDiametreBT(float diametreBT) 
    {
        this.m_DiametreBT = diametreBT;
    }

    public float getDiametreBL() 
    {
        return m_DiametreBL;
    }

    public void setDiametreBL(float diametreBL) 
    {
        this.m_DiametreBL = diametreBL;
    }

    public String getCategorie() 
    {
        return m_Categorie;
    }

    public void setCategorie(String categorie) 
    {
        this.m_Categorie = categorie;
    }

    public int getIdLot() 
    {
        return m_IdLot;
    }

    public void setIdLot(int idLot) 
    {
        this.m_IdLot = idLot;
    }
    
    public String getCommentaire()
    {
        return m_Commentaire;
    }
    
    public void setCommentaire(String commentaire)
    {
        this.m_Commentaire = commentaire;
    }

    @Override
    public String toString() 
    {
        return "Piston{" + "m_IdPiece=" + m_IdPiece + ", m_DiametreHT=" + m_DiametreHT + ", m_DiametreHL=" + m_DiametreHL + ", m_DiametreBT=" + m_DiametreBT + ", m_DiametreBL=" + m_DiametreBL + ", m_Categorie=" + m_Categorie + ", m_IdLot=" + m_IdLot + '}';
    }
    
    
   
    
    
  
}

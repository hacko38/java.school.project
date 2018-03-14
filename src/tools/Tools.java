/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Hakim
 */
public class Tools {
    public static boolean isNull(String chaine){
		boolean ok;
		
                ok = (chaine == null) || (chaine.trim().equals(""));
		return ok;
	}
 
    public static boolean estAlpha(String chaine){
		boolean ok;
		
		if ((chaine == null) || (chaine.trim().equals("")))
		{
			ok = false;
		}
		else {
			ok = chaine.trim().matches("^[\\p{L}]+$");
		}
		return ok;
	}
	
	public static boolean estEntier (String pNum){
		boolean ok;
		
		if ((pNum == null)|| (pNum.trim().equals(""))) 											// adresse incorrect (vide)
		{
			ok = false;
		}
		else 
		{
			ok = pNum != null && pNum.matches("[\\d]+");
		}

		
		return ok;
		
	}

	
	public static boolean estReel (String chiffres)												
	{
		boolean ok;
		
		if ((chiffres == null)|| (chiffres.trim().equals(""))) 											// adresse incorrect (vide)
		{
			ok = false;
		}
		else 
		{
			ok = chiffres.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)");
		}

		
		return ok;
	}
        
          public static boolean isInf (int chiffre)
        {
            boolean ok;
            
            ok = chiffre > 0;
            return ok;
        }
          
          
          public static boolean mesureCorrecte (String s)
        {
            boolean ok;
            
            ok = !(!estReel(s) || Float.parseFloat(s) <= 0);
            
          return ok;  
        }
          
        


}

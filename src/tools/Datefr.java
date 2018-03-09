/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author quent
 */
public class Datefr extends GregorianCalendar {
    
    @Override
    public String toString()
    {
       return getDisplayName(DAY_OF_WEEK, LONG, Locale.FRANCE)+" "+get(DAY_OF_MONTH)+" "+ getDisplayName(MONTH, LONG, Locale.FRANCE)+ " "+String.format("%04d",get(YEAR))+ " " + String.format("%02d",get(HOUR_OF_DAY))+ "h"+ String.format("%02d",get(MINUTE))+"mn"+String.format("%02d",get(SECOND))+"s"+String.format("%03d",get(MILLISECOND));

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import utils.Tools;

/**
 *
 * @author Hakim
 */
public class UserId {
    private String username;
    private String password;
    private static UserId instance;

    public UserId(String username, String password) throws idException
    {
        if (!setUsername(username)){
            throw new idException();
        }
        if (!setPassword(password)){
            throw new idException();
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private boolean setUsername(String username) {
        boolean ok;
        if(Tools.isNull(username))
            ok = false;
        else{
            ok = true;
            this.username = username;
        }
        
        return ok;
    }

    private boolean setPassword(String password) {
        boolean ok;
        if(Tools.isNull(password))
            ok = false;
        else{
            ok = true;
            this.password = password;
        }
        return ok;

    }

    
}

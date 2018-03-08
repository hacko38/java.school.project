/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import tools.Tools;

/**
 *
 * @author Hakim
 */
public class Stock {

    private String model;
    private String category;
    private int qteStock;
    private int seuilMin;

    public Stock(String model, String category, int qteStock, int seuilMin) throws StockException {
        if (!this.setModel(model)) {
            throw new StockException("Modele nul");
        }
        if (!this.setCategory(category)) {
            throw new StockException("Categorie nulle");
        }
        if (!this.setQteStock(qteStock)) {
            throw new StockException("Stock < 0");
        }
        if (!this.setSeuilMin(seuilMin)) {
            throw new StockException("Seuil < 0");
        }
    }

    public String getModel() {
        return model;
    }

    private boolean setModel(String model) {
        boolean ok;
        if (Tools.isNull(model)) {
            ok = false;
        } else {
            this.model = model;
            ok = true;
        }
        return ok;
    }

    public String getCategory() {
        return category;
    }

    private boolean setCategory(String category) {
        boolean ok;
        if (Tools.isNull(category)) {
            ok = false;
        } else {
            this.category = category;
            ok = true;
        }
        return ok;
    }

    public int getQteStock() {
        return qteStock;
    }

    private boolean setQteStock(int qteStock) {
        boolean ok;
        if (qteStock < 0) {
            ok = false;
        } else {
            this.qteStock = qteStock;
            ok = true;
        }
        return ok;
    }

    public int getSeuilMin() {
        return seuilMin;
    }

    private boolean setSeuilMin(int seuilMin) {
        boolean ok;
        if (seuilMin < 0) {
            ok = false;
        } else {
            this.seuilMin = seuilMin;
            ok = true;
        }
        return ok;
    }

}

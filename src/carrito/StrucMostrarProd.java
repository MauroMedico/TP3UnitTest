/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

import java.awt.Image;

/**
 *
 * @author miguel
 */
public class StrucMostrarProd {
    String nProd;
    String dProd;
    String pProd;
    String fAddProd;
    int cantProdSolic;
    String msjAlerta;
    Image[] imProd;

    public StrucMostrarProd(String nProd, String dProd, String pProd, String fAddProd, int cantProdSolic, String msjAlerta) {
        this.nProd = nProd;
        this.dProd = dProd;
        this.pProd = pProd;
        this.fAddProd = fAddProd;
        this.cantProdSolic = cantProdSolic;
        this.msjAlerta = msjAlerta;
    }

    public StrucMostrarProd(String nProd, String dProd, String pProd, String fAddProd, int cantProdSolic, String msjAlerta, Image[] imProd) {
        this.nProd = nProd;
        this.dProd = dProd;
        this.pProd = pProd;
        this.fAddProd = fAddProd;
        this.cantProdSolic = cantProdSolic;
        this.msjAlerta = msjAlerta;
        this.imProd = imProd;
    }

    StrucMostrarProd() {
    
    }

    
    public String getnProd() {
        return nProd;
    }

    public void setnProd(String nProd) {
        this.nProd = nProd;
    }

    public String getdProd() {
        return dProd;
    }

    public void setdProd(String dProd) {
        this.dProd = dProd;
    }

    public String getpProd() {
        return pProd;
    }

    public void setpProd(String pProd) {
        this.pProd = pProd;
    }

    public String getfAddProd() {
        return fAddProd;
    }

    public void setfAddProd(String fAddProd) {
        this.fAddProd = fAddProd;
    }

    public int getCantProdSolic() {
        return cantProdSolic;
    }

    public void setCantProdSolic(int cantProdSolic) {
        this.cantProdSolic = cantProdSolic;
    }

    public String getMsjAlerta() {
        return msjAlerta;
    }

    public void setMsjAlerta(String msjAlerta) {
        this.msjAlerta = msjAlerta;
    }

    public Image[] getImProd() {
        return imProd;
    }

    public void setImProd(Image[] imProd) {
        this.imProd = imProd;
    }
    
    
}


package carrito;

import java.awt.Image;

/**
 *
 * @author miguel
 */
public class Producto {
    int codProducto;
    String nomProd;
    String descProd;
    int stockProd;
    double valor;
    Image[] fotos;
    
    public Producto(int cp,String np, String dp, int sp, double v,Image[] fotitos){
    codProducto=cp;
    nomProd =new String(np);
    descProd=new String(dp);
    stockProd= sp;
    valor= v;
  //  this.fotos=fotitos;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public int getStockProd() {
        return stockProd;
    }

    public void setStockProd(int stockProd) {
        this.stockProd = stockProd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Image[] getFotos() {
        return fotos;
    }
    
}

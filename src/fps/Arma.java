/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fps;

/**
 *
 * @author marcelosiedler
 */
public class Arma extends Item{
    private Double peso;
    private Integer pente;
    private Double dano;
    
    private String descricao;
    private Double gold;
    private Double cash;
    
    public Arma()
    {
        this.dano = null;
        this.pente = null;
        this.peso = null;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getPente() {
        return pente;
    }

    public void setPente(Integer pente) {
        this.pente = pente;
    }

    public Double getDano() {
        return dano;
    }

    public void setDano(Double dano) {
        this.dano = dano;
    }
    
}

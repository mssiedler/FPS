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
public class Personagem extends Item {
    private Double resistenciaaDano;
    private Double altura;
    private Double porcentagemVida;
    
    private String descricao;
    private Double gold;
    private Double cash;
    
    public Personagem()
    {
        this.porcentagemVida = 100.0;
        this.altura = null;
        this.resistenciaaDano = 0.0;
        
    
    }

    public Double getResistenciaaDano() {
        return resistenciaaDano;
    }

    public void setResistenciaaDano(Double resistenciaaDano) {
        this.resistenciaaDano = resistenciaaDano;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPorcentagemVida() {
        return porcentagemVida;
    }

    public void setPorcentagemVida(Double porcentagemVida) {
        this.porcentagemVida = porcentagemVida;
    }
    
    public String resumo()
    {
        return super.resumo() + "Características:\n" +
                "Altura:"+this.altura + "\n" +
                "Porcentagem Vida:"+this.porcentagemVida + "%\n" +
                "Resistencia a Dano"+this.resistenciaaDano + "%\n";
        
        
    }

 
    
    
}

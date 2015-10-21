/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fps;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelosiedler
 */
public class FPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personagem personagem = new Personagem();
        
        personagem.setAltura(1.60);
        personagem.setPorcentagemVida(100.0);
        personagem.setResistenciaaDano(10.0);
        personagem.setDescricao("AK-47");
        personagem.setGold(300.0);
        
        JOptionPane.showMessageDialog(null, personagem.resumo());
        
    }
    
}

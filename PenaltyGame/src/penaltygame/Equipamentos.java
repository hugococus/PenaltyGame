/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penaltygame;

/**
 *
 * @author Lab
 */
public class Equipamentos {
    
    String nome;
    int bonusChute;
    int bonusAcertarCanto;
    int bonusDefesa;

    public Equipamentos(String nome, int bonusChute, int bonusAcertarCanto, int bonusDefesa) {
        this.nome = nome;
        this.bonusChute = bonusChute;
        this.bonusAcertarCanto = bonusAcertarCanto;
        this.bonusDefesa = bonusDefesa;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonusChute() {
        return bonusChute;
    }

    public void setBonusChute(int bonusChute) {
        this.bonusChute = bonusChute;
    }

    public int getBonusAcertarCanto() {
        return bonusAcertarCanto;
    }

    public void setBonusAcertarCanto(int bonusAcertarCanto) {
        this.bonusAcertarCanto = bonusAcertarCanto;
    }

    public int getBonusDefesa() {
        return bonusDefesa;
    }

    public void setBonusDefesa(int bonusDefesa) {
        this.bonusDefesa = bonusDefesa;
    }


    
    
    
    
}

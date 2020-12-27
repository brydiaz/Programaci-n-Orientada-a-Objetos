/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderwarriors;

/**
 *
 * Builder concreto
 */
public class GBarbaro extends BuilderGuerrero {
    @Override
    public void buildManeraDeAtacar() {
        guerrero.setManeraDeAtacar("Ataco por tierra");
    }

    @Override
    public void buildVida() {
        guerrero.setVida(1000);
    }

    @Override
    public void buildDañoDeAtaque() {
        guerrero.setDañoDeAtaque(300);
    }

    @Override
    public void buildCategoría() {
        guerrero.setCategoría("Terrestre con espada");
    }
}

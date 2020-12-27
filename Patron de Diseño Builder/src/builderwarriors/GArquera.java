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
public class GArquera extends BuilderGuerrero {

    @Override
    public void buildManeraDeAtacar() {
        guerrero.setManeraDeAtacar("Ataco por tierra");
    }

    @Override
    public void buildVida() {
        guerrero.setVida(500);
    }

    @Override
    public void buildDañoDeAtaque() {
        guerrero.setDañoDeAtaque(200);
    }

    @Override
    public void buildCategoría() {
        guerrero.setCategoría("Terrestre con arco");
    }
    
}

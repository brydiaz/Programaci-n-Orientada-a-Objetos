/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderwarriors;

/**
 *
 * Este es el director
 */
public class Ejercito {
    private BuilderGuerrero builderGuerrero;

    public Guerrero getBuilderGuerrero() {
        return builderGuerrero.getGuerrero();
    }

    public void setBuilderGuerrero(BuilderGuerrero builderGuerrero) {
        this.builderGuerrero = builderGuerrero;
    }
    
    public void generarGuerrero(){
        builderGuerrero.crearGuerrero();
        builderGuerrero.buildCategoría();
        builderGuerrero.buildDañoDeAtaque();
        builderGuerrero.buildManeraDeAtacar();
        builderGuerrero.buildVida();
    }
}

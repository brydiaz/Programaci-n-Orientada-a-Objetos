/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderwarriors;

/* Esta será el builder abstracto
*/
public abstract class BuilderGuerrero {
    protected Guerrero guerrero;

    public Guerrero getGuerrero() {
        return guerrero;
    }

    public void crearGuerrero() {
        guerrero= new Guerrero();
    }

    public abstract void buildManeraDeAtacar();
    public abstract void buildVida();
    public abstract void buildDañoDeAtaque();
    public abstract void buildCategoría();

}

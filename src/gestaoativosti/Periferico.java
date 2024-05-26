/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoativosti;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class Periferico extends AtivoTI {

    private String tipo;

    public Periferico(String tipo, String nome, int id) {
        super(nome, id);
        this.tipo = tipo;
    }

    public String getTipoPeriferico() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return "Periferico (" + this.getTipoPeriferico() + ")";
    }

    @Override
    public String toString() {
        return "Periferico{" + super.toString() + "tipo=" + tipo + '}';
    }

}

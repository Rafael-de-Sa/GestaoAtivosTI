/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoativosti;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class Computador extends AtivoTI {

    private String especificacoes;

    public Computador(String nome, int id, String especificacoes) {
        super(nome, id);
        this.especificacoes = especificacoes;
    }

    @Override
    public String getTipo() {
        return "Computador";
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    @Override
    public String toString() {
        return "Computador{" + super.toString() + "especificacoes=" + especificacoes + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoativosti;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public abstract class AtivoTI {

    private String nome;
    private int id;

    public AtivoTI(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AtivoTI{" + "nome=" + nome + ", id=" + id + '}';
    }

    public abstract String getTipo();

}

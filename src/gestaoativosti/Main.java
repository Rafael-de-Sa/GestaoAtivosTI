/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoativosti;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        SistemaControleBensTI sistema = new SistemaControleBensTI();

        Computador computador1 = new Computador("Laptop Dell", 1, "i7, 16GB RAM");
        Periferico periferico1 = new Periferico("Monitor", "Monitor Samsung", 2);

        Funcionario funcionario1 = new Funcionario("Alice", 1);
        Funcionario funcionario2 = new Funcionario("Bob", 2);

        sistema.adicionarAtivos(computador1);
        sistema.adicionarAtivos(periferico1);

        sistema.adicionarFuncionario(funcionario1);
        sistema.adicionarFuncionario(funcionario2);

        sistema.vincularAtivoFuncionario(1, 1);
        sistema.vincularAtivoFuncionario(2, 2);

        sistema.listarAtivos();
    }
}

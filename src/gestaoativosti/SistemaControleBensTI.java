/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoativosti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */

/*
Crie uma classe SistemaControleBensTI com métodos para:
Adicionar ativos ao sistema.
Adicionar funcionários ao sistema.
Vincular um ativo a um funcionário.
Listar todos os ativos e os funcionários aos quais estão vinculados.
 */
public class SistemaControleBensTI {

    private List<AtivoTI> ativos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private Map<AtivoTI, Funcionario> vinculos = new HashMap<>();

    public void adicionarAtivos(AtivoTI ativo) {
        ativos.add(ativo);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void vincularAtivoFuncionario(int idAtivo, int idFuncionario) {
        AtivoTI ativo = buscarAtivoPorId(idAtivo);
        Funcionario funcionario = buscarFuncionarioPorId(idFuncionario);
        if (ativo != null && funcionario != null) {
            vinculos.put(ativo, funcionario);
        }
    }

    private AtivoTI buscarAtivoPorId(int id) {
        for (AtivoTI ativo : ativos) {
            if (ativo.getId() == id) {
                return ativo;
            }
        }
        return null;
    }

    private Funcionario buscarFuncionarioPorId(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

}

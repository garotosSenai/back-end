package Model;

import java.util.ArrayList;
import java.util.List;

public class TaferaService {

    private static int id = 1;
    private List<Tarefa> banco = new ArrayList<>();

    //cadastrar
    public void cadastrarTarefa(String descricao, String nome, Pessoa responsavel) {
        Tarefa tarefa = new Tarefa(id++, nome, descricao, responsavel);
        banco.add(tarefa);
    }

    //Listar
    public List<?> listarTarefas() {
        return banco;
    }

    // Buscar por ID (NOVO)
    public Tarefa buscarPorId(int id) {
        for (Tarefa t : banco) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    // Deletar
    public void deletartafefa(int id) {
        for (Tarefa t : banco) {
            if (t.getId() == id) {
                banco.remove(t);
                IO.println("Tarefa excluída com sucesso!");
                break;
            }
        }
    }

    // Atualizar Descrição
    public void atualizarTarefa(int id, String novaDescricao) {
        for (Tarefa t : banco) {
            if (t.getId() == id) {
                t.setDescricao(novaDescricao);
                IO.println("Tarefa atualizada com sucesso! " + t);
                break;
            }
        }
    }

}
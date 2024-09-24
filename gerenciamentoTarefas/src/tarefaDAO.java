
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class tarefaDAO {
    private List<tarefaDTO> tarefas;

    public tarefaDAO() {
    this.tarefas = new ArrayList<>();
    }
    
    public void exibir(tarefaDTO tarefadto){
    tarefas.add(tarefadto);
        JOptionPane.showMessageDialog(null, "Titulo: " + tarefadto.getTitulo() + "\nDescrição: " + tarefadto.getDescricao() + "\nPrazo: " + tarefadto.getPrazo());
    }
    public void listar(){
    if(tarefas.isEmpty()){
    JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas!!!");
    }else{
    StringBuilder lista = new StringBuilder("Tarefas cadsatradas\n");
    for(tarefaDTO t : tarefas){
    lista.append(t).append("\n\n");
    }
    JOptionPane.showMessageDialog(null, lista.toString());
    }
    
    }
    
    
}

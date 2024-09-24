
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class alunoDAO {

    private List<alunoDTO> alunos;

    public alunoDAO() {
        this.alunos = new ArrayList<>();
    }

    public void exibir(alunoDTO alunodto) {
        alunos.add(alunodto);
        JOptionPane.showMessageDialog(null, "Nome: " + alunodto.getNome() + "\nMatricula: " + alunodto.getMatricula() + "\nCurso: " + alunodto.getCurso());
    }
    
    public void listar(){
    if(alunos.isEmpty()){
    JOptionPane.showMessageDialog(null, "Não há alunos matriculados!!!");
    }else{
    StringBuilder lista = new StringBuilder("Alunos matriculados\n");
    for(alunoDTO a : alunos){
        lista.append(a).append("\n\n");
    }
    JOptionPane.showMessageDialog(null, lista.toString());
    }
    }
}

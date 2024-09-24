
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class funcionarioDAO {

    private List<funcionarioDTO> funcionarios;

    public funcionarioDAO() {
        this.funcionarios = new ArrayList<>();
    }

    public void exibir(funcionarioDTO funcionariodto) {
        funcionarios.add(funcionariodto);
        JOptionPane.showMessageDialog(null, "Nome: " + funcionariodto.getNome() + "\n" + "Cargo: " + funcionariodto.getCargo() + "\n" + "Salário: " + funcionariodto.getSalario());
    }

    public void listar() {
 if (funcionarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
        } else {
            StringBuilder lista = new StringBuilder("Funcionários cadastrados:\n");
            for (funcionarioDTO f : funcionarios) {
                lista.append(f).append("\n\n");  // Chama o método toString() de cada funcionário
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }

    }
}

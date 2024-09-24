
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class veiculoDAO {

    private List<veiculoDTO> veiculos;

    public veiculoDAO() {
        this.veiculos = new ArrayList<>();
    }

    public void exibir(veiculoDTO veiculodto) {
        veiculos.add(veiculodto);
        JOptionPane.showMessageDialog(null, "Placa: " + veiculodto.getPlaca() + "\nModelo: " + veiculodto.getModelo() + "\nAno: " + veiculodto.getAno() + "\nTipo: " + veiculodto.getTipo());
    }

    public void listar() {
        if (veiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há carros cadsatrados!!!");
        } else {
            StringBuilder lista = new StringBuilder("Carros cadastrados\n");
            for (veiculoDTO v : veiculos) {
                lista.append(v).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

}


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class carroDAO {

    private List<CarroDTO> carros;

    public carroDAO() {
        this.carros = new ArrayList<>();
    }

    public void exibir(CarroDTO carrodto) {
        carros.add(carrodto);
        JOptionPane.showMessageDialog(null, "Modelo: " + carrodto.getModelo() + "\nMarca: " + carrodto.getMarca() + "\nAno: " + carrodto.getAno() + "\nPreço: " + carrodto.getPreco());
    }

    public void listar() {
        if (carros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há carros cadastrados!!!");
        } else {
            StringBuilder lista = new StringBuilder("Carros cadastrados\n");
            double total = 0;
            for (CarroDTO c : carros) {
                lista.append(c).append("\n\n");
                total += c.getPreco();
            }
                JOptionPane.showMessageDialog(null, lista.toString() + "\n Valor arrecadado: R$" + total);
            

        }
    }

}

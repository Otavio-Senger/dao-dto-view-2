
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class reservaDAO {
    private List<reservaDTO> reservas;

    public reservaDAO() {
    this.reservas = new ArrayList<>();
    }
    public void exibir(reservaDTO reservadto){
        reservas.add(reservadto);
        JOptionPane.showMessageDialog(null, "Cliente: " + reservadto.getCliente() + "\n" + "Número do quarto: " + reservadto.getQuarto() + "\n" + "Data de entrada: " + reservadto.getEntrada() + "\n" + "Data de saída: " + reservadto.getSaida());
    }
    
    public void listar(){
    if (reservas.isEmpty()){
    JOptionPane.showMessageDialog(null, "Nenhuma reserva foi feita!!!");
    }else{
    StringBuilder lista = new StringBuilder("Reservas feitas\n");
    for (reservaDTO r : reservas){
    lista.append(r).append("\n\n");
    }
    JOptionPane.showMessageDialog(null, lista.toString());
    }
    }
    
    
    
    
    
}

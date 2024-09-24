
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class pedidoDAO {
    private List<pedidoDTO> pedidos;

    public pedidoDAO() {
        this.pedidos = new ArrayList<>();
    }
    public void exibir(pedidoDTO pedidodto){
        pedidos.add(pedidodto);
        JOptionPane.showMessageDialog(null, "Número do pedido: " + pedidodto.getNumeroPedido() + "\nCliente: " + pedidodto.getCliente() + "\nItens: " + pedidodto.getItens() + "\nValor total: " + pedidodto.getValor());
    }
    public void listar(){
     if (pedidos.isEmpty()){
     JOptionPane.showMessageDialog(null, "Não há pedidos cadastrados!!!");
     }else{
     StringBuilder lista = new StringBuilder("Pedidos Cadastrados\n");
     for(pedidoDTO p: pedidos){
         lista.append(p).append("\n\n");
     }
     JOptionPane.showMessageDialog(null, lista.toString());
     }
    }
    
    
    
}

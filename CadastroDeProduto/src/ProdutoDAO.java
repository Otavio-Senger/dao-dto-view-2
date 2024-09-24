
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProdutoDAO {
   private List<ProdutoDTO> produtos;

    public ProdutoDAO() {
    this.produtos = new ArrayList<>();
    }
   
   public void armazenarEexibir(ProdutoDTO produtodto){
        produtos.add(produtodto);
        JOptionPane.showMessageDialog(null, "Produto: " + produtodto.getNome() + "\n" + "Preço: R$" + produtodto.getPreco() + "\n" + "Quantidade: " + produtodto.getQuantidade());
    }
}

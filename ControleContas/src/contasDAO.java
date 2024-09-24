
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class contasDAO {

    private List<contasDTO> contas;

    public contasDAO() {
        this.contas = new ArrayList<>();
    }

    public void exibir(contasDTO contasdto) {
        contas.add(contasdto);
        JOptionPane.showMessageDialog(null, "Descrição: " + contasdto.getDescricao() + "\nValor: " + contasdto.getValor() + "\nData de vencimento: " + contasdto.getDataVencimento() + "\nPago: " + contasdto.getPago());
    }

    public void listar() {
        if (contas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma conta para pagar!!!");
        } else {
            StringBuilder lista = new StringBuilder("Contas para pagar\n");
            boolean contasPendentes = false;

            for (contasDTO c : contas) {
                if (c.getPago() == 0) {
                    lista.append(c).append("\n\n");
                    contasPendentes = true;
                }
            }
            if (contasPendentes){
            JOptionPane.showMessageDialog(null, lista.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Todas as contas foram pagas!!!");
            }
        }

    }

}

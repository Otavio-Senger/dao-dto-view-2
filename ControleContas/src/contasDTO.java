
import java.util.Date;


public class contasDTO {
    private String descricao;
    private double valor;
    private Date dataVencimento;
    private int pago;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    
    @Override
    public String toString(){
    return "Descrição: " + descricao + "\nValor: " + valor + "\nData de vencimento: " + dataVencimento + "\nPago: " + pago;
    }
}

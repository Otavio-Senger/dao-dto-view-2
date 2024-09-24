
import java.util.Date;


public class reservaDTO {
    private String cliente;
    private Date entrada;
    private Date saida;
    private int quarto;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
    
    @Override
    public String toString(){
    return "Cliente: " + cliente + "\nNúmero do quarto: " + quarto + "\nData de entrada: " + entrada + "\nData de saída: " + saida;
    }
    
}


public class pedidoDTO {
    private String numeroPedido;
    private String cliente;
    private String itens;
    private double valor;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
    return "Número do pedido: " + numeroPedido + "\nCliente: " + cliente + "\nItens: " + itens + "\nTotal: " + valor;
    }
}

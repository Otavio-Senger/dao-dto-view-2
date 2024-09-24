
import java.util.Date;

public class tarefaDTO {

    private String titulo;
    private String descricao;
    private Date prazo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nDescrição: " + descricao + "\nPrazo: " + prazo;
    }
}

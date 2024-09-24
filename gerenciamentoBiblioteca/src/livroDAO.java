
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class livroDAO {

    private List<livroDTO> livros;

    public livroDAO() {
        this.livros = new ArrayList<>();
    }

    public void exibir(livroDTO livrodto) {
        livros.add(livrodto);
        JOptionPane.showMessageDialog(null, "Titulo: " + livrodto.getTitulo() + "\n" + "Autor: " + livrodto.getAutor() + "\n" + "Ano de publicação: " + livrodto.getAno());
    }

    public void listar() {
        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado!!");
        } else {
            StringBuilder lista = new StringBuilder("Livros Cadastrador\n");
            for (livroDTO f : livros) {
                lista.append(f).append("\n\n");

            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    public void excluir() {
        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há livros para excluir!!");
        } else {
            if (livros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há livros para excluir!");
            } else {
                // Solicita ao usuário o título do livro a ser excluído
                String tituloParaExcluir = JOptionPane.showInputDialog(null, "Digite o título do livro a ser excluído:");

                // Verifica se o livro com o título informado existe na lista
                livroDTO livroParaExcluir = null;
                for (livroDTO livro : livros) {
                    if (livro.getTitulo().equalsIgnoreCase(tituloParaExcluir)) {
                        livroParaExcluir = livro;
                        break;
                    }
                }

                // Se o livro foi encontrado, remove da lista
                if (livroParaExcluir != null) {
                    livros.remove(livroParaExcluir);
                    JOptionPane.showMessageDialog(null, "Livro '" + tituloParaExcluir + "' excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Livro não encontrado!");
                }

            }
        }
    }
}

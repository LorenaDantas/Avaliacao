
class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponivel = disponibilidade;
    }
}
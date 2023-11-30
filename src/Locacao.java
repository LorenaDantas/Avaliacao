
class Locacao {
    private Cliente cliente;
    private Livro livro;

    public Locacao(Cliente cliente, Livro livro) {
        this.cliente = cliente;
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }
}
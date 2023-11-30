public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("Sistemas Operacionais Modernos", "Andrew S. Tanenbaum");
        Livro livro2 = new Livro("Linux, a Biblia", "Christopher Negus");

        // Criando cliente
        Cliente cliente = new Cliente("Yakob");

        // Realizando locações
        Locacao locacao1 = new Locacao(cliente, livro1);
        Locacao locacao2 = new Locacao(cliente, livro2);

        // Atualizando a disponibilidade dos livros
        livro1.setDisponibilidade(false);
        livro2.setDisponibilidade(false);

        // Exibindo informações das locações
        exibirInformacoesLocacao(locacao1);
        exibirInformacoesLocacao(locacao2);
    }

    public static void exibirInformacoesLocacao(Locacao locacao) {
        Cliente cliente = locacao.getCliente();
        Livro livro = locacao.getLivro();

        System.out.println("Locação para: " + cliente.getNome());
        System.out.println("Livro: " + livro.getTitulo() + " por " + livro.getAutor());
        System.out.println("Disponibilidade: " + (livro.estaDisponivel() ? "Disponível" : "Indisponível"));
        System.out.println();
    }
}
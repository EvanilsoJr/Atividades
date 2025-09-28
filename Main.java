public class Main {
    public static void main(String[] args) {
        String nomeBiblioteca = "Livraria Municipal";

        Biblioteca biblioteca = new Biblioteca(nomeBiblioteca);

        Livro livro = new Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");

        biblioteca.recebimento(livro);

        livro.emprestimo();

        if (livro.getAno() < 2000) {
            System.out.println("Este é um livro clássico.");
        } else {
            System.out.println("Este livro é recente.");
        }
    }
}
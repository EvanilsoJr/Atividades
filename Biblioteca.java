public class Biblioteca {
    private String nome;

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void recebimento(Item item) {
        System.out.println("Item recebido na biblioteca " + nome + ":");
        item.informacoes();
    }

    public String getNome() {
        return nome;
    }
}
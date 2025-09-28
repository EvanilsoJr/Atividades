abstract class Item {
    private String titulo;
    private int ano;

    public Item() {
        this.titulo = "Sem título";
        this.ano = 0;
    }

    public Item(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void informacoes() {
        System.out.println("Título :" + titulo + ", Ano: " + ano);
    }

    public abstract void emprestimo();
}
import java.awt.*;

public class Entidade {
    private Dimension tamanho;
    private MyImage m;
    private String nome;
    public Entidade(Dimension tamanho, MyImage img, String nome){
        this.tamanho=tamanho;
        this.m=img;
        this.nome=nome;
    }
    public Entidade(int largura, int altura, MyImage img, String nome){
        Dimension d = new Dimension(largura,altura);
        this.tamanho=d;
        this.m=img;
        this.nome=nome;
    }

    public void setM(MyImage m) {
        this.m = m;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(Dimension tamanho) {
        this.tamanho = tamanho;
    }
    public void setTamanho(int largura, int altura) {
        this.tamanho = new Dimension(largura,altura);
    }
}

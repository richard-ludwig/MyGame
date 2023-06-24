import java.awt.*;

public class Habilidade {
    private MyImage m;
    private Dimension tamanho;
    private int dano;
    private String descrição;
    public Habilidade(Dimension tamanho, int dano, String descrição, MyImage m) {
        this.m = m;
        this.tamanho = tamanho;
        this.dano = dano;
        this.descrição = descrição;
    }
    public void setTamanho(Dimension tamanho) {
        this.tamanho = tamanho;
    }
    public void setTamanho(int largura, int altura) {
        this.tamanho = new Dimension(largura,altura);
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public void setM(MyImage m) {
        this.m = m;
    }
}

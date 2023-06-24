import java.awt.*;
import java.util.ArrayList;

public class Personagem extends Entidade{
    private ArrayList<Habilidade> habilidades;
    private int vida;
    private int mana;
    private Point p;
    public Personagem(Dimension tamanho, MyImage img, String nome){
        super(tamanho, img, nome);
        this.habilidades=new ArrayList<>();
        this.vida=0;
        this.mana=0;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public void newHabilidade(Habilidade h){
        this.habilidades.add(h);
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}

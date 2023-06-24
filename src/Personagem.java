import java.awt.*;
import java.util.ArrayList;

public class Personagem {
    private int tamanho;
    private MyImage m;
    private String nome;
    private ArrayList<Habilidade> habilidades;
    private int vida;
    private int mana;
    private Point p;
    public Personagem(){
        m= new MyImage();
        tamanho=0;
        nome="";
        habilidades=new ArrayList<>();
        vida=0;
        mana=0;
    }

    public void setM(MyImage m) {
        this.m = m;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

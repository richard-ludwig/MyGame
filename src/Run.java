import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        MyImage mageImage = new MyImage();
        Jogo j = new Labirinto();
        Personagem mago = new Personagem();
        mago.setNome("Grey");
        mago.setVida(100);
        mago.setMana(100);
        mago.setM(mageImage);
        ArrayList<Personagem> esqueletos = new ArrayList<>();

    }
}

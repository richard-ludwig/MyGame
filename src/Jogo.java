import java.util.ArrayList;

public abstract class Jogo {
    private ArrayList<Personagem> p = new ArrayList<>();
    private GUI g;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private Fase f;
    private GUI gui;

    public void addPlayer(String nome) {
        Jogador j = new Jogador(nome);
        jogadores.add(j);
    }
    public void addPlayer() {
        String defaultPlayerName ="Player "+jogadores.size()+1;
        Jogador j = new Jogador(defaultPlayerName);
        jogadores.add(j);
    }

}
public class Habilidade {
    private MyImage m;
    private int tamanho;
    private int dano;
    private String descrição;
    public Habilidade() {
        m = new MyImage();
        tamanho = 0;
        dano = 0;
        descrição = "";
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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

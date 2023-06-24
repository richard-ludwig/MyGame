import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import MyClasses.MyArchive;

public class Fase {
    private int dificuldade;
    private int nome;
    private ArrayList<String> desenho;
    public void carregaFase(int fase){
        String path = "/txt/fase"+fase+".txt";
        File file = MyClasses.MyArchive.getFile(path);
        this.desenho=MyClasses.MyArchive.readBR(file);
    }
}
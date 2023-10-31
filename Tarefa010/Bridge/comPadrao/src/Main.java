import java.util.ArrayList;
import java.util.List;

import model.Produto;
import relatorios.GeradorDeRelatorios;
import relatorios.RelatorioAnalitico;
import relatorios.RelatorioSimples;
import visualizadores.VisualizacaoConsole;
import visualizadores.VisualizacaoGUI;

public class Main {

    public static void main(String[] args) {
       
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Teclado", 300));
        produtos.add(new Produto("Computador", 6500));
        produtos.add(new Produto("Monitor 144hz", 1700));
        produtos.add(new Produto("Havainana", 75));
        
        VisualizacaoConsole visualizacaoConsole = new VisualizacaoConsole();
        VisualizacaoGUI visualizacaoGUI = new VisualizacaoGUI();

        GeradorDeRelatorios relatorioSimples = new RelatorioSimples(visualizacaoGUI);
        relatorioSimples.gerarRelatorios(produtos);

        GeradorDeRelatorios relatorioAnalitico = new RelatorioAnalitico(visualizacaoConsole);
        relatorioAnalitico.gerarRelatorios(produtos);
    }
}

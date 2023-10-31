package relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import visualizadores.VisualizadorDeRelatorios;
import model.Produto;

public abstract class GeradorDeRelatorios {

	protected VisualizadorDeRelatorios visualizador;

	public GeradorDeRelatorios(VisualizadorDeRelatorios visualizador) {
		this.visualizador = visualizador;
	}


	public final void gerarRelatorios(List<Produto> produtos) {
		String cabecalho = this.gerarCabecalho();
		String conteudo = this.gerarConteudo(produtos);
		this.gerarVisualizacao(cabecalho, conteudo);
	}


	protected String gerarCabecalho() {
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
		return new String(
				"RELATORIO DE PRODUTOS VENDIDOS\n" + sdf.format(new Date()) + "\nBLSoft Sistemas Dev Corp.\n");
	}


	protected abstract String gerarConteudo(List<Produto> produtos);


	protected abstract void gerarVisualizacao(String cabecalho, String conteudo);

}
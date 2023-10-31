package comPadrao.main;

import comPadrao.entity.Documento;

public class App {
    public static void main(String[] args) throws Exception {
        Documento doc1 = new Documento("Relatório", " 07/07/20", "Extrato");

        Documento doc2 = doc1.clone();

        System.out.println("doc1 Nome: " + doc1.getNome() + " Data: " + doc1.getData() + " Tipo: " + doc1.getTipo());
        System.out.println("doc2 Nome: " + doc2.getNome() + " Data: " + doc2.getData() + " Tipo: " + doc2.getTipo());

        doc2.setData("10/10/23");

        System.out.println("doc1 Nome: " + doc1.getNome() + " Data: " + doc1.getData() + " Tipo: " + doc1.getTipo());
        System.out.println("doc2 Nome: " + doc2.getNome() + " Data: " + doc2.getData() + " Tipo: " + doc2.getTipo());
    }
}

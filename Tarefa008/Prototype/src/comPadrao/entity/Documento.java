package comPadrao.entity;

public class Documento implements IClonavel {
    private String nome;
    private String data;
    private String tipo;

    public Documento(String nome, String data, String tipo) {
        this.nome = nome;
        this.data = data;
        this.tipo = tipo;
    }

    @Override
    public Documento clone() {
        return new Documento(this.nome, this.data, this.tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
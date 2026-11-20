package ProjetoBiblioteca.biblioteca.model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private Integer obrasPublicadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void setObrasPublicadas(Integer obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }
}

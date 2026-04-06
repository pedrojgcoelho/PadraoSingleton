package singleton;

public class LojaBicicletas {

    private LojaBicicletas() {
    }

    private static LojaBicicletas instance = new LojaBicicletas();

    public static LojaBicicletas getInstance() {
        return instance;
    }

    private String nomeLoja;
    private String endereco;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
package EstruturaDeDados;

public class Contato {
    private String nome, endereco;
    private long cpf;
    public Contato(String n, String e, long c ) {
        nome = n;
        endereco = e;
        cpf = c;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public long getCpf() {
        return cpf;
    }
}

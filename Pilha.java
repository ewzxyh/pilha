package EstruturaDeDados;

public class Pilha {
    private int topo, maxTam;
    private Contato[] vetor; // vetor de contatos
    public Pilha() {
        topo = 0;
        maxTam = 0;
        vetor = null;
    }
    public boolean pilhaVazia() {
        return topo == 0;
    }
    public boolean pilhaCheia() {
        return topo == maxTam;
    }
    public int getMaxTam() {
        return maxTam;
    }
    public boolean setMaxTam(int aux) {
        if (aux <= 1 || aux > 10000) return false;
        maxTam = aux;
        vetor = new Contato[maxTam];
        topo = 0;
        return true;
    }
    public boolean push(Contato aux){
        if(vetor == null) return false;
        if (pilhaCheia()) return false;
        vetor[topo] = aux;
        topo++;
        return true;
    }
    public Contato pop() {
        if (pilhaVazia()) return null;
        topo--;
        Contato aux = vetor[topo];
        vetor[topo] = null;
        return aux;
    }
}

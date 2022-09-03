package EstruturaDeDados;
import java.util.Scanner;
public class TestaPilha {
    public static Scanner leia = new Scanner(System.in);
    public static Contato criarContato(){
        String n, e;
        long c;
        System.out.println("CPF: ");
        c = leia.nextLong();
        leia.skip("\\R");
        System.out.println("Nome: ");
        n = leia.nextLine();
        System.out.println("Endereço: ");
        e = leia.nextLine();
        Contato aux = new Contato(n, e, c);
        return aux;

    }
    public static void main(String[] args){
        Pilha objeto = new Pilha();
        int op = 0, tam = 0;
        Contato aux = null;
        do{
            System.out.println("1 - Criar Pilha");
            System.out.println("2 - Empilhar um Contato");
            System.out.println("3 - Desempilhar um Contato");
            System.out.println("4 - Sair");
            op = leia.nextInt();
            switch(op){
                case 1: //criar pilha
                    do{
                    System.out.println("Tamanho da Pilha: (>2 e <10000)");
                    tam = leia.nextInt();
                    }while(!objeto.setMaxTam(tam));
                    break;
                case 2: //empilhar
                    aux = criarContato();
                    if(objeto.push(aux)) System.out.println("Sucesso!");
                    else System.out.println("Erro!");
                    aux = null;
                    break;
                case 3: //desempilhar
                    aux = objeto.pop();
                    if(aux != null){
                        System.out.println("Sucesso!");
                        System.out.println("Nome: " + aux.getNome());
                        System.out.println("Endereço: " + aux.getEndereco());
                        System.out.println("CPF: " + aux.getCpf());
                    }
                    else System.out.println("Erro!");
                    aux = null;
                    break;
                case 4: //sair
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");   
            }
        }while(op != 4);
    }
}

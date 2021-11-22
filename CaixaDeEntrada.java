import java.util.ArrayList;
/**
 * Classe CaixaDeEntrada simula uma caixa de entrada. Tem uma Array List
 * que guarda as mensagens e tem a mens_index_erro que é uma mensagem default 
 * para um erro ao acessar um índice inexistente na Array List Mensagens.
 */
public class CaixaDeEntrada {

    private ArrayList<Mensagem> Mensagens = new ArrayList<Mensagem>();
    private Mensagem mens_index_erro;
    
    /**
     * Construtor que cria a caixa de entrada e também cria a 
     * mensagem de erro de índice.
     */
    public CaixaDeEntrada(){
        mens_index_erro = new Mensagem("Mensagem não encontrada (índice não encontrado) ...");
    }

    /**
     * Metodo que adiciona uma mensagem a Array List Mensagens.
     * @param m é a mensagem a ser adicionada a Caixa de Entrada.
     */
    public void adicionaMensagem(Mensagem m){
        Mensagens.add(m);
    }

    /**
     * Metodo que acessa uma mensagem da caixa de entrada com base em seu índice
     * e retorna o objeto mensagem.
     * @param i é o índice da mensagem a ser acessada.
     * @return retorna o objeto mensagem.
     */
    public Mensagem acessaMensagem(int i){
        if( i < 0 || i > Mensagens.size() - 1){
            return mens_index_erro;
        }
        else{
            return Mensagens.get(i);
        }
    }

    /**
     * Metodo que remove uma mensagem da caixa de entrada (remove o objeto da Array List Mensagens).
     * @param i é o índice da mensagem a ser removida.
     */
    public void removeMensagem(int i){
        if( i < 0 || i > Mensagens.size() - 1){
            System.out.println(mens_index_erro.toString());
        }
        else{
            Mensagens.remove(i);
        }
    }
}

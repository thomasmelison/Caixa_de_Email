/**
 * A classe mensagem guarda individualmente as mensagens
 * com o nome do remetente e do destinatário.
 */
public class Mensagem {
    
    private String remetente;
    private String destinatario;
    private String mensagem;

    /**
     * Mensagem default para Mensagem nao encontrada.
     */
    public Mensagem(String erro){
        mensagem = erro;
    }
    
    /**
     * Construtor que cria a mensagem
     * @param remetente string que guarda o nome de quem mandou a mensagem
     * @param destinatario string que guarda o nome de quem recebeu a mensagem
     * @param mensagem string que guarda a mensagem em si
     */
    public Mensagem(String remetente, String destinatario, String mensagem){
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
    
    /**
     * Função que anexa uma linha de texto a mensagem
     * @param linha_de_texto é a string que será concatenada na mensagem
     */
    public void anexa(String linha_de_texto){
        mensagem = mensagem + "\n" + linha_de_texto;
    }

    /**
     * Função que retorna uma string com o remetente, o destinatário e a mensagem.
     * Pode retornar erro caso o remetente e o destinatário sejam nulos, que será o 
     * caso para a um objeto criado pelo construtor Mensagem(). Esta mensagem é
     * default para quando algum erro de indice inválido.
     * @return 
     */
    public String toString(){
        if(remetente == null|| destinatario == null ){
            return mensagem;
        }
        else{
            return "De: " + remetente + "\n Para: " + destinatario + "\n " + mensagem;
        }
    }


}

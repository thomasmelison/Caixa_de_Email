public class Mensagem {
    
    private String remetente;
    private String destinatario;
    private String mensagem;

    /**
     * Mensagem default para Mensagem nao encontrada.
     */
    public Mensagem(){
        mensagem = "Mensagem não encontrada...";
    }

    public Mensagem(String remetente, String destinatario, String mensagem){
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
    public void anexa(String linha_de_texto){
        mensagem = mensagem + "\n" + linha_de_texto;
    }
    public String toString(){
        if(remetente == null|| destinatario == null ){
            return mensagem;
        }
        else{
            return "De: " + remetente + "\n Para: " + destinatario + "\n " + mensagem;
        }
    }


}

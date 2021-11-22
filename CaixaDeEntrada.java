import java.util.ArrayList;
public class CaixaDeEntrada {

    private ArrayList<Mensagem> Mensagens = new ArrayList<Mensagem>();
    private Mensagem mens_default;
    
    public CaixaDeEntrada(){
        mens_default = new Mensagem();
    }

    public void adicionaMensagem(Mensagem m){
        Mensagens.add(m);
    }
    public Mensagem acessaMensagem(int i){
        if( i < 0 || i > Mensagens.size() - 1){
            return mens_default;
        }
        else{
            return Mensagens.get(i);
        }
    }
    public void removeMensagem(int i){
        if( i < 0 || i > Mensagens.size() - 1){
            System.out.println(mens_default.toString());
        }
        else{
            Mensagens.remove(i);
        }
    }
}

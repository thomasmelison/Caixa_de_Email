import java.util.ArrayList; 
/**
 * Usuario
 */
public class Usuario {

    private static ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
    private String nome;
    private String email;
    private String senha;

    public static ArrayList<Usuario> getUsuarios(){
        return Usuarios;
    }

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }
    
}
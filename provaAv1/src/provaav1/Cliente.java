package provaav1;

/**
 *
 * @author ymartins
 */
public class Cliente {
    private String nome;
    private String telefone;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String telefone){
        this.nome = "Sem nome";
        this.telefone = "(00)0000-0000";
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}

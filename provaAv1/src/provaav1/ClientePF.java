package provaav1;

/**
 *
 * @author ymartins
 */
public class ClientePF extends Cliente{
    private long rg;
    private long cpf;
    
    public ClientePF(){
        
    }
    
    public ClientePF(String nome, String telefone, long rg, long cpf){
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        
    }
    
    public void setRg(long rg){
        this.rg = rg;
    }
    
    public long getRg(){
        return this.rg;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    
    public long getCpf(){
        return this.cpf;
    }
    
    public void statusClientePF(){
        System.out.println("----- DADOS CLIENTE PF -----");
        System.out.println("Nome Cliente PF: " + this.getNome());
        System.out.println("Telefone Cliente PF: " + this.getTelefone());
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
    }
}

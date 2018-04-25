package provaav1;

/**
 *
 * @author ymartins
 */
public class ClientePJ extends Cliente{
    private int ie;
    private int cnpj;
    
    public ClientePJ(){
        
    }
    
    public ClientePJ(String nome, String telefone, int ie, int cnpj){
        super(nome, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
    }
    
    public void setIe(int ie){
        this.ie = ie;
    }
    
    public int getIe(){
        return this.ie;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    public int getCnpj(){
        return this.cnpj;
    }
}

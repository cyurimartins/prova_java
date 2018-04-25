package provaav1;
import javax.swing.JOptionPane;

/**
 *
 * @author ymartins
 */
public class ProvaAv1 {

    public static void main(String[] args) {
        
        //PRIMEIRO CLIENTE PF
        ClientePF c1 = new ClientePF();
        
        c1.setNome(JOptionPane.showInputDialog(null, "Informe nome cliente PF: " ));
        c1.setTelefone(JOptionPane.showInputDialog(null, "Telefone: " ));
        c1.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "Informe RG: ")));
        c1.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Informe CPF: ")));        
        JOptionPane.showMessageDialog(null, "\nDados do Cliente: " + "\n\nnome: " + c1.getNome() + "\nFone: " + c1.getTelefone() + "\nRG: " + c1.getRg() + "\nCPF: " + c1.getRg());
       
       //SEGUNDO CLIENTE PF
       
        ClientePF c2 = new ClientePF("Argemiro Vieira", "(45)278-4167", 44789643, 478921358);
        JOptionPane.showMessageDialog(null, "\nDados do Cliente: " + "\n\nnome: " + c2.getNome() + "\nFone: " + c2.getTelefone() + "\nRG: " + c2.getRg() + "\nCPF: " + c2.getRg());

        
        //CLIENTE PJ
        
        //PRIMEIRO CLIENTE PJ
        
        ClientePJ p1 = new ClientePJ();
        p1.setNome(JOptionPane.showInputDialog(null, "Informe nome cliente PJ: " ));
        p1.setTelefone(JOptionPane.showInputDialog(null, "Telefone: " ));
        p1.setIe(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe IE: ")));
        p1.setCnpj(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe CNPJ: ")));        
        JOptionPane.showMessageDialog(null, "\nDados do Cliente: " + "\n\nnome: " + p1.getNome() + "\nFone: " + p1.getTelefone() + "\nIE: " + p1.getIe() + "\nCNPJ: " + p1.getCnpj());
        
        ClientePJ p2 = new ClientePJ("Souza & Souza Ltda", "(45)278-7456", 412029301, 72856749/00001-42);
        JOptionPane.showMessageDialog(null, "\nDados do Cliente: " + "\n\nnome: " + p2.getNome() + "\nFone: " + p2.getTelefone() + "\nIE: " + p2.getIe() + "\nCNPJ: " + p2.getCnpj());

        
        
        
        // TODO code application logic here
    }
    
}

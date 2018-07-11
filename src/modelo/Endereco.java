
package modelo;

public class Endereco {
    private Integer id;
    private String logradouro;       
    private String bairro;       
    private String cidade;
    private String estado;
    
    public Endereco(){
        
    }
    
    public Endereco(Integer id, String logradouro, String bairro, String cidade, String estado){
        this.id = id;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer Id){
        this.id = id;
    }
    
    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getCidade(){
       return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}

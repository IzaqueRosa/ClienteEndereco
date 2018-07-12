
package modelo;

import java.util.List;

public class Cliente {
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private double salario;
    private List<Endereco> enderecos;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, String email, double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
}

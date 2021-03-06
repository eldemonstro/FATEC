package br.com.fatec.bean;

public class Usuario {
    
    private int id;
    private String login;
    private String senha;
    private String status;
    private String tipo;
    
    public Usuario (int idp, String loginp, String senhap, String statusp, String tipop){
        this.login = loginp;
        this.senha = senhap;
        this.status = statusp;
        this.tipo = tipop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

package bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Usuario implements Serializable {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String confirmar;

    private Calendar dataCadastro;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmar() {
        return confirmar;
    }

    public void setContraSenha(String contraSenha) {
        this.confirmar = contraSenha;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Map<String, String> verificaDados() {

        Map<String, String> campos = new HashMap<>();
        
        if (nome.isEmpty()) {
            campos.put("nome", "nome");
        } else {
            campos.put("nome", nome);
        }

        if (email.isEmpty()) {
            campos.put("email", "");
        } else {
            campos.put("email", email);
        }

        if (senha.isEmpty()) {
            campos.put("senha", "");
        } else {
            campos.put("senha", senha);
        }

        if (!senha.equals(confirmar)) {
            campos.put("confirmar", "");
        } else {
            campos.put("confirmar", confirmar);
        }
        return campos;
    }
}

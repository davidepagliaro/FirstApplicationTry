package com.dpagl.newapplicationfirst;

/**
 * Created by dpagl on 10/02/2017.
 */

public class Utenti {
    private String email;
    private String cellulare;
    private String Indirizzo;
    private String password;



    private String nome;

    public Utenti(String email,String cellulare,String indirizzo,String password,String nome){
        this.email=email;
        this.cellulare=cellulare;
        this.Indirizzo=indirizzo;
        this.password=password;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getIndirizzo() {
        return Indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        Indirizzo = indirizzo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

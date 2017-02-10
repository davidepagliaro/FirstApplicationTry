package com.dpagl.newapplicationfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dpagl on 10/02/2017.
 */

public class ListLogin {

    private static ListLogin a=new ListLogin();
    private List<Utenti> listalogin=new ArrayList<>();
    private Utenti admin=new Utenti("admin","3452126934","via sandro sandri 71","admin");

    private ListLogin(){
    listalogin.add(admin);
    }

    public static ListLogin getIstance(){
        return a;
    }

    public void setList(Utenti u){
        listalogin.add(u);
    }

    public int searchUtentebyemail(String email){
        int control=-1;
       for(int i=0;i<listalogin.size();i++){
           if(listalogin.get(i).getEmail().equalsIgnoreCase(email)){
               return i;
           }

           }
        return control;
       }


    public  Utenti getUtente(int i){
        return listalogin.get(i);
    }
}

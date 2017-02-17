package com.dpagl.newapplicationfirst;


import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

/**
 * Created by dpagl on 15/02/2017.
 */

public class UtentiAdapter extends RecyclerView.Adapter<UtentiAdapter.UtentiAdapterVH> {

    List<Utenti> dataSet=new ArrayList<>();

    private static UtentiAdapter u=new UtentiAdapter();

    private UtentiAdapter() {
        dataSet.add(new Utenti("admin","admin","admin","admin","admin"));
    }

    public static UtentiAdapter getUtentiAdapter(){
        return u;
    }

    public void addUtente(Utenti u){
        dataSet.add(u);
        notifyItemChanged(dataSet.size()-1);
    }
    public void addList(List<Utenti> lista){
        dataSet=lista;
        notifyDataSetChanged();
    }
    public Utenti getUtente(int i){
        return dataSet.get(i);
    }
    public boolean loginControl(String username, String password) {

        if(searchUtentebyemail(username)==-1){
            return false;
        }else{
            Utenti u=getUtente(searchUtentebyemail(username));
            if(u.getPassword().equalsIgnoreCase(password)){
                return true;
            }else{
                return false;}
        }


    }
    private int searchUtentebyemail(String email){
        int control=-1;
        for(int i=0;i<dataSet.size();i++){
            if(dataSet.get(i).getEmail().equalsIgnoreCase(email)){
                return i;
            }

        }
        return control;
    }


    @Override
    public UtentiAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainlayout,parent,false);
        return new UtentiAdapterVH(view);
    }

    @Override
    public void onBindViewHolder(UtentiAdapterVH holder, int position) {
    Utenti u=getUtente(position);
        holder.nameTv.setText(u.getNome().toString());
        holder.addressTv.setText(u.getIndirizzo().toString());
        holder.emailTv.setText(u.getEmail().toString());
        holder.phoneNumberTv.setText(u.getCellulare().toString());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class UtentiAdapterVH extends RecyclerView.ViewHolder{
        TextView nameTv, phoneNumberTv,emailTv, addressTv;
        Button call,send,go;

        public UtentiAdapterVH(View itemView) {
            super(itemView);
            nameTv = (TextView) itemView.findViewById(R.id.item_nametxt);
            phoneNumberTv = (TextView) itemView.findViewById(R.id.main_teltxt);
            emailTv = (TextView)itemView.findViewById(R.id.main_emailtxt);
            addressTv = (TextView)itemView.findViewById(R.id.main_viewtxt);
            call=(Button)itemView.findViewById(R.id.main_callBT);
            send=(Button)itemView.findViewById(R.id.main_sendBT);
            go=(Button)itemView.findViewById(R.id.main_goBT);

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent =new Intent(v.getContext(),NameActivity.class);
                    v.getContext().startActivity(intent);



                }
            });

            send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            go.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}

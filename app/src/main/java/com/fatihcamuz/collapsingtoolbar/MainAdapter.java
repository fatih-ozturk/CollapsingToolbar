package com.fatihcamuz.collapsingtoolbar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Fatih CAMUZ on 14.7.2015.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ContactViewHolder> {

    private List<MainModel> mainModels;

    public MainAdapter(List<MainModel> contactList) {
        this.mainModels = contactList;
    }


    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder viewHolder, int i) {
        MainModel ci = mainModels.get(i);
        viewHolder.Name.setText(ci.name);
        viewHolder.Subname.setText(ci.subname);
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.recyclerlist_item, viewGroup, false);

        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView Name;
        protected TextView Subname;

        public ContactViewHolder(View v) {
            super(v);
            Name = (TextView) v.findViewById(R.id.name);
            Subname = (TextView) v.findViewById(R.id.subname);
        }
    }
}
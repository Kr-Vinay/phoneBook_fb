package com.example.phonebook_fb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonebook_fb.databinding.ItemCardviewBinding;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter < myAdapter.UserViewHolder>{
    private Context context;
    private ArrayList<User> userArrayList;


    public myAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCardviewBinding itemCardviewBinding=DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_cardview, parent, false);
        return new UserViewHolder(itemCardviewBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull myAdapter.UserViewHolder holder, int position) {
        User currentUser=userArrayList.get(position);
        holder.itemCardviewBinding.setUser(currentUser);

    }


    @Override
    public int getItemCount() {
        return userArrayList.size();
    }



        public class UserViewHolder extends RecyclerView.ViewHolder {
            private ItemCardviewBinding itemCardviewBinding;





            public UserViewHolder(ItemCardviewBinding itemCardviewBinding) {
                super(itemCardviewBinding.getRoot());
                this.itemCardviewBinding = itemCardviewBinding;
                itemCardviewBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int position = getAdapterPosition();
                    }

                });
            }

}
}







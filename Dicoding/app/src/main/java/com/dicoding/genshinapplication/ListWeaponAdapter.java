package com.dicoding.genshinapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListWeaponAdapter extends RecyclerView.Adapter<ListWeaponAdapter.ListViewHolder> {
    private ArrayList<Weapon> listWeapon;
    private OnItem2ClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItem2ClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListWeaponAdapter(ArrayList<Weapon> list) { this.listWeapon = list; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_weapon, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Weapon weapon = listWeapon.get(position);
        Glide.with(holder.itemView.getContext())
                .load(weapon.getCard())
                .into(holder.imgCard);
        holder.imgCard.setBackgroundResource(weapon.getBackground());
        holder.tvName.setText(weapon.getName());

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.fade_in_right);
        ((ListViewHolder)holder).itemView.startAnimation(animation);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listWeapon.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWeapon.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard;
        TextView tvName;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_item_card);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }
}
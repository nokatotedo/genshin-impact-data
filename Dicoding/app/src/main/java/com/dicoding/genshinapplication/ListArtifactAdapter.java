package com.dicoding.genshinapplication;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListArtifactAdapter extends RecyclerView.Adapter<ListArtifactAdapter.ListViewHolder> {
    private ArrayList<Artifact> listArtifact;

    public ListArtifactAdapter(ArrayList<Artifact> list) { this.listArtifact = list; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_artifact, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Artifact artifact = listArtifact.get(position);
        Glide.with(holder.itemView.getContext())
                .load(artifact.getCard())
                .into(holder.imgCard);
        Glide.with(holder.itemView.getContext())
                .load(artifact.getArtifacta())
                .into(holder.imgArtifactA);
        Glide.with(holder.itemView.getContext())
                .load(artifact.getArtifactb())
                .into(holder.imgArtifactB);
        Glide.with(holder.itemView.getContext())
                .load(artifact.getArtifactc())
                .into(holder.imgArtifactC);
        Glide.with(holder.itemView.getContext())
                .load(artifact.getArtifactd())
                .into(holder.imgArtifactD);
        holder.tvName.setText(artifact.getName());
        holder.tvArtifactOne.setText(artifact.getArtifactOne());
        holder.tvArtifactTwo.setText(artifact.getArtifactTwo());
        holder.tvArtifactDetailOne.setText(artifact.getDetailArtifactOne());
        holder.tvArtifactDetailTwo.setText(artifact.getDetailArtifactTwo());
        holder.tvDomain.setText(artifact.getDomain());

        holder.btnExpand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.layoutDetail.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(holder.layoutCard, new AutoTransition());
                    holder.layoutDetail.setVisibility(View.GONE);
                    holder.btnExpand.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(holder.layoutCard, new AutoTransition());
                    holder.layoutDetail.setVisibility(View.VISIBLE);
                    holder.btnExpand.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }
            }
        });

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.fade_in);
        ((ListViewHolder)holder).itemView.startAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return listArtifact.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard, imgArtifactA, imgArtifactB, imgArtifactC, imgArtifactD;
        TextView tvName, tvArtifactOne, tvArtifactTwo, tvArtifactDetailOne, tvArtifactDetailTwo, tvDomain;
        ImageButton btnExpand;
        LinearLayout layoutCard, layoutDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_item_card);
            imgArtifactA = itemView.findViewById(R.id.img_item_artifactA);
            imgArtifactB = itemView.findViewById(R.id.img_item_artifactB);
            imgArtifactC = itemView.findViewById(R.id.img_item_artifactC);
            imgArtifactD = itemView.findViewById(R.id.img_item_artifactD);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvArtifactOne = itemView.findViewById(R.id.tv_item_artifactOne);
            tvArtifactTwo = itemView.findViewById(R.id.tv_item_artifactTwo);
            tvArtifactDetailOne = itemView.findViewById(R.id.tv_item_artifactDetailOne);
            tvArtifactDetailTwo = itemView.findViewById(R.id.tv_item_artifactDetailTwo);
            tvDomain = itemView.findViewById(R.id.tv_item_domain);
            btnExpand = itemView.findViewById(R.id.btn_item_expand);
            layoutCard = itemView.findViewById(R.id.layout_item_card);
            layoutDetail = itemView.findViewById(R.id.layout_item_detail);
        }
    }
}
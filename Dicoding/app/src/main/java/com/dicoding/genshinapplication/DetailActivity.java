package com.dicoding.genshinapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.tb_detail_toolbar1);
        setSupportActionBar(toolbar);

        ImageView imgCard = findViewById(R.id.img_detail_card);
        ImageView imgPhoto = findViewById(R.id.img_detail_photo);
        TextView tvName = findViewById(R.id.tv_detail_name);
        ImageView imgVision = findViewById(R.id.img_detail_vision);
        TextView tvInfo = findViewById(R.id.tv_detail_info);
        ImageView imgArtifactA = findViewById(R.id.img_detail_artifactA);
        ImageView imgArtifactB = findViewById(R.id.img_detail_artifactB);
        ImageView imgArtifactC = findViewById(R.id.img_detail_artifactC);
        ImageView imgArtifactD = findViewById(R.id.img_detail_artifactD);
        TextView tvArtifactone = findViewById(R.id.tv_detail_artifactone);
        TextView tvArtifacttwo = findViewById(R.id.tv_detail_artifacttwo);

        Character character = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(character != null) {
            Glide.with(this)
                    .load(character.getCard())
                    .into(imgCard);
            Glide.with(this)
                    .load(character.getPhoto())
                    .into(imgPhoto);
            tvName.setText(character.getName());
            Glide.with(this)
                    .load(character.getVision())
                    .into(imgVision);
            tvInfo.setText(character.getInfo());
            Glide.with(this)
                    .load(character.getArtifacta())
                    .into(imgArtifactA);
            Glide.with(this)
                    .load(character.getArtifactb())
                    .into(imgArtifactB);
            Glide.with(this)
                    .load(character.getArtifactc())
                    .into(imgArtifactC);
            Glide.with(this)
                    .load(character.getArtifactd())
                    .into(imgArtifactD);
            tvArtifactone.setText(character.getArtifactOne());
            tvArtifacttwo.setText(character.getArtifactTwo());
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Character");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
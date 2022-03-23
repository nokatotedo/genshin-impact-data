package com.dicoding.genshinapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail2Activity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        Toolbar toolbar = findViewById(R.id.tb_detail_toolbar1);
        setSupportActionBar(toolbar);

        TextView tvName = findViewById(R.id.tv_detail_name);
        ImageView imgCard = findViewById(R.id.img_detail_card);
        TextView tvBaseATK = findViewById(R.id.tv_detail_baseatk);
        TextView tvSecond = findViewById(R.id.tv_detail_second);
        TextView tvPassive = findViewById(R.id.tv_detail_passive);
        TextView tvAbility = findViewById(R.id.tv_detail_ability);

        Weapon weapon = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(weapon != null) {
            tvName.setText(weapon.getName());
            Glide.with(this)
                    .load(weapon.getCard())
                    .into(imgCard);
            imgCard.setBackgroundResource(weapon.getBackground());
            tvBaseATK.setText(weapon.getBaseatk());
            tvSecond.setText(weapon.getSecond());
            tvPassive.setText(weapon.getPassive());
            tvAbility.setText(weapon.getAbility());
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Weapon");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
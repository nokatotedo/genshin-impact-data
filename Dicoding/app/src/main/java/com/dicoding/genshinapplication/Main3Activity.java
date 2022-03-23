package com.dicoding.genshinapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    private RecyclerView rvWeapon;
    private ArrayList<Weapon> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toolbar toolbar = findViewById(R.id.tb_main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main_navbar);
        bottomNavigationView.setSelectedItemId(R.id.home_weapon);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home_character:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home_artifact:
                        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home_weapon:
                        return true;
                }
                return false;
            }
        });

        rvWeapon = findViewById(R.id.rv_weapon);
        rvWeapon.setHasFixedSize(true);
        list.addAll(WeaponData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWeapon.setLayoutManager(new GridLayoutManager(this, 2));
        ListWeaponAdapter listWeaponAdapter = new ListWeaponAdapter(list);
        rvWeapon.setAdapter(listWeaponAdapter);
        listWeaponAdapter.setOnItemClickCallback(new OnItem2ClickCallback() {
            @Override
            public void onItemClicked(Weapon weapon) {
                Intent moveIntent = new Intent(Main3Activity.this,Detail2Activity.class);
                moveIntent.putExtra(Detail2Activity.ITEM_EXTRA, weapon);
                startActivity(moveIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.about_profile) {
            Intent moveIntent = new Intent(Main3Activity.this, AboutActivity.class);
            startActivity(moveIntent);
        }
        return true;
    }
}
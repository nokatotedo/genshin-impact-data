package com.dicoding.genshinapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView rvArtifact;
    private ArrayList<Artifact> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.tb_main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main_navbar);
        bottomNavigationView.setSelectedItemId(R.id.home_artifact);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home_character:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home_artifact:
                        return true;
                    case R.id.home_weapon:
                        startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        rvArtifact = findViewById(R.id.rv_artifact);
        rvArtifact.setHasFixedSize(true);
        list.addAll(ArtifactData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvArtifact.setLayoutManager(new LinearLayoutManager(this));
        ListArtifactAdapter listArtifactAdapter = new ListArtifactAdapter(list);
        rvArtifact.setAdapter(listArtifactAdapter);
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
            Intent moveIntent = new Intent(Main2Activity.this, AboutActivity.class);
            startActivity(moveIntent);
        }
        return true;
    }
}
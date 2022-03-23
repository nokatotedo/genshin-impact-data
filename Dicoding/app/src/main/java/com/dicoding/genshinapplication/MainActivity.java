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

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCharacter;
    private ArrayList<Character> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tb_main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main_navbar);
        bottomNavigationView.setSelectedItemId(R.id.home_character);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home_character:
                        return true;
                    case R.id.home_artifact:
                        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home_weapon:
                        startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        rvCharacter = findViewById(R.id.rv_character);
        rvCharacter.setHasFixedSize(true);
        list.addAll(CharacterData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCharacter.setLayoutManager(new LinearLayoutManager(this));
        ListCharacterAdapter listCharacterAdapter = new ListCharacterAdapter(list);
        rvCharacter.setAdapter(listCharacterAdapter);
        listCharacterAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Character character) {
                Intent moveIntent = new Intent(MainActivity.this,DetailActivity.class);
                moveIntent.putExtra(DetailActivity.ITEM_EXTRA, character);
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
            Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(moveIntent);
        }
        return true;
    }
}
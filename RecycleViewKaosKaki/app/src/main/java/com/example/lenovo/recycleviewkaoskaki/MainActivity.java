package com.example.lenovo.recycleviewkaoskaki;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKaosKaki;
    private ArrayList<KaosKaki> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKaosKaki = findViewById(R.id.rv_kaos_kaki);
        rvKaosKaki.setHasFixedSize(true);

        list.addAll(KaosKakiData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKaosKaki.setLayoutManager(new LinearLayoutManager(this));
        ListKaosKaki listHeroAdapter = new ListKaosKaki(list);
        rvKaosKaki.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
    }

    private void showRecyclerGrid(){
        rvKaosKaki.setLayoutManager(new GridLayoutManager(this, 2));
        GridKaosKaki gridHeroAdapter = new GridKaosKaki(list);
        rvKaosKaki.setAdapter(gridHeroAdapter);
    }

    private void showRecyclerCardView(){
        rvKaosKaki.setLayoutManager(new LinearLayoutManager(this));
        CardViewKaosKaki cardViewHeroAdapter = new CardViewKaosKaki(list);
        rvKaosKaki.setAdapter(cardViewHeroAdapter);
    }
}

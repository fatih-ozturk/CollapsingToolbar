package com.fatihcamuz.collapsingtoolbar;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fatih CAMUZ on 14.7.2015.
 */
public class MainActivity extends AppCompatActivity {
    CollapsingToolbarLayout collapsingToolbar;
    RecyclerView recyclerView;
    MainAdapter simpleMainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        initRecyclerView();


    }

    private void initRecyclerView() {

        recyclerView = (RecyclerView) findViewById(R.id.scrollableview);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        List<MainModel> result = new ArrayList<>();


        for (int i = 1; i <= 30; i++) {
            MainModel mainModel = new MainModel();

            mainModel.name = MainModel.Name_sample;
            mainModel.subname = MainModel.Subname_sample;

            result.add(mainModel);
        }

        if (simpleMainAdapter == null) {
            MainAdapter ca = new MainAdapter(result);
            recyclerView.setAdapter(ca);
        }
    }

    private void initToolbar() {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.anim_toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowTitleEnabled(true);
            }
        }

        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Fatih CAMUZ");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}

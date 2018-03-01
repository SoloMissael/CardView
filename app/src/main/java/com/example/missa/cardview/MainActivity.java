package com.example.missa.cardview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();



        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        productList.add(
                new DataProvider("Son Goku", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Vegetta", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Krilin", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Piccolo", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Son Gohan", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Bills", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Trunks", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Gotenks", "Dragon Ball Super",R.drawable.goku)
        );
        productList.add(
                new DataProvider("Goku Black", "Dragon Ball Super",R.drawable.goku)
        );

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);



    }



}

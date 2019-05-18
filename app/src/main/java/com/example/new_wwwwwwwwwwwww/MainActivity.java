package com.example.new_wwwwwwwwwwwww;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  List<Model> modelList = new ArrayList<>();

    private RecyclerView recyclerView;
    private Adapter Adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        Adapter = new Adapter(modelList,getApplicationContext());
        recyclerView.setAdapter(Adapter);


        modelData();
    }

    private void modelData() {

       Model model = new Model("canada2019","http://lorempixel.com/400/201");
        modelList.add(model);

        Model model1 = new Model("canada2","http://lorempixel.com/400/202");
        modelList.add(model1);

       Model model2 = new Model("canada3","https://www.iremigration.com/CanadaGallery");
        modelList.add(model2);

        Model model3 = new Model("canada4","https://www.iremigration.com/CanadaGallery");
        modelList.add(model3);

    }
}

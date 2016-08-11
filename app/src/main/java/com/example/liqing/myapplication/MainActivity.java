package com.example.liqing.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView)findViewById(R.id.list);
        inifruit();
        listView.setAdapter(new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList));


    }
    //
   public void inifruit(){
       Fruit apple1 =new Fruit("apple",R.drawable.apple);
       fruitList.add(apple1);
       Fruit banana =new Fruit("ba",R.drawable.banana);
       fruitList.add(banana);
       Fruit strawberry =new Fruit("strba",R.drawable.strawberry);
       fruitList.add(strawberry);
       Fruit lemon = new Fruit("lemo",R.drawable.lemon);
       fruitList.add(lemon);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               //点击的Item，是一个Fruit 对象
               Fruit fruit = fruitList.get(i);
               Toast.makeText(MainActivity.this,fruit.getFruitName(),Toast.LENGTH_SHORT).show();

           }
       });


    }
}

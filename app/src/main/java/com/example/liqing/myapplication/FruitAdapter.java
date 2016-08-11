package com.example.liqing.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by liqing on 16/8/10.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
   private int itemId;
//这个构造函数不是


    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        itemId=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder ;
       //View view;
        Fruit fruit = (Fruit) getItem(position);
        if(convertView==null){
            //
            convertView= LayoutInflater.from(getContext()).inflate(itemId,null);
            holder=new Holder();
            holder.fruitImage=(ImageView) convertView.findViewById(R.id.imgeView);
            holder.fruitName=(TextView)convertView.findViewById(R.id.textView);
            convertView.setTag(holder);


        }else{
            holder=(Holder)convertView.getTag();


        }
        holder.fruitName.setText(fruit.getFruitName());
        holder.fruitImage.setImageResource(fruit.getFruitImage());


        return convertView;
    }
    class Holder{
        TextView fruitName;
        ImageView fruitImage;
    }
}

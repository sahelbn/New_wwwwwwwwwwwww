package com.example.new_wwwwwwwwwwwww;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;



public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Model> modelList;
    private Context mmcontext;
//**********************************context***********************
    public Adapter(List<Model> modelList, Context mmcontext) {
        this.modelList = modelList;
        this.mmcontext = mmcontext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView =  LayoutInflater.from(mmcontext).inflate(R.layout.movie_list_row,viewGroup,false);
        MyViewHolder holder = new MyViewHolder(itemView);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        Model model =  modelList.get(i);
        holder.title.setText(model.getTitle());
        Glide.with(mmcontext).load(model.getUrl()).into(holder.pic_circle);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
//************************************init(xml)**********************
    public class MyViewHolder extends RecyclerView.ViewHolder{

        public CircleImageView pic_circle;
        public TextView title;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pic_circle=(CircleImageView)itemView.findViewById(R.id.pic_circle);
            title=(TextView)itemView.findViewById(R.id.title);
        }
    }
}

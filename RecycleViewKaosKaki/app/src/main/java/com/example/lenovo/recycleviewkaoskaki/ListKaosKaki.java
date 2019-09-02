package com.example.lenovo.recycleviewkaoskaki;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKaosKaki extends RecyclerView.Adapter<ListKaosKaki.ListViewHolder> {
    private ArrayList<KaosKaki> listKaosKaki;

    public ListKaosKaki(ArrayList<KaosKaki> list) {
        this.listKaosKaki = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_list_kaos_kaki, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        KaosKaki kaos = listKaosKaki.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kaos.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(kaos.getName());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailKaosKaki.class);
                intent.putExtra("title",listKaosKaki.get(position).getName());
                intent.putExtra("description",listKaosKaki.get(position).getDesc());
                intent.putExtra("img",listKaosKaki.get(position).getPhoto());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKaosKaki.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        RelativeLayout relativeLayout;
        ListViewHolder(View itemView) {
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.view_game);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }
}

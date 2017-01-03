package com.shiguiyou.materialdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shiguiyou.materialdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shiguiyou on 2017/1/2.
 */

public class SimpleRecyclerViewAdapter extends RecyclerView.Adapter<SimpleRecyclerViewAdapter.SimpleViewHolder> {

    Context context;
    List<String> lists = new ArrayList<>();

    public SimpleRecyclerViewAdapter(Context context) {
        this.context = context;
        lists.add("Honestly");
        lists.add("I was surprised");
        lists.add("the first time");
        lists.add("at just");
        lists.add("how smooth");
        lists.add("the Toolbar animation is,");
        lists.add("Even the FAB");
        lists.add("reacts beautifully");
        lists.add("upon touch");
        lists.add("with a higher");
        lists.add("elevation");
        lists.add("Check out");
        lists.add("the code");
        lists.add("sample");
        lists.add("over at");
        lists.add("my Git.");
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerlist_item, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.title.setText(lists.get(position));
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public SimpleViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listitem_name);
        }
    }
}

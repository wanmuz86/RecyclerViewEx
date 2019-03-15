package com.itrainasia.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {


    private final LinkedList<String> mWordList;
    private LayoutInflater mLayoutInflater;

    public class WordViewHolder extends RecyclerView.ViewHolder {

        public final TextView wordItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(@NonNull View itemView, WordListAdapter adapter) {
            super(itemView);
            this.mAdapter = adapter;
            wordItemView = itemView.findViewById(R.id.word);
        }

    }

    public WordListAdapter(Context context, LinkedList<String> wordList) {
        mLayoutInflater = LayoutInflater.from(context);
        mWordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mItemView = mLayoutInflater.inflate(R.layout.wordlist_item, viewGroup, false);

        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder wordHolder, int i) {
        wordHolder.wordItemView.setText(mWordList.get(i));
    }



    @Override
    public int getItemCount() {

        return mWordList.size();
    }

}

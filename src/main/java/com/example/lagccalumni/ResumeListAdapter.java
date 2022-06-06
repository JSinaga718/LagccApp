package com.example.lagccalumni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//we use adapter to tell list how&what to fill

public class ResumeListAdapter extends RecyclerView.Adapter<ResumeListAdapter.ViewHolder> {
    private ArrayList<Resume> resumeList;
    //context tells us which activity is currently open
    private Context context;

    public ResumeListAdapter(ArrayList<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    @NonNull
    @Override
    //tells list which view to use
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_resume, parent, false);
        return new ViewHolder(view);
    }

    @Override
    //tells us what data to put inside view
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Resume resume = resumeList.get(position);
        holder.description.setText(resume.getDescription());
        holder.imageView.setImageDrawable(ContextCompat.getDrawable(context, resume.getImage()));

    }

    @Override
    public int getItemCount() {
        return resumeList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView description;
        final ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            description = itemView.findViewById(R.id.description);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

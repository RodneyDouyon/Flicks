package com.codepath_student.rodney.flicks;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath_student.rodney.flicks.models.Movie;

import java.util.ArrayList;

public class MovieAdapter {

    // list of movies
    ArrayList<Movie> movies;

    // initialize with list

    public MovieAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    // create the viewholder as a static inner class
    public  static class ViewHolder extends RecyclerView.ViewHolder{

        // track view objects
        ImageView ivPosterImage;
        TextView tvTitle;
        TextView tvOverview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // lookup view objects by id
            ivPosterImage =(ImageView) itemView.findViewById(R.id.ivPosterImage);
            tvOverview = (TextView) itemView.findViewById(R.id.tvOverview);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        }
    }
}

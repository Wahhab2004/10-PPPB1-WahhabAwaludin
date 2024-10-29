package com.example.disasterapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import android.view.View.OnClickListener


class MovieAdapter(private val context: Context,private val movieList: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    // ViewHolder untuk item layout
    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewMovie: ImageView = itemView.findViewById(R.id.imageResId)
        val textViewTitle: TextView = itemView.findViewById(R.id.title)
        val textViewDuration: TextView = itemView.findViewById(R.id.duration)
        val textViewAgeGroup: TextView = itemView.findViewById(R.id.ageGroup)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.imageViewMovie.setImageResource(movie.imageResId)
        holder.textViewTitle.text = movie.title
        holder.textViewDuration.text = movie.duration
        holder.textViewAgeGroup.text = movie.ageGroup

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailMovieActivity::class.java)
            intent.putExtra("imageResId", movie.imageResId)
            intent.putExtra("title", movie.title)
            intent.putExtra("duration", movie.duration)
            intent.putExtra("ageGroup", movie.ageGroup)
//            listener.invoke(movie)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = movieList.size
}

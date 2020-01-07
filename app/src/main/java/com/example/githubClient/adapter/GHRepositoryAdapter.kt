package com.example.githubClient.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.githubClient.GHLanguageColorMap
import com.example.githubClient.R
import com.example.githubClient.model.Repo

class GHRepositoryAdapter(private val repositories: ArrayList<Repo>?, private val darkMode: Boolean, private val context: Context) : RecyclerView.Adapter<GHRepositoryAdapter.GHRepositoryViewHolder>() {

    companion object {
        private val TAG = GHRepositoryAdapter::class.java.simpleName
    }

    class GHRepositoryViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val cardView: CardView = view.findViewById(R.id.cardview)
        val textViewName: TextView = view.findViewById(R.id.repositoryListRowTextName)
        val textViewDescription: TextView = view.findViewById(R.id.repositoryListRowTextDescription)
        val textViewLanguage: TextView = view.findViewById(R.id.repositoryListRowTextLanguage)
        val imageViewLanguageCircle: ImageView = view.findViewById(R.id.repositoryListRowLanguageCircle)
        val textViewForkNumber: TextView = view.findViewById(R.id.repositoryListRowTextForkNumber)
        val imageViewForkNumber: ImageView = view.findViewById(R.id.repositoryListRowFork)
        val textViewStarNumber: TextView = view.findViewById(R.id.repositoryListRowTextStarNumber)
        val imageViewStarNumber: ImageView = view.findViewById(R.id.repositoryListRowStar)

        init {
            textViewName.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
            Log.e(TAG, "clicked")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GHRepositoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repository_list_row, parent, false) as View
        return GHRepositoryViewHolder(view)
    }

    override fun getItemCount(): Int = repositories?.size ?: 0

    override fun onBindViewHolder(holder: GHRepositoryViewHolder, position: Int) {
        if (darkMode) {
            holder.cardView.setCardBackgroundColor(Color.DKGRAY)
            val darkColor = ContextCompat.getColor(context, R.color.cardTextDark)
            holder.textViewForkNumber.setTextColor(darkColor)
            holder.textViewStarNumber.setTextColor(darkColor)
            holder.textViewLanguage.setTextColor(darkColor)
            holder.textViewDescription.setTextColor(darkColor)
            holder.textViewName.setTextColor(darkColor)
            holder.imageViewForkNumber.setColorFilter(darkColor)
            holder.imageViewStarNumber.setColorFilter(darkColor)
        } else {
            holder.cardView.setCardBackgroundColor(Color.WHITE)
            val lightColor = ContextCompat.getColor(context, R.color.cardText)
            holder.textViewForkNumber.setTextColor(lightColor)
            holder.textViewStarNumber.setTextColor(lightColor)
            holder.textViewLanguage.setTextColor(lightColor)
            holder.textViewDescription.setTextColor(lightColor)
            holder.textViewName.setTextColor(lightColor)
            holder.imageViewForkNumber.setColorFilter(lightColor)
            holder.imageViewStarNumber.setColorFilter(lightColor)
        }

        holder.textViewName.text = repositories?.get(position)?.name
        holder.textViewDescription.text = repositories?.get(position)?.description

        val language = repositories?.get(position)?.language

        holder.textViewLanguage.text = language
        val langColor = Color.parseColor(GHLanguageColorMap.getLanguageColor(language))
        val mode = PorterDuff.Mode.SRC_ATOP
        holder.imageViewLanguageCircle.setColorFilter(langColor, mode)

        holder.textViewForkNumber.text = repositories?.get(position)?.forksCount.toString()
        holder.textViewStarNumber.text = repositories?.get(position)?.stargazersCount.toString()
    }
}
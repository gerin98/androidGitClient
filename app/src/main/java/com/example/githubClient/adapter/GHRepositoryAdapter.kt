package com.example.githubClient.adapter

import android.graphics.Color
import android.graphics.PorterDuff
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubClient.GHLanguageColorMap
import com.example.githubClient.R
import com.example.githubClient.model.Repo

class GHRepositoryAdapter(private val repositories: ArrayList<Repo>?) : RecyclerView.Adapter<GHRepositoryAdapter.GHRepositoryViewHolder>() {

    companion object {
        private val TAG = GHRepositoryAdapter::class.java.simpleName
    }
//
//    private val sortedRepositories by lazy {
//        repositories?.sortedWith(compareBy {it.language})
//    }

    class GHRepositoryViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val textViewName: TextView = view.findViewById(R.id.repositoryListRowTextName)
        val textViewDescription: TextView = view.findViewById(R.id.repositoryListRowTextDescription)
        val textViewLanguage: TextView = view.findViewById(R.id.repositoryListRowTextLanguage)
        val imageViewLanguageCircle: ImageView = view.findViewById(R.id.repositoryListRowLanguageCircle)
        val textViewForkNumber: TextView = view.findViewById(R.id.repositoryListRowTextForkNumber)
        val textViewStarNumber: TextView = view.findViewById(R.id.repositoryListRowTextStarNumber)

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
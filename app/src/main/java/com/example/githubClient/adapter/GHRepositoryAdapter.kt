package com.example.githubClient.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubClient.R
import com.example.githubClient.model.Repo

class GHRepositoryAdapter(private val repositories: ArrayList<Repo>?) : RecyclerView.Adapter<GHRepositoryAdapter.GHRepositoryViewHolder>() {

    companion object {
        private val TAG = GHRepositoryAdapter::class.java.simpleName
    }

    class GHRepositoryViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val textViewName: TextView = view.findViewById(R.id.repositoryListRowTextName)
        val textViewDescription: TextView = view.findViewById(R.id.repositoryListRowTextDescription)
        val textViewLanguage: TextView = view.findViewById(R.id.repositoryListRowTextLanguage)

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
        holder.textViewLanguage.text = repositories?.get(position)?.language
    }
}
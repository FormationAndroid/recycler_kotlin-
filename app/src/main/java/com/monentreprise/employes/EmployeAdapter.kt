package com.monentreprise.employes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_employe.view.*

class EmployeAdapter (private val employes: ArrayList<Employe>) : RecyclerView.Adapter<EmployeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_employe, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: EmployeAdapter.ViewHolder, position: Int) {
        holder.bindItems(employes[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(employe: Employe) {
            itemView.textNom.text = employe.nom
            itemView.textPrenom.text = employe.prenom
            itemView.textAge.text = employe.age.toString()
        }
    }

    override fun getItemCount(): Int {
        return employes.size
    }

}
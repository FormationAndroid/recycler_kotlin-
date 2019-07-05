package com.monentreprise.employes

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.item_employe.view.*

class EmployeAdapter (private val employes: ArrayList<Employe>) : RecyclerView.Adapter<EmployeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_employe, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(employes[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val txtNom = itemView.findViewById<TextView>(R.id.textNom)
        private val txtPrenom = itemView.findViewById<TextView>(R.id.textPrenom)
        private val txtAge = itemView.findViewById<TextView>(R.id.textAge)
        private val imageProfil = itemView.findViewById<ImageView>(R.id.imgProfil)

        fun bindItems(employe: Employe) {

            employe.apply {
                txtNom.text = nom
                txtPrenom.text = prenom
                txtAge.text = age.toString()
                imageProfil.setImageDrawable(ContextCompat.getDrawable(itemView.context, picture))
                if (!isValid)
                    itemView.setBackgroundColor(ContextCompat.getColor(itemView.context, R.color.colorGrey))
            }


        }
    }

    override fun getItemCount(): Int {
        return employes.size
    }

}
package com.monentreprise.employes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listEmployes = ArrayList<Employe>()
        listEmployes.add(Employe("Dupont", "Jean", 42))
        listEmployes.add(Employe("Robertson", "Charlie", 24))
        listEmployes.add(Employe("Hamilton", "Aimee", 66))
        listEmployes.add(Employe("Reid", "Jacqueline", 21))
        listEmployes.add(Employe("Fleming", "Amirah", 38))
        listEmployes.add(Employe("Chambers", "Beth", 46))
        listEmployes.add(Employe("Moore", "Amie", 27))

        val adapterEmploye = EmployeAdapter(listEmployes)
        recyclerEmploye.adapter = adapterEmploye

    }
}

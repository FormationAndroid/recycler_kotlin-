package com.monentreprise.employes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listEmployes = ArrayList<Employe>()
        listEmployes.add(Employe("Dupont", "Jean", 42, R.drawable.man1, true))
        listEmployes.add(Employe("Robertson", "Charlie", 24, R.drawable.man2, true))
        listEmployes.add(Employe("Hamilton", "Aimee", 66, R.drawable.woman1, true))
        listEmployes.add(Employe("Reid", "Jacqueline", 21, R.drawable.woman1, false))
        listEmployes.add(Employe("Fleming", "Amirah", 38, R.drawable.woman1, true))
        listEmployes.add(Employe("Chambers", "Beth", 46, R.drawable.woman2, false))
        listEmployes.add(Employe("Moore", "Amie", 27, R.drawable.woman1, true))

        val adapterEmploye = EmployeAdapter(listEmployes)
        recyclerEmploye.adapter = adapterEmploye

    }
}

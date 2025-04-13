package com.example.tallertiendavirtual.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tallertiendavirtual.R


class PerfilFragment : Fragment() {

    private lateinit var btn_perfil : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_perfil,container,false)
        btn_perfil = view.findViewById(R.id.btn_perfil)

        btn_perfil.setOnClickListener{
            findNavController().navigate(R.id.InicioFragment)
        }

        return view
    }

}
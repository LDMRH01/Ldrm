package com.lramirez.recycleview_leonardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    private var listaClientes: MutableList<dtClientes> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaClientes.add(
            dtClientes("Jitomate","Precio Menudeo $60","Precio Mayoreo $50"))
        listaClientes.add(
            dtClientes("Rambután","Precio Menudeo $40","Precio Mayoreo $36"))
        listaClientes.add(
            dtClientes("Ajo","Precio Menudeo $180","Precio Mayoreo $150"))
        listaClientes.add(
            dtClientes("Kiwi","Precio Menudeo $90","Precio Mayoreo $70"))
        listaClientes.add(
            dtClientes("Pimiento verde","Precio Menudeo $45","Precio Mayoreo $30"))
        listaClientes.add(
            dtClientes("Lechuga","Precio Menudeo $30","Precio Mayoreo $20"))
        listaClientes.add(
            dtClientes("limón","Precio Menudeo $35","Precio Mayoreo $30"))
        listaClientes.add(
            dtClientes("Lima","Precio Menudeo $45","Precio Mayoreo $40"))
        listaClientes.add(
            dtClientes("Arándano","Precio Menudeo $55","Precio Mayoreo $40"))
        listaClientes.add(
            dtClientes("Pera","Precio Menudeo $33","Precio Mayoreo $25"))
        listaClientes.add(
            dtClientes("Girasol","Precio Menudeo $30","Precio Mayoreo $25"))
        listaClientes.add(
            dtClientes("Melón","Precio Menudeo $50","Precio Mayoreo $40"))
        listaClientes.add(
            dtClientes("Sandía","Precio Menudeo $15","Precio Mayoreo $10"))
        listaClientes.add(
            dtClientes("Plátano","Precio Menudeo $40","Precio Mayoreo $30"))
        listaClientes.add(
            dtClientes("Jicama","Precio Menudeo $55","Precio Mayoreo $49"))
        listaClientes.add(
            dtClientes("Fresa","Precio Menudeo $100","Precio Mayoreo $90"))
        listaClientes.add(
            dtClientes("Durazno","Precio Menudeo $60","Precio Mayoreo $55"))
        listaClientes.add(
            dtClientes("Naranja","Precio Menudeo $35","Precio Mayoreo $30"))

        var tabla = findViewById<RecyclerView>(R.id.tablaClientes)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ClientesAdapter(this,listaClientes)

    }
}
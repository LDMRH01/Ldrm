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
            dtClientes("1","Jitomate","Precio Menudeo $60","Precio Mayoreo $50"))
        listaClientes.add(
            dtClientes("2","Rambután","Precio Menudeo $40","Precio Mayoreo $36"))
        listaClientes.add(
            dtClientes("3","Ajo","Precio Menudeo $180","Precio Mayoreo $150"))
        listaClientes.add(
            dtClientes("4","Kiwi","Precio Menudeo $90","Precio Mayoreo $70"))
        listaClientes.add(
            dtClientes("5","Pimiento verde","Precio Menudeo $45","Precio Mayoreo $30"))
        listaClientes.add(
            dtClientes("6","Lechuga","Precio Menudeo $30","Precio Mayoreo $20"))
        listaClientes.add(
            dtClientes("7","limón","Precio Menudeo $35","Precio Mayoreo $30"))
        listaClientes.add(
            dtClientes("8","Lima","Precio Menudeo $45","Precio Mayoreo $40"))
        listaClientes.add(
            dtClientes("9","Arándano","Precio Menudeo $55","Precio Mayoreo $40"))
        listaClientes.add(
            dtClientes("10","Pera","Precio Menudeo $33","Precio Mayoreo $25"))
        listaClientes.add(
            dtClientes("11","Girasol","Precio Menudeo $30","Precio Mayoreo $25"))
        listaClientes.add(
            dtClientes("12","Melón","Precio Menudeo $50","Precio Mayoreo $40"))
        listaClientes.add(
            dtClientes("13","Sandía","Precio Menudeo $15","Precio Mayoreo $10"))
        listaClientes.add(
            dtClientes("14","Plátano","Precio Menudeo $40","Precio Mayoreo $30"))
        listaClientes.add(
            dtClientes("15","Jicama","Precio Menudeo $55","Precio Mayoreo $49"))
        listaClientes.add(
            dtClientes("16","Fresa","Precio Menudeo $100","Precio Mayoreo $90"))
        listaClientes.add(
            dtClientes("17","Durazno","Precio Menudeo $60","Precio Mayoreo $55"))
        listaClientes.add(
            dtClientes("18","Naranja","Precio Menudeo $35","Precio Mayoreo $30"))
        listaClientes.add(
            dtClientes("19","Nuez","Precio Menudeo $200","Precio Mayoreo $170"))
        listaClientes.add(
            dtClientes("20","Coco","Precio Menudeo $","Precio Mayoreo $0"))

        var tabla = findViewById<RecyclerView>(R.id.tablaClientes)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ClientesAdapter(this,listaClientes)

    }
}
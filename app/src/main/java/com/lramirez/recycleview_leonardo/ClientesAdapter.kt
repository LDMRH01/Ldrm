package com.lramirez.recycleview_leonardo
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class ClientesAdapter(var context: Context,
    var ListaClientes: MutableList<dtClientes>) :
    RecyclerView.Adapter<ClientesAdapter.vHolder>()

{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtid: TextView
        init {
            txtid= itemView.findViewById(R.id.txtId)
        }
        lateinit var txtnombre: TextView
        init{
            txtnombre=itemView.findViewById(R.id.txtNombre)
        }
        lateinit var txtpreciom: TextView
        init{
            txtpreciom=itemView.findViewById(R.id.txtpreciom)
        }
        lateinit var txtpreciomy: TextView
        init{
            txtpreciomy=itemView.findViewById(R.id.txtPrecioMy)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientesAdapter.vHolder {
       var itemView = LayoutInflater.from(context).inflate(
           R.layout.vistaclientes,parent,false)
        return vHolder(itemView)
               }
    override fun getItemCount(): Int {
        return ListaClientes.size
    }
    override fun onBindViewHolder(holder: ClientesAdapter.vHolder, position: Int) {
       var clientes = ListaClientes[position]
        holder.txtid.text=clientes.id
        holder.txtnombre.text=clientes.Nombre
        holder.txtpreciom.text=clientes.PrecioM
        holder.txtpreciomy.text=clientes.PrecioMy
    }



}
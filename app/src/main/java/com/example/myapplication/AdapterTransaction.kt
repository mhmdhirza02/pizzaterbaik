package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterTransaction(private val listOrder: List<TransactionModel>) :
    RecyclerView.Adapter<AdapterTransaction.ViewHolderOrder>() {

    class ViewHolderOrder(view: View) : RecyclerView.ViewHolder(view) {
        val txtNama: TextView = view.findViewById(R.id.textNamaMenu)
        val txtHarga: TextView = view.findViewById(R.id.textHargaMenu)
        val txtJml: TextView = view.findViewById(R.id.textQtyMenu)
        val imgGambar: ImageView = view.findViewById(R.id.imageMenu)
        val context = view.context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderOrder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.card_layout_order, parent, false)
        return ViewHolderOrder(view)
    }

    override fun onBindViewHolder(holder: ViewHolderOrder, position: Int) {
        val modelTrx = listOrder[position]

        holder.txtNama.text = modelTrx.nama
        holder.txtHarga.text = modelTrx.harga.toString()
        holder.txtJml.text = modelTrx.jumlah.toString()
        holder.imgGambar.setImageResource(modelTrx.gambar)
    }

    override fun getItemCount(): Int = listOrder.size
}

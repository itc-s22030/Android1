package jp.ac.it_college.std.s22030.fragmentsample

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.ac.it_college.std.s22030.fragmentsample.databinding.MenuRowBinding

class MenuAdapter(
    private val data : List<Menu>,
    private val callback: (Menu) -> Unit
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    class ViewHolder(val binding: MenuRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(MenuRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = data[position]
        holder.binding.apply {
            menuName.text = data[position].name
            menuPrice.text = "%,d".format(data[position].price)
            root.setOnClickListener { callback(menu)}
        }
    }
}
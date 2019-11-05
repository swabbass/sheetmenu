package ru.whalemare.sheetmenu.adapter

import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import ru.whalemare.sheetmenu.R
import ru.whalemare.sheetmenu.extension.toList

/**
 * Developed with ❤
 * @since 2017
 * @author Anton Vlasov - whalemare
 */
open class MenuAdapter(
    var menuItems: List<MenuItem> = emptyList(),
    var callback: MenuItem.OnMenuItemClickListener? = null,
    var itemLayoutId: Int = 0,
    var showIcons: Boolean = true
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    companion object {
        fun with(itemLayoutId: Int, menu: Menu, showIcons: Boolean): MenuAdapter {
            return MenuAdapter(
                menuItems = menu.toList(),
                itemLayoutId = itemLayoutId,
                showIcons = showIcons
            )
        }
    }

    @LayoutRes
    open fun getLayoutItem(): Int {
        return itemLayoutId
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(getLayoutItem(), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = menuItems[position]

        if (showIcons) {
            if (item.icon == null) {
                holder.imageIcon.visibility = View.GONE
            } else {
                holder.imageIcon.visibility = View.VISIBLE
            }
        } else {
            holder.imageIcon.visibility = View.GONE
        }

        holder.imageIcon.setImageDrawable(item.icon)
        holder.textTitle.text = item.title
        holder.itemView.setOnClickListener {
            callback?.onMenuItemClick(item)
        }
    }

    override fun getItemCount(): Int {
        return menuItems.size
    }

    open class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageIcon: ImageView = itemView.findViewById(R.id.image_icon) as ImageView
        var textTitle: TextView = itemView.findViewById(R.id.text_title) as TextView
    }
}
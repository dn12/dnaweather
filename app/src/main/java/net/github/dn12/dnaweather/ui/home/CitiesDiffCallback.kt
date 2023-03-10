

package net.github.dn12.dnaweather.ui.home

import androidx.annotation.Nullable
import androidx.recyclerview.widget.DiffUtil
import net.github.dn12.network.model.City

class CitiesDiffCallback(
    private val oldList: MutableList<City>,
    private val newList: MutableList<City>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].name == newList[newItemPosition].name
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    @Nullable
    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }
}

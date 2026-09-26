package com.github.kusa233.kalmia.mysql.data.row

data class Row(
    val values: List<String?>
) {
    companion object {
        val EMPTY_ROW: Row = Row(emptyList())
    }

    operator fun get(index: Int): String? {
        return this.values[index]
    }

    fun size(): Int {
        return this.values.size
    }
}
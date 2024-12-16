package cc.samlab.bookshelf.data.network

import com.google.gson.annotations.SerializedName

data class VolumeInfo(
    @SerializedName("imageLinks") val imageLinks: Thumbnails?
)
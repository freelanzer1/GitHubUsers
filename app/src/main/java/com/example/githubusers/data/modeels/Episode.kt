package com.example.githubusers.data.modeels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Episode : Serializable {
    @SerializedName("id")
    @Expose
    var id = 0

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("air_date")
    @Expose
    var airDate: String? = null

    @SerializedName("episode")
    @Expose
    var episode: String? = null

    @SerializedName("characters")
    @Expose
    var characters: List<String>? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("created")
    @Expose
    var created: String? = null

    companion object {
        private const val serialVersionUID = 5152006410181529310L
    }
}
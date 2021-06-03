package com.example.githubusers.data.modeels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Origin : Serializable {
    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    companion object {
        private const val serialVersionUID = -8744206074573927986L
    }
}
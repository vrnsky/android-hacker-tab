package my.edu.stc.hackertab.model

import com.google.gson.annotations.SerializedName

data class Repository (

    @SerializedName("author")
    val author: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("avatar")
    val avatar: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("language")
    var language: String,

    @SerializedName("languageColor")
    var languageColor: String,

    @SerializedName("stars")
    var stars: Int,

    @SerializedName("forks")
    var forks: Int,

    @SerializedName("currentPeriodStars")
    var currentPeriodStars: Int,

    @SerializedName("builtBy")
    var contributors: List<Contributor>
) {
}
package my.edu.stc.hackertab.model

import com.google.gson.annotations.SerializedName

data class Contributor(

    @SerializedName("username")
    val username: String,

    @SerializedName("href")
    val href: String,

    @SerializedName("avatar")
    var avatar: String
) {
}
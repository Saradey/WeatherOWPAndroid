package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

open class Weather : RealmObject() {
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("main")
    var main: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("icon")
    var icon: String? = null
}
package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

open class Clouds : RealmObject() {
    @SerializedName("all")
    var all: Int? = null
}
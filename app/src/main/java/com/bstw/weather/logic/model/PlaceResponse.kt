package com.bstw.weather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 搜索城市名称后,返回的的 和城市数据相关的数据.places 是和搜索关键字关系度比较高的地区信息.
 */
data class PlaceResponse(val status:String, val places : List<Place>)

/**
 * @SerializedName : 由于JSON中一些字段的命名(如: "formatted_address" : 中国北京市 )可能与kotlin的命名规范不一致,
 * 使用 @SerializedName注解方式, 让 JSON 字段和 kotlin 字段之间建立映射关系. 将 formatted_address
 */
data class Place(val name:String,val location: Location,@SerializedName("formatted_address") val address:String)

/**
 * 经纬度模型
 */
data class Location(val lng:String, val lat:String)
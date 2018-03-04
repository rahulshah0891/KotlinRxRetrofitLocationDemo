package com.kotlinrxdemo.retrofitbeans

data class PhotosItem(
	val photoReference: String? = null,
	val width: Int? = null,
	val htmlAttributions: List<String?>? = null,
	val height: Int? = null
)

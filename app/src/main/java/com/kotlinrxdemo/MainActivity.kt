package com.kotlinrxdemo

import android.app.Activity
import android.os.Bundle
import com.kotlinrxdemo.retrofit.RetrofitSingleton
import com.kotlinrxdemo.retrofitbeans.LocationResponseBean
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getLocationObs()?.subscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())


    }

    fun getLocationObs(): Observable<LocationResponseBean>? {
        val locationResponseObs = RetrofitSingleton.instance.configRetrofit()?.
                googlePlaceLocation(getString(R.string.api_key),"23.586761,72.369949", "2000", "restaurant");
        return locationResponseObs
    }
}

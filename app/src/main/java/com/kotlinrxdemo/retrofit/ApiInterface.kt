package com.kotlinrxdemo.retrofit

import com.kotlinrxdemo.retrofitbeans.LocationResponseBean
import io.reactivex.Observable
import retrofit2.http.*

/**
 * Created by Rahul on 3/3/2018.
 */
interface ApiInterface {

    //https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=23.586761,72.369949
    // &radius=500&type=restaurant&key=AIzaSyBePPBGTexyu_TamKkmqQT0idaeQaGz5uA

    @GET("json") fun googlePlaceLocation(@Query("key") key: String, @Query("location") location: String,
                                         @Query("radius") radius: String, @Query("type") type: String): Observable<LocationResponseBean>

}
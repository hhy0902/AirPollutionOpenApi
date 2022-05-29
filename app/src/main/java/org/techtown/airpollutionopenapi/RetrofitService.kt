package org.techtown.airpollutionopenapi

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface RetrofitService {

    @Headers("Authorization: KakaoAK ${BuildConfig.KAKAO_API_KEY}")
    @GET("v2/local/geo/transcoord.json?output_coord=TM")
    fun getTmCoordinates(
        @Query("x") longitude : Double,
        @Query("y") latitude : Double
    )

}
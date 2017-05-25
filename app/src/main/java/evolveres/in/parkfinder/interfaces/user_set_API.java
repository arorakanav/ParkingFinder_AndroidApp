package evolveres.in.parkfinder.interfaces;

/**
 * Created by nishc on 22-06-2016.
 */

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;


public interface user_set_API {
    @FormUrlEncoded
    @POST("/ParkingFinder/insertParkingPlace.php")
    public void insertData(
            @Field("UID") String UID,
            @Field("Address") String Address,
            @Field("Price") int Price,
            @Field("Description") String Description,
            @Field("Lat") double Lat,
            @Field("Lon") double Lon,
            @Field("Length") int Length,
            @Field("Breadth") int Breadth,
            @Field("Height") int Height,
            @Field("NoOfParkingPlace") int NoOfParkingPlace,
            Callback<Response> callback);

}

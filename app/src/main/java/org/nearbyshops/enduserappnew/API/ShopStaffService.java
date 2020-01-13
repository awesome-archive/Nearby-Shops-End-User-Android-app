package org.nearbyshops.enduserappnew.API;


import org.nearbyshops.enduserappnew.Model.ModelRoles.ShopStaffPermissions;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by sumeet on 30/8/17.
 */


public interface ShopStaffService {



    @PUT ("/api/v1/User/ShopStaffLogin/UpdateStaffPermissions")
    Call<ResponseBody> updateStaffPermissions(
            @Header("Authorization") String headers,
            @Body ShopStaffPermissions permissions
    );





    @PUT ("/api/v1/User/ShopStaffLogin/UpgradeUser/{UserID}/{Role}")
    Call<ResponseBody> upgradeUserToShopStaff(
            @Header("Authorization") String headers,
            @Path("UserID")int userID,
            @Path("Role")int role
    );





    @PUT("/api/v1/User/ShopStaffLogin/UpdateStaffLocation")
    Call<ResponseBody> updateStaffLocation(
            @Header("Authorization") String headers,
            @Body ShopStaffPermissions permissions
    );




    @GET("/api/v1/User/ShopStaffLogin/GetUserDetails/{UserID}")
    Call<ShopStaffPermissions> getUserDetails(
            @Header("Authorization") String headers,
            @Path("UserID")int userID
    );


}

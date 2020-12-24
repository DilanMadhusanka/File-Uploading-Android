package com.insharp.android.file_upload_android.network;

import com.insharp.android.file_upload_android.models.ImageResponse;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    String BASE_URL = "http://192.168.1.100/ImageUploadApi/";

    //this is our multipart request
    //we have two parameters on is name and other one is description
    @Multipart
    @POST("Api.php?apicall=upload")
    Call<ImageResponse> uploadImage(@Part("image\"; filename=\"myfile.jpg\" ") RequestBody file, @Part("desc") RequestBody desc);


}

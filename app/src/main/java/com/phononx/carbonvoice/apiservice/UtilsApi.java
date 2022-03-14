package com.phononx.carbonvoice.apiservice;

public class UtilsApi {
    private static final String BASE_URL_API = "https://api.github.com/";

    public static com.phononx.carbonvoice.apiservice.BaseApiService getAPIService(){
        return com.phononx.carbonvoice.apiservice.RetrofitClient.getClient(BASE_URL_API).create(com.phononx.carbonvoice.apiservice.BaseApiService.class);
    }
}

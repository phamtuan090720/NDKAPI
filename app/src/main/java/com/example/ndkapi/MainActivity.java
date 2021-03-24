package com.example.ndkapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ndkapi.api.ApiService;
import com.example.ndkapi.model.Film;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    private Button btnCallApi;
    public native String getAPIKey();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        btnCallApi = findViewById(R.id.btn_CallApi);
        TextView tv = findViewById(R.id.sample_text);
        tv.setText("APIKEY:"+getAPIKey());
        btnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getJsonDataFilm();
            }
        });
    }
    // goi api
    public void  getJsonDataFilm(){
        String keyAPI = new String(Base64.decode(getAPIKey(),Base64.DEFAULT));
        TextView tv = findViewById(R.id.sample_text);
        tv.setText("APIKEY Khi được mã hóa:"+keyAPI);
        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(keyAPI)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<List<Film>> call = apiService.getAllFilm();
        call.enqueue(new Callback<List<Film>>() {
            @Override
            public void onResponse(Call<List<Film>> call, Response<List<Film>> response) {
                    Toast.makeText(getApplicationContext(),"Call API Success",Toast.LENGTH_LONG).show();
                getDataFilm(response.body());
            }

            @Override
            public void onFailure(Call<List<Film>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Err",Toast.LENGTH_LONG).show();
            }
        });

    }
    // fromat data
    private void getDataFilm(List<Film> ls){

        Log.i("//======== Size","=>"+ls.size());
        for(Film p:ls){
            Log.i("//======== Film","=>"+p.toString());
        }

    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

}
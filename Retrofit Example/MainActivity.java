public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callApi();      
  }
  
  public void callApi(){
    ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
    Call<JSONObject> call = apiService.versionCode();
    call.enqueue(new Callback<JSONObject>() {
        @Override
        public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
            JSONObject json = response.body();
        }
        @Override
        public void onFailure(Call<JSONObject> call, Throwable t) {
            Log.e(TAG, t.toString());
        }
    });
  }
}

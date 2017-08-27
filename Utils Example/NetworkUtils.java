public class NetworkUtils {
    private static final String TAG = "NetworkUtil";
    private static ConnectivityManager cm;
    private static Context context;

    public NetworkUtils(Context ctx) {
        cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        context = ctx;
    }

    public static boolean isConnected() {
        if (cm != null) {
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            if (activeNetwork != null) {
                boolean isConnected = activeNetwork.isConnected();
                if (isConnected) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean checkConnection() {
        if (isConnected()) {
            Log.e(TAG, "checkConnection: true");
            return true;
        } else {
            Log.e(TAG, "checkConnection: false");
//            DialogUtils.showNoInternetConnectionDialog(context);
            return false;
        }
    }


    public static boolean checkConnection(Context context) {
        if (isConnected())
            return true;
        else {
//            DialogUtils.showNoInternetConnectionDialog(context);
            return false;
        }
    }


    public static String getConnectionType() {
        if (cm != null) {
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            if (activeNetwork != null) {
                boolean isConnected = activeNetwork.isConnected();

                if (isConnected) {
                    if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                        return "WIFI";
                    } else {
                        return "DATA";
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}

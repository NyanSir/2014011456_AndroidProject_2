package bistu.rookie.u_nity.project_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LogcatTag";
    private static final String ANOTHERTAG = "AnotherTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Verbose Message");
        Log.d(TAG, "Debug Message");
        Log.i(TAG, "Info Message");
        Log.w(TAG, "Warning Message");
        Log.e(TAG, "Error Message");

        Log.v(ANOTHERTAG, "Another Verbose Message");
        Log.d(ANOTHERTAG, "Another Debug Message");
        Log.i(ANOTHERTAG, "Another Info Message");
        Log.w(ANOTHERTAG, "Another Warning Message");
        Log.e(ANOTHERTAG, "Another Error Message");
    }

}

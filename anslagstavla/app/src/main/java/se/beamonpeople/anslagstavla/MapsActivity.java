package se.beamonpeople.anslagstavla;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(new MapHandler(this));
        EditText userInput = (EditText) findViewById(R.id.editText);
        TextView userLog = (TextView) findViewById(R.id.textView);
        Button userSend = (Button) findViewById(R.id.sendText);

        DataHandler dataHandler = new DataHandler();
        new InputController(userInput, userLog,userSend, dataHandler);

    }
}

package se.beamonpeople.anslagstavla;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapController implements GoogleMap.OnMapClickListener, GoogleMap.InfoWindowAdapter {

    private final GoogleMap map;
    private final Activity mainActivity;
    private final DataHandler dataHandler;

    public MapController(GoogleMap mMap, Activity mainActivity, DataHandler dataHandler) {
        this.map = mMap;
        map.setOnMapClickListener(this);
        map.setInfoWindowAdapter(this);
        this.mainActivity = mainActivity;
        this.dataHandler = dataHandler;
    }

    @Override
    public void onMapClick(final LatLng latLng) {
        MarkerOptions marker = new MarkerOptions()
                .position(latLng);
        map.addMarker(marker);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View view = mainActivity.getLayoutInflater().inflate(R.layout.info_window, null);

        final TextView textView = (TextView) view.findViewById(R.id.infoWindowTextView);


        textView.setText(dataHandler.getTotalLog());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setWidth(50);
                textView.setTextColor(Color.CYAN);
            }
        });
        return view;

    }
}

package se.beamonpeople.anslagstavla;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapController implements GoogleMap.OnMapClickListener, GoogleMap.InfoWindowAdapter {

    private final GoogleMap map;
    private final Activity mainActivity;

    public MapController(GoogleMap mMap, Activity mainActivity) {
        this.map = mMap;
        map.setOnMapClickListener(this);
        map.setInfoWindowAdapter(this);
        this.mainActivity = mainActivity;
    }

    @Override
    public void onMapClick(final LatLng latLng) {
        MarkerOptions marker = new MarkerOptions()
                .position(latLng)
                .title("Ny");
        map.addMarker(marker);
        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                return false;
            }

        });
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View view = mainActivity.getLayoutInflater().inflate(R.layout.info_window, null);

        final EditText editText = (EditText) view.findViewById(R.id.infoWindowEditText);

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("Namn");
                editText.setWidth(50);
                editText.selectAll();
                editText.setTextColor(Color.CYAN);
            }
        });
        return view;


    }
}

package se.beamonpeople.anslagstavla;

import android.app.Activity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapHandler implements OnMapReadyCallback {
    private final Activity mainActivity;
    private final DataHandler dataHandler;
    private GoogleMap mMap;
    private MapController mapController;

    public MapHandler(MapsActivity mainActivity, DataHandler dataHandler) {
        this.mainActivity = mainActivity;
        this.dataHandler = dataHandler;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mapController = new MapController(mMap, mainActivity, dataHandler);

    }
}

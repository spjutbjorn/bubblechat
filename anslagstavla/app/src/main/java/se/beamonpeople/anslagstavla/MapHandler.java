package se.beamonpeople.anslagstavla;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapHandler implements OnMapReadyCallback {
    private GoogleMap mMap;
    private MapController mapController;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mapController = new MapController(mMap);

    }
}

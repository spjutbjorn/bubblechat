package se.beamonpeople.anslagstavla;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;


public class MapController implements GoogleMap.OnMapClickListener {

    private final GoogleMap map;

    public MapController(GoogleMap mMap) {
        this.map = mMap;
        map.setOnMapClickListener(this);
    }

    @Override
    public void onMapClick(final LatLng latLng) {

    }
}

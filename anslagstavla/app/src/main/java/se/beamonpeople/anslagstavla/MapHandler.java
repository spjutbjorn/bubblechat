package se.beamonpeople.anslagstavla;

import android.app.Activity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapHandler implements OnMapReadyCallback {
    public static final LatLng MARIA_TORGET = new LatLng(59.3187082,
            18.0611976);
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


        CameraUpdate center=
                CameraUpdateFactory.newLatLng(MARIA_TORGET);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(15);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);
    }
}

package baidumapsdk.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BaiduMapOptions;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * Main Activity for Baidu Map View
 */
public class MainActivity extends Activity {

    MapView mMapView = null ;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super . onCreate ( savedInstanceState ) ;
        // Before using the SDK each component initialization context information, passing the ApplicationContext
        // Note that this method again setContentView way to achieve before
        SDKInitializer. initialize ( getApplicationContext ( ) ) ;
        setContentView ( R. layout . activity_main ) ;
        // Get a reference to the map control
        mMapView = ( MapView ) findViewById ( R. id . bmapView ) ;
        BaiduMap mBaiduMap = mMapView. getMap() ;

// ordinary map
       // mBaiduMap. SetMapType ( BaiduMap. MAP_TYPE_NORMAL ) ;

// satellite map
        mBaiduMap. setMapType ( BaiduMap. MAP_TYPE_SATELLITE ); ;
    }
    @Override
    protected void onDestroy ( ) {
        super . onDestroy ( ) ;
        // executed when the activity execution onDestroy mMapView.onDestroy (), to achieve the map lifecycle management
        mMapView. onDestroy ( ) ;
    }
    @Override
    protected void onResume ( ) {
        super . onResume ( ) ;
        // executed when the activity execution onResume mMapView onResume (), map to achieve life-cycle management.
        mMapView. onResume ( ) ;
    }
    @Override
    protected void onPause ( ) {
        super . onPause ( ) ;
        // executed when the activity execution onPause mMapView onPause (), map to achieve life-cycle management.
        mMapView. onPause ( ) ;
    }
}

package budasuyasa.android.simplecrud;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Main application file
 */
public class CrudApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}

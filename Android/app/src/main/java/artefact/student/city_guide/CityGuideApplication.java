package artefact.student.city_guide;

import android.app.Application;

import com.blongho.country_data.World;

public class CityGuideApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize the World library
        World.init(this);
    }
}

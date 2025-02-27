package ch.epfl.sweng.project.weather;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

import ch.epfl.sweng.project.R;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class WeatherModule {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    @interface ApiKey {
    }

    @Binds
    public abstract WeatherService bindWeatherService(OpenWeatherMapWeatherService weatherServiceImpl);

    @Provides
    @ApiKey
    public static String provideApiKey(@ApplicationContext Context context) {
        return context.getString(R.string.openweather_api_key);
    }

    @Provides
    public static RequestQueue provideRequestQueue(@ApplicationContext Context context) {
        return Volley.newRequestQueue(context);
    }
}

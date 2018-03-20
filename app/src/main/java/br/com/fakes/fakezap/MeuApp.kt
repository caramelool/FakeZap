package br.com.fakes.fakezap

import android.app.Application
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk
import com.orhanobut.hawk.NoEncryption

/**
 * Created by logonrm on 19/03/2018.
 */
class MeuApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this);
        Hawk.init(this)
                .build();
    }

}
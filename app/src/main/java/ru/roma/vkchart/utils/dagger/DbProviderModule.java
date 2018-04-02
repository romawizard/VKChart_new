package ru.roma.vkchart.utils.dagger;

import dagger.Module;
import dagger.Provides;
import ru.roma.vkchart.data.data_base.DataBaseWorker;
import ru.roma.vkchart.domain.providers.ApiProvider;
import ru.roma.vkchart.domain.providers.DbProvider;

/**
 * Created by Ilan on 26.03.2018.
 */

@Module
public class DbProviderModule {

    @Provides
//    @Naned("DB")
    DbProvider provideDbWorker(){
        return new DataBaseWorker();
    }
}

package com.englishtown.vertx.promises.guice;

import com.englishtown.promises.guice.WhenBinder;
import com.englishtown.vertx.promises.WhenContainer;
import com.englishtown.vertx.promises.WhenEventBus;
import com.englishtown.vertx.promises.WhenHttpClient;
import com.englishtown.vertx.promises.WhenPlatformManager;
import com.englishtown.vertx.promises.impl.*;
import com.google.inject.AbstractModule;
import com.google.inject.util.Modules;

/**
 * Guice vertx-mod-when binder
 */
public class GuiceWhenBinder extends AbstractModule {
    /**
     * Configures a {@link com.google.inject.Binder} via the exposed methods.
     */
    @Override
    protected void configure() {

        install(Modules.override(new WhenBinder()).with(new OverridesGuiceWhenBinder()));

//        bind(WhenPlatformManager.class).to(DefaultWhenPlatformManager.class);
        bind(WhenContainer.class).to(DefaultWhenContainer.class);
        bind(WhenEventBus.class).to(DefaultWhenEventBus.class);
        bind(WhenHttpClient.class).to(DefaultWhenHttpClient.class);

    }
}

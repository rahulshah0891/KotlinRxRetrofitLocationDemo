package com.kotlinrxdemo.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kotlinrxdemo.autovalue.AutoValueAdapterFactory;

import java.lang.reflect.Modifier;


public class AppGSonBuilder {

  public static Gson getInternal() {

    return new GsonBuilder().excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT,
                                                        Modifier.STATIC).serializeNulls().create();
  }

  public static Gson getExternal() {

    return new GsonBuilder().excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT,
                                                        Modifier.STATIC, Modifier.VOLATILE).serializeNulls().create();
  }

  public static Gson getAutoValueGson() {
    return new GsonBuilder().registerTypeAdapterFactory(new AutoValueAdapterFactory())
        .serializeNulls()
        .create();
  }
}

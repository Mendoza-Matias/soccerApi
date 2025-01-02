package com.mmendoza.soccerApi.services;

public abstract class GenericService<T, Y> {

    public abstract Y service(T request);

    public Y call(T request) { /* the method that calls the service implementation. */
        return service(request);
    }
}

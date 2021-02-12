package de.patrickmetz.hello_world_service.view;

public interface HelloWorldViewIF<T> {
    T greeting(String content);
}

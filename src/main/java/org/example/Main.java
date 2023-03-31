package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(8181)
                .addService(new HelloServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }
}
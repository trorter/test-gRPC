package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(8181)
                .addService(new HelloServiceImpl())
                .addService(ProtoReflectionService.newInstance())
                .build();

        server.start();
        server.awaitTermination();
    }
}
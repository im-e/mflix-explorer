package org.sparta.tech259.finalproject;


import org.bson.types.ObjectId;
import org.sparta.tech259.finalproject.model.repositories.CommentRepository;
import org.sparta.tech259.finalproject.service.CommentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(FinalProjectApplication.class, args);

    }


}

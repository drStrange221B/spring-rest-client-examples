package com.emrys.rest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.emrys.rest.config.domain.Name;
import com.emrys.rest.config.domain.User;
import com.emrys.rest.config.domain.UserData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

@Component
public class Bootstrap implements CommandLineRunner {
    private static FileWriter file;


    @Override
    public void run(String... args) throws Exception {

        Name name = new Name();
        name.setFirst("Rojaya");
        name.setLast("Maharjan");
        name.setTitle("Developer");

        User user = new User();
        user.setCurrency("Dollar");
        user.setEmail("emrys@gmail.com");
        user.setGender("Male");
        user.setName(name);

        Name name1 = new Name();
        name1.setFirst("Rojaya 1");
        name1.setLast("Maharjan 1");
        name1.setTitle("Developer 1");

        User user1 = new User();
        user1.setCurrency("Dollar");
        user1.setEmail("emrys@gmail.com");
        user1.setGender("Male");
        user1.setName(name1);


        Name name2 = new Name();
        name2.setFirst("Rojaya 2");
        name2.setLast("Maharjan 2");
        name2.setTitle("Developer");

        User user2 = new User();
        user2.setCurrency("Dollar");
        user2.setEmail("emrys@gmail.com");
        user2.setGender("Male");
        user2.setName(name2);


        Name name3 = new Name();
        name3.setFirst("Rojaya 3");
        name3.setLast("Maharjan");
        name3.setTitle("Developer");

        User user3 = new User();
        user3.setCurrency("Dollar");
        user3.setEmail("emrys@gmail.com");
        user3.setGender("Male");
        user3.setName(name3);

        UserData userData = new UserData();

        userData.setData(Arrays.asList(user1,user2,user3));

        ObjectMapper mapper = new ObjectMapper();
        String s = System.getProperty("user.dir");
        System.out.println(s);
        mapper.writeValue(new File( s + "/src/main/resources/sample1.json"),userData);

        String jsonString = mapper.writeValueAsString(userData);

        Resource resource = new ClassPathResource("sample.json");
        System.out.println("###################");
        System.out.println(resource.getURI().toString());

        System.out.println(jsonString);

        try(FileWriter fileWriter = new FileWriter(s+"/src/main/resources/users.txt")){

            fileWriter.write(jsonString);
        }catch(IOException e)
        {
            e.printStackTrace();
        }






    }
}

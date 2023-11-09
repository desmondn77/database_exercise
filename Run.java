package com.example.springdatajpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Run implements CommandLineRunner {
    int bl;
    @Autowired
    Bankserv bankSer;
    @Override
    public void run(String... args) throws Exception {
        BankUser user=new BankUser();
        user.setId(4L);
        user.setFirstname("Hamed");
        user.setLastname("Torabi");
        user.birthDate("1377/6/23");
        user.shabaNumber("IR120000000000" + user.setId(4L));
        user.balance(int bl = 20000);
        bankSer.save(user);
    }
}

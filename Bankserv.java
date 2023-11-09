package com.example.springdatajpa1;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bankserv extends  BankUser{
    @Autowired
    BankUserRepository bankuserRepository;
    @Transactional
    public void save(BankUser user){
        employeeRepository.save(user);
    }
}

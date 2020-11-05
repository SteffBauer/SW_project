package de.othr.sw.bank.service;

import de.othr.sw.bank.entity.Account;
import de.othr.sw.bank.entity.Session;
import de.othr.sw.bank.entity.SessionRequest;
import de.othr.sw.bank.entity.TransferRequest;
import de.othr.sw.bank.repo.AccountRepository;
import de.othr.sw.bank.repo.AddressRepository;
import de.othr.sw.bank.repo.CustomerRepository;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("api/banking")
public class BankingService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AccountRepository accountRepository;


    @GetMapping("/account")
    public ResponseEntity<Double> getAccountValue(@RequestBody UUID sessionUuid){
        throw new NotYetImplementedException();
    }

    @PutMapping("/account/transfer")
    public ResponseEntity<Double> getAccountValue(@RequestBody TransferRequest transferRequest){
        throw new NotYetImplementedException();
    }
}

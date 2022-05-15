package com.project.transaction;

import com.project.transaction.jpa.TxnRepository;
import com.project.transaction.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

@Controller
public class UserController {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TxnRepository txnrepo;

    @RequestMapping(value = "/add", method = RequestMethod.GET)// Map ONLY POST Requests
    @ResponseBody
    public String addNewUser() throws Exception {

        String firstname = "xxx";
        String lastname = "lll";
        String email = "45r67t8@rtygu.com";
        String amount = "10";
        String type = "Prateek's Test";

        System.out.println("In POST Method");

        User n = new User();
        n.setFirst_Name(firstname);
        n.setLast_Name(lastname);
        n.setEmail(email + "@mail.com");
        n.setCreated_At(LocalDateTime.now());
        n.setUpdated_At(LocalDateTime.now());
        repo.save(n);

        System.out.println("Data populated in User");

        Transactions val = new Transactions();
        val.setAmount(amount);
        val.setType(type);
        val.setCreatedAt(LocalDateTime.now());
        val.setUpdatedAt(LocalDateTime.now());
        txnrepo.save(val);

        System.out.println("Data populated in Transactions");

        return type + " txn. posted";
    }

    @GetMapping(path = "/users")
    public @ResponseBody
    Iterable<User> getAllUsers(Model model) {
        // This returns a JSON or XML with the users
        return repo.findAll();
    }

    @GetMapping(path = "/userTxns")
    public @ResponseBody
    Iterable<Transactions> getAllUserTxns(Model model) {
        // This returns a JSON or XML with the users
        return txnrepo.findAll();
    }
}

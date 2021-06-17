package com.project.transaction;

import javax.persistence.*;

@Entity
@Table(name = "user_data")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String First_Name;
    @Column
    private String Last_Name;
    @Column
    private String Email;

    //    @Column(columnDefinition = "VARCHAR(100) GENERATED ALWAYS AS (CONCAT(First_Name,' ',Last_Name))")
//    private String Full_Name;

    @Column(columnDefinition = "DATETIME DEFAULT")
    private String Created_At;

    @Column(columnDefinition = "DATETIME DEFAULT")
    private String Updated_At;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

//    public String getFull_Name() {
//        return Full_Name;
//    }
//
//    public void setFull_Name(String full_Name) {
//        Full_Name = full_Name;
//    }

    public String getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(String created_At) {
        Created_At = created_At;
    }

    public String getUpdated_At() {
        return Updated_At;
    }

    public void setUpdated_At(String updated_At) {
        Updated_At = updated_At;
    }


    //    @OneToOne(mappedBy = "user_id", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn

//    public Transactions getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(Transactions transactions) {
//        this.transactions = transactions;
//    }
//
//    @OneToOne(mappedBy = "user")
//    private Transactions transactions;
}

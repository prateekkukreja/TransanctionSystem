package com.project.transaction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "transactions")
public class Transactions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer user_id;


    @Column(columnDefinition = "DATETIME DEFAULT")
    private String Created_At;

    @Column(columnDefinition = "DATETIME DEFAULT")
    private String Updated_At;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;

    @Column
    private String amount;

    @Column
    private String type;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

}

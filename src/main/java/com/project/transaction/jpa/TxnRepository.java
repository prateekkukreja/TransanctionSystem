package com.project.transaction.jpa;

import com.project.transaction.Transactions;
import com.project.transaction.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxnRepository extends JpaRepository<Transactions, Integer> {
}

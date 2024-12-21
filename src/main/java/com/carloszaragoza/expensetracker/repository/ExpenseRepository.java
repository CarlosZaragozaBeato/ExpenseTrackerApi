package com.carloszaragoza.expensetracker.repository;


import com.carloszaragoza.expensetracker.entity.Expense;
import com.carloszaragoza.expensetracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUserAndDateBetween(User user, Date startDate, Date endDate);
}



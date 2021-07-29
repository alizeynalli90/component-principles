package az.alizeynalli.cashflow.service;

import az.alizeynalli.cashflow.database.entity.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> getAll();

    Expense get(Long id);

    Expense create(Expense entity);

    Expense save(Expense entity);

    void delete(Long id);
}

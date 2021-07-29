package az.alizeynalli.cashflow.service.impl;

import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.database.repository.ExpenseRepository;
import az.alizeynalli.cashflow.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepository repository;

    @Override
    public List<Expense> getAll() {
        return repository.findAll();
    }

    @Override
    public Expense get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Expense create(Expense entity) {
        return repository.save(entity);
    }

    @Override
    public Expense save(Expense entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

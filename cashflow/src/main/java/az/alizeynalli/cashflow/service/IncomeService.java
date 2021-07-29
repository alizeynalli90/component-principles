package az.alizeynalli.cashflow.service;

import az.alizeynalli.cashflow.database.entity.Income;

import java.util.List;

public interface IncomeService {

    List<Income> getAll();

    Income get(Long id);

    Income create(Income entity);

    Income save(Income entity);

    void delete(Long id);
}

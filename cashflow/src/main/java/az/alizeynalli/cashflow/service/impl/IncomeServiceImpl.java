package az.alizeynalli.cashflow.service.impl;

import az.alizeynalli.cashflow.database.entity.Income;
import az.alizeynalli.cashflow.database.repository.IncomeRepository;
import az.alizeynalli.cashflow.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    IncomeRepository repository;

    @Override
    public List<Income> getAll() {
        return repository.findAll();
    }

    @Override
    public Income get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Income create(Income income) {
        return repository.save(income);
    }

    @Override
    public Income save(Income income) {
        return repository.save(income);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}

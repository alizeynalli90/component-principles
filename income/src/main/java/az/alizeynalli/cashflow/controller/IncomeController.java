package az.alizeynalli.cashflow.controller;


import az.alizeynalli.cashflow.database.entity.Income;
import az.alizeynalli.cashflow.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cashflow")
public class IncomeController {

    @Autowired
    IncomeService service;

    @GetMapping("/incomes")
    public List<Income> getIncomes() { return service.getAll(); }

    @GetMapping("/income/{id}")
    public Income getIncome(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @PostMapping("/income")
    public Income createIncome(@RequestBody Income income) {
        return service.create(income);
    }

    @PutMapping("/income")
    public Income saveIncome(@RequestBody Income income) {
        return service.save(income);
    }

    @DeleteMapping("/income/{id}")
    public void deleteIncome(@PathVariable("id") Long id) {
        service.delete(id);
    }

}

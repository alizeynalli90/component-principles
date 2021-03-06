package az.alizeynalli.cashflow.controller;

import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cashflow")
public class ExpenseController {

    @Autowired
    ExpenseService service;

    @GetMapping("/expenses")
    public List<Expense> getExpenses() { return service.getAll(); }

    @GetMapping("/expense/{id}")
    public Expense getExpense(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @DeleteMapping("/expense/{id}")
    public void deleteExpense(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @PostMapping("/expense")
    public Expense createExpense(@RequestBody Expense expense) {
        return service.create(expense);
    }

    @PutMapping("/expense")
    public Expense saveExpense(@RequestBody Expense expense) {
        return service.save(expense);
    }

}

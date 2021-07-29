package az.alizeynalli.cashflow.database.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "expense")
public class Expense {

    private long id;
    private String description;
    private Date dueDate;
    private BigDecimal amount;

    public Expense() {
    }

    public Expense(long id, String description,Date dueDate, BigDecimal amount) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.amount = amount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "due_date", nullable = false)
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Column(name = "amount", nullable = false)
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

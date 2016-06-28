package model.hibernate.dao;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Дмитрий on 28.06.2016.
 */
@Entity
@Table(name = "transactions", schema = "", catalog = "manager")
public class TransactionsEntity {
    private int idTransaction;
    private int idAccount;
    private int type;
    private double amount;
    private Date transactionDate;
    private String comment;

    @Id
    @Column(name = "idTransaction")
    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    @Basic
    @Column(name = "idAccount")
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "Type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Amount")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "transactionDate")
    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Basic
    @Column(name = "Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionsEntity that = (TransactionsEntity) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (idAccount != that.idAccount) return false;
        if (idTransaction != that.idTransaction) return false;
        if (type != that.type) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idTransaction;
        result = 31 * result + idAccount;
        result = 31 * result + type;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}

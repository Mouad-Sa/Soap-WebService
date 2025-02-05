package ws;

import java.util.Date;

public class Account {
    private int code;
    private Date creationDate;
    private double solde;

    public Account() {
    }

    public Account(int code ,Date creationDate, double solde) {
        this.creationDate = creationDate;
        this.code = code;
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}

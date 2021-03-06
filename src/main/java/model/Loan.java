package model;

import java.time.LocalDate;
import java.util.UUID;

public class Loan {
    private final UUID id;
    private final long requestedAmount;
    private final int dti;
    private final int creditScore;
    private final long savings;
    private Qualification qualification;
    private long loanAmount;
    private LoanStatus status;
    private LocalDate approvedDate;

    public Loan(long requestedAmount, int dti, int creditScore, long savings) {
        this.id = UUID.randomUUID();
        this.requestedAmount = requestedAmount;
        this.dti = dti;
        this.creditScore = creditScore;
        this.savings = savings;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public long getRequestedAmount() {
        return requestedAmount;
    }

    public int getDti() {
        return dti;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public long getSavings() {
        return savings;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(LocalDate approvedDate) {
        this.approvedDate = approvedDate;
    }
}

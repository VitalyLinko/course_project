package bookmodel;

import usermodel.User;

import java.time.LocalDate;

public abstract class PrintedProduct {

    private String productName;
    private LocalDate productTakenDate;
    private LocalDate productReturnDate;
    private LocalDate productReturnedDate;
    private User productUserStatus;
    private boolean availableStatus;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getProductTakenDate() {
        return productTakenDate;
    }

    public void setProductTakenDate(LocalDate productTakenDate) {
        this.productTakenDate = productTakenDate;
    }

    public boolean getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(boolean availableStatus) {
        this.availableStatus = availableStatus;
    }

    public LocalDate getProductReturnDate() {
        return productReturnDate;
    }

    public void setProductReturnDate(LocalDate productReturnDate) {
        this.productReturnDate = productReturnDate;
    }

    public LocalDate getProductReturnedDate() {
        return productReturnedDate;
    }

    public void setProductReturnedDate(LocalDate productReturnedDate) {
        this.productReturnedDate = productReturnedDate;
    }

    public User getProductUserStatus() {
        return productUserStatus;
    }

    public void setProductUserStatus(User productUserStatus) {
        this.productUserStatus = productUserStatus;
    }

    @Override
    public String toString() {
        return "productName=" + productName + '\n' +
                "availableStatus (is taken)=" + availableStatus;
    }
}

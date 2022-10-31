package bookmodel;

import java.time.LocalDate;

public abstract class PrintedProduct{

    private String productName;
    private LocalDate productReturnDate;
    private boolean availableStatus;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getProductReturnDate() {
        return productReturnDate;
    }

    public void setProductReturnDate(LocalDate productReturnDate) {
        this.productReturnDate = productReturnDate;
    }

    public boolean getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(boolean availableStatus) {
        this.availableStatus = availableStatus;
    }

    @Override
    public String toString() {
        return "productName=" + productName + '\n' +
                "productReturnDate=" + productReturnDate + '\n' +
                "availableStatus (is taken)=" + availableStatus;
    }
}

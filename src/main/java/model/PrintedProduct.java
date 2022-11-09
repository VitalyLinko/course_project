package model;

import java.time.LocalDate;

public abstract class PrintedProduct {

    private int bookID;
    private String name;
    private LocalDate returnDate;
    private boolean availableStatus;

    private static int counter = 0;

    public PrintedProduct(String name) {
        this.bookID = ++counter;
        this.name = name;
        this.returnDate = null;
        this.availableStatus = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(boolean availableStatus) {
        this.availableStatus = availableStatus;
    }

    @Override
    public String toString() {
        return "PrintedProduct{" +
                "bookID=" + bookID +
                ", name='" + name + '\'' +
                ", returnDate=" + returnDate +
                ", availableStatus=" + availableStatus +
                '}';
    }
}

package bookmodel;

import usermodel.User;

import java.time.LocalDate;

public class HistoryToken {

    private LocalDate takenDate;
    private LocalDate returnedDate;
    private User user;

    public HistoryToken(LocalDate takenDate, LocalDate returnedDate, User user) {
        this.takenDate = takenDate;
        this.returnedDate = returnedDate;
        this.user = user;
    }

    public LocalDate getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(LocalDate takenDate) {
        this.takenDate = takenDate;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(LocalDate returnedDate) {
        this.returnedDate = returnedDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "HistoryToken{" +
                "takenDate=" + takenDate +
                ", returnedDate=" + returnedDate +
                ", user=" + user +
                '}';
    }
}

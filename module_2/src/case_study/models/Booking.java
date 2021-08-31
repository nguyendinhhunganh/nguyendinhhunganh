package case_study.models;

public class Booking {
    private int bookingCode;
    private String firstDay;
    private String lastDay;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(int bookingCode, String firstDay, String lastDay, Customer customer, Facility facility) {
        this.bookingCode = bookingCode;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.customer = customer;
        this.facility = facility;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", firstDay='" + firstDay + '\'' +
                ", lastDay='" + lastDay + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}

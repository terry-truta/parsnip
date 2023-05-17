package org.parsnip.data.model.flight;

@Entity
@Table(name = "flight")
class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "flight_date")
    private String flightDate;

    @Column(name = "flight_time")
    private String flightTime;

    @Column(name = "from_airport_code")
    private String fromAirportCode;

    @Column(name = "to_airport_code")
    private String toAirportCode;

    @Column(name = "tail_number")
    private String tailNumber;

    @Column(name = "requested_aircraft_size")
    private String requestedAircraftSize;

    @Column(name = "actual_aircraft_size")
    private String actualAircraftSize;

    @Column(name = "estimated_flight_hours")
    private double estimatedFlightHours;

    @Column(name = "estimated_billed_hours")
    private double estimatedBilledHours;

    @Column(name = "actual_flight_hours")
    private double actualFlightHours;

    @Column(name = "actual_billed_hours")
    private double actualBilledHours;

    @OneToMany(mappedBy = "flight")
    private List<FlightBilling> flightBillings = new ArrayList<>();

    // Constructors, getters, and setters


    public Flight(int id, String flightDate, String flightTime, String fromAirportCode, String toAirportCode, String tailNumber, String requestedAircraftSize, String actualAircraftSize, double estimatedFlightHours, double estimatedBilledHours, double actualFlightHours, double actualBilledHours, List<FlightBilling> flightBillings) {
        this.id = id;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.fromAirportCode = fromAirportCode;
        this.toAirportCode = toAirportCode;
        this.tailNumber = tailNumber;
        this.requestedAircraftSize = requestedAircraftSize;
        this.actualAircraftSize = actualAircraftSize;
        this.estimatedFlightHours = estimatedFlightHours;
        this.estimatedBilledHours = estimatedBilledHours;
        this.actualFlightHours = actualFlightHours;
        this.actualBilledHours = actualBilledHours;
        this.flightBillings = flightBillings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getFromAirportCode() {
        return fromAirportCode;
    }

    public void setFromAirportCode(String fromAirportCode) {
        this.fromAirportCode = fromAirportCode;
    }

    public String getToAirportCode() {
        return toAirportCode;
    }

    public void setToAirportCode(String toAirportCode) {
        this.toAirportCode = toAirportCode;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getRequestedAircraftSize() {
        return requestedAircraftSize;
    }

    public void setRequestedAircraftSize(String requestedAircraftSize) {
        this.requestedAircraftSize = requestedAircraftSize;
    }

    public String getActualAircraftSize() {
        return actualAircraftSize;
    }

    public void setActualAircraftSize(String actualAircraftSize) {
        this.actualAircraftSize = actualAircraftSize;
    }

    public double getEstimatedFlightHours() {
        return estimatedFlightHours;
    }

    public void setEstimatedFlightHours(double estimatedFlightHours) {
        this.estimatedFlightHours = estimatedFlightHours;
    }

    public double getEstimatedBilledHours() {
        return estimatedBilledHours;
    }

    public void setEstimatedBilledHours(double estimatedBilledHours) {
        this.estimatedBilledHours = estimatedBilledHours;
    }

    public double getActualFlightHours() {
        return actualFlightHours;
    }

    public void setActualFlightHours(double actualFlightHours) {
        this.actualFlightHours = actualFlightHours;
    }

    public double getActualBilledHours() {
        return actualBilledHours;
    }

    public void setActualBilledHours(double actualBilledHours) {
        this.actualBilledHours = actualBilledHours;
    }

    public List<FlightBilling> getFlightBillings() {
        return flightBillings;
    }

    public void setFlightBillings(List<FlightBilling> flightBillings) {
        this.flightBillings = flightBillings;
    }
}
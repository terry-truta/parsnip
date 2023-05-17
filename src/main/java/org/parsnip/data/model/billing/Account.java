package org.parsnip.data.model.billing;

@Entity
@Table(name = "jetcard")
class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "beginning_balance")
    private double beginningBalance;

    private String size;

    @OneToMany(mappedBy = "jetCard")
    private List<FlightBilling> flightBillings = new ArrayList<>();

    // Constructors, getters, and setters

    public double getCurrentBalance() {
        double totalBilledHours = flightBillings.stream()
                .mapToDouble(FlightBilling::getActualBilledHours)
                .sum();
        return beginningBalance - totalBilledHours;
    }
}

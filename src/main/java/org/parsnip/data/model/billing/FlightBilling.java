package org.parsnip.model.data.billing;

@Entity
@Table(name = "flight_billing")
class FlightBilling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "jetcard_id")
    private JetCard jetCard;

    // Constructors, getters, and setters

    public double getActualBilledHours() {
        return flight.getActualBilledHours();
    }
}
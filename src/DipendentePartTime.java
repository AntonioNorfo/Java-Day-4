public class DipendentePartTime extends Dipendente {
    private double tariffaOraria;
    private int oreLavorate;

    public DipendentePartTime(String matricola, String dipartimento, double tariffaOraria, int oreLavorate) {
        super(matricola, dipartimento);
        this.tariffaOraria = tariffaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {

        return tariffaOraria * oreLavorate;
    }
}

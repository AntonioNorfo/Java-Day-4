public class Dirigente extends Dipendente {
    private double stipendioBase;
    private double bonus;

    public Dirigente(String matricola, String dipartimento, double stipendioBase, double bonus) {
        super(matricola, dipartimento);
        this.stipendioBase = stipendioBase;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return stipendioBase + bonus;
    }
}

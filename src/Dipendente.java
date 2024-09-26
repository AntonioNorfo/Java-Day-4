public abstract class Dipendente {
    private String matricola;
    private String dipartimento;

    public Dipendente(String matricola, String dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    // Metodo astratto che sarà implementato dalle classi concrete

    public abstract double calculateSalary();
}

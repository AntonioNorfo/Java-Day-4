public class Main {
    public static void main(String[] args) {



        Dipendente d1 = new DipendenteFullTime("001", "Produzione", 2500.00);
        Dipendente d2 = new DipendentePartTime("002", "Vendite", 20.00, 80);
        Dipendente d3 = new Dirigente("003", "Amministrazione", 3000.00, 500.00);



        Dipendente[] dipendenti = {d1, d2, d3};



        double totaleStipendi = 0;



        for (Dipendente dip : dipendenti) {
            double stipendio = dip.calculateSalary();
            System.out.println("Matricola: " + dip.getMatricola() + ", Stipendio: " + stipendio);
            totaleStipendi += stipendio;
        }

        System.out.println("Totale stipendi: " + totaleStipendi);
    }
}

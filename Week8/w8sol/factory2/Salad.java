public class Salad extends Food {

    public Salad() {
        super("Salad", 300);
    }

    @Override
    public String eat() {
        return "bite crunch crunch crunch";
    }
}

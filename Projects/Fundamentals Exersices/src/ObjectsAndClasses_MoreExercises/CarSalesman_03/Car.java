package ObjectsAndClasses_MoreExercises.CarSalesman_03;

public class Car {


    public String getColor() {
        return this.color;
    }

    public String getWeight() {
        return this.weight;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public String getModel() {
        return this.model;
    }

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    private String model;
    private Engine engine;
    private String weight;
    private String color;

    @Override
    public String toString() {
        return this.model + ":" +"\n"+ String.format("%s" +
                "  Weight: %s%n" +
                "  Color: %s",this.engine,this.weight,this.color);
    }
}
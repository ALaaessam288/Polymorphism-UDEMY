class Mitsubishi extends Car {


    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);

    }
}
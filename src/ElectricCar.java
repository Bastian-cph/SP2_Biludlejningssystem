public class ElectricCar extends ACar{
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }
    public int getWhPrKm()
    {
    return (getBatteryCapacity() *1000) / getMaxRange();
    }
    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public int getMaxRange()
    {
        return maxRange;
    }

    @Override
    public int getRegistrationFee()
    {

        int kmPrLitre = Math.round(100 / (getWhPrKm() / 91.25f));
        int fee = 0;
        if (kmPrLitre >= 20 && kmPrLitre < 50)
        {
            fee = 330;
        }
        else if (kmPrLitre >= 15 && kmPrLitre < 20)
        {
            fee = 1050;
        } else if (kmPrLitre >=10 && kmPrLitre <15)
        {
        return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <10) {
            fee = 5500;
        }
        else
        {
            fee = 10470;
        }
        return fee;
    }



    @Override
    public String toString() {
        String str = super.toString();

        str += "Get wh pr km = " + getWhPrKm() +
                "\n Battery capacity = " + batteryCapacity +
                "\n Max range = " + maxRange +
                "\n Registration fee = " + getRegistrationFee() + "\n";
        return str;
    }
}

package advancedFeattures;

public class MainEnums {

    public static void enumEx(){
        System.out.println(Enums.Planet.JUPITER);
    }

        public String toString(){
        return Enums.Planet.JUPITER.sizePlanet() + " " + super.toString();
    }
    public static void main(String[] args) {
        enumEx();
        Enums.Planet.JUPITER.distanceFromEarth();
        System.out.println("Distance from Jupiter to Earth is: " + Enums.Planet.JUPITER.distanceFromEarth() + " km");
        System.out.println(Enums.Planet.SATURN.distanceFromEarth());
        System.out.println("The size of Planet Saturn is: " + Enums.Planet.SATURN.sizePlanet());
        System.out.println(Enums.Planet.EARTH.sizePlanet());

        System.out.println(Enums.Cars.BMW.raportPrice());
        System.out.println(Enums.Cars.DACIA.compareCars());
    }

}

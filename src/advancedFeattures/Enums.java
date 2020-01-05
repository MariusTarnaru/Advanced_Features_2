package advancedFeattures;

public class Enums {


    public enum Planet {
        EARTH(149597890, "SMALL"),
        SATURN(1426725400, "medium"),
        JUPITER(778412010, "large");

        private final int distance;
        private final String size;

        Planet(int distance, String size) {
            this.distance = distance;
            this.size = size;
        }

        public double distanceFromEarth() {
            return distance - Planet.EARTH.distance;
        }

        public String sizePlanet() {
            return size;
        }
    }

        public enum Cars {

        DACIA(1, "Romania"),
        BMW(5.6, "Germany"),
        Citroen(3.5, "France");

        private final double orderPrice;
        private final String country;

        Cars(double orderPrice, String country) {
            this.orderPrice = orderPrice;
            this.country = country;
        }

        public double raportPrice() {
            return (orderPrice - DACIA.orderPrice) * 10;
        }

        public double compareCars() {
           return compareTo(Citroen);

        }


    }

}

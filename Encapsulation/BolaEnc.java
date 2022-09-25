package Array;

public class BolaEnc {
        private double radius;

        BolaEnc(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double showDiameter(){
            return radius;
        }

        public double showLuasPermukaan(){
            return 4 * Math.PI * radius * radius;
        }


        public double showVolume(){
            return 4 * Math.PI * radius * radius * radius / 3;
        }
    }

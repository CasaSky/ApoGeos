package com.team6.haw.apogeos.Entitäten;


/**
 * Position Class
 */
public class Position {


        private double longitude;
        private double latitude;
        private String positionName;


        public Position(double longitude, double latitude, String positionName) {

            this.longitude = longitude;
            this.latitude = latitude;
            this.positionName = positionName;
        }

        @Override
        public String toString() {
            return "Position{" +
                    "positionName='" + positionName + '\'' +
                    "lontitude='" + longitude + '\'' +
                    "latitude='" + latitude + '\'' +
                    '}';
        }

/*        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SeriennummerTyp)) return false;

            SeriennummerTyp that = (SeriennummerTyp) o;

            return nummer.equals(that.nummer);

        }*/

/*        @Override
        public int hashCode() {
            return nummer.hashCode();
        }*/

        public double getLongitude() {

            return longitude;
        }

        public double getLatitude() {

            return latitude;
        }

        public String getPositionName() {

            return positionName;
        }


}



package fr.ensim.tp2.model;

import java.util.Date;

// Utilisation de https://json2csharp.com/json-to-pojo pour générer la structure
public class InstantMeasurePojo {
    // Les classes internes doivent etre statiques
    public static class Station {
        @Override
        public String toString() {
            return "Station [city=" + city + ", elevation=" + elevation + ", latitude=" + latitude + ", longitude="
                    + longitude + ", name=" + name + ", uuid=" + uuid + "]";
        }

        private String name;
        private String uuid;
        private double latitude;
        private double longitude;
        private double elevation;
        private String city;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getElevation() {
            return elevation;
        }

        public void setElevation(double elevation) {
            this.elevation = elevation;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static class Temperature extends ObservationMeasure {
    }

    public static class Rainfall extends ObservationMeasure {
    }

    public static class AtmosphericPressure extends ObservationMeasure {
    }

    public static class GlobalRadiation extends ObservationMeasure {
    }

    public static class Wind10m extends ObservationMeasure {
    }

    public static class WindDirection extends ObservationMeasure {
    }

    public static class Windgust10m extends ObservationMeasure {
    }

    public static class Humidity extends ObservationMeasure {
    }

    public static class InsolationTime extends ObservationMeasure {
    }

    public static class Evapotranspiration extends ObservationMeasure {
    }

    public static class WindS extends ObservationMeasure {
    }

    public static class WindgustS extends ObservationMeasure {
    }

    public static class WindDirectionS extends ObservationMeasure {
    }

    public static class OutsideTemperature extends ObservationMeasure {
    }

    public static class Barometer extends ObservationMeasure {
    }

    public static class SolarRadiation extends ObservationMeasure {
    }

    public static class OutsideHumidity extends ObservationMeasure {
    }

    public static class WindSpeed extends ObservationMeasure {
    }

    public static class Rainrate extends ObservationMeasure {
    }

    public static class DewPoint extends ObservationMeasure {
    }

    public static class WindChill extends ObservationMeasure {
    }

    public static class HeatIndex extends ObservationMeasure {
    }

    public static class Observation {
        @Override
        public String toString() {
            return "Observation [atmospheric_pressure=" + atmospheric_pressure + ", barometer=" + barometer
                    + ", dew_point=" + dew_point + ", evapotranspiration=" + evapotranspiration + ", global_radiation="
                    + global_radiation + ", heat_index=" + heat_index + ", humidity=" + humidity + ", insolation_time="
                    + insolation_time + ", outside_humidity=" + outside_humidity + ", outside_temperature="
                    + outside_temperature + ", rainfall=" + rainfall + ", rainrate=" + rainrate + ", solar_radiation="
                    + solar_radiation + ", temperature=" + temperature + ", time=" + time + ", wind_10m=" + wind_10m
                    + ", wind_chill=" + wind_chill + ", wind_direction=" + wind_direction + ", wind_direction_s="
                    + wind_direction_s + ", wind_s=" + wind_s + ", wind_speed=" + wind_speed + ", windgust_10m="
                    + windgust_10m + ", windgust_s=" + windgust_s + "]";
        }

        private Date time;
        private Temperature temperature;
        private Rainfall rainfall;
        private AtmosphericPressure atmospheric_pressure;
        private GlobalRadiation global_radiation;
        private Wind10m wind_10m;
        private WindDirection wind_direction;
        private Windgust10m windgust_10m;
        private Humidity humidity;
        private InsolationTime insolation_time;
        private Evapotranspiration evapotranspiration;
        private DewPoint dew_point;
        private WindS wind_s;
        private WindgustS windgust_s;
        private WindDirectionS wind_direction_s;
        private OutsideTemperature outside_temperature;
        private Barometer barometer;
        private SolarRadiation solar_radiation;
        private OutsideHumidity outside_humidity;
        private WindSpeed wind_speed;
        private WindChill wind_chill;
        private Rainrate rainrate;
        private HeatIndex heat_index;

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        public Temperature getTemperature() {
            return temperature;
        }

        public void setTemperature(Temperature temperature) {
            this.temperature = temperature;
        }

        public Rainfall getRainfall() {
            return rainfall;
        }

        public void setRainfall(Rainfall rainfall) {
            this.rainfall = rainfall;
        }

        public AtmosphericPressure getAtmospheric_pressure() {
            return atmospheric_pressure;
        }

        public void setAtmospheric_pressure(AtmosphericPressure atmospheric_pressure) {
            this.atmospheric_pressure = atmospheric_pressure;
        }

        public GlobalRadiation getGlobal_radiation() {
            return global_radiation;
        }

        public void setGlobal_radiation(GlobalRadiation global_radiation) {
            this.global_radiation = global_radiation;
        }

        public Wind10m getWind_10m() {
            return wind_10m;
        }

        public void setWind_10m(Wind10m wind_10m) {
            this.wind_10m = wind_10m;
        }

        public WindDirection getWind_direction() {
            return wind_direction;
        }

        public void setWind_direction(WindDirection wind_direction) {
            this.wind_direction = wind_direction;
        }

        public Windgust10m getWindgust_10m() {
            return windgust_10m;
        }

        public void setWindgust_10m(Windgust10m windgust_10m) {
            this.windgust_10m = windgust_10m;
        }

        public Humidity getHumidity() {
            return humidity;
        }

        public void setHumidity(Humidity humidity) {
            this.humidity = humidity;
        }

        public InsolationTime getInsolation_time() {
            return insolation_time;
        }

        public void setInsolation_time(InsolationTime insolation_time) {
            this.insolation_time = insolation_time;
        }

        public Evapotranspiration getEvapotranspiration() {
            return evapotranspiration;
        }

        public void setEvapotranspiration(Evapotranspiration evapotranspiration) {
            this.evapotranspiration = evapotranspiration;
        }

        public DewPoint getDew_point() {
            return dew_point;
        }

        public void setDew_point(DewPoint dew_point) {
            this.dew_point = dew_point;
        }

        public WindS getWind_s() {
            return wind_s;
        }

        public void setWind_s(WindS wind_s) {
            this.wind_s = wind_s;
        }

        public WindgustS getWindgust_s() {
            return windgust_s;
        }

        public void setWindgust_s(WindgustS windgust_s) {
            this.windgust_s = windgust_s;
        }

        public WindDirectionS getWind_direction_s() {
            return wind_direction_s;
        }

        public void setWind_direction_s(WindDirectionS wind_direction_s) {
            this.wind_direction_s = wind_direction_s;
        }

        public OutsideTemperature getOutside_temperature() {
            return outside_temperature;
        }

        public void setOutside_temperature(OutsideTemperature outside_temperature) {
            this.outside_temperature = outside_temperature;
        }

        public Barometer getBarometer() {
            return barometer;
        }

        public void setBarometer(Barometer barometer) {
            this.barometer = barometer;
        }

        public SolarRadiation getSolar_radiation() {
            return solar_radiation;
        }

        public void setSolar_radiation(SolarRadiation solar_radiation) {
            this.solar_radiation = solar_radiation;
        }

        public OutsideHumidity getOutside_humidity() {
            return outside_humidity;
        }

        public void setOutside_humidity(OutsideHumidity outside_humidity) {
            this.outside_humidity = outside_humidity;
        }

        public WindSpeed getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(WindSpeed wind_speed) {
            this.wind_speed = wind_speed;
        }

        public WindChill getWind_chill() {
            return wind_chill;
        }

        public void setWind_chill(WindChill wind_chill) {
            this.wind_chill = wind_chill;
        }

        public Rainrate getRainrate() {
            return rainrate;
        }

        public void setRainrate(Rainrate rainrate) {
            this.rainrate = rainrate;
        }

        public HeatIndex getHeat_index() {
            return heat_index;
        }

        public void setHeat_index(HeatIndex heat_index) {
            this.heat_index = heat_index;
        }
    }

    public static class InstantMeasureRoot {
        private Station station;
        private Observation observation;

        @Override
        public String toString() {
            return "InstantMeasureRoot [observation=" + observation + ", station=" + station + "]";
        }

        public Station getStation() {
            return station;
        }

        public void setStation(Station station) {
            this.station = station;
        }

        public Observation getObservation() {
            return observation;
        }

        public void setObservation(Observation observation) {
            this.observation = observation;
        }
    }

    public static class ObservationMeasure {
        private String value;
        private String name;
        private String longname;
        private String unit;
        private double resolution;
        private String new_variable;

        @Override
        public String toString() {
            return "ObservationMeasure [longname=" + longname + ", name=" + name + ", new_variable=" + new_variable
                    + ", resolution=" + resolution + ", unit=" + unit + ", value=" + value + "]";
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLongname() {
            return longname;
        }

        public void setLongname(String longname) {
            this.longname = longname;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public double getResolution() {
            return resolution;
        }

        public void setResolution(double resolution) {
            this.resolution = resolution;
        }

        public String getNew_variable() {
            return new_variable;
        }

        public void setNew_variable(String new_variable) {
            this.new_variable = new_variable;
        }
    }
}

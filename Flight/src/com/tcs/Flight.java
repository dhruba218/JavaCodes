package com.tcs;



class Flight
{
    String FlightId;
    String departure_From;
    String arrival_To;
    double duration;
    boolean Meal_available;

    double getDuration(){
        return duration;
    }
    boolean getMeal_available(){
        return Meal_available;
    }
    String getDeparture_From(){
        return departure_From;
    }
    String getArrival_To(){
        return arrival_To;
    }

    Flight( String FlightId, String departure_From, String arrival_To, double duration, boolean Meal_available){
        this.FlightId = FlightId;
        this.departure_From = departure_From;
        this.arrival_To = arrival_To;
        this.duration = duration;
        this.Meal_available = Meal_available;
    }
}


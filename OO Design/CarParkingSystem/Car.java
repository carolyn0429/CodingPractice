class Car {
	
	Permission permission;
	Time enteringTime, leavingTime;
	String carPlate;
	int number;
	private void setCarPlate(String carPlate){
		carPlate = this.carPlate
	};
	private String getCarPlate(){
		return carPlate;
	};

	private void setEnteringTime(Time enteringTime){
		enteringTime = this.enteringTime;
	}
	private Time getEnteringTime(){
		return enteringTime;
	};
	private void setLeavingTime(Time leavingTime){
		leavingTime = this.leavingTime;
	}
	private Time getLeavingTime(){
		return leavingTime;
	};

	private void setParkingSpotNumber(ParkingSpot ps){
		number = ps.getSpotNumber;
	}
	private int getParkingSpotNumber(){
		return number;
	}
}
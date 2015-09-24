class ParkingSpot{

	//instance variables
	int number;
	Permission permission;
	boolean compact, occupied;

	//constructor
	public ParkingSpot(int number, Permission permission, boolean compact){
		number = this.number;
		permission = this.permission;
		compact = this.compact;
	};

	//instance functions
	private Time getAllowedParkingTime(Permission permission){
		if (permission=="Reserved"){

		}else if (permission == "Handicapped"){

		}else if (permission == "Free"){

		}else if (permission == "Regular"){

		}else{

		}
	};
	private Time getRemainingParkingTime(Car car){
		Time enteringTime = car.getEnteringTime();
		if (car.getPermission()!=)
	};
	private boolean isOccupied(){
		return occupied; 
	};
	private boolean isCompact(){
		return compact;
	};
	private void setSpotNumer(int number){
		number = this.number;
	};
	private int getSpotNumber(){
		return number;
	};
	void setSpotPermission(Permission permission){
		if (permission.isEquals(ParkingSpot.getSpotPermission())){
			System.out.println("You are setting the same permission");
			return;
		}else{
			permission = this.permission;
		}
		
	};
	private Permission getSpotPermission(){
		return permission;
	};

}
public class Q1603_DesignParkingSystem {
    int numBig, numMedium, numSmall;
    int occupiedBig = 0, occupiedMedium = 0, occupiedSmall = 0;

    public Q1603_DesignParkingSystem(int big, int medium, int small) {
        numBig = big;
        numMedium = medium;
        numSmall = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if(occupiedBig == numBig) return false;
                else {
                    occupiedBig++;
                    return true;
                }
            case 2:
                if (occupiedMedium == numMedium) return false;
                else {
                    occupiedMedium++;
                    return true;
                }
            case 3:
                if(occupiedSmall == numSmall) return false;
                else {
                    occupiedSmall++;
                    return true;
                }
            default:
                return false;
        }
    }
}

package Gnutella;

public class Neighbor {
    String neighborID;
    String neighborIP;
    int neighborPort;

    //constructor to assign peerId,IP address,Port number from config file
    public Neighbor(String neighborID, String neighborIP, int neighborPort)
    {
        this.neighborID=neighborID;
        this.neighborIP=neighborIP;
        this.neighborPort=neighborPort;

    }
}

package space.onepantsu.chibiholder.character.status;

public class Slave extends Status{
    private Long lordsID;
    private Long price;

    /**
     * Constructors of Slave
     */
    public Slave(){
        super(10);
        setLordsID(0);
        setPrice(750);
    }
    public Slave(Long lordsID, Long chibscoins, Long price){
        super(chibscoins);
        setLordsID(lordsID);
        setPrice(price);
    }

    /**
     * ID of the Lord
     * @param mastersID
     */
    public void setLordsID(long mastersID) {
        this.lordsID = mastersID;
    }
    public Long getLordsID() {
        return lordsID;
    }

    /**
     * Price of the Slave
     * @param price
     */
    public void setPrice(long price) {
        this.price = price;
    }
    public Long getPrice() {
        return price;
    }
}

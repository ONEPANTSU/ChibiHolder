package space.onepantsu.chibiholder.character.status;

import java.util.ArrayList;

public class Lord extends Status{

    private ArrayList<Long> slavesID;
    private Long mastersID;
    private boolean mastersTrust;
    private Long debt;

    /**
     * Constructors of Lord
     */
    public Lord(){
        super(1000);
        setMastersID(0L);
        setMastersTrust(true);
        setDebt(0L);
    }
    public Lord(long chibscoins){
        super(chibscoins);
        setMastersID(0L);
        setMastersTrust(true);
        setDebt(0L);
    }

    /**
     * Id of the Master
     */
    public void setMastersID(Long mastersID) {
        this.mastersID = mastersID;
    }
    public Long getMastersID() {
        return mastersID;
    }

    /**
     * Master's Trust to the Lord
     * @param mastersTrust
     */
    public void setMastersTrust(boolean mastersTrust) {
        this.mastersTrust = mastersTrust;
    }
    public void changeMastersTrust(){
        if (debt != 0){
            setMastersTrust(false);
        }
        else{
            setMastersTrust(true);
        }
    }


    /**
     * Lord's debt to the Master
     * @param debt
     */
    public void setDebt(Long debt) {
        this.debt = debt;
    }
    public Long getDebt() {
        return debt;
    }
}

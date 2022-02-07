package space.onepantsu.chibiholder.character.status;

public class Status {
    private Long chibscoins;

    /**
     * Constructors of Status
     */
    public Status(){
        setChibscoins(0);
    }
    public Status(long chibscoins){
        setChibscoins(chibscoins);
    }

    /**
     * Chibscoins of the Chibs
     * @param chibscoins
     */
    public void setChibscoins(long chibscoins) {
        this.chibscoins = chibscoins;
    }
    public Long getChibscoins() {
        return chibscoins;
    }

}

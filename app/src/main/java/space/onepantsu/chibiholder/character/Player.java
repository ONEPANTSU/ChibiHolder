package space.onepantsu.chibiholder.character;

import space.onepantsu.chibiholder.character.status.Lord;
import space.onepantsu.chibiholder.character.status.Status;

public class Player extends Character{

    private Status status;
    private boolean heir;

    /**
     * Constructors of Player
     */
    public Player(){
        super();
        setStatus(new Lord());
        setHeir(false);
    }
    public Player(long id, String name, String surname, Sex sex){
        super(id, name, surname, sex);
        setStatus(new Lord());
        setHeir(false);
    }

    /**
     * Status (Lord/Slave) of the Chibs
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }


    /**
     * Has player heirs or not
     * @param heir
     */
    public void setHeir(boolean heir) {
        this.heir = heir;
    }

}

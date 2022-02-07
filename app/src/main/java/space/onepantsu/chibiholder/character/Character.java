package space.onepantsu.chibiholder.character;

import space.onepantsu.chibiholder.character.status.Status;

/**
 *  Class of the Chibs
 */

public class Character {

    final int MIN_LIFE = 5;
    final int MAX_LIFE = 14;

    private Long id;
    private String name;
    private String surname;
    private int life;
    private Sex sex;

    /**
     * Constructors of Chibs
     */
    public Character(){
        setName("Chibs");
        setRandomLife();
        setRandomSex();
    }

    public Character(long id, String name, String surname, Sex sex){
        setId(id);
        setName(name);
        setSurname(surname);
        setSex(sex);
        setRandomLife();
    }

    /**
     * ID of the Chibs
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    /**
     * Name of the Chibs
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    /**
     * Surname (House) of the Chibs
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    /**
     * Life Cycle of the Chibs (5 - 14 days)
     * @param life
     */
    public void setLife(int life) {
        this.life = life;
    }
    public int getLife() {
        return life;
    }
    public void setRandomLife(){
        this.setLife((int)(Math.random() * ((MAX_LIFE - MIN_LIFE) + 1)) + MIN_LIFE);
    }

    /**
     * Sex of the Chibs
     * @param sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public Sex getSex() {
        return sex;
    }
    public void setRandomSex(){
        if ((int) Math.random() == 1) {
            this.setSex(Sex.MALE);
        } else {
            this.setSex(Sex.FEMALE);
        }
    }
}
